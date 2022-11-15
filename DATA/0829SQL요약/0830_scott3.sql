--update
--OR REPLACE를 빼먹으면 삭제하고 오타수정 후 다시 만들거나
--GUI에서 수정해줘야 한다, 
CREATE PROCEDURE UPDATE_PERSON
(
MYNUM IN INT,
CHANGENAME VARCHAR2
)
IS TEMPVAR VARCHAR2(20) :='학생';
BEGIN TEMPVAR:=CHANGENAME || TEMPVAR; 
UPDATE SIMPLE_TEST_TABLE SET NAME=TEMPVAR WHERE
NUM=MYNUM;
END UPDATE_PERSON;

--in int 매개변수  --원래는 in을 붙여주는게 맞아.
--:= 대입 int a=b;   -> 오라클에선 int a:=b;
-- || 뒤에 붙이기      -> a||b a의 뒤에 b를 붙임.

/
select * from simple_test_table;
--1번을 이용희에서 최호준 학생으로 업데이트함.
exec update_person(1,'최호준');
--|| 기호는 글자 이어붙이기. 오라클에선 이게 다리같이 이어붙이는 용도로 쓴다, MYSQL에선 원래 쓰던대로.

--select procedure 는 cursor라는 걸 반환해줌.
--cursor라는 걸 통해서 결과를 출력
--cursor 란? sql 결과를 저장하는 메모리의 위치를 가리키는 포인터

create or replace procedure person_select(
myname in varchar2,
o_cursor out sys_refcursor)
is begin open o_cursor
for 
select num, name, phone_number from simple_test_table 
where name=myname;
exception when others then
dbms_output.put_line('sql error:' ||sqlerrm);
end person_select;

--프로시저로 굳이 select 하기에는 어려움이 많다. 
--실험용 데이터 확인 및 추가
/
select * from simple_test_table;
exec add_person(5,'이동준','010-5517-1234');
exec add_person(6,'이동준','010-2517-1234');
exec add_person(7,'이동준','010-3517-1234');

/
--select 프로시저 호출
--도구-> 환경설정 ->표시->공백문제
var o_cursor refcursor 
exec person_select('이동준', :o_cursor) 
print o_cursor;
--c 언어할때처럼 값을 반환하거나 준게 아니고, 프린트만 해주는 거다 ㅇㅅㅇ

