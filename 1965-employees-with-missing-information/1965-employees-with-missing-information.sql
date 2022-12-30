select employee_id from employees where employee_id not in (select employee_id from salaries)
union all
select employee_id from salaries where employee_id not in (select employee_id from employees)
order by 1 asc