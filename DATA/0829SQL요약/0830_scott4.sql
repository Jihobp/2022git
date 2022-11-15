--fx 함수 ㅇㅅㅇ
--set serveroutput on; --dbms output(콘솔로그)때문에 ㅔ하는 것
--다 쓰면 주석처리하거나 이거 1줄만 다른 파일에서 하기... 왜하는지? 몰그ㅖㅆ다능~~~~~~~

--아주 심플한 함수
--djleee 라는 텍스트 반환하는 함수

create or replace function mytest_func return varchar is
v_test varchar2(100);
begin v_test:='이동준';
return v_test;
end;
--바차를 집어넣고 이동준을 넣어서v_test 반환

/
select mytest_func() from dual; --dual 임시테이블, 함수 기능테스트시 쓰임.

select * from simple_test_table where name=mytest_func();


--번호를 통해서 이름값을 반환해내는 함수

create or replace function func_getperson(v_num int)
return varchar is v_name varchar(100);
begin select name into v_name from simple_test_table where num=v_num;
return v_name;
exception when others then 
DBMS_OUTPUT.PUT_LINE('exception occurred! ('||sqlcode||'):'||sqlerrm);
return '';
end;
/
--set serveroutput on; DBMS_OUTPUT 때문에 쓰라고 한 거임...

/*
--인트타입 파라미터가 있다. 숫자가 들어갈거고,
리턴값은 바차타입인데 브이넴의 변수값을 리턴할거다.
예외가 발생하면 에러메세지 적고 
공백을 리턴할거다.
beging에서 시작하면 네임을 선택해서 브이넴에 집어 넣는다, 심플테스트 테이블의, 웨얼 넘-브이넘일때. 

--리턴타입은 바차고 프이네임을 반환. 
--심플테스트에 있는걸 집어넣고, 
--exception이 발생했으면, 
--오류 메세지를 뱉어내고, --오류 메세지때문에 setserver on을 하라고 한거다.

--set serveroutput on; DBMS_OUTPUT 때문에 쓰라고 한거임.*/


---
select func_getperson(1) from dual; --1번 학생의 이름 조회
select mytest_func() from dual;--이동준 이름 반환

--프로시저 안에 반환값 있는 함수를 매개변수로 넣을 수 있다.
exec add_person(50, func_getperson(1), '010-9999-9191');
exec add_person(100, mytest_func(), '010-2299-9191');

select * from simple_test_table;
