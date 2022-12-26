with q as (select t.account,
                  u.name        as name,
                  sum(t.amount) as balance
           from transactions t
                    left join users u on u.account = t.account
           group by account)
select q.name    as name,
       q.balance as balance
from q
where q.balance > 10000