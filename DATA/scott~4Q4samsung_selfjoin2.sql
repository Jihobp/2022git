--samsung ���� ���� Ǭ��
--������ �̸��� ������ �̸��� ���� ����� ��. �̸�, ������ id, ������ id��  ����Ǵ°�.
--�Ųٷ� �о��.
--drop table samsungpeople;
create table samsungpeople(
i_d integer primary key, --���� 
name varchar2(20), 
boss integer);  --id�� ��Ƽ���� boss�� ��Ƽ�� �����. �ϳ��� ���̺��� �ΰ�ó�� �Ἥ ���ؼ� join������ �������°Ŷ�.

insert into samsungpeople values (1,'�̰���',1); --�ϳ��� ���̺��� �ΰ�ó�� �����.
insert into samsungpeople values (2,'ȫ����',2);
insert into samsungpeople values (3,'�̺���',1);
insert into samsungpeople values (4,'�����',1);
insert into samsungpeople values (5,'�Ŷ�ȣ��',3);
insert into samsungpeople values (6,'�Ｚ����',4);
insert into samsungpeople values (7,'�����Ｚ',4);
insert into samsungpeople values (8,'�Ｚ���̿���',4);

select * from samsungpeople;

select a.name as i_d, b.name as boss from samsungpeople a, samsungpeople b where a.i_d=b.boss;

select a.name as i_d, b.name as boss from samsungpeople a join samsungpeople b on a.i_d=b.boss; 


--where �� ok, join on �� ok.
--select a.name as SSSS, b.name as VVVV from tablename a, tablename b   where/join~on a.xx=b.xx;
--a������ id��, b������ ������ �ִ´�. samsungpeople a, samsungpeople b���� ��,  ���� ���⿡, 




