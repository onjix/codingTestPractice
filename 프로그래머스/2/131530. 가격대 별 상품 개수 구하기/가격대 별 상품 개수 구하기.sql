-- 코드를 입력하세요
SELECT 
Truncate((price / 10000), 0) * 10000 as price_group, 
count(*) product
from product
group by price_group
order by price_group