create table mytest
(num int primary key,
name varchar2(100)
);

insert into mytest (num, name) values (1, '�׽�Ʈ1');
insert into mytest (num, name) values (2, '�׽�Ʈ2');

delete from mytest where num=1;

update mytest set name = 'mytest' where num=2;

select * from mytest;
