select id,
       case
           when id % 2 = 0
               then (select s1.student from seat s1 where s1.id = s.id - 1)
           when id % 2 = 1 and (select s2.student from seat s2 where s2.id = s.id + 1) is not null
               then (select s2.student from seat s2 where s2.id = s.id + 1)
           else student end as student
from seat s
