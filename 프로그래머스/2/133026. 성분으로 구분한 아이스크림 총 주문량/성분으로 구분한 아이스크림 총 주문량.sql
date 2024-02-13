-- 코드를 입력하세요
# SELECT * from first_half order by shipment_id
# select * from ICECREAM_INFO

select i.INGREDIENT_TYPE, sum(total_order) as total_order
from first_half f join icecream_info i on f.flavor = i.flavor
group by i.INGREDIENT_TYPE
order by total_order