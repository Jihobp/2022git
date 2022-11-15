select * from food_truck;
select * from food_category;

-- join
-- 두 테이블에서 공통되는 키 값을 가져와서 
-- 그 값이 겹치는 걸 보여준다.
select food_truck.name 음식명, price, food_category.name 분류 
from food_truck join food_category on food_truck.foodcode=food_category.code;

-- 가격 저렴한 순
select food_truck.name 음식명, price, food_category.name 분류 
from food_truck join food_category on food_truck.foodcode=food_category.code order by food_truck.price;

-- 가격 비싼 순
select food_truck.name 음식명, price, food_category.name 분류 
from food_truck join food_category on food_truck.foodcode=food_category.code order by food_truck.price desc;

-- 중첩 질의
select * from food_truck;

select max(price) from food_truck;

select * from food_truck where price = (select max(price) from food_truck);

select * from find_max_price;

select * from food_truck where price = (select * from find_max_price);


--create view food_name_category_name as 
select food_truck.name 음식명, price, food_category.name 분류 
from food_truck join food_category on food_truck.foodcode=food_category.code;

select food_truck.name 음식명, price, food_category.name 분류 
from food_truck,food_category ;

select food_truck.name 음식명, price, food_category.name 분류 
from food_truck, food_category where food_truck.foodcode=food_category.code;

select * from food_name_category_name;

-- delete
commit;
delete from test1 where num=1;
select * from test1;
rollback;

-- update 
update food_truck set name='아이스 아메리카노' where name='아아';
select * from food_truck;

--컬럼추가
alter table test1 add nickName varchar2(1000);

--not null로 수정하기 위해서 값을 집어넣음
update test1 set nickname = 'abc' where nickname is null;

--컬럼수정
--nickName 속성을 not null로 바꿈(null을 허용하지 않음)
alter table test1 modify nickName not null; 

insert into test1 values(1,'이동준','dj');
update test1 set nickname='pjh' where name='박지호';
update test1 set nickname='jhj' where name='장혜정';
select * from test1;





