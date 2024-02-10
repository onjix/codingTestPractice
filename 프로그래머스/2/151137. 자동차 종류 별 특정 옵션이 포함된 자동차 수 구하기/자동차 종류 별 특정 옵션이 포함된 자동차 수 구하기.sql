-- 코드를 입력하세요
# SELECT * from CAR_RENTAL_COMPANY_CAR where options in ('통풍시트', '열선시트', '가죽시트')
SELECT car_type, count(*) as cars 
from CAR_RENTAL_COMPANY_CAR 
where options REGEXP '통풍시트|열선시트|가죽시트'
group by car_type
order by car_type