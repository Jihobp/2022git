--samsung 문제 내가 푼거
--각자의 이름과 보스의 이름을 같이 출력할 것. 이름, 각자의 id, 보스의 id가  저장되는값.
--거꾸로 읽어라.
--drop table samsungpeople;
create table samsungpeople(
i_d integer primary key, --정수 
name varchar2(20), 
boss integer);  --id가 인티저라 boss도 인티저 써야함. 하나의 테이블을 두개처럼 써서 비교해서 join교집합 가져오는거라서.

insert into samsungpeople values (1,'이건희',1); --하나의 테이블을 두개처럼 써야함.
insert into samsungpeople values (2,'홍라희',2);
insert into samsungpeople values (3,'이부진',1);
insert into samsungpeople values (4,'이재용',1);
insert into samsungpeople values (5,'신라호텔',3);
insert into samsungpeople values (6,'삼성전자',4);
insert into samsungpeople values (7,'수원삼성',4);
insert into samsungpeople values (8,'삼성라이온즈',4);

select * from samsungpeople;

select a.name as i_d, b.name as boss from samsungpeople a, samsungpeople b where a.i_d=b.boss;

select a.name as i_d, b.name as boss from samsungpeople a join samsungpeople b on a.i_d=b.boss; 


--where 도 ok, join on 도 ok.
--select a.name as SSSS, b.name as VVVV from tablename a, tablename b   where/join~on a.xx=b.xx;
--a네임의 id를, b네임의 보스에 넣는다. samsungpeople a, samsungpeople b에서 온,  둘은 같기에, 




