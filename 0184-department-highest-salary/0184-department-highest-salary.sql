with t as (select d.id          as id,
                  max(e.salary) as salary
           from employee e
                    left join department d on e.departmentId = d.id
           group by d.id)
select d.name   as Department,
       e.name   as Employee,
       e.salary as Salary
from employee e
         left join department d on e.departmentId = d.id
where d.id in (select t.id from t where t.salary = e.salary);