select user_id,
       concat(upper(substr(name,1,1)),lower(substr(name,2))) AS name
from users
order by user_id