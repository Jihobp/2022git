create table food_category
(
   code int primary key,
   name varchar2(100) not null unique
);

insert into food_category values(1, '�ѽ�');
insert into food_category values(2, '�߽�');
insert into food_category values(3, '�Ͻ�');
insert into food_category values(4, '���');
insert into food_category values(5, '����');
insert into food_category values(6, '��Ÿ');
insert into food_category values(7, '���ľƴ�');
insert into food_category values(8, '����Ʈ');


create table food_Truck
(
   num int primary key,
   name varchar2(100) not null,
   price int,
   foodcode number not null, 
    foreign key(foodcode) REFERENCES food_category(code)
);


create SEQUENCE food_rownum;


insert into food_truck values(food_rownum.nextval, '�����', 6000, 1);
insert into food_truck values(food_rownum.nextval, 'û����', 5500, 1);
insert into food_truck values(food_rownum.nextval, '��ġ��', 5000, 1);

insert into food_truck values(food_rownum.nextval, '��κ�', 3000, 2);
insert into food_truck values(food_rownum.nextval, '�����', 4500, 2);
insert into food_truck values(food_rownum.nextval, '���꽽', 8000, 2);

insert into food_truck values(food_rownum.nextval, '�ʹ�', 12000, 3);
insert into food_truck values(food_rownum.nextval, '������� �߳�', 2500, 3);
insert into food_truck values(food_rownum.nextval, '���', 9000, 3);

insert into food_truck values(food_rownum.nextval, '���İ�Ƽ', 16000, 4);
insert into food_truck values(food_rownum.nextval, '������ũ', 57000, 4);
insert into food_truck values(food_rownum.nextval, 'û������', 15000, 4);

insert into food_truck values(food_rownum.nextval, '��������', 18000, 5);
insert into food_truck values(food_rownum.nextval, '�������� �', 500, 5);
insert into food_truck values(food_rownum.nextval, '���ξ��� �ſ���', 1200, 5);

insert into food_truck values(food_rownum.nextval, '�����', 12000, 6);
insert into food_truck values(food_rownum.nextval, '�巡�� ����', 650000, 6);
insert into food_truck values(food_rownum.nextval, '��ġ ���� ��', 500, 6);

insert into food_truck values(food_rownum.nextval, '���콺', 7500, 7);
insert into food_truck values(food_rownum.nextval, 'Ű����', 130000, 7);
insert into food_truck values(food_rownum.nextval, '�����', 99000, 7);


insert into food_truck values(food_rownum.nextval, '�ƾ�', 3500, 8);
insert into food_truck values(food_rownum.nextval, '��������ũ', 160000, 8);
insert into food_truck values(food_rownum.nextval, '���̽�ũ������ũ', 85000, 8);




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





-- view
-- view : ���� ���̺�
-- select������ ������� ������ ���̺�
-- create table ������ ������� ���� ���̺��� �ƴϰ�
-- �������̺���� �̿��ؼ� �ڷ���ȸ�ϰ�, �� ��ȸ�� �ڷᰡ���� ������� ������ ���̺�

-- food_truck�� �ְ��� �����ϴ� ���̺��� ����
create view find_max_price as select max(price) max_price from food_truck;
select * from find_max_price;

-- view�� �� �̿��ϸ� ��ø ���ǰ� �� �������� �� �ִ�.
select * from food_truck where price=(select * from find_max_price);
