select a.activity_date as day,
       count(distinct a.user_id) as active_users
from activity a
where a.activity_date > date('2019-06-27') and a.activity_date <= date('2019-07-27')
group by activity_date