-- drop table table1; 할필요 없다 삭제하는거.
-- /**/ 주석

--실습문제 0818- 2,3페이지 .
--ctrl 엔터 일일히 해줘야 함 한줄 쓸때마다 ㅠㅠ
-- 시퀀스 --도 새로고침 !!!!!!! --for문의 증가변수랑 똑같다. 1부터 9999 max까지 어마마하게 설정.
-- 순차적으로 증가해야 하는 값이 있을 때 많이 씀
-- 오라클 장점은 시퀀스 뿐인가... ㅠㅠ
create sequence myrow;
create sequence myseq;

--samsung 문제 내가 푼거
--각자의 이름과 보스의 이름을 같이 출력할 것. 이름, 각자의 id, 보스의 id가  저장되는값.
create table samsungpeople
(boss varchar2(100) primary key, name varchar2(100), id number,
foreign key(id) references song(id) );  

insert into samsungpeople values (myrow.nextval, '이건희', 1);

----------------------------------------------------------


--1부터 1씩 증가, 100되면 다시 1로 돌아옴.
create sequence myseqtest start with 1 increment by 1 maxvalue 100
cycle NOCACHE;


--순차적으로 증가하는 숫자
--drop table song;
create table song
( i_d number primary key, title varchar2(100), price number); --언더바 앞에 ㄴㄴ
--drop table singer;
create table singer 
(id number primary key, name varchar2(100), hit_song_id number,
foreign key(hit_song_id) references song(i_d));


insert into song values (myrow.nextval, 'dragon night', 10000);
insert into song values (myrow.nextval, '신호등', 9000);
insert into song values (myrow.nextval, 'let it be', 8000);
insert into song values (myrow.nextval, 'bad guy', 7000);
insert into song values (myrow.nextval, '분홍신발', 5000);
--123456을 일일히 지정해 줄 필요가 없다.


select * from song;

--hit song을 나중에 추가하려면 이렇게 내가 알고 있는 값의 --이미 존재하는 노래를 적는거. 
-- 컬럼(=열)만 적는다.
insert into singer(id,name) values(myseq.nextval, '이무진');
insert into singer(id,name) values(myseq.nextval, '세카이노오와리');
insert into singer(id,name) values(myseq.nextval, '유희열');

select * from singer;

update singer set hit_song_id=2 where id =1;
update singer set hit_song_id=1 where id =2;

insert into singer values(myseq.nextval,'비틀즈',3); --한꺼번에 삽입

select * from singer;

--join 교집합 ???????????????????????????????????????????????????????????????????????????????????????????
select name, title from song join singer on song.i_d=singer.hit_song_id;

select name, title from song right join singer on song.i_d=singer.hit_song_id; --오른쪽에 있는 것만 보인다. --오른쪽 기준 교집합
select name, title from song left join singer on song.i_d=singer.hit_song_id; --레프트 있는 것만 보인다. --왼쪽 기준 교집합.


select myrow.nextval from dual;
--편집해서 첫시작 만들어준다. 스크립트 실행 f5 ㄴㄴ. ctrl+enter 해서 일일히 수행해준다.