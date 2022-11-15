create table MYSTUDENTS ( --�ߺ� �Ǹ� �����ȵǰ�, ���̺� ������ ���ΰ�ħ �ϴû� ������ ���巷����.
name varchar2(20),
age number,
hakbeon varchar2(20) primary key); --�⺻Ű�� �ƴϳ� �����ϴ°�.





insert into student(hakbeon, name, age) values('11', '�ȼ���', 19);
-- ���ڿ� ���ڿ�
insert into mystudents(hakbeon, name, age) values('1', '�ȼ���', 19);
insert into mystudents(hakbeon, name, age) values('2', '������', 15);
insert into mystudents(hakbeon, name, age) values('3', '����ȣ', 99);
insert into mystudents(hakbeon, name, age) values('4', '��ȣ��', 78);
-- drop table mystudents; �ٻ����Ǽ� �ٽ� �����ؾ��� �Ф� �ϴû� ���ΰ�ħ.

--drop - ���̺� �������� ���� �ȵ�
--truncate - ���̺� �ִ� ������ ������ �����ϰ� ���̺� ��ü�� �׳� ����.
--delete ���̺� �ִ� ���� �����ϰ� ������ ��
commit; --insert, update, delete �� �ķ� ���ִ°� ����.
rollback; --������ commint�� �κ����� ���ư� �� �ִ�.
--�������� ���ư��� ����. �� 2�ܰ� ������ ���ư��� �ȵ�.

--savepoint ������ �������� ���ư� �� �ִ°�

--���̰� 10���� �л��� ��ȸ
select * from mystudents;
select * from mystudents where age >=10 and age<=19; 
select * from mystudents where age>9 and age<20;

--*��ſ� �ٸ��� �ᵵ ��.

select name from mystudents where age>9 and age<20;
select name as �̸� from mystudents where age>9 and age<20; --as ��������.
select name �̸� from mystudents where age>9 and age<20;
select name as "�� ��" from mystudents where age>9 and age<20;
select name "�� ��" from mystudents where age>9 and age<20;

delete from mystudents where name='��ȣ��'
--insert into mystudents values('����ȣ',10,'123');
--select * from mystudents;
update mystudents set age=20 where name='����ȣ';

-- crud
-- pk
-- ���踦 ǥ���Կ� �־ �ſ� �߿��� ����� fk�� �Ұ�
-- 2�� �̻��� ���̺��� �ϳ��� ���̰� ���ִ� join�� ���ؼ� �ٷﺼ ��, 

--�а����̺� �����
create table major (name varchar2(20), code char(3) primary key);

insert into major values('�İ�', '001');
insert into major values('ȭ��', '102');
insert into major values('���', '200');
--�л� ���̺� ���ο� �÷��߰��غ���
-- �а��ڵ带 �߰��� ��
-- ���ǻ���!!!!!!!!!!!!!!!
--�а��ڵ� �߰��� �� major���̺��� doe�� �ڷ���, ũ�Ⱑ ��� �¾ƾ���.
alter table mystudents add(code char(3));
--�ܷ�Ű �߰�
--�������� �̸��� �ƹ����Գ� ��� ��
--major�� code �÷��� ����(reference)�ؼ� �������.
alter table mystudents add constraint fk_stu;
alter table add contraint fk_stu foreign key(code) references major(code);



--001�� �����ϴ� �а��̹Ƿ� ������ �߰�����
insert into mystudents values('������', 23, '100','001');
--777 666�� ���� ���� �߰� �Ұ���
insert into mystudents values('�̵���1',34,'109''777');
insert into mystudents values('�̵���2',34,'110''666');

--2�� ���
insert into mystudents values('��ο�', 27, '7','200');
insert into mystudents values('�̵���', 17, '8','200');
insert into mystudents values('����Ź', 17, '9','200');

--3�� �а��ڵ尡 001�� �л��� �̸��� ���̸� ����غ�����.
select * from mystudents where code='001'; 
--4�� �а��ڵ尡 102(Ȥ�� 002)ȭ�� �� �л��� ���̸� ��� 20��� �����ϼ���.
update mystudents set age=20 where code='102';  
--5�� ���� �̾��� �л��� ����������. (like ��� Ű���带 �̿��ؾ� �� ��)
delete from mystudents where name like '��%';

--����
--���� ���� ���� ��� ����
select max(age) from mystudents;
delete from mystudents where age = (select max(age) from mystudents);
select * from mystudents;

--1�� ������ ���� �׷ȴ� ���̾�׷��� crud, pk, fk �Ἥ ������ ������ �غ�����. 
--crud : create, read, update, delete
--�߸�����Ŷ�� �����ϰų� ���ص� ��. �⺻������ ������� �л����̺� ���� ������ ��������.

--���̺� 2���� ������ ����. 

--�л� ���̺� �ִ� �а��ڵ带 �̿��ؼ� �а��� ����غ���
--����
select mystudents.name "�л���", major.name "�а���", hakbeon from 
mystudents join major on mystudents.code=major.code;

--char �� varchar2 �Ѵ� ���ڿ�
--char�� ũ�� ���� varchar2 ũ�Ⱑ ����
--VARCHAR2=VARCHAR �ε� VARCHAR2�� ����Ŭ�� ����� �ߴ�.
--char(20) - > an������ 20����Ʈ ũ�� �Ҵ�, varchar(20) �ִ� 20����Ʈ �Ҵ�//��� �׋��׶� ����������ؼ� ũ�Ⱑ Ŀ�� �ӵ��� ���� but �ǹ����� �̰ŷ� �� ��������


