--프로시저
create or replace procedure add_person
(
mynum in int,
myname varchar2,
mypn varchar2
)
is begin 
insert into simple_test_table values(mynum,myname,mypn);
end add_person;

/
--begin 뒤에 스페이스 해야함. 이걸 실행하면 뒤도 실행한다. 
--error..j.................

-- 삭제
create or replace procedure delete_person
(mynum in int)
is begin delete from simple_test_table where num=mynum;
end delete_person;

/
exec add_person(4,'오세룡','010-1212-7777');
select * from simple_test_table;
exec delete_person(4);


/*
1. 프로시저 -- 특정기능을 수행하는 트랜젝션 언어로, 호출을 통해 실행되어 미리 저장해 놓은 sql 작업 수행,
오라클에서 프로시저를 세미클론으로 구분이 안되기 때무네 / 혹은 다른 워크시트에서 실행
-> t. 함수랑 거의 유사함, 미리 만들어둔 트랜잭션, select 문 등을 호출하는 용도
etc. 우리가 실행해야함

그룹바이 > 총합을 한번에 구할려고 한번의 sum으로 묶어서 가져오는것. 
~별 비용,~부서별 비용, 
>>insert, update 할때 자동실행은 트리거,
>>insert 문의 view 화 하는 것. -->프로시져 
--values(mynum,myname,mypn) 을 add_person에 넣는다. 

2. 함수-- 프로시저와 유사하나 RETURN을 사용하여 처리결과를 단일값으로 반환.
-> t. 여러개의 함수가 하나의 프로시저를 이룬다. 즉 프로시저의 실행단위라고도 본다,
통상적으로!!!(정확한 정의는 아님)
프로시저는 반환값 없는 함수
함수는 반환을 해줘야 하는 것
이렇게 정의하기도 합니다.

3. 트리거-- 이벤트가 발생할 떄마다 자동적으로 수행되는 절차형 SQL. 
-> t. 특정한 조건이 되었을 때 호출하는 코드
CREATE OR REPLACE -- 없으면 만들고 있으면 덮어 쓰기
IS BEGIN과 END 프로시저명 -- 사이에 함수 작성
프로시저+프로시저명+실행 -- 실행 가능.
etc. 자동화 같이 실행( 쇼핑몰 주문 목록 up! )

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
프로시저, 함수, 트리거
셋 다 쿼리를 미리 정의해놨다가 함수 호출하듯이 불러서 쓰는 것.
트랜잭션 ㅣ 일종의 작업 단위. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
*트랜잭션=쿼리문, 날리기 전에 커밋해주세요 : crud 한다는 것. 
*커밋하면 저장, 체크포인트. 
db의 상태를 변화시키는 작업 단위
(insert, update, delete 단, drop 은 해당 안됨)


프로시저, 함수, 트리거
셋 다 쿼리를 미리 정의해놨다가 함수 호출하듯이 불러서 쓰는 방식


 - - - - - - - - - - - - - - - - 
셋다 만드는 방법은 다들 매우 유사하므로
본 수업에서는 프로시저만 다룬다.
PL/SQL처럼 조건문이나 반복문들도 있는 데,
이러한 부분들은 필요할 때 직접 찾아보시길 바란다.
*/