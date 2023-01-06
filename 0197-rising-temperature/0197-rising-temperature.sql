select w1.id
from weather w1, weather w2
where w1.temperature > w2.temperature and w2.recordDate = date_sub(w1.recordDate,interval  1 day);
