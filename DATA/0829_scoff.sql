--DROP TABLE food;
--//Code sql = query = select �� =���ǹ�
--//structed query language ���� ���� ��.
--���ɷ� ������Ʈ ���డ��, �𸣸� �� �� ��. 
		--//sql���� > sql ���������, ���� ����Ʈ ������??????????????? �ϱ��..args..>>�������� �����. 
create table food --���̺� ����
(
    num int primary key,
    name varchar2(50),
    price int,
    foodcode number, -- food_category�� Ÿ���� �Ȱ��ƾ� ��.
    foreign key(foodcode) REFERENCES food_category(code)
);

--�׷����� �ұ��ϰ� food �ڿ� �÷��� ���� ����??
--1. ��������� �÷����� �����ֱ� ���ؼ�
--2. ���� ���ϴ� ������� ������ �ֱ� ���ؼ�
insert into food(price, name, num) values(10000,'Ȳ������',5);
--3. ���� ���ϴ� �����͸� �ֱ� ���ؼ�.
insert into food(num,name,price) values(1,'�Ұ��',7000);
insert into food(num,name,price) values(2,'�Ұ��',6000);
SELECT*FROM FOOD;
--select all from 
/*select * from �ӽ����̺�;
insert into �ӽ����̺� values('����ȣ',1);
�����÷�(=��)���� name �̴���, �� �̸��� �ѱ� �̸����� 'ǥ��'�� ��
name �κ��� �޴���� �÷�(=��)���� ǥ����.
*/
--insert update delete

--NAME, PRICE�� �̾Ƴ��� �ʹ�--
    SELECT NAME, price from food;
    
--�޴��� ���� �ְ� �ʹٸ�?
select name from food;

--6000����� ���� �� �ִ� ���ĸ� ��ȸ�غ���.
--price �� 6000 �̻� 7000 �̸��� ���� ���´�.
select * from food where price >=6000 and price <7000;

--��ġ������ ��ġ+�������� ����
--�̸��� ���ؼ� ��ȸ�ص� ������
--�׷��� �Ǹ� ��� ��ġ������ ��ġ+�������� �ٲ�
--�׷��� �̷��� 

--���� �ֱٿ� ������ sql�� ȭ���� ���´�
update food set name='��ġ+����' where num=3;
--������Ʈ���� ���� ū ���ǻ���!!!!!
--����  where ���� �� ���� �Ǹ�
--��� �����Ͱ� �� �ϰ������� ������ �ȴ�.
--���� ���⼭ where�� ������ ��� ���ĸ޴���(name))��
--��ġ+������ �Ǿ������ ������������������������������������������������������������������������������������������������
--��� Ȯ��
--update insert delete�� ��� �Ⱥ�����. table ���ΰ�ħ, ������ ���ų�, select *from table; �ľ��Ѵ�/
--�⺻Ű�� ��\���ĸ�, ���� ���ϴ� �����͸� �ٲܶ� �����Ͱ� �ϳ��ۿ� ���ٴ� ������ �Ǿ��־���Ѵ٤�.������ only one deta~~!!!
select*from food;

--insert �� �� ��� �÷��� ������ �˰� �ִٸ�
--�����ϰ�  values���� ���� �� �ִ�.
--�� ���̺��� ����, ���ڿ�, ������ �����ε�, 
--������ �˰� �ִٸ� food �ڿ� �÷��� ���� ����.
--�׷����� �ұ��ϰ� �÷��� ���� ����?

insert into food(price,name,num) values(2000,'����ä',4);
--�׷����� �ұ��ϰ� food �ڿ� �÷��� ���� ����??
--1. ��������� �÷����� �����ֱ� ���ؼ�
--2. ���� ���ϴ� ������� ������ �ֱ� ���ؼ�
insert into food(price, name, num) values(10000,'Ȳ������',5);
--3. ���� ���ϴ� �����͸� �ֱ� ���ؼ�.
insert into food(num,name) values(6,'�����޴�');
select*from food;
--git�� commitó�� ���� �ۼ��� insert, update, delete���� �����ϴ� ��.
--commit������ �ʰ� �� ���α׷��� �������� ���� �ۼ���
--insert update delete�� ������ �ȵ�/. �� ���� ���ϰ� ���Ŷ� ����
commit;

--1. food ���̺� ���� 10���� �߰��غ���
--�÷��̶� �̷��͵� �� �״�� ����ֱ�
--1. �����͸� ����ֱ�, 2.���� ���� ������� �ֱ�, 3.���� ����ְ� ���� �����͸� �ֱ�.
insert into food(num,name,price) values(7,'����',9900);
insert into food(num,name,price) values(8,'�ݶ�',1000);
insert into food(num,name,price) values(9,'��ġ����',10000);
insert into food(num,name,price) values(10,'��ġ�ݶ�',100000);
insert into food(num,name,price) values(11,'��ġġŲ',12000);
insert into food(num,name,price) values(12,'��ġ����',1000000);
insert into food(num,name,price) values(13,'�Ľ�Ÿ',8200);
insert into food(num,name,price) values(14,'��ġ����',990);
insert into food(num,name,price) values(15,'������',13500);
insert into food(num,name,price) values(16,'������',14900);
insert into food(num,name,price) values(17,'��ġ������ġ',4900);
insert into food(num,name,price) values(18,'�������ڵ���',10000000000);
insert into food values(19,'�Ͽ��̾��������� ���ξ���',null);   --null �ֱ�
insert into food values(20,'��ġ�������� ���ξ���',null);     --���� ����ְ� ���� �����͸� �ֱ�
insert into food(name,num) values('��ġ���ξ��ú�ħ��',21);--���� ���ϴ� ����, ���ϴ� ��
select * from food;

--���� num�� ������� �ϰ� �ʹٸ�?
select *from food order by num; --���� asc�� ��������
select *from food order by num asc; --�� �ΰ��� �Ȱ��� �ڵ�. 
--asc : �������� ����, ��������
--desc:��������, ���������ϰ� ������ ���� �ϸ� �� ��



--��� ������� �����ϰ� �ʹٸ�?
--desc�� ���������� �ǹ��Ѵ�.
select *from food order by price desc;  --���� ����

--null ���� �ƴ� �͸� ��ȸ�ϰ� �ʹٸ�?
select *from food where price is not null;      --where�� update, delete�� ���̰�, orderby�� ���Ŀ� ���δ�./

--null ���� �ƴ� �͸� ��ȸ�ϰ� �ʹٸ� + ���� ��� ��?
select * from food where price is not null order by price desc;
update food set price=1000 where price is null;

--2. �޴��� ��ġ��� ���� ���� �͸� ��ȸ�غ���
SELECT * from food where name like '%��ġ%';
select * from food where name like '%����%';
--like ���� ���ڿ����� ����
--%��ȣ�� ���� 0���� �̻�
--�� '��ġ'�� �ƴ϶� '��Ʈ���� ��ġ' �ƴϸ� '��ġ�'��
--��ġ��� �ܾ� �յڿ� ���� ������ ���� ��ġ�� ���ԵǸ�
--�� ��ȸ�Ѵ�.


--3. ������ 5000~7000�� ������ �͸� ��ȸ�ϱ�
select * from food where price >=5000 and price <=7000;
select * from food where price >=3000 and price <=10000;

--4. ������ null���� �� 1000������ ����
update food set price=1000 where price is null;

--5. num���� 1���� �޴��� �̸��� '���ִ� �Ұ��' ��� �ٲٱ�*/
update food set name='���ִ� �Ұ��' where num=1;
update food set name='���ִ� ��Ʈ�����Ͽ��̾�����' where num=2;
--�� Ǯ�� ���� commit

commit;
select *from food;
show autocommit;

--commit : ����
--������ �߰� ���� �����ϱ� ���� commit �ϰ�
--���࿡ �߰� ���� ������ �߸�?�ٸ� rollback
--�� ���ǻ���, 
--1. rollback( =�ǵ�����)�� ���� �ֱٿ�  commit�� �������θ� ���ư�
--2. autocommit ����� �����ִٸ�, rollback�� �ȸ���.
--because, isert update delete �� �԰� ���ſ� commit�� �ȴ�.
commit;
update food set name='����ī��';        --��� ���ĸ��� ����ī���� �ٲ�-
--��� ������ ����ī���� �ٲٰ� commit �ع�����..... ����ų �� ����.

select * from food;         
rollback; --���������� commit�� �������� ����.

--insert update select�� �����Ƿ�, delete�� �غ���.
-- D E L E T E 
--update ���� ���������� where �� �������� ��� ������ �� ���ư�.
--delete from food where price >=50000;

--drop, truncate ��� ������ �ִ�.
--drop �� ���̺� ��ü�� �� ����������, rooback(=����)�� �ȵ�.
--truncate�� �����͸� �� �����, ���̺��� ���� �ִµ� (�ڸ���)
--������ �����Ϳ� ���ؼ� rollback�� �ȵ�.
--������ delete�� rollback�� ��.
--truncate �� �������� drop�� Ư�� !!!!!!!!!!!!!! �����ؼ� �����. ���̺� ��ü�� �� ���������� ������ �ȵǼ���.
--������ Ŀ!!!!!!!!!!!!!!!���� !!�ִ�!

--table�� �÷��� �߰��� �� �ִ�.
alter table food add recipe varchar2(1000);
--�÷��� �Ӽ��� ������ �����ϴ�.
alter table food modify price not null;

select * from food;

--1. ���� �̸��� ��Ʈ�� �� �� ���� ~�� ���� where name like '%%";
--delete from food where name like--'%��Ʈ%';
--2. ���� �̸��� �Ͽ��̾��� �� �� ����
--delete from food where name like --'%�Ͽ��̾�%';
--3. ������ 10000�� �Ѵ� �� ����
--delete from food where price -->10000;
--4. ���İ����� 5000�� ������ ���� �����Ǹ� 'msg�߰�' �̶�� ����
update food set recipe ='msg�߰�' where price<=5000;
--5. ������ ������ ������ �����ؼ� �����ֱ�
--���� ��������� ���� �ʹٸ� ���� asc�� ���̸� ��.
select *from food order by price asc; --asc vs desc 

-------------------------------------------------

select * from food;
select *from food_category;

select code �з��ڵ�, name �з��� from food_category;

--�ܷ�Ű �ڵ�� ��Ÿ���� ,
--�ܷ�Ű�� �ΰ��� ���̺��� ���� ������ �ڵ� ������

create table food_Truck
(
    num int primary key,
    name varchar2(100) not null,
    price int,
    foodcode number, -- food_category�� Ÿ���� �Ȱ��ƾ� ��.
    foreign key(foodcode) REFERENCES food_category(code)
);

--sequence(������)
--����Ŭ�� �ִ°ǵ�, mssql �� �ִ� ��
--mysql���� ��� ����� �� ���� ����� ��� ��.
create SEQUENCE food_rownum;
--�������� ������ ����
--for ���� i ó�� ���� ���������� �þ�� ��
--���� ���������� ���� ���� �ʾƵ� �ڵ����� ���� ������.
--nextval : ++i�̶� ����. �� ������ ���� ���� �־� ��. ->>�� ������ �ƴϾ ������ ������ �׳� �߰����ִ� �Ŵ� ������
insert into food_truck values(food_rownum.nextval, '��Ʈ����',5000,5);
select * from food_truck;
--num 1 �� ��𰬳ĸ� �Ф�
--insert into �� �� ������ ���鼭 num ���� �����ٰ� ������ ���׳� ������.
create sequence dj;
insert into food_truck values(dj.nextval, '����ī��', 4000,5);  
--insert into food_truck values(food_rownum.nextval, '�������', 3000, 50);
--��>> ������ ���� ���� �� ����˴ϴ�?!!!!!! // ī�װ����� �ƿ� ��� �� food code 50/
insert into food_truck values(food_rownum.nextval,'Ÿ�̾�',30000,7);
insert into food_truck values(food_rownum.nextval,'��¥����������ũ',300,7);
select *from food_truck;

--jjion �����̺��� ����Ǵ� Ű ���� �����ͼ�
--�� ���� ��ġ�� �� �����ش�.
select food_truck.name ���ĸ�, price, food_category.name �з� 
from food_truck join food_category on food_truck.foodcode=food_category.code;

-- Q 3
-- 1. �� ī�װ����� ���� 3���� �߰��ϼ���.
insert into food (num,name,price) values(22,'�Ͽ��̾��������� ��Ʈ�������ξ���',9999999999);
insert into Food_Truck values(food_rownum.nextval, '��������ġ��',50000,7);
insert into food_truck values(food_rownum.nextval, '���ʹ���ũ����',3000,7);
insert into food_truck values(food_rownum.nextval, '���ʹ���ũ��ͻ�',2500,7);
insert into food_truck values(food_rownum.nextval, '���ʹ��Ͷ�����',3900,7);
insert into food_truck values(food_rownum.nextval, '���ʹ��;��̽�ũ��',1500,7);
select * from food_truck;
-- 2. ����Ʈ��� �з� �߰��ϼ���. (�ڵ�8)
insert into food_category values(8,'����Ʈ');

-- 3. ����Ʈ 5�� �߰��ϼ���.
insert into food_truck values (food_rownum.nextval,'�����', 6000, 8);
insert into food_truck values (food_rownum.nextval, '��Ʈ���ڶ�', 5900, 8);
insert into food_truck values (food_rownum.nextval, '��Ʈ��������Ǫġ��', 5900, 8);

-- 4. jion �̿��ؼ� ���ĸ�, ����, �з� ǥ���غ�����. --food_truck.name ����Ʈ��, food_truck.price ����, food_category.name �з�
select food_truck.name ����Ʈ��, price ����, food_category.name �з� 
from food_truck join food_category on food_truck.foodcode=food_category.code;
-- 5. 4��ó�� �ϵ� ���ݼ����� �����غ�����.(��Ѽ����� �ϱ�) ��
select food_truck.name ����Ʈ��, price ����, food_category.name �з� 
from food_truck join food_category on food_truck.foodcode=food_category.code order by price desc; --���� //asc

--join �ؼ� 
/*select food_truck.name ���ĸ�,price, food_category.name �з�
from food_truck join food_category on food_truck.foodcode=food_category.code
order by food_truck.price desc;
*/
-- group by
-- ���ĵ��� foodcode���� �����.
select * from food_truck;

--��ü ��� ����
select avg(price) from food_truck;
--��ü �ְ� ����
select max(price) from food_truck;

--�з�(=foodcode)�� ��� ����
select foodcode, avg(price) from food_truck group by foodcode;
--�з���(=foodcode) �ְ� ���� ����
select foodcode, max(price) from food_truck group by foodcode;

--���ǻ���
--�׳� group by�� ����
-- ������ ������ �� ©������(mysql)
-- oracle�� �ƿ� �� ��
--select foodcode, name from food_truck GROUP by foodcode;

-- having
-- group by�� ������ ���ǹ� ���� ��
-- group by ���� where���� ��
select foodcode, max(price) from food_truck group by foodcode 
having max(price)>10000; --max���� ������ �Ѵ� �͸� �����ִ� ��

select foodcode, max(price) from food_truck group by foodcode 
having max(price)<10000; --max���� ������ �̸��� �͸� ������


-- ��ø ����
-- �ְ��� ������ ã�� �ʹٸ�?
-- price���� max(price)�� ������ ���� �����͸� ���
select * from food_truck where price=(select max(price) from food_truck);
-- ������ �ȿ� �� �ٸ� �������� �� ��



-- view
-- view : ���� ���̺�
-- select������ ������� ������ ���̺�
-- create table ������ ������� ���� ���̺��� �ƴϰ�
-- �������̺���� �̿��ؼ� �ڷ���ȸ�ϰ�, �� ��ȸ�� �ڷᰡ���� ������� ������ ���̺�
-- sql plus ��� c## view �߰�

-- food_truck�� �ְ��� �����ϴ� ���̺��� ����
create view find_max_price as select max(price) max_price from food_truck;
select * from find_max_price;

-- view�� �� �̿��ϸ� ��ø ���ǰ� �� �������� �� �ִ�.
select * from food_truck where price=(select * from find_max_price);

--��ü �ְ� ����
select max(price) from food_truck;

------OSR------
--<<<<<<<<<<<<< 1. ���� �з��� ��� ǥ���ϵ�, �з��� ���� ��µǰ� �ϱ� >>>>>>>>>>>>>>>>>>
select avg(price) ���, food_category.name, food_truck.foodcode 
from food_truck join food_category 
on food_truck.foodcode = food_category.code
group by food_category.name, food_truck.foodcode;  
--����� food_catyegory.name�� food_truck.foodcode�� ����ͼ�
--food truck �� food category �� �����ϰ� food truck
--group�� food_cateygory.name�� food_truck.foodcode �� ��� �����,.


--�з���(=foodcode) food �ְ� ���� ����
select foodcode, max(price) from food_truck group by foodcode;

--1-2. ��� ���� ��� ������ ����
select avg(price) ���, food_category.name, food_truck.foodcode 
from food_truck join food_category 
on food_truck.foodcode = food_category.code
group by food_category.name, food_truck.foodcode order by avg(price) desc;

--1-3. ��� ���� ������ ������ ����
select avg(price) ���, food_category.name, food_truck.foodcode 
from food_truck join food_category 
on food_truck.foodcode = food_category.code
group by food_category.name, food_truck.foodcode order by avg(price) asc;

select * from food_truck;

----join���� �������� �ϴ°� ����
--2. �з����� ���� ��� ���ĵ� ǥ���ϱ�
--select foodcode, max(price) from food group by foodcode having max(price);
-- price���� max(price)�� ������ ���� �����͸� ���
create view max_price as select max(price) max_price, food_category.name from food_truck 
join food_category on food_truck.foodcode = food_category.code 
group by food_category.name;

select * from max_price;

create view food_price_category as select food_truck.name food_truck_name, price, food_category.name food_category_name
from food_truck
join food_category on food_truck.foodcode = food_category.code;

select * from food_price_category;

select food_truck_name, price, max_price.name from food_price_category
join max_price on food_price_category.price = max_price.max_price and 
food_price_category.food_category_name = max_price.name;



--3. �з����� ���� ������ ���ĵ� ǥ���ϱ�
--price ���� min(price)�� ������ ���� �����͸� ���
create view min_price as select min(price) min_price, food_category.name from food_truck 
join food_category on food_truck.foodcode = food_category.code 
group by food_category.name;

select * from min_price;

select food_truck_name, price, min_price.name from food_price_category
join min_price on food_price_category.price = min_price.min_price and 
food_price_category.food_category_name = min_price.name;



--4. ��������� �� �� ������ ���� ������ ���� ���ĺз���?
create view avg_price_code as select avg(price) avg, foodcode from food_truck group by foodcode;
select * from avg_price_code;
select min(avg) min from avg_price_code;
create view min_code as select foodcode from avg_price_code where avg = (select min(avg) from avg_price_code);
select food_category.name from food_category where code = (select * from min_code);


--5. ��������� �� �� ������ ���� ��� ���� ���ĺз���? 
select max(avg) max from avg_price_code;
create view max_code as select foodcode from avg_price_code where avg = (select max(avg) from avg_price_code);
select * from max_code;
select food_category.name from food_category where code = (select * from max_code);

--nullable > false �� ����x true�� ��o

--view : join�� ª��,
/*
join : (������) ���δٸ� ���̺��� �ϳ��� ���̺�� ��ġ�°�.
��ø���� : select �� �ȿ��� select ���� �� ������ ��....   
crud - > create read=select update delete..
sequence(������) ����Ŭ, mssql �� �ִ°�. my sql�� ����.
�������� ������ ����.
for ���� i ó�� ���� ���������� �þ��, ���� ���������� ���� ���� �ʾƵ� �ڵ����� �� ����. 
nextval�� ���Ѹ� �� ������ �ƴϾ ������ ������ �߰����ֵ��� ���� ���� �־���.
--animal_id ������ ��ȸ�ϴ� sql �� �ۼ�.
--SELECT * from animal_ins order by animal_id;
--���� ��ȣ�ҿ� ���� ��� ������ �̸��� ��ȣ������ ��ȸ, animla_id ����
--SELECT name, datetime from animal_ins order by animal_id desc;
--���� ��ȣ�ҿ� ���� ���� �� ���� ����1�� ���̵�� �̸��� ��ȸ�ϴ� SQL ���� �ۼ����ּ���. �̶� ����� ���̵� ������ ��ȸ���ּ���.
--SELECT animal_id, name from animal_ins where intake_condition like '%sick%' order by animal_id;
--���� ��ȣ�ҿ� ���� ���� �� ���� ����1�� ���̵�� �̸��� ��ȸ�ϴ�-->!='aged'���,  SQL ���� �ۼ����ּ���. �̶� ����� ���̵� ������ ��ȸ���ּ���.
--SELECT animal_id, name from animal_ins where intake_condition !='aged' order by animal_id; 

SELECT animal_id, name, datetime from animal_ins order by name, datetime desc;
-- ��, �̸��� ���� �����̸� !!!! ��ȣ�� ���߿� ������ ������ ���� ������� �Ѵ�????? 
-- ��ø����? select ���� select !! datetime ? �� ������ ���!! 
-- SELECT name from animal_ins where datetime=(select min(datetime) from animal_ins);
-- SELECT animal_id, name, datetime from animal_ins where 'name=name' order by datetime desc; zzz��������������������������������

-- ��ø����? select ���� select !! ���� ���� ���� ������ �̸�??  datetime �� ���� ���. 
SELECT name from animal_ins where datetime=(select min(datetime) from animal_ins);*/



select * from food_truck;
select * from food_category;

-- �з� '�ڵ庰��' ����� ǥ���غ���
select foodcode, avg(price) from food_truck group by foodcode;
-- => �� �ڵ尡 �ǹ��ϴ� �ٸ� ���� ������ �� ����.

--<<<<<<<<<<<<<<<1. ���� �з��� ��� ǥ���ϵ�, �з��� ���� ��µǰ� �ϱ�>>>>>>>>>>>>>>>
-- ������ : �� ���� ���̺��� ��� ��Ī��Ű�� ��

-- view ���� Ǫ�� ���(=��ø����) select select -->>> view�� slect�ϸ� slect �� ����� �״�� ���´�. view�� ���� ����ȭ
select name, avgprice from 
(select foodcode, avg(price) avgprice from food_truck 
group by foodcode) a
join 
food_category 
on a.foodcode=food_category.code; --foodcode�� foodcategory.code �� ������.

--from () a ��� �ӽ����̺��� ���� =view�� ���. 
--foodcode�� �������� food category��  join�ϴ� ��. 
--foodcode �� ������ ����� �����ϴµ�, food_truck�������� �����ͼ� groupby foodcode �� ���´�. 
--avg(price)�� avgprice�� ������ ��. 
--a�� Ǫ���ڵ�� Ǫ��ī�װ��� �ڵ�� ������ �̸��� ��հ����� ����ϴ� ��.


--view �̿��ؼ� Ǫ�� ���
create view groupby_foodcode_avg as
select foodcode, avg(price) avgprice from food_truck
group by foodcode;


select * from groupby_foodcode_avg;


select name, avgprice from food_category join groupby_foodcode_avg 
on food_category.code=groupby_foodcode_avg.foodcode;

-- 1-2. ��հ��� ��� ��
select name, avgprice from food_category join groupby_foodcode_avg 
on food_category.code=groupby_foodcode_avg.foodcode 
order by avgprice desc;
-- 1-3. ��հ��� ������ ��
select name, avgprice from food_category join groupby_foodcode_avg 
on food_category.code=groupby_foodcode_avg.foodcode 
order by avgprice asc; --asc�� ������ ������


-- <2. �з����� ���� ��� ���ĵ� ǥ���ϱ� > 

-- 1. group by �̿��ؼ� �� �ڵ庰�� ��� ������ ǥ���ؾ� ��.
--select foodcode, max(price) maxprice from food_truck group by foodcode;
--create view max_food as 
--select foodcode, max(price) maxprice from food_truck group by foodcode; --max food view ���� ������ 
-- 1. join �� �̿��ؼ� �� ������ ī�װ���(=�з���) ǥ���ؾ� ��.
-- distinct : �ߺ� ���� Ű����. 
select distinct food_truck.name foodname, price, food_category.name categoryname 
from food_truck join food_category 
on food_truck.foodcode = food_category.code;
--food_category.name categoryname  �� Ǫ�� ī�װ� ������ �̸� ����. 
--food_category.name (as) categoryname  ~~~~~~ 
--��ǥ�� �Ἥ �Ӽ��� ����, �״��� ������ �̸����� �����ִ� ��. 
--�����̸��� ���� ��츦 ����.

--food_category.�� �ִ� �̸��� categoryname �̴�.
-- 1���� 2���� join ?      ������ --->> view �� �Ἥ 1, 2���� �ٿ��� �Ѵ�. ������> 
create view food_category_truck as
select distinct food_truck.name foodname, price, food_category.name categoryname
from food_truck join food_category
on food_truck.foodcode = food_category.code;
--create view ~ as (���� �ִ�  select �� ������ ������)


--select * from max_food; -- �ڵ庰 �ְ�
select * from food_category_truck; -- �� ���ĺ� ī�װ� ǥ���ϴ� ��
-->select distinct food_truck.name foodname, price, food_category.name categoryname 
--from food_truck join food_category 
--on food_truck.foodcode = food_category.code; view�� ����� ����ü--slect�� slect�Ѱ�.

--2. ������ ī�װ����� �з��ϰ� �Ǿ���.
--�׷��Ƿ� ī�װ����� max ����(view��) �ٽ� group by �Ѵ�.
select categoryname, max(price) maxprice from food_category_truck 
group by categoryname;

--categoryname���� ��� categoryname�̶� �ִ밡���� �����´�. max(price) as maxprice


--drop view max_food;
--view ���� �� ���ǻ��� : avg�� max �� �Լ��� ����� �� �ٸ� �̸����� ġȯ�ؾ� ��
create view max_food as
select categoryname, max(price) maxprice from food_category_truck 
group by categoryname;
--as �ں��� ��� view�� ������ �˷��ִ°�.

select * from max_food;


-- 3.  1���� 2���� join�Ѵ�.
select foodname, price, max_food.categoryname from max_food 
join food_category_truck  --view
on max_food.categoryname=food_category_truck.categoryname and 
max_food.maxprice=food_category_truck.price;
--�ִ� ������ ���� �з��� ���´�. (�ѽ� �߽�) 
--max food�� category join(�� view �ΰ� �����Ѱ�)
--�� ������ ������ ������, ������ �� ������ ���� ���� ������



-- <<<<<<<<<<<<<<<<<<<<<< 3. �з����� ���� ������ ���� ǥ�� >>>>>>>>>>>>>>>>>>>>> 
--1.���ĸ�, ī�װ����� ������ ���̺� �����(2������ ����, food_category
--2. food_category_truck�� �ִ� ������ group by �ؼ� min ���� ���Ѵ�, 
select categoryname, min(price) minprice from food_category_truck
group by categoryname;
create view min_food as
select categoryname, min(price) minprice from food_category_truck
group by categoryname;

-- 3�� ����
select foodname, price, min_food.categoryname from 
food_category_truck join min_food on 
food_category_truck.categoryname = min_food.categoryname and 
food_category_truck.price = min_food.minprice;

--groupby, view �����аɷ� join ���ؼ� ��ø���Ǳ��� �ϸ� �ȴٰ�..^^??? ^^???????????????
-- <<<<<<<<<<<<<<4�� ��������� ���� ������ ���� ������ ���� ���� �з�? >>>>>>>>>>>>>>
--1������ ����� ������.
select * from groupby_foodcode_avg;
--�ڵ庰�� ���� �����µ�, �� �ڵ忡 ��Ī�Ǵ� �̸��� �߰�(join �̿�)
select name, groupby_foodcode_avg.foodcode, avgprice 
from groupby_foodcode_avg 
join food_category 
on 
groupby_foodcode_avg.foodcode=food_category.code;

--�̸��̶� groupby_foodcode_avg.~����~ Ǫ���ڵ带 �����԰�, avgprice �� �����ͽ�. 
--group_foodcode_avg �� food_category�� join �Ѵ�. 
--groupby_foodcode_avg�� Ǫ���ڵ��, food_category�� �ڵ�� ��ĥ��. 

create view group_avg_food as 
select name, groupby_foodcode_avg.foodcode, avgprice 
from groupby_foodcode_avg 
join food_category 
on 
groupby_foodcode_avg.foodcode=food_category.code;

--group_avg_food �並 �����
--�̸��̶� groupby_foodcode_avg.~����~ Ǫ���ڵ带 �����԰�, avgprice�� �����Դ�. 
--on - �����ϴ� ������ groupby_foodcode_avg.foodcode=food_category.code�� ���� ��, 
--from group_foodcode_avg�� �̸�, �ڵ�,�� ��հ����� ����ϴ� ��.
--�տ������� �а� �ڿ��� ����� �������� 

select * from group_avg_food;

--��ø���� (view���� ��ø����) slect slect �Ǵϱ�. 
select * from group_avg_food where avgprice=
(select min(avgprice) from group_avg_food);


--avgprice�� �ڿ����� ����Ʈ �����̽�(min(avgprice) from group_avg_food)-�ּҰ��̶��� ����?. 
--avg price �並 ����Ѵ�. 


-- <<<<<<<<<<<<<<<<<<< 5�� ��������� �� �� ������ ���� ������� ���� �з�? >>>>>>>>>>>>>> 
--4�� �ٿ����� MAX �� �ٲٸ� �� ������
select * from group_avg_food where avgprice=
(select max(avgprice) from group_avg_food);




-- ���ν���_�Լ�_Ʈ���� ����_insert,delete,update,select,�Ű�����_��ȯ���ִ��Լ�_Ȱ��

