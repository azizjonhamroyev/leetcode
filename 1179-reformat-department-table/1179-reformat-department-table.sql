select id,
       sum(case when month = 'jan' then revenue end) as Jan_Revenue,
       sum(case when month = 'feb' then revenue end) as Feb_Revenue,
       sum(case when month = 'mar' then revenue end) as Mar_Revenue,
       sum(case when month = 'apr' then revenue end) as Apr_Revenue,
       sum(case when month = 'May' then revenue end) as May_Revenue,
       sum(case when month = 'jun' then revenue end) as Jun_Revenue,
       sum(case when month = 'jul' then revenue end) as Jul_Revenue,
       sum(case when month = 'aug' then revenue end) as Aug_Revenue,
       sum(case when month = 'sep' then revenue end) as Sep_Revenue,
       sum(case when month = 'oct' then revenue end) as Oct_Revenue,
       sum(case when month = 'nov' then revenue end) as Nov_Revenue,
       sum(case when month = 'dec' then revenue end) as Dec_Revenue
from department
group by id