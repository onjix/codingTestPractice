-- 코드를 입력하세요
select date_format(datetime, '%H') as Hour, count(*)
from animal_outs 
where date_format(datetime, '%H') >= '09' and date_format(datetime, '%H') <= '19'
group by Hour
order by Hour