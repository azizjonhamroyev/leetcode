select name as Employee
from employee e
where e.managerId is not null and e.salary > (select salary from employee where employee.id = e.managerId)