--�ּ� 2���� �÷�
--1�� �÷��߰� �Ǿ���
--id�� ���� Ÿ���� �÷��̾�� �ǰ�(number��� �Ѵ� number)
--id���� �ִ� ���� �߰������ ��

create table mysamsungpeople(
id number primary key,
name varchar2(30) not null, --������ ������� ����
boss_is number)
select * from mysamsungpeople;
insert into mysamsungpeople values(1,'�̰���',1);
insert into mysamsungpeople values(2,'ȫ����',2);
insert into mysamsungpeople values(3,'�̺���',1);
insert into mysamsungpeople values(4,'�����',1);
insert into mysamsungpeople values(5,'�Ŷ�ȣ��',3);
insert into mysamsungpeople values(6,'�Ｚ����',4);
insert into mysamsungpeople values(7,'�����Ｚ',4);
insert into mysamsungpeople values(8,'�Ｚ���̿���',4);

alter table mysamsungpeople rename column boss_is to boss_id;

select a.name boss, b.name name 
from mysamsungpeople a join mysamsungpeople b
on a.boss_id=b.id ;

select a.name boss, b.name name 
from mysamsungpeople a join mysamsungpeople b
on a.id=b.boss_id;

select * from mysamsungpeople;

--���� ���̺� �ΰ��� ������ ���Ƿ� a,b�� ���� ���̴�. ������!!
--select a.name boss, b.name from samsungpeoiple
-- a(boss name) join samsungpeople b(name) on a.id=b.boss_is; 
-- a,b�� ������ �� join�Ǹ� a.id=b.boss_is �� ����!! 