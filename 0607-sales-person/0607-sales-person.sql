select name  from salesperson
where sales_id not in
(select sales_id from orders left join company on company.com_id = orders.com_id
                 where company.name = 'RED')