select d.name   as Department,
       e.name   as Employee,
       e.salary as Salary
from employee e
         left join Department d on e.departmentId = d.id
where (select count(distinct e2.salary)
       from employee e2
       where e2.salary > e.salary and e.departmentId = e2.departmentId) < 3