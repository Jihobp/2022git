create table MYSTUDENTS ( --중복 되면 생성안되고, 테이블 누르고 새로고침 하늘색 눌러서 만드렁야함.
name varchar2(20),
age number,
hakbeon varchar2(20) primary key); --기본키냐 아니냐 지정하는거.





insert into student(hakbeon, name, age) values('11', '안서준', 19);
-- 숫자열 문자열
insert into mystudents(hakbeon, name, age) values('1', '안서준', 19);
insert into mystudents(hakbeon, name, age) values('2', '김혜민', 15);
insert into mystudents(hakbeon, name, age) values('3', '박지호', 99);
insert into mystudents(hakbeon, name, age) values('4', '최호준', 78);
-- drop table mystudents; 다삭제되서 다시 생성해야함 ㅠㅠ 하늘색 새로고침.

--drop - 테이블 완전삭제 복구 안됨
--truncate - 테이블에 있는 내용을 완전히 삭제하고 테이블 자체는 그냥 있음.
--delete 테이블에 있는 내용 삭제하고 복구도 됨
commit; --insert, update, delete 전 후로 해주는게 좋다.
rollback; --직전에 commint한 부분으로 돌아갈 수 있다.
--연속으로 돌아가진 못함. 즉 2단계 전으로 돌아가긴 안됨.

--savepoint 저장한 지점으로 돌아갈 수 있는거

--나이가 10대인 학생만 조회
select * from mystudents;
select * from mystudents where age >=10 and age<=19; 
select * from mystudents where age>9 and age<20;

--*대신에 다른걸 써도 됨.

select name from mystudents where age>9 and age<20;
select name as 이름 from mystudents where age>9 and age<20; --as 생략가능.
select name 이름 from mystudents where age>9 and age<20;
select name as "이 름" from mystudents where age>9 and age<20;
select name "이 름" from mystudents where age>9 and age<20;

delete from mystudents where name='최호준'
--insert into mystudents values('박지호',10,'123');
--select * from mystudents;
update mystudents set age=20 where name='박지호';

-- crud
-- pk
-- 관계를 표현함에 있어서 매우 중요한 요소인 fk를 할것
-- 2개 이상의 테이블을 하나로 보이게 해주는 join에 대해서 다뤄볼 것, 

--학과테이블도 만들기
create table major (name varchar2(20), code char(3) primary key);

insert into major values('컴공', '001');
insert into major values('화공', '102');
insert into major values('토목', '200');
--학생 테이블에 새로운 컬럼추가해보기
-- 학과코드를 추가할 것
-- 주의사항!!!!!!!!!!!!!!!
--학과코드 추가할 때 major테이블의 doe랑 자료형, 크기가 모두 맞아야함.
alter table mystudents add(code char(3));
--외래키 추가
--제약조건 이름은 아무렇게나 적어도 됨
--major의 code 컬럼을 참고(reference)해서 만들었다.
alter table mystudents add constraint fk_stu;
alter table add contraint fk_stu foreign key(code) references major(code);



--001은 존재하는 학과이므로 이현민 추가가능
insert into mystudents values('이현민', 23, '100','001');
--777 666은 없는 과라서 추가 불가능
insert into mystudents values('이동준1',34,'109''777');
insert into mystudents values('이동준2',34,'110''666');

--2번 토목
insert into mystudents values('노민영', 27, '7','200');
insert into mystudents values('이동준', 17, '8','200');
insert into mystudents values('조영탁', 17, '9','200');

--3번 학과코드가 001인 학생의 이름과 나이만 출력해보세요.
select * from mystudents where code='001'; 
--4번 학과코드가 102(혹은 002)화공 인 학생의 나이를 모두 20살로 통일하세요.
update mystudents set age=20 where code='102';  
--5번 성이 이씨인 학생을 지워보세요. (like 라는 키워드를 이용해야 할 것)
delete from mystudents where name like '이%';

--참고
--나이 제일 많은 사람 삭제
select max(age) from mystudents;
delete from mystudents where age = (select max(age) from mystudents);
select * from mystudents;

--1번 본인이 직접 그렸던 다이어그램을 crud, pk, fk 써서 실제로 구현을 해보세요. 
--crud : create, read, update, delete
--잘못만든거라면 수정하거나 안해도 됨. 기본적으로 만들었던 학생테이블 등을 실제로 만들어보세요.

--테이블 2개와 데이터 삽입. 

--학생 테이블에 있는 학과코드를 이용해서 학과를 출력해보기
--조인
select mystudents.name "학생명", major.name "학과명", hakbeon from 
mystudents join major on mystudents.code=major.code;

--char 와 varchar2 둘다 문자열
--char는 크기 고정 varchar2 크기가 유동
--VARCHAR2=VARCHAR 인데 VARCHAR2를 오라클에 쓰라고 했다.
--char(20) - > an무조건 20바이트 크기 할당, varchar(20) 최대 20바이트 할당//대신 그떄그때 수정해줘야해서 크기가 커서 속도에 영향 but 실무에서 이거로 다 때려넣음


