# # -- 코드를 입력하세요
SELECT p.product_code, (p.price * o.sales_amount) as sales
from product as p join 
(select f.product_id, sum(f.sales_amount) as sales_amount
from offline_sale as f
group by f.product_id
order by f.product_id) as o
on p.product_id = o.product_id
order by sales desc, product_code
