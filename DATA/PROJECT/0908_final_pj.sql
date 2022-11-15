drop view view_user;
drop view find_max_comments;
drop view view_user2;
drop view female_nickname;

drop procedure insert_prefer;
drop procedure ex_prefer_gender_info;
drop procedure delete_prefer;
drop procedure add_user;
drop procedure insert_user_info;

drop function insufficient_like;



drop procedure procedure_delete_post;
drop procedure procedure_delete_user;
drop trigger delete_following_info;
drop trigger update_following_info;
drop trigger insert_following_info;
drop trigger delete_like_info;
drop trigger update_like_info;
drop trigger insert_like_info;
drop trigger delete_comments;
drop trigger update_comments;
drop trigger insert_comments;
drop trigger delete_post;
drop trigger update_post;
drop trigger insert_post;

drop sequence following_num;
drop sequence like_num;
drop sequence comment_num;
drop sequence post_num;
drop sequence user_num;
drop sequence prefer_num;
drop sequence gender_num;

drop table following_info;
drop table like_info;
drop table comments;
drop table post;
drop table user_info;
drop table prefer;
drop table gender;



-- ���� ���̺�
create table gender
(
    gender_num int primary key, -- ���� ��ȣ
    gender_type varchar2(9) unique not null -- ���� Ÿ��
);

-- ��ȣ�о� ���̺�
create table prefer
(
    prefer_num int primary key, -- ��ȣ�о� ��ȣ
    prefer_type varchar2(255) unique not null -- ��ȣ�о� ����
);

-- ȸ������ ���̺�
create table user_info
(
    user_num int primary key, -- ȸ����ȣ
    user_id varchar2(255) unique not null, --ȸ�� ���̵�
    user_password varchar2(255) not null, -- ��й�ȣ
    user_nickname varchar2(255) unique not null, -- �г���
    user_name varchar2(255) not null, -- �̸�
    user_birth varchar2(255) not null, -- �������
    user_email varchar2(255) unique not null, -- �̸���
    user_phonenum varchar2(255) unique not null, -- ��ȭ��ȣ
    user_regdate varchar2(255) not null, -- ������
    user_profile_name varchar2(255), -- �����ʻ��� ���� �̸�
    user_profile_path varchar2(255), -- �����ʻ��� ���� ���
    user_gender_num int not null, -- ���� �ܷ�Ű ����
    user_prefer_num int, -- ��ȣ�о� �ܷ�Ű ����
    user_count_post int, -- �ۼ��� �Խñ� ��
    user_count_comment int, -- �ۼ��� ��� ��
    user_count_like int, -- ���ƿ��� ��
    user_count_following int, -- �ȷ��� ��
    user_count_follower int, -- �ȷο� ��
    constraint fk_user_gender_num foreign key(user_gender_num) references gender(gender_num) on delete cascade, 
    constraint fk_user_prefer_num foreign key(user_prefer_num) references prefer(prefer_num) on delete cascade
);

-- �Խñ� ���̺�
create table post
(
    post_num int primary key, 
    post_created_at varchar2(255) not null, 
    post_user_num int not null, --�ܷ�Ű�� ����
    post_title varchar2(255) not null, 
    post_content varchar2(3000) not null, 
    post_writer_position varchar2(255), 
    post_comment_count int, 
    post_like_count int, 
    constraint fk_post_user_num foreign key(post_user_num)
    references user_info(user_num) on delete cascade
);

-- ��� ���̺�
create table comments
(
    comment_num int primary key, 
    comment_created_at varchar2(255) not null, 
    comment_user_num int not null, -- �ܷ�Ű�� ����
    comment_post_num int not null, -- �ܷ�Ű�� ����
    comment_content varchar2(300) not null, 
    constraint fk_comment_user_num foreign key(comment_user_num) 
    references user_info(user_num) on delete cascade, 
    constraint fk_comment_post_num foreign key(comment_post_num) 
    references post(post_num) on delete cascade
);

-- ���ƿ� ���̺�
create table like_info
(
    like_num int primary key, 
    like_create_time varchar2(20) not null, 
    like_user_num int not null, 
    like_post_num int not null, 
    like_relation varchar2(100) unique not null, 
    foreign key(like_user_num) 
    references user_info(user_num) on delete cascade, 
    foreign key(like_post_num) 
    references post(post_num) on delete cascade
);

-- �ȷ��� ���̺�
create table following_info
(
    following_num int primary key, 
    following_create_time varchar2(20) not null, 
    following_user_num int not null, 
    following_user2_num int not null, 
    following_relation varchar2(100) unique, 
    foreign key(following_user_num) 
    references user_info(user_num) on delete cascade, 
    foreign key(following_user2_num) 
    references user_info(user_num) on delete cascade
);



-- dbms_output.put_line('������ �����˴ϴ�.');
-- Ʈ����. �Խñ� �Է½� ȸ������ ����
create or replace trigger insert_post 
after insert on post 
for each row 
begin 
update user_info set user_count_post = user_count_post+1 
where :new.post_user_num = user_num;
end;
/
-- Ʈ����. �Խñ� �ۼ��� ���� �Ұ�
create or replace trigger update_post 
before update of post_user_num on post 
for each row 
begin 
raise_application_error(-20000, '�Խñ� �ۼ��� ���� �Ұ�');
end;
/
-- Ʈ����. �Խñ� ������ ȸ������ ���� �� ���, ���ƿ� ����
create or replace trigger delete_post 
before delete on post 
for each row 
begin 
update user_info set user_count_post = user_count_post-1 
where :old.post_user_num = user_num;
end;
/

-- Ʈ����. ��� �Է½� ȸ������, �Խñ� ����
create or replace trigger insert_comments 
after insert on comments 
for each row 
begin 
update user_info set user_count_comment = user_count_comment+1 
where :new.comment_user_num = user_num;
update post set post_comment_count = post_comment_count+1 
where :new.comment_post_num = post_num;
end;
/
-- Ʈ����. ����� ���� ���� �Ұ�
create or replace trigger update_comments 
before update of comment_user_num, comment_post_num on comments 
for each row 
begin 
raise_application_error(-20000, '����� ���� ���� �Ұ�');
end;
/
-- Ʈ����. ��� ������ ȸ������, �Խñ� ����
create or replace trigger delete_comments 
before delete on comments 
for each row 
begin 
update user_info set user_count_comment = user_count_comment-1 
where :old.comment_user_num = user_num;
update post set post_comment_count = post_comment_count-1 
where :old.comment_post_num = post_num;
end;
/

-- Ʈ����. ���ƿ� �Է½� ȸ������, �Խñ� ����
create or replace trigger insert_like_info 
after insert on like_info 
for each row 
begin 
update user_info set user_count_like = user_count_like+1 
where :new.like_user_num = user_num;
update post set post_like_count = post_like_count+1 
where :new.like_post_num = post_num;
end;
/
-- Ʈ����. ���ƿ� ���� �Ұ�
create or replace trigger update_like_info 
before update on like_info 
for each row 
begin 
raise_application_error(-20000, '���ƿ� ���� �Ұ�');
end;
/
-- Ʈ����. ���ƿ� ������ ȸ������, �Խñ� ����
create or replace trigger delete_like_info 
after delete on like_info 
for each row 
begin 
update user_info set user_count_like = user_count_like-1 
where :old.like_user_num = user_num;
update post set post_like_count = post_like_count-1 
where :old.like_post_num = post_num;
end;
/

-- Ʈ����. �ȷ��� �Է½� ȸ������ ����
create or replace trigger insert_following_info 
after insert on following_info 
for each row 
begin 
update user_info set user_count_following = user_count_following+1 
where :new.following_user_num = user_num;
update user_info set user_count_follower = user_count_follower+1 
where :new.following_user2_num = user_num;
end;
/
-- Ʈ����. �ȷ��� ���� �Ұ�
create or replace trigger update_following_info 
before update on following_info
for each row 
begin 
raise_application_error(-20000, '�ȷ��� ���� �Ұ�');
end;
/
-- Ʈ����. �ȷ��� ������ ȸ������ ����
create or replace trigger delete_following_info 
after delete on following_info
for each row 
begin 
update user_info set user_count_following = user_count_following-1 
where :old.following_user_num = user_num;
update user_info set user_count_follower = user_count_follower-1 
where :old.following_user2_num = user_num;
end;
/

-- ���ν���. ȸ������ ����
create or replace procedure procedure_delete_user(input_num in int) 
is begin 
delete following_info where following_user_num = input_num;
delete following_info where following_user2_num = input_num;
delete like_info where like_user_num = input_num;
delete like_info where like_post_num in (select post_num from post where post_user_num = input_num);
delete comments where comment_user_num = input_num;
delete comments where comment_post_num in (select post_num from post where post_user_num = input_num);
delete post where post_user_num = input_num;
delete user_info where user_num = input_num;
end;
/
-- ���ν���. �Խñ� ����
create or replace procedure procedure_delete_post(input_num in int) 
is begin 
delete following_info where following_user_num = input_num;
delete following_info where following_user2_num = input_num;
delete like_info where like_user_num = input_num;
delete like_info where like_post_num in (select post_num from post where post_user_num = input_num);
delete comments where comment_user_num = input_num;
delete comments where comment_post_num in (select post_num from post where post_user_num = input_num);
delete post where post_user_num = input_num;
end;
/



-- ���� ���̺�
create sequence gender_num;
insert into gender(gender_num, gender_type) values (gender_num.nextval, '����');
insert into gender(gender_num, gender_type) values (gender_num.nextval, '����');
insert into gender(gender_num, gender_type) values (gender_num.nextval, '�����');
insert into gender(gender_num, gender_type) values (gender_num.nextval, '�߼�');

update gender set gender_type='unknown' where gender_type='�����';
delete from gender where gender_type='�߼�';
select*from gender;

-- ��ȣ�о� ���̺�
create sequence prefer_num;
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '����');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '���');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, 'ķ��');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '����');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '�');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, 'ȣ���');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '��Ʈ����');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '�ڵ�');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '�߱�');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '�����Կ�');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '�Թ�');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '��ȭ');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '���а���');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '�׸��׸���');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '�����ͼ���');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '����');

update prefer set prefer_type='����' where prefer_type='ķ��';
delete from prefer where prefer_type='����';
select*from prefer;

-- ȸ������ ���̺�
create sequence user_num;
insert into user_info values (user_num.nextval, 'letter333', 'password1', 'letter', '������', to_date('1998-02-17', 'YYYY-MM-DD'), 'seryong12@gmail.com', '010-3194-0217', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 1, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'jihop379', 'pa5sword2', 'errorj', '����ȣ', to_date('1995-01-14', 'YYYY-MM-DD'), 'jihop379@gmail.com', '010-1234-1234', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, 1, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'igodda0654', 'pAssword3', 'sik', '�̹���', to_date('1990-01-01', 'YYYY-MM-DD'), 'igodda0654@gmail.com', '010-4321-4312', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 3, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'mong', 'mong_pass', 'mong_nick', '����', to_date('2000-01-01', 'YYYY-MM-DD'), 'mong@mail.com', '010-0000-0001', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 5, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'cowww', 'cowww_pass', 'cow_nick', '����ī��', to_date('2000-01-02', 'YYYY-MM-DD'), 'cowww@mail.com', '010-0000-0002', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 3, 4, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'dog', 'dog_pass', 'dog_nick', '����', to_date('2000-01-03', 'YYYY-MM-DD'), 'meong@mail.com', '010-0000-0003', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 7, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'parkjiho14', 'ppp1234', 'mint', '����ȣ', to_date('2000-01-03', 'YYYY-MM-DD'), 'jihop379@mail.com', '010-0000-0004', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, 8, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'hacker', 'strongbeom', 'hacker19', '��Ŀ��', to_date('2000-08-18', 'YYYY-MM-DD'), 'dark_hacker19@mail.com', '010-7808-1818', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 3, 9, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'nemesis', 'rororoi', 'jormungandr', '�����', to_date('2000-07-21', 'YYYY-MM-DD'), 'bluenight2@mail.com', '010-7859-5566', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 5, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'youluvme', 'eee22i', 'cyberpitcher',  '�ķ�ٽ���',  to_date('2003-11-08', 'YYYY-MM-DD'), 'powerflower@mail.com', '010-5522-8601', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 4, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'dohi', 'dohidohi', 'dohi123', '�̵���', to_date('1980-05-15', 'YYYY-MM-DD'), 'dohi123@mail.com', '010-9875-4552', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, 8, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'pon noiman', 'pon noiman77', 'pon noiman199', '�� ���̸�', to_date('1900-01-25', 'YYYY-MM-DD'), 'pon noiman123@mail.com', '010-9465-6578', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, 15, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'purin', 'pupurin', 'pupupurin', 'Ǫƾ', to_date('1996-01-01', 'YYYY-MM-DD'), 'pupupupurin@mail.com', '010-9999-9999', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 14, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'ctulru', 'ctulrukkk', 'ctulrukkkkk', 'ũ����', to_date('0001-01-01', 'YYYY-MM-DD'), 'ctulruuuuu@mail.com', '070-8888-8888', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 3, 13, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'allen turing', 'allenallen', 'turing turing', '�ٷ� Ʃ��', to_date('2010-05-30', 'YYYY-MM-DD'), 'allen turing0530@mail.com', '010-0530-0530', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 3, 12, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'dongjoon', 'dongdonglee', 'DongJoonLee34', '�̵���', to_date('1990-05-18', 'YYYY-MM-DD'), 'dongdonglee@mail.com', '010-5645-2322', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 9, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'juli', 'julilkim', 'juljulkk', '���ָ�', to_date('1988-01-30', 'YYYY-MM-DD'), 'julijuli@mail.com', '010-6787-8363', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, null, 0, 0, 0, 0, 0);

update user_info set user_nickname='drowssap' where user_num=4;
delete from user_info where user_num=17;
exec procedure_delete_user(16);
select*from user_info;

-- �Խñ� ���̺�
create sequence post_num;
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 2, 'test title1', 'test content', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 3, 'test title2', 'test content22', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 2, 'test title3', 'test content33', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 4, 'post_mong', 'mongmongmong', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 5, 'post_cowww', 'cowwwwwwwwwww', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 6, 'post_dog', 'meong post content', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 7, 'popopopcatcorn', '��Ĺ�� �Ϳ���', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 8, '���� Ŀ���� ��õ�޽��ϴ�', '#��Ʈ���� ����Ǫġ�� ����, ���ʴ� ���־�', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 9, '���ø��� �⹦�� �̾߱� ����', '#���ø��� �⹦���̾߱� ����, �⹦���̾߱� �Ⱥ��� �λ�����!', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 10, '��Ĺ��Ĺ��������', '����̴� �������� �����̴� �������� ���� ����� ������ ���� �������� �����;�����̸� �𸣸� �λ�����!', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 11, '���簳��', '�Ƹ�尡 ������ ���̾Ƹ��!', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 12, '��â�� �ǰ�;��', '������ �ټ����� �̷���?', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 13, 'ķ���ϱ� ���� ��Ұ� �����?', '��õ�޽��ϴ�', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 14, '��ǳ �����ּ���Ф�', '���� �����ּ���Ф�', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 15, '���簳��', '���������� �Ⱦ��ϴ� ���ô�? (�õ��)', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 15, '���� ���õ� ������ Ǯ��', '������ ���� ����ٰ�� ���߾�;;', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 5, '�����ְ�', '������ ��¥ �ְ��Դϴ�.;', null, 0, 0);

update post set post_title='��ǳ �����ϼ���Ф�' where post_num=14;
delete from post where post_num=17;
exec procedure_delete_post(16);
select*from post;

-- ��� ���̺�
create sequence comment_num;
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 1, 1, 'comment1');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 2, 2, 'comment2');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 3, 3, 'comment33');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 6, 4, 'kkkkkkk');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 7, 5, 'really?');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 10, 7, 'oh my cat!');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 4, 7, '��� �Ϳ���');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 11, 10, '������ ���� �� �ּ��� ������ ���� ��ϴ�. ');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 12, 11, '���� ���簳�� �ְ�^-^');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 13, 8, '���� �����̴� �����?');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 15, 13, 'ķ�� ��� 1�� 1Ŀ�� �ܵ� ��������!');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 14, 15, '�� �λ��� �õ�� �ʹ�????');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 5, 8, '��Ʈ���� ���ڵ� ���־��!');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 9, 12, '���Ը� �� �ø��ô°� ����');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 8, 12, '�ڼ��� �߸� �Ȱ� �ƴұ��-������-');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 15, 7, '������ �����մϴ� ������������ ���� Ǫ���䤷����');

update comments set comment_content='update comment' where comment_num = 3;
delete from comments where comment_num = 16;
select*from comments;

-- ���ƿ� ���̺�
create sequence like_num;
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'1', '3', '1-3');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'2', '1', '2-1');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'3', '2', '3-2');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'4', '2', '4-2');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'5', '7', '5-7');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'6', '4', '6-4');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'7', '9', '7-9');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'8', '2', '8-2');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'9', '4', '9-4');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'10', '11', '10-11');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'11', '10', '11-10');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'12', '8', '12-8');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'13', '7', '13-7');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'14', '5', '14-5');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'15', '14', '15-14');
insert into like_info values (like_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'11', '5', '11-5');

delete from like_info where like_num=16;
select*from like_info;

-- �ȷ��� ���̺�
create sequence following_num;
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'1', '2', '1-2');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'2', '3', '2-3');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'3', '2', '3-2');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'4', '8', '4-8');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'5', '1', '5-1');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'5', '2', '5-2');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'5', '3', '5-3');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'5', '4', '5-4');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'6', '10', '6-10');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'7', '11', '7-11');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'8', '12', '8-12');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'9', '14', '9-14');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'10', '15', '10-15');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'11', '7', '11-7');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'12', '6', '12-6');
insert into following_info values (following_num.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'13', '5', '13-5');

delete from following_info where following_num=16;
select*from following_info;



-- join. ȸ����ȣ�� ���̵�� �ۼ��� ��� �ҷ�����
select user_num �ۼ���ȸ����ȣ, user_id �ۼ��ھ��̵�, user_name �ۼ����̸�, comment_num �ۼ���۹�ȣ, comment_content �ۼ���� 
from user_info join comments on user_info.user_num = comments.comment_user_num and user_info.user_id='igodda0654';

-- join. ȸ����ȣ�� ���̵�� �ۼ��� �� �ҷ�����
select user_num �ۼ���ȸ����ȣ, user_id �ۼ��ھ��̵�, user_name �ۼ����̸�, post_num �Խñ۹�ȣ, post_title �Խñ�����, post_content �ۼ��Խñ� 
from user_info join post on user_info.user_num = post.post_user_num and user_info.user_id='jihop379';

-- join, group by. �� ������ ���� ������ ��
select user_info.user_gender_num, gender.gender_type, count(*) 
from user_info join gender on user_info.user_gender_num = gender.gender_num 
group by gender.gender_num, gender.gender_type, user_info.user_gender_num 
order by user_gender_num;

-- join, group by, having. ���ϴ� ���� ������ ��
select user_info.user_gender_num, gender.gender_type, count(*) 
from user_info join gender on user_info.user_gender_num = gender.gender_num 
group by gender.gender_num, gender.gender_type, user_info.user_gender_num having gender_type='����'
order by user_gender_num;



-- join. ȸ������ ���
select user_num, user_regdate, user_id, user_password, user_nickname, user_name, user_gender_num, user_birth, user_phonenum, user_email, user_prefer_num 
from user_info 
join gender on user_gender_num=gender_num 
join prefer on user_prefer_num=prefer_num;

-- join, ��ø����, group by, having. ����ȸ�� �� ���
select gender_type, count(gender_type) count_gender from (select user_nickname, gender_type, prefer_type
from user_info 
join gender on user_gender_num=gender_num 
join prefer on user_prefer_num=prefer_num) group by gender_type having gender_type='����';

-- join, view. ���̵�, ����, ��ȣ�о� ���
create view view_user as select user_nickname, gender_type, prefer_type
from user_info 
join gender on user_gender_num=gender_num 
join prefer on user_prefer_num=prefer_num;
select*from view_user;

-- view, group by. ������ ���� ��ȣ�о� �� ���
select gender_type, count(gender_type) count_gender from view_user group by gender_type;

-- view, group by, having. ����ȸ���� ��ȣ�о� �� ���
select gender_type, count(gender_type) count_gender from view_user group by gender_type having gender_type='����';

-- ���ν���. ��ȣ�о� �Է�
create or replace procedure insert_prefer(prefer_num in int, prefer_type in varchar2) 
is begin insert into prefer values(prefer_num, prefer_type);
end insert_prefer;
/
exec insert_prefer(prefer_num.nextval, '����');
select*from prefer;

-- �Լ�. �Խñ۹�ȣ �Է½� ���ƿ並 ���� ���� ���� �Խñ۰��� ���ƿ䰳�� ���� ���
create or replace function insufficient_like(post_num int) 
return int 
is 
nownum int := post_num;
num1 int;
num2 int;
begin 
select max(post_like_count) 
into num2 
from post 
end;
begin 
select post_like_count 
into num1 
from post 
where post_num=nownum;
end;
return num2-num1;
end;
/
select insufficient_like(1) from dual;

--�Լ�. �Խñ۹�ȣ �Է½� ����� ���� ���� ���� �Խñ۰��� ��۰��� ���� ���
create or replace function insufficient_comment(post_num int) 
return int 
is 
nownum int := post_num;
num1 int;
num2 int;
begin 
select max(post_comment_count) 
into num2 
from post 
end;
begin 
select post_comment_count 
into num1 
from post 
where post_num=nownum;
end;
return num2-num1;
end;
/
select insufficient_comment(1) from dual;

-- join. ����, ��ȣ�о� ���
select gender_type ����, prefer_type ��ȣ�о�
from user_info join gender on user_gender_num=gender_num join prefer on user_prefer_num=prefer_num;

-- view. ������ ��۹�ȣ ���
create view find_max_comments as select max(comment_num) Last_comment from comments;
select * from find_max_comments;

-- join, view. �̸�, ����, ���ƿ� �� ���
create view view_user2 as select user_name, gender_type, like_num
from user_info
join gender on user_gender_num=gender_num
join like_info on like_user_num=user_num;
select *from view_user2;

-- view, group by. ������ ���� ���ƿ� �� ���
select gender_type, sum(like_num) as sum_like_num  from view_user2 group by gender_type;

-- view, group by, having. ����ȸ���� ���ƿ� �� ���
select gender_type, sum(like_num) as sum_like_num from view_user2 group by gender_type having gender_type='����';

-- join, view. ����ȸ������ �г��� ���
create view female_nickname as select gender.gender_num as female, user_info.user_nickname as nickname
from user_info join gender on user_info.user_gender_num = gender.gender_num
where user_info.user_gender_num='2';
select * from female_nickname;

-- ���ν���. ��ȣ�о� �Է�
create or replace procedure ex_prefer_gender_info(prefer_num in int, prefer_type in varchar2) 
is begin insert into prefer values(prefer_num, prefer_type);
end ex_prefer_gender_info;
/
exec ex_prefer_gender_info(prefer_num.nextval, '����Ÿ�� ��å');
select*from prefer;



-- join. ���̵�, �̸�, ���� ���
select user_id, user_name, gender_type 
from user_info, gender where user_gender_num=gender_num;

-- ���ν���. ��ȣ�о� ����
create or replace procedure delete_prefer
(
    myprefernum in int
)
is begin 
delete prefer where prefer_num=myprefernum;
end delete_prefer;
/
exec delete_prefer(17);
select*from prefer;

-- ���ν���. ȸ������ �ֱ�
create or replace procedure add_user
(
    mynum in int, 
    myid in varchar2, 
    mypass in varchar2, 
    mynick in varchar2, 
    myname in varchar2, 
    mybirth in varchar2, 
    myemail in varchar2, 
    mypn in varchar2, 
    myregd in varchar2, 
    myproname in varchar2, 
    mypropath in varchar2, 
    mygender_num in int, 
    myprefer_num in int, 
    mycount_post in int, 
    mycount_comment in int, 
    mycount_like int, -- ���ƿ��� ��
    mycount_following int, -- �ȷ��� ��
    mycount_follower int -- �ȷο� ��
) 
is begin 
insert into user_info values (mynum, myid, mypass, mynick, myname, mybirth, myemail, mypn, myregd, myproname, mypropath, mygender_num, myprefer_num, mycount_post, mycount_comment, mycount_like, mycount_following, mycount_follower);
end add_user;
/
exec add_user(user_num.nextval, 'prori1', 'rolripop', 'ddfs', '�Ѹ���', to_date('1999-12-25', 'YYYY-MM-DD'), 'rorirori123@mail.com', '010-1224-563', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, 15, 0, 0, 0, 0, 0);
select*from user_info;



-- �����Լ�. ������Ϸ� ���̸� ����Ͽ� ���
WITH TEMP AS (
    SELECT '������'  NM, TO_DATE('19990702', 'YYYYMMDD') BIRTHDAY FROM DUAL UNION ALL
    SELECT '����Ź'  NM, TO_DATE('19890228', 'YYYYMMDD') BIRTHDAY FROM DUAL UNION ALL
    SELECT '������'  NM, TO_DATE('19950228', 'YYYYMMDD') BIRTHDAY FROM DUAL UNION ALL
    SELECT '����ȣ'  NM, TO_DATE('20000528', 'YYYYMMDD') BIRTHDAY FROM DUAL UNION ALL
    SELECT '�̹���' NM, TO_DATE('19820517', 'YYYYMMDD') BIRTHDAY FROM DUAL
)
SELECT NM, TO_CHAR(BIRTHDAY, 'YYYY-MM-DD') BIRTHDAY, 
    CASE WHEN TRUNC(SYSDATE) - BIRTHDAY <= 30 THEN
            TRUNC(SYSDATE) - BIRTHDAY + 1 || '��'
        WHEN MONTHS_BETWEEN(TRUNC(SYSDATE), BIRTHDAY) < 12 THEN
            TRUNC(MONTHS_BETWEEN(TRUNC(SYSDATE), BIRTHDAY)) || '����'
        ELSE
            TRUNC(MONTHS_BETWEEN(TRUNC(SYSDATE), BIRTHDAY) / 12 ) || '��'
    END AGE
FROM TEMP
/

-- ���ν���. ȸ������ �Է�
create or replace procedure insert_user_info 
(
    user_num in int , -- ȸ����ȣ
    user_id varchar2, --ȸ�� ���̵�
    user_password varchar2, -- ��й�ȣ
    user_nickname varchar2, -- �г���
    user_name varchar2, -- �̸�
    user_birth varchar2, -- �������
    user_email varchar2, -- �̸���
    user_phonenum varchar, -- ��ȭ��ȣ
    user_regdate varchar2, -- ������
    user_profile_name varchar2, -- �����ʻ��� ���� �̸�
    user_profile_path varchar2, -- �����ʻ��� ���� ���
    user_gender_num int , -- ���� �ܷ�Ű ����
    user_prefer_num int, -- ��ȣ�о� �ܷ�Ű ����
    user_count_post int, -- �ۼ��� �Խñ� ��
    user_count_comment int, --��� ��
    user_count_like int, -- ���ƿ��� ��
    user_count_following int, -- �ȷ��� ��
    user_count_follower int -- �ȷο� ��
) 
is begin 
insert into user_info values (user_num, user_id, user_password, user_nickname, user_name, user_birth, user_email, user_phonenum, user_regdate, user_profile_name,user_profile_path, user_gender_num, user_prefer_num,user_count_post,user_count_comment, user_count_like, user_count_following, user_count_follower); 
end insert_user_info;
/
exec insert_user_info (user_num.nextval,'drarke', 'rororoi', 'ddwwss', 'dualcore', to_date('2000-07-21', 'YYYY-MM-DD'), 'eisklek2@mail.com', '010-5632-7854', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 5, 0, 0, 0, 0, 0);
select*from user_info;