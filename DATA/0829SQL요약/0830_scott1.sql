create table simple_test_table
(
num int primary key,
name varchar2(30) not null,
phone_number varchar2(20) unique
);
--��ȣ�� �л���ȣ �ֹι�ȣ ó�� ���ļ� �ȵǰ� ��ΰ� ���� �ִ�.
--�ڵ��� ��ȣ�� ��ġ�� ������ ���� ���� �ִ�. 
--not null, unique 
--������ ���� ������ �ϰ� ���� �� ����մϴ�. �� �ߺ��� ������� �ʴ°�. 
--�׸��� �翬�� NOT NULL�� �Բ� ��밡��. 
--id?VARCHAR(10)?UNIQUE?NOT?NULL,


insert into simple_test_table values(1, '�̿���', null);
insert into simple_test_table values(2,'�̵���','010-2940-1613');
select * from simple_test_table;
delete from simple_test_table;


--Ư���� ������ �Ǿ��� �� ȣ���ϴ� �ڵ�
/*
�´� ����� ����� �ٵ� �ſ� �����ϹǷ� �� ���������� ���ν����� �ٷ��.
PL/SQLó�� ���ǹ��̳� �ݺ����鵵 �ִµ�, �̷��� �κе��� �ʿ��� �� ���� ã�ƺ��ñ�. 
*/

--���ν��� -- add_person ������ �����, �ٲٱ�. 
create or replace procedure add_person
(
mynum in int,
myname varchar2,
mypn varchar2
)
is begin 
insert into simple_test_table values(mynum,myname,mypn);
end add_person;

--begin �ڿ� �����̽� �ؾ���.
--error..j.................
--insert ���� view ȭ �ϴ� ��. = > ���ν��� 
--values(mynum,myname,mypn) �� add_person�� �ִ´�. 
