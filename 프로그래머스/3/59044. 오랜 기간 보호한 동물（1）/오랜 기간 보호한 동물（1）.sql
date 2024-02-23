-- 코드를 입력하세요
SELECT ai.name, ai.datetime
from animal_ins ai left join animal_outs ao on ai.animal_id = ao.animal_id
where ao.sex_upon_outcome is null
order by ai.datetime
limit 3