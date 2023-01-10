CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE M int;
SET M = N-1;
  RETURN (
      select distinct salary from employee order by salary desc LIMIT M,1
  );
END