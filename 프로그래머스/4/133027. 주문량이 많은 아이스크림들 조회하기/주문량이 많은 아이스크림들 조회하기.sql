-- 코드를 입력하세요

# select f.flavor, f.total_order from july as j join first_half as f on j.shipment_id = f.shipment_id
# select flavor from (select flavor, sum(total_order) from july as j join first_half as f on j.shipment_id = f.shipment_id)
select flavor from ((select flavor, total_order from first_half) union (select flavor, total_order from july)) as s group by flavor order by sum(total_order) desc limit 3