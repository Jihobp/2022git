select * from food_truck;
select * from food_category;

-- join
-- �� ���̺��� ����Ǵ� Ű ���� �����ͼ� 
-- �� ���� ��ġ�� �� �����ش�.
select food_truck.name ���ĸ�, price, food_category.name �з� 
from food_truck join food_category on food_truck.foodcode=food_category.code;

-- ���� ������ ��
select food_truck.name ���ĸ�, price, food_category.name �з� 
from food_truck join food_category on food_truck.foodcode=food_category.code order by food_truck.price;

-- ���� ��� ��
select food_truck.name ���ĸ�, price, food_category.name �з� 
from food_truck join food_category on food_truck.foodcode=food_category.code order by food_truck.price desc;

-- ��ø ����
select * from food_truck;

select max(price) from food_truck;

select * from food_truck where price = (select max(price) from food_truck);

select * from find_max_price;

select * from food_truck where price = (select * from find_max_price);


--create view food_name_category_name as 
select food_truck.name ���ĸ�, price, food_category.name �з� 
from food_truck join food_category on food_truck.foodcode=food_category.code;

select food_truck.name ���ĸ�, price, food_category.name �з� 
from food_truck,food_category ;

select food_truck.name ���ĸ�, price, food_category.name �з� 
from food_truck, food_category where food_truck.foodcode=food_category.code;

select * from food_name_category_name;

-- delete
commit;
delete from test1 where num=1;
select * from test1;
rollback;

-- update 
update food_truck set name='���̽� �Ƹ޸�ī��' where name='�ƾ�';
select * from food_truck;

--�÷��߰�
alter table test1 add nickName varchar2(1000);

--not null�� �����ϱ� ���ؼ� ���� �������
update test1 set nickname = 'abc' where nickname is null;

--�÷�����
--nickName �Ӽ��� not null�� �ٲ�(null�� ������� ����)
alter table test1 modify nickName not null; 

insert into test1 values(1,'�̵���','dj');
update test1 set nickname='pjh' where name='����ȣ';
update test1 set nickname='jhj' where name='������';
select * from test1;





