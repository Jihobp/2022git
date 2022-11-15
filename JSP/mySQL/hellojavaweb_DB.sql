drop table testtable;
create table testtable(
mynum int primary key,
name varchar(100) );
insert into testtable values(1,'박지호');
insert into testtable values(2,'오세룡');
select * from testtable;
update testtable set name='박지호(여성)'
where name='박지호';
delete from testtable where name='오세룡';

drop table Employee;
create table employee(
name varchar(100),
sabeon int primary key,
buseo varchar(100));

insert into Employee values('박지호',1,'대식');
insert into Employee values('오세룡',2,'소식');
insert into Employee values('이범식',3,'범식');
insert into Employee values('조영탁',4,'다식');

select * from Employee;

-- 데이터베이스(스키마) 선택하는 것.
use sys;
use hello_java_web;

-- 내가 작업하고자 하는 데이터 베이스를 선택을 해야 함.
-- 더블클릭을 하든 use를 하든 선택을 해줘야 한다.
-- 프로그램이랑 연동할거면 코드로 연동해야 해서 crud 써라.
/**/

-- member
-- 이름, id, 비번, 폰번호, 성별
-- 제발제발제바랍ㅈ뎆베베제제발 jspdb 드럼통 연결하고 테이블 생성 하샴 ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
drop table member;

create table member(
	name varchar(100) not null,
    id varchar(100) primary key,
    pw varchar(100) not null, 
    hp varchar(50) unique,
    gender varchar(10)
);

alter table member add hobby varchar(50);

select * from member;
-- -----------------------------------------
create table memberDTO(
name varchar(100) not null,
id varchar(100) primary key,
pw varchar(100), 
gender varchar(100)
);

select * from memberDTO;

-- -----------------------------------------
select * from user;
create table BBS(
	bbsID int primary key,
    bbsTitle varchar(50),
    userID varchar(20),
    bbsDate DATETIME,
    bbsContent VARCHAR(2048), -- 게시글에 작성된 글을 담을 수 있게함, 
    bbsAvailable int -- 삭제됐는지 안됐는지 알려줌. 1인경우 삭제되지 않은 경우, 0인경우 삭제된 경우.>글삭목적
);
-- insert into user values('홍길동','gildong','1234','010-3949-2929','남자','수면'); 
/*
mysql> use BBS;
mysql> SELECT * FROM BBS;*/

-- UPDATE 테이블명 SET 필드명='바꿀 필드값' ... WHERE 조건절
-- 테이블에서 id가 1인 데이터의 name값을 snowball로 바꿉니다.


-- bid : 게시글에 고유 번호(기본키)
create table mvc_board(
bid int not null auto_increment,
bName varchar(45) default null,
bTitle varchar(100) default null,
bContent varchar(100) default null,
bDate timestamp null default current_timestamp, /*기본값:현재 시간*/
bHit int default 0, 
bGroup int default null,
bStep int default null,
bIndent int default null,
primary key(bid)
);