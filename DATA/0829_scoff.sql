--DROP TABLE food;
--//Code sql = query = select 문 =질의문
--//structed query language 구조 질의 어.
--배운걸로 프로젝트 진행가능, 모르면 갓 구 글. 
		--//sql문제 > sql 고득점문제, 연습 사이트 ㅇㅅㅇ??????????????? 하기싫..args..>>공유폴더 깃허브. 
create table food --테이블 생성
(
    num int primary key,
    name varchar2(50),
    price int,
    foodcode number, -- food_category랑 타입이 똑같아야 함.
    foreign key(foodcode) REFERENCES food_category(code)
);

--그럼에도 불구하고 food 뒤에 컬럼명 적는 이유??
--1. 명시적으로 컬럼들을 보여주기 위해서
--2. 내가 원하는 순서대로 데이터 넣기 위해서
insert into food(price, name, num) values(10000,'황제정식',5);
--3. 내가 원하는 데이터만 넣기 위해서.
insert into food(num,name,price) values(1,'불고기',7000);
insert into food(num,name,price) values(2,'불고기',6000);
SELECT*FROM FOOD;
--select all from 
/*select * from 임시테이블;
insert into 임시테이블 values('박지호',1);
실제컬럼(=열)명은 name 이더라도, 그 이름을 한글 이름으로 '표시'가 됨
name 부분을 메뉴라는 컬럼(=열)으로 표시함.
*/
--insert update delete

--NAME, PRICE만 뽑아내고 싶다--
    SELECT NAME, price from food;
    
--메뉴만 보여 주고 싶다면?
select name from food;

--6000원대로 먹을 수 있는 음식만 조회해보자.
--price 가 6000 이상 7000 미만인 값만 나온다.
select * from food where price >=6000 and price <7000;

--김치제육을 김치+제육으로 변경
--이름을 통해서 조회해도 되지만
--그렇게 되면 모든 김치제육이 김치+제육으로 바뀜
--그래서 이렇게 

--가장 최근에 실행한 sql문 화나만 남는다
update food set name='김치+제육' where num=3;
--업데이트문의 가장 큰 주의사항!!!!!
--끝에  where 절을 안 적게 되면
--모든 데이터가 다 일괄적으로 변경이 된다.
--만약 여기서 where문 없으면 모든 음식메뉴가(name))값
--김치+제육이 되어버린다 ㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅇㅅㅇㅇㅇㅅㅇㅅㅇㅅㅇㅅㅇㅇㅅㅇㅇㅅㅇㅅㅇㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅇ
--결과 확인
--update insert delete는 결과 안보여줌. table 새로고침, 데이터 들어가거나, select *from table; 쳐야한다/
--기본키를 왜\쓰냐면, 내가 원하는 데이터를 바꿀때 데이터가 하나밖에 없다는 보장이 되어있어야한다ㅑ.유일한 only one deta~~!!!
select*from food;

--insert 할 때 모든 컬럼의 순서를 알고 있다면
--생략하고  values부터 적을 수 있다.
--이 테이블은 숫자, 문자열, 숫자의 순서인데, 
--순서를 알고 있다면 food 뒤에 컬럼명 생략 가능.
--그럼에도 불구하고 컬럼명 적는 이유?

insert into food(price,name,num) values(2000,'무생채',4);
--그럼에도 불구하고 food 뒤에 컬럼명 적는 이유??
--1. 명시적으로 컬럼들을 보여주기 위해서
--2. 내가 원하는 순서대로 데이터 넣기 위해서
insert into food(price, name, num) values(10000,'황제정식',5);
--3. 내가 원하는 데이터만 넣기 위해서.
insert into food(num,name) values(6,'랜덤메뉴');
select*from food;
--git의 commit처럼 내가 작성한 insert, update, delete문을 저장하는 것.
--commit해주지 않고 이 프로그램을 꺼버리면 내가 작성한
--insert update delete가 적용이 안됨/. 즉 저장 안하고 끈거랑 같음
commit;

--1. food 테이블에 음식 10개만 추가해보기
--컬럼이랑 이런것들 다 그대로 집어넣기
--1. 데이터만 집어넣기, 2.내가 정한 순서대로 넣기, 3.내가 집어넣고 싶은 데이터만 넣기.
insert into food(num,name,price) values(7,'피자',9900);
insert into food(num,name,price) values(8,'콜라',1000);
insert into food(num,name,price) values(9,'김치피자',10000);
insert into food(num,name,price) values(10,'김치콜라',100000);
insert into food(num,name,price) values(11,'김치치킨',12000);
insert into food(num,name,price) values(12,'김치와인',1000000);
insert into food(num,name,price) values(13,'파스타',8200);
insert into food(num,name,price) values(14,'김치과자',990);
insert into food(num,name,price) values(15,'리조또',13500);
insert into food(num,name,price) values(16,'빠에야',14900);
insert into food(num,name,price) values(17,'김치샌드위치',4900);
insert into food(num,name,price) values(18,'민츠초코덮밥',10000000000);
insert into food values(19,'하와이안피자위의 파인애플',null);   --null 넣기
insert into food values(20,'김치피자위의 파인애플',null);     --내가 집어넣고 싶은 데이터만 넣기
insert into food(name,num) values('김치파인애플부침개',21);--내가 원하는 순서, 원하는 값
select * from food;

--만약 num의 순서대로 하고 싶다면?
select *from food order by num; --끝에 asc는 생략가능
select *from food order by num asc; --이 두개는 똑같은 코드. 
--asc : 오름차순 정렬, 생략가능
--desc:내림차순, 내림차순하고 싶으면 생략 하면 안 됨



--비싼 순서대로 정렬하고 싶다면?
--desc는 내림차순을 의미한다.
select *from food order by price desc;  --내림 차순

--null 값이 아닌 것만 조회하고 싶다면?
select *from food where price is not null;      --where은 update, delete에 쓰이고, orderby는 정렬에 쓰인다./

--null 값이 아닌 것만 조회하고 싶다면 + 가격 비싼 순?
select * from food where price is not null order by price desc;
update food set price=1000 where price is null;

--2. 메뉴명에 김치라는 것이 들어가는 것만 조회해보기
SELECT * from food where name like '%김치%';
select * from food where name like '%피자%';
--like 구문 문자열에서 쓰임
--%기호의 뜻은 0글자 이상
--즉 '김치'뿐 아니라 '민트초코 김치' 아니면 '김치찌개'등
--김치라는 단어 앞뒤에 뭐가 오든지 간에 김치가 포함되면
--다 조회한다.


--3. 가격이 5000~7000원 사이인 것만 조회하기
select * from food where price >=5000 and price <=7000;
select * from food where price >=3000 and price <=10000;

--4. 가격이 null값인 건 1000원으로 조정
update food set price=1000 where price is null;

--5. num값이 1번인 메뉴의 이름을 '맛있는 불고기' 라고 바꾸기*/
update food set name='맛있는 불고기' where num=1;
update food set name='맛있는 민트초코하와이안피자' where num=2;
--다 풀고 나서 commit

commit;
select *from food;
show autocommit;

--commit : 저장
--데이터 추가 수정 삭제하기 전에 commit 하고
--만약에 추가 수정 삭제를 잘못?다면 rollback
--단 주의사항, 
--1. rollback( =되돌리기)은 내가 최근에  commit한 지점으로만 돌아감
--2. autocommit 기능이 켜져있다면, rollback이 안먹음.
--because, isert update delete 를 함과 동신에 commit이 된다.
commit;
update food set name='민초카레';        --모든 음식명을 민초카레로 바꿈-
--모든 음식을 민초카레로 바꾸고 commit 해버리면..... 돌이킬 수 없다.

select * from food;         
rollback; --마지막으로 commit한 지점으로 돌림.

--insert update select를 했으므로, delete로 해보자.
-- D E L E T E 
--update 문과 마찬가지로 where 절 안적으면 모든 내용이 다 날아감.
--delete from food where price >=50000;

--drop, truncate 라는 구문도 있다.
--drop 은 테이블 자체를 싹 지워버리고, rooback(=복구)가 안됨.
--truncate는 데이터만 싹 지우고, 테이블은 남아 있는데 (자르다)
--삭제한 데이터에 대해서 rollback이 안됨.
--다행히 delete는 rollback이 됨.
--truncate 도 문제지만 drop은 특히 !!!!!!!!!!!!!! 주의해서 써야함. 테이블 자체를 싹 지워버리고 복구도 안되서ㅏ.
--문제가 커!!!!!!!!!!!!!!!질수 !!있다!

--table의 컬럼을 추가할 수 있다.
alter table food add recipe varchar2(1000);
--컬럼의 속성도 변경이 가능하다.
alter table food modify price not null;

select * from food;

--1. 음식 이름이 민트가 들어간 것 삭제 ~가 들어간것 where name like '%%";
--delete from food where name like--'%민트%';
--2. 음식 이름에 하와이안이 들어간 것 삭제
--delete from food where name like --'%하와이안%';
--3. 가격이 10000원 넘는 것 삭제
--delete from food where price -->10000;
--4. 음식가격이 5000원 이하인 것의 레시피를 'msg추가' 이라고 변경
update food set recipe ='msg추가' where price<=5000;
--5. 가격이 저렴한 순서로 정렬해서 보여주기
--굳이 명시적으로 적고 싶다면 끝에 asc를 붙이면 됨.
select *from food order by price asc; --asc vs desc 

-------------------------------------------------

select * from food;
select *from food_category;

select code 분류코드, name 분류명 from food_category;

--외래키 코드는 오타방지 ,
--외래키는 두개의 테이블에서 제일 메인인 코드 ㅇㅅㅇ

create table food_Truck
(
    num int primary key,
    name varchar2(100) not null,
    price int,
    foodcode number, -- food_category랑 타입이 똑같아야 함.
    foreign key(foodcode) REFERENCES food_category(code)
);

--sequence(시퀀스)
--오라클에 있는건데, mssql 에 있는 것
--mysql에는 없어서 비슷한 걸 따로 만들어 줘야 함.
create SEQUENCE food_rownum;
--시퀀스는 일종의 변수
--for 문의 i 처럼 값이 순차적으로 늘어나는 것
--내가 수동적으로 값을 넣지 않아도 자동으로 값이 증가함.
--nextval : ++i이랑 같음. 즉 증가된 값을 집어 넣어 줌. ->>그 순서가 아니어도 증가된 순서로 그냥 추가해주는 거다 ㅇㅅㅇ
insert into food_truck values(food_rownum.nextval, '민트덮밥',5000,5);
select * from food_truck;
--num 1 은 어디갔냐면 ㅠㅠ
--insert into 할 떄 오류가 나면서 num 값이 들어가려다가 못들어가고 ㅈ그냥 증가됨.
create sequence dj;
insert into food_truck values(dj.nextval, '딸기카레', 4000,5);  
--insert into food_truck values(food_rownum.nextval, '오렌지찌개', 3000, 50);
--ㄴ>> 무결정 제약 조건 에 위배됩니다?!!!!!! // 카테고리에서 아예 벗어난 값 food code 50/
insert into food_truck values(food_rownum.nextval,'타이어',30000,7);
insert into food_truck values(food_rownum.nextval,'진짜스펀지케이크',300,7);
select *from food_truck;

--jjion 두테이블에서 공통되는 키 값을 가져와서
--그 값이 겹치는 걸 보여준다.
select food_truck.name 음식명, price, food_category.name 분류 
from food_truck join food_category on food_truck.foodcode=food_category.code;

-- Q 3
-- 1. 각 카테고리별로 음식 3개씩 추가하세요.
insert into food (num,name,price) values(22,'하와이안피자위의 민트초코파인애플',9999999999);
insert into Food_Truck values(food_rownum.nextval, '민초피자치즈',50000,7);
insert into food_truck values(food_rownum.nextval, '민초버터크로플',3000,7);
insert into food_truck values(food_rownum.nextval, '민초버터크루와상',2500,7);
insert into food_truck values(food_rownum.nextval, '민초버터떡볶이',3900,7);
insert into food_truck values(food_rownum.nextval, '민초버터아이스크림',1500,7);
select * from food_truck;
-- 2. 디저트라는 분류 추가하세요. (코드8)
insert into food_category values(8,'디저트');

-- 3. 디저트 5개 추가하세요.
insert into food_truck values (food_rownum.nextval,'딸기라떼', 6000, 8);
insert into food_truck values (food_rownum.nextval, '민트초코라떼', 5900, 8);
insert into food_truck values (food_rownum.nextval, '민트초코프라푸치노', 5900, 8);

-- 4. jion 이용해서 음식명, 가격, 분류 표시해보세요. --food_truck.name 디저트명, food_truck.price 가격, food_category.name 분류
select food_truck.name 디저트명, price 가격, food_category.name 분류 
from food_truck join food_category on food_truck.foodcode=food_category.code;
-- 5. 4번처럼 하되 가격순으로 정렬해보세요.(비싼순으로 하기) 오
select food_truck.name 디저트명, price 가격, food_category.name 분류 
from food_truck join food_category on food_truck.foodcode=food_category.code order by price desc; --오름 //asc

--join 해설 
/*select food_truck.name 음식명,price, food_category.name 분류
from food_truck join food_category on food_truck.foodcode=food_category.code
order by food_truck.price desc;
*/
-- group by
-- 음식들을 foodcode별로 묶어보자.
select * from food_truck;

--전체 평균 가격
select avg(price) from food_truck;
--전체 최고 가격
select max(price) from food_truck;

--분류(=foodcode)별 평균 가격
select foodcode, avg(price) from food_truck group by foodcode;
--분류별(=foodcode) 최고가 음식 가격
select foodcode, max(price) from food_truck group by foodcode;

--주의사항
--그냥 group by만 쓰면
-- 나머지 값들은 다 짤려버림(mysql)
-- oracle은 아예 안 됨
--select foodcode, name from food_truck GROUP by foodcode;

-- having
-- group by한 다음에 조건문 쓰는 것
-- group by 뒤의 where절인 것
select foodcode, max(price) from food_truck group by foodcode 
having max(price)>10000; --max값이 만원이 넘는 것만 보여주는 것

select foodcode, max(price) from food_truck group by foodcode 
having max(price)<10000; --max값이 만원이 미만인 것만 보여줌


-- 중첩 질의
-- 최고가의 음식을 찾고 싶다면?
-- price값이 max(price)랑 동일한 것의 데이터를 출력
select * from food_truck where price=(select max(price) from food_truck);
-- 쿼리문 안에 또 다른 쿼리문이 들어간 것



-- view
-- view : 가상 테이블
-- select문으로 만들어진 가상의 테이블
-- create table 문으로 만들어진 정식 테이블이 아니고
-- 기존테이블들을 이용해서 자료조회하고, 그 조회된 자료가지고 만들어진 가상의 테이블
-- sql plus 열어서 c## view 추가

-- food_truck의 최고가만 저장하는 테이블을 만듦
create view find_max_price as select max(price) max_price from food_truck;
select * from find_max_price;

-- view를 잘 이용하면 중첩 질의가 더 간략해줄 수 있다.
select * from food_truck where price=(select * from find_max_price);

--전체 최고 가격
select max(price) from food_truck;

------OSR------
--<<<<<<<<<<<<< 1. 음식 분류별 평균 표시하되, 분류명도 같이 출력되게 하기 >>>>>>>>>>>>>>>>>>
select avg(price) 평균, food_category.name, food_truck.foodcode 
from food_truck join food_category 
on food_truck.foodcode = food_category.code
group by food_category.name, food_truck.foodcode;  
--평균을 food_catyegory.name과 food_truck.foodcode를 갖고와서
--food truck 과 food category 를 조인하고 food truck
--group을 food_cateygory.name과 food_truck.foodcode 를 묶어서 만든다,.


--분류별(=foodcode) food 최고가 음식 가격
select foodcode, max(price) from food_truck group by foodcode;

--1-2. 평균 값이 비싼 순으로 정렬
select avg(price) 평균, food_category.name, food_truck.foodcode 
from food_truck join food_category 
on food_truck.foodcode = food_category.code
group by food_category.name, food_truck.foodcode order by avg(price) desc;

--1-3. 평균 값이 저렴한 순으로 정렬
select avg(price) 평균, food_category.name, food_truck.foodcode 
from food_truck join food_category 
on food_truck.foodcode = food_category.code
group by food_category.name, food_truck.foodcode order by avg(price) asc;

select * from food_truck;

----join까지 할정도는 하는게 좋다
--2. 분류별로 가장 비싼 음식들 표시하기
--select foodcode, max(price) from food group by foodcode having max(price);
-- price값이 max(price)랑 동일한 것의 데이터를 출력
create view max_price as select max(price) max_price, food_category.name from food_truck 
join food_category on food_truck.foodcode = food_category.code 
group by food_category.name;

select * from max_price;

create view food_price_category as select food_truck.name food_truck_name, price, food_category.name food_category_name
from food_truck
join food_category on food_truck.foodcode = food_category.code;

select * from food_price_category;

select food_truck_name, price, max_price.name from food_price_category
join max_price on food_price_category.price = max_price.max_price and 
food_price_category.food_category_name = max_price.name;



--3. 분류별로 가장 저렴한 음식들 표시하기
--price 값이 min(price)랑 동일한 것의 데이터를 출력
create view min_price as select min(price) min_price, food_category.name from food_truck 
join food_category on food_truck.foodcode = food_category.code 
group by food_category.name;

select * from min_price;

select food_truck_name, price, min_price.name from food_price_category
join min_price on food_price_category.price = min_price.min_price and 
food_price_category.food_category_name = min_price.name;



--4. 평균적으로 볼 때 음식이 가장 저렴한 편인 음식분류는?
create view avg_price_code as select avg(price) avg, foodcode from food_truck group by foodcode;
select * from avg_price_code;
select min(avg) min from avg_price_code;
create view min_code as select foodcode from avg_price_code where avg = (select min(avg) from avg_price_code);
select food_category.name from food_category where code = (select * from min_code);


--5. 평균적으로 볼 때 음식이 가장 비싼 편인 음식분류는? 
select max(avg) max from avg_price_code;
create view max_code as select foodcode from avg_price_code where avg = (select max(avg) from avg_price_code);
select * from max_code;
select food_category.name from food_category where code = (select * from max_code);

--nullable > false 는 넑값x true는 넑o

--view : join을 짧게,
/*
join : (교집합) 서로다른 테이블을 하나의 테이블로 합치는거.
중첩질의 : select 문 안에서 select 문이 또 나오는 거....   
crud - > create read=select update delete..
sequence(시퀀스) 오라클, mssql 에 있는것. my sql엔 없다.
시퀀스는 일종의 변수.
for 문의 i 처럼 값이 순차적으로 늘어나고, 내가 수동적으로 값을 넣지 않아도 자동으로 갑 증가. 
nextval을 ㅆㅡ면 그 순서가 아니어도 증가된 순서로 추가해주듯이 증가 값을 넣어줌.
--animal_id 순으로 조회하는 sql 문 작성.
--SELECT * from animal_ins order by animal_id;
--동물 보호소에 들어온 모든 동물의 이름과 보호시작일 조회, animla_id 역순
--SELECT name, datetime from animal_ins order by animal_id desc;
--동물 보호소에 들어온 동물 중 아픈 동물1의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.
--SELECT animal_id, name from animal_ins where intake_condition like '%sick%' order by animal_id;
--동물 보호소에 들어온 동물 중 젊은 동물1의 아이디와 이름을 조회하는-->!='aged'재외,  SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.
--SELECT animal_id, name from animal_ins where intake_condition !='aged' order by animal_id; 

SELECT animal_id, name, datetime from animal_ins order by name, datetime desc;
-- 단, 이름이 같은 동물이면 !!!! 보호를 나중에 시작한 동물을 먼저 보여줘야 한다????? 
-- 중첩질의? select 안의 select !! datetime ? 이 나중인 경우!! 
-- SELECT name from animal_ins where datetime=(select min(datetime) from animal_ins);
-- SELECT animal_id, name, datetime from animal_ins where 'name=name' order by datetime desc; zzzㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ

-- 중첩질의? select 안의 select !! 가장 먼저 들어온 동물의 이름??  datetime 이 빠른 경우. 
SELECT name from animal_ins where datetime=(select min(datetime) from animal_ins);*/



select * from food_truck;
select * from food_category;

-- 분류 '코드별로' 평균을 표시해보기
select foodcode, avg(price) from food_truck group by foodcode;
-- => 각 코드가 의미하는 바를 쉽게 유추할 수 없다.

--<<<<<<<<<<<<<<<1. 음식 분류별 평균 표시하되, 분류명도 같이 출력되게 하기>>>>>>>>>>>>>>>
-- 공통점 : 두 개의 테이블을 묶어서 매칭시키는 것

-- view 없이 푸는 방법(=중첩질의) select select -->>> view를 slect하면 slect 한 결과가 그대로 나온다. view를 통한 간략화
select name, avgprice from 
(select foodcode, avg(price) avgprice from food_truck 
group by foodcode) a
join 
food_category 
on a.foodcode=food_category.code; --foodcode랑 foodcategory.code 가 같으면.

--from () a 라는 임시테이블을 만들어서 =view랑 비슷. 
--foodcode를 가져오고 food category를  join하는 것. 
--foodcode 랑 가격의 평균을 선택하는데, food_truck에서부터 가져와서 groupby foodcode 로 묶는다. 
--avg(price)를 avgprice로 설정한 것. 
--a의 푸드코드랑 푸드카테고리의 코드랑 같으면 이름과 평균가격을 출력하는 것.


--view 이용해서 푸는 방법
create view groupby_foodcode_avg as
select foodcode, avg(price) avgprice from food_truck
group by foodcode;


select * from groupby_foodcode_avg;


select name, avgprice from food_category join groupby_foodcode_avg 
on food_category.code=groupby_foodcode_avg.foodcode;

-- 1-2. 평균값이 비싼 순
select name, avgprice from food_category join groupby_foodcode_avg 
on food_category.code=groupby_foodcode_avg.foodcode 
order by avgprice desc;
-- 1-3. 평균값이 저렴한 순
select name, avgprice from food_category join groupby_foodcode_avg 
on food_category.code=groupby_foodcode_avg.foodcode 
order by avgprice asc; --asc는 생략이 가능함


-- <2. 분류별로 가장 비싼 음식들 표시하기 > 

-- 1. group by 이용해서 각 코드별로 비싼 음식을 표시해야 함.
--select foodcode, max(price) maxprice from food_truck group by foodcode;
--create view max_food as 
--select foodcode, max(price) maxprice from food_truck group by foodcode; --max food view 생성 ㅇㅅㅇ 
-- 1. join 을 이용해서 각 음식의 카테고리명(=분류명) 표시해야 함.
-- distinct : 중복 제거 키워드. 
select distinct food_truck.name foodname, price, food_category.name categoryname 
from food_truck join food_category 
on food_truck.foodcode = food_category.code;
--food_category.name categoryname  은 푸드 카테고리 네임의 이름 설정. 
--food_category.name (as) categoryname  ~~~~~~ 
--쉼표를 써서 속성을 적고, 그다음 나오는 이름으로 적어주는 것. 
--음식이름이 같은 경우를 제거.

--food_category.에 있는 이름은 categoryname 이다.
-- 1번과 2번을 join ?      그전에 --->> view 를 써서 1, 2번을 줄여야 한다. ㅇㅅㅇ> 
create view food_category_truck as
select distinct food_truck.name foodname, price, food_category.name categoryname
from food_truck join food_category
on food_truck.foodcode = food_category.code;
--create view ~ as (위에 있는  select 문 복사함 ㅇㅅㅇ)


--select * from max_food; -- 코드별 최고가
select * from food_category_truck; -- 각 음식별 카테고리 표시하는 것
-->select distinct food_truck.name foodname, price, food_category.name categoryname 
--from food_truck join food_category 
--on food_truck.foodcode = food_category.code; view로 만든거 그자체--slect를 slect한거.

--2. 음식을 카테고리명별로 분류하게 되었다.
--그러므로 카테고리명별로 max 값을(view를) 다시 group by 한다.
select categoryname, max(price) maxprice from food_category_truck 
group by categoryname;

--categoryname으로 묶어서 categoryname이랑 최대가격을 가져온다. max(price) as maxprice


--drop view max_food;
--view 만들 때 주의사항 : avg나 max 등 함수의 결과는 또 다른 이름으로 치환해야 함
create view max_food as
select categoryname, max(price) maxprice from food_category_truck 
group by categoryname;
--as 뒤부터 어떤걸 view로 만들지 알려주는거.

select * from max_food;


-- 3.  1번과 2번을 join한다.
select foodname, price, max_food.categoryname from max_food 
join food_category_truck  --view
on max_food.categoryname=food_category_truck.categoryname and 
max_food.maxprice=food_category_truck.price;
--최대 가격인 음식 분류가 나온다. (한식 중식) 
--max food랑 category join(즉 view 두개 조인한것)
--그 음식이 뭔지는 모르지만, 가격이 젤 높은거 추출 가능 ㅇㅅㅇ



-- <<<<<<<<<<<<<<<<<<<<<< 3. 분류별로 가장 저렴한 음식 표시 >>>>>>>>>>>>>>>>>>>>> 
--1.음식명, 카테고리명이 나오는 테이블 만들기(2번에서 만듦, food_category
--2. food_category_truck에 있는 음식을 group by 해서 min 값을 구한다, 
select categoryname, min(price) minprice from food_category_truck
group by categoryname;
create view min_food as
select categoryname, min(price) minprice from food_category_truck
group by categoryname;

-- 3번 정답
select foodname, price, min_food.categoryname from 
food_category_truck join min_food on 
food_category_truck.categoryname = min_food.categoryname and 
food_category_truck.price = min_food.minprice;

--groupby, view 만들어둔걸로 join 잘해서 중첩질의까지 하면 된다고..^^??? ^^???????????????
-- <<<<<<<<<<<<<<4번 평균적으로 볼때 음식이 가장 저렴한 편인 음식 분류? >>>>>>>>>>>>>>
--1번에서 만든거 가져옴.
select * from groupby_foodcode_avg;
--코드별로 가격 묶었는데, 각 코드에 매칭되는 이름도 추가(join 이용)
select name, groupby_foodcode_avg.foodcode, avgprice 
from groupby_foodcode_avg 
join food_category 
on 
groupby_foodcode_avg.foodcode=food_category.code;

--이름이랑 groupby_foodcode_avg.~에서~ 푸드코드를 가져왔고, avgprice 도 가져와쏙. 
--group_foodcode_avg 랑 food_category를 join 한다. 
--groupby_foodcode_avg의 푸드코드랑, food_category의 코드랑 겹칠때. 

create view group_avg_food as 
select name, groupby_foodcode_avg.foodcode, avgprice 
from groupby_foodcode_avg 
join food_category 
on 
groupby_foodcode_avg.foodcode=food_category.code;

--group_avg_food 뷰를 만든다
--이름이랑 groupby_foodcode_avg.~에서~ 푸드코드를 가져왔고, avgprice도 가져왔다. 
--on - 조인하는 조건이 groupby_foodcode_avg.foodcode=food_category.code이 같을 때, 
--from group_foodcode_avg의 이름, 코드,과 평균가격을 출력하는 것.
--앞에서부터 읽고 뒤에서 제대로 차근차근 

select * from group_avg_food;

--중첩질의 (view끼리 중첩질의) slect slect 되니까. 
select * from group_avg_food where avgprice=
(select min(avgprice) from group_avg_food);


--avgprice가 뒤에나온 셀렉트 프라이스(min(avgprice) from group_avg_food)-최소값이랑랑 같을?. 
--avg price 뷰를 출력한다. 


-- <<<<<<<<<<<<<<<<<<< 5번 평균적으로 볼 때 음식이 가장 비싼편인 음식 분류? >>>>>>>>>>>>>> 
--4번 붙여놓고 MAX 로 바꾸면 끝 ㅇㅅㅇ
select * from group_avg_food where avgprice=
(select max(avgprice) from group_avg_food);




-- 프로시저_함수_트리거 시작_insert,delete,update,select,매개변수_반환값있는함수_활용

