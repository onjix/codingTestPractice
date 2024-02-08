-- 코드를 입력하세요

# select animal_id, name from animal_ins where sex_upon_intake like 'Neutered %' or sex_upon_intake like 'Spayed %'
# select animal_id, name, sex_upon_intake from animal_ins where not sex_upon_intake like 'Neutered%' and not sex_upon_intake like 'Spayed%'

select *
from (select animal_id, name, 'O' as 중성화 from animal_ins where sex_upon_intake like 'Neutered %' or sex_upon_intake like 'Spayed %' union select animal_id, name, 'X' as 중성화 from animal_ins where sex_upon_intake not like 'Neutered %' and sex_upon_intake not like 'Spayed %') as s
order by s.animal_id