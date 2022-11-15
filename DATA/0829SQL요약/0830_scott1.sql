create table simple_test_table
(
num int primary key,
name varchar2(30) not null,
phone_number varchar2(20) unique
);
--번호는 학생번호 주민번호 처럼 겹쳐선 안되고 모두가 갖고 있다.
--핸드폰 번호는 겹치진 않지만 없을 수도 있다. 
--not null, unique 
--유일한 값만 들어가도록 하고 싶을 때 사용합니다. 즉 중복을 허용하지 않는것. 
--그리고 당연히 NOT NULL과 함께 사용가능. 
--id?VARCHAR(10)?UNIQUE?NOT?NULL,


insert into simple_test_table values(1, '이용희', null);
insert into simple_test_table values(2,'이동준','010-2940-1613');
select * from simple_test_table;
delete from simple_test_table;


--특정한 조건이 되었을 떄 호출하는 코드
/*
셋다 만드는 방법은 다들 매우 유사하므로 본 수업에서는 프로시저만 다룬다.
PL/SQL처럼 조건문이나 반복문들도 있는데, 이러한 부분들은 필요할 때 직접 찾아보시길. 
*/

--프로시저 -- add_person 절차로 만들기, 바꾸기. 
create or replace procedure add_person
(
mynum in int,
myname varchar2,
mypn varchar2
)
is begin 
insert into simple_test_table values(mynum,myname,mypn);
end add_person;

--begin 뒤에 스페이스 해야함.
--error..j.................
--insert 문의 view 화 하는 것. = > 프로시져 
--values(mynum,myname,mypn) 을 add_person에 넣는다. 
