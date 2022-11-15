--최소 2개의 컬럼
--1개 컬럼추가 되야함
--id랑 같은 타입의 컬럼이어야 되고(number라면 둘다 number)
--id에서 있는 값을 추가해줘야 함

create table mysamsungpeople(
id number primary key,
name varchar2(30) not null, --공백을 허용하지 않음
boss_is number)
select * from mysamsungpeople;
insert into mysamsungpeople values(1,'이건희',1);
insert into mysamsungpeople values(2,'홍라희',2);
insert into mysamsungpeople values(3,'이부진',1);
insert into mysamsungpeople values(4,'이재용',1);
insert into mysamsungpeople values(5,'신라호텔',3);
insert into mysamsungpeople values(6,'삼성전자',4);
insert into mysamsungpeople values(7,'수원삼성',4);
insert into mysamsungpeople values(8,'삼성라이온즈',4);

alter table mysamsungpeople rename column boss_is to boss_id;

select a.name boss, b.name name 
from mysamsungpeople a join mysamsungpeople b
on a.boss_id=b.id ;

select a.name boss, b.name name 
from mysamsungpeople a join mysamsungpeople b
on a.id=b.boss_id;

select * from mysamsungpeople;

--같은 테이블 두개로 나눠서 임의로 a,b로 나눈 것이당. ㅇㅅㅇ!!
--select a.name boss, b.name from samsungpeoiple
-- a(boss name) join samsungpeople b(name) on a.id=b.boss_is; 
-- a,b가 교집합 즉 join되면 a.id=b.boss_is 가 같다!! 