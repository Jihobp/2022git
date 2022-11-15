create table gamer_info(
gamer_num int primary key,  --���̸� ���� ��ȣ
gamer_id varchar2(255) unique not null, --���̸� ���̵�
gamer_password varchar2(255) not null,  --���̸� ��й�ȣ
gamer_nickname varchar2(255) not null,    --���̸� �г��� �ܷ�Ű ����
gamer_gun_num int,   --�ѱ� �̸� �ܷ�Ű ����
constraint fk_gamer_gun_num foreign key(gamer_gun_num) references weapon(gun_num) on delete cascade,
constraint fk_gamer_nickname foreign key(gamer_nickname) references nickname(nickname) on delete cascade
);

select * from gamer_info;
select * from nickname;
select * from weapon;

create sequence gamer_information;

insert into nickname values('������Ʈ');
insert into nickname values('������ģ����');
insert into nickname values('����ī��');
insert into nickname values('��ɲ�');
insert into nickname values('ġ��');
insert into nickname values('���Ͱ����');


insert into gamer_info values (gamer_information.nextval, 'Xenoint', 'djlee', '������Ʈ', 1);
insert into gamer_info values (gamer_information.nextval, 'jihoppop', 'pass123', '������ģ����', 1);
insert into gamer_info values (gamer_information.nextval, 'letter33', 'pa98ss', '����ī��', 2);
insert into gamer_info values (gamer_information.nextval, 'catcatpow', 'p1a4s34s', '��ɲ�', 3);
insert into gamer_info values (gamer_information.nextval, 'hacker818', 'ch23ete', 'ġ��', 1);

update gamer_info set gamer_nickname='���Ͱ����' where gamer_num=4;
delete from gamer_info where gamer_nickname='ġ��';
select*from gamer_info;

drop table nickname;
create table nickname(
nickname varchar2(255) primary key    --���̸� �г���
);
--nickname_num int primary key,    -- ���̸� ��ȣ pk


create table weapon(
gun_num int primary key,
gun_name varchar2(100),
gun_type varchar2(100),
emo_type varchar2(100)
);

create sequence weaponmaster;
insert into weapon(gun_num, gun_name, gun_type, emo_type) values (weaponmaster.nextval, 'r99', 'smg','light emo');
insert into weapon(gun_num, gun_name, gun_type, emo_type) values (weaponmaster.nextval, 'wingman', 'pistol','heavy emo');
insert into weapon(gun_num, gun_name, gun_type, emo_type) values (weaponmaster.nextval, 'peacekeepr', 'shotgun','shotgun emo');


--er diagram : chen �� >>���� ǥ�� db diagram, ���̺�
--�л����̺�ΰ� �а� ���̺� 
--pk, fk, insert deta, update,delete
--�ڵ� ĸ��, ������ ǥ��