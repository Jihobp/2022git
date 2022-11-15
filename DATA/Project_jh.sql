--�� ���̺� ������-- 

create table gender
(
    gender_number int primary key,
    gender_type varchar2(255) unique not null --    male char(6) not null,  female char(6) not null, nknown char(6) not null //������ �ϸ�, ��� �� ������ ������ �𸣴ϱ�.
);

create sequence gender_num;
delete from gender;
insert into gender(gender_number, gender_type) values(gender_number.nextval, 'female');
insert into gender(gender_number, gender_type) values(gender_number.nextval, 'male');
insert into gender(gender_number, gender_type) values(gender_number.nextval, '�ܰ���');
insert into gender(gender_number, gender_type) values(gender_number.nextval, '������');

update into gender set gender_type='unknown' where gender_type='�ܰ���';
delete from gender where gender_type='������';

select * from gender;
select * from gender where gender_type like '%female%'; --��¹� 
select * from gender where gender_type like '%male%';

create table interest
(
    interest_num varchar2(255) primary key,        --��ȣ �о�  ��ȣ
    interest_text varchar2(255) unique not null --��ȣ �о� �շ�
);

create sequence interest_num;
insert into interest (interest_num, interest_text) values (interest_num.nextval, '��Ʈ����');
insert into interest (interest_num, interest_text) values (interest_num.nextval, '���ظ�Ǯ��');
insert into interest (interest_num, interest_text) values (interest_num.nextval, '�ڵ�');
select * from interest;

update interest set interest_text='����' where interest_text='�ڵ�';

create table user_info
(
    user_num int primary key,   --ȸ����ȣ
    user_id varchar2(255) not null, --ȸ�� ���̵�
    user_password varchar2(255) not null,   --��й�ȣ
    user_nickname varchar2(255) not null,   --�г���
    user_name varchar2(255) not null,   --�̸�
    user_birthdate int not null,    --�������
    user_phone_num int not null,    --����ȣ
    user_email varchar2(255) not null,  --�̸���
    user_profile_picture_name varchar2(255) not null,   --������ ���� ���� �̸�
    user_profile_path varchar2(255) not null,   --������ ���� ���� ���
    user_profile_timestamp varchar2(255) not null, --������
    user_gender_num int not null, -- ���� �ܷ�Ű ����
    user_interest_num varchar2(255), --��� �ܷ�Ű ����
    constraint fk_user_gender_number foreign key(user_gender_num) references gender(gender_number),
    constraint fk_user_interest_num foreign key(user_interest_num) references interest(interest_num)
);

--2) ���̺�� �ּ� ������ 3�� �ְ�, 1�� �ٲٰ�, 1�� ����� (insert, update, delete)

create sequence user_num;
insert into user_info(user_num, user_id, user_password, user_nickname, user_name, user_birthdate, user_phone_num, user_email, user_profile_picture_name, user_profile_path, user_timestamp, user_gender_num, user_interest_num)
values(user_num.nextval, 1, 'parkjiho14', 'ppp1234', 'mint', '����ȣ', to_date('1995-01-14','YYYY-MM-DD'), '010-1234-1493', 'jihop379@gmail.com', 'popcat', 'popopcat_pic', '20220922104408',1,3);

insert into user_info(user_num, user_id, user_password, user_nickname, user_name, user_birthdate, user_phone_num, user_email, user_profile_picture_name, user_profile_path, user_timestamp, user_gender_num, user_interest_num)
values(user_num.nextval, 2, 'ohseryong', 'strongseryong', 'letter', '������', to_date('1998-02-17'','YYYY-MM-DD'), '010-7777-9090', 'seryong12@gmail.com', 'malangmalang', 'malangmalang_pic', '20220923104408',2,2);

insert into user_info(user_num, user_id, user_password, user_nickname, user_name, user_birthdate, user_phone_num, user_email, user_profile_picture_name, user_profile_path, user_timestamp, user_gender_num, user_interest_num)
values(user_num.nextval, 3, 'hacker', 'strongseryong', 'hacker18', '��Ŀ��', '1999-08-18', '010-7808-1818', 'dark_hacekr18@gmail.com', 'errorerror', 'pic_hack', '20220924104408',3,1);


update user_info set name='������' where num=2;
DELETE FROM  user_info WHERE num=3;
select * from user_info;




create table post
(
    post_num int primary key, -- �ܷ�Ű
    post_uploader_num varchar2(255) not null, --���δ� �ѹ� �ܷ�Ű??????
    post_name varchar2(255) not null,
    post_picture varchar2(255),
    pic_filename varchar2(255) not null,
    pic_filesize varchar2(255) not null,
    pic_file_path varchar2(255) not null,
    
    post_text varchar2(255),
    post_timestamp varchar2(255) not null,
    post_url varchar2(255),
    
    post_count_comments int, 
    post_count_likes int, 
    post_tag varchar2(255),
    constraint fk_post_uploader_num foreign key(post_uploader_num) references user_info(user_num)
);
create sequence post_num;
insert into post(post_num, post_uploader_num, post_name, post_picture, pic_filename, pic_filesize, pic_file_path, post_text, post_timestamp, post_url, post_count_comments, post_count_likes, post_tag)
values(post_num.nextval, 1, 1, 'mint', 'popopopcatcorn', 'popcat', 'pppp', '1090x393', null, '��Ĺ�� �Ϳ���', null, null, 45, 70, '�����');




create table comments 
(
    comment_num int primary key, --����Ʈ
    comment_post_num varchar2(255) not null, --��� �޸� ����Ʈ ���̵� �ܷ�Ű?
    comment_user_num varchar2(255) not null, --��� �� ���� �ѹ� �ܷ�Ű?  
    comment_timestamp int not null, --Ÿ�ӽ�����
    comment_contents varchar2(255) not null, --��� ����
    constraint fk_comment_post_num foreign key(comment_post_num) references post(post_num),
    constraint fk_comment_user_num foreign key(comment_user_num) references user_info(user_num)
);
create sequence comments_num;
insert into comments(comment_num, comment_post_num, commmet_user_num, comment_timestamp, comment_contents)
values (comment_num.nextval, 1, 1, 'user1', systimestamp, '��� �Ϳ���');

--create sequence ������ �̸�;  >> �������� �ڵ����� ��ȣ �Ű��ֱ� ���� ���� ��.  ????->����Ʈ�ѹ�, �����ѹ� ��
--create sequence user_up; drop sequence gender_up;

--view  >>���� ���� ��� �ӽ� ���̺� �����. 
create view find_max_comments as select max(comment_num) max_comment from comments;
select * from find_max_comments;

--join (������) ���� �ٸ� ���̺��� �ϳ��� ��ġ����. >>> ����, ���
select interest.interest_num prefernum, user_info.user_gender_num joingender
from interest join user_info
on interest.interest_num = user_info.user_ineterest_num;
--interest�� interest_num�� �̸��� prefernum���� �̸� ����, ���� ��ȣ�� �Ȱ��� 
--interest ���̺��� ineterest_num�̶� user_info���̺��� user_ineterest_num�� ������
--��� ��ȣ�� ���� ����ϴ� ��. 

--5) �׷� ���� ex) ȸ�������� �Է��� ������Ϸ� 10�밡 ����̰� 20�� ���� ������� ��ȸ�ϴ� ��.
--���뺰 �̿��ڼ� ���� ȹ�� (like netflix db, ���̺� � �������� ���䰡 �ִ����� ã�� �� ���� ������� ��踦 ��!!) 
--xxxx ����� group by �ؼ� max ���� ���Ѵ� 
--1. 

select , max(comment_num)



--6) �غ� ����. >> ��� ���� avg. 


/*
create table follow
(
    follower_id varchar2(255) primary key, --�ȷο� �� ���.
    follower_num int,
    following_id varchar2(255) --�ȷ��� ���� ���

);

create table tagged
(
    tag_name varchar2(255) primary key, 
    tag_num int, --�±׼� ���Ѱɱ�? �±� ����, �±� �� ����/.
    tag_id varchar2(255), --�±��� ���� ���̵�
    
);

create table account_info
(
    account_info_post_num primary key,  --�ܤ���Ű
    account_info_comment_num varchar2(255),
    account_info_likes_num varchar2(255),
    account_info_following_num varchar2(255),
    account_info_follower_num varchar2(255)
);
insert into account_info(account_info_post_num, account_info_comment_num, account_info_likes_num, account_info_following_num, account_info_follower_num)
values(1, 122939489348, 45, 34, 59);


*/



