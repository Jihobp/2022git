--yt 오빠's drop the table yo 
--테이블, pk, fk, crud까지 한거입니다. 참고하면서 틀린 부분이나 본인과 다른 점 있으면 이야기해서 수정해보아요.
drop table comment_info;
drop table post_info;
drop table user_info;
drop table hobby_info;
drop table gender_info;


create table gender_info  
(gender_number int primary key,
gender_type varchar2(10) unique not null);

create table hobby_info 
(hobby_number int primary key,
hobby_type varchar2(100) unique not null);

create table user_info 
(user_number int primary key, 
user_create_time varchar2(20) not null, 
user_id varchar2(36) unique not null, 
user_password varchar2(20) not null, 
user_nick_name varchar2(36) unique not null, 
user_name varchar2(20) not null, 
user_gender_number int not null, 
user_birthday varchar2(8) not null, 
user_phone_number varchar2(20) unique not null, 
user_eMail varchar2(30) unique not null, 
user_hobby_number int, 
user_profile_file_name varchar2(100), 
user_profile_file_address varchar2(100), 
user_count_post int, 
user_count_comment int, 
user_count_like int, 
user_count_following int, 
user_count_follower int, 
foreign key(user_gender_number) references gender_info(gender_number), 
foreign key(user_hobby_number) references hobby_info(hobby_number));

create table post_info 
(post_number int primary key, 
post_create_time varchar2(20) not null, 
post_user_number int not null, 
post_name varchar2(100) not null, 
post_contents varchar2(3000) not null, 
post_location varchar2(100), 
post_count_comment int, 
post_count_like int, 
post_tag_contents varchar2(300), 
foreign key(post_user_number) references user_info(user_number));

create table comment_info 
(comment_number int primary key, 
comment_create_time varchar2(20) not null, 
comment_user_number int not null, 
comment_post_number int not null, 
comment_contents varchar2(300) not null, 
foreign key(comment_user_number) references user_info(user_number), 
foreign key(comment_post_number) references post_info(post_number));



drop sequence gender_up;
drop sequence hobby_up;
drop sequence user_up;
drop sequence post_up;
drop sequence comment_up;

create sequence gender_up;
create sequence hobby_up;
create sequence user_up;
create sequence post_up;
create sequence comment_up;



insert into gender_info values (gender_up.nextval, '남자');
insert into gender_info values (gender_up.nextval, '여자');
insert into gender_info values (gender_up.nextval, '로봇');
update gender_info set gender_type='비공개' where gender_number=3;
insert into gender_info values (gender_up.nextval, '고양이');
delete from gender_info where gender_number=4;

insert into hobby_info values (hobby_up.nextval, '게임');
insert into hobby_info values (hobby_up.nextval, '방탈출');
insert into hobby_info values (hobby_up.nextval, '등산');
update hobby_info set hobby_type='헬스' where hobby_number=3;
insert into hobby_info values (hobby_up.nextval, '호흡');
delete from hobby_info where hobby_number=4;

insert into user_info values (user_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'mong', 'mong_pass', 'mong_nick', 'monkey', '1', '20000101', '010-0000-0001', 'mong.naver.com', '1', 
null, null, null, null, null, null, null);
insert into user_info values (user_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'cowww', 'cowww_pass', 'cowww_nick', 'cow', '2', '20000102', '010-0000-0002', 'cow.naver.com', '2', 
null, null, null, null, null, null, null);
insert into user_info values (user_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'ddong', 'dong_pass', 'dong_nick', 'dog', '1', '20000103', '010-0000-0003', 'dog.naver.com', '2', 
null, null, null, null, null, null, null);
update user_info set user_id='dong' where user_number=3;
insert into user_info values (user_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'ddd', 'ddd_pass', 'ddd_nick', 'ddd', '1', '20000104', '010-0000-0004', 'ddd.naver.com', '1', 
null, null, null, null, null, null, null);
delete from user_info where user_number=4;

insert into post_info values (post_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'1', 'post_mong', 'mongmongmong', 
null, null, null, null);
insert into post_info values (post_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'2', 'post_cowww', 'cowwwwwwwwwww', 
null, null, null, null);
insert into post_info values (post_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'2', 'post_cowwwwwww', '123', 
null, null, null, null);
update post_info set post_contents='wallwallwall' where post_number=3;
insert into post_info values (post_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'3', 'post_dddd', 'dddd', 
null, null, null, null);
delete from post_info where post_number=4;

insert into comment_info values (comment_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'1', '2', 'kkkkkk');
insert into comment_info values (comment_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'3', '1', 'really?');
insert into comment_info values (comment_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'3', '2', 'oh my cat!');
update comment_info set comment_contents='oh my god!' where comment_number=3;
insert into comment_info values (comment_up.nextval, to_char(sysdate,'yyyy.mm.dd hh24:mi'), 
'3', '2', 'oh my dog!');
delete from comment_info where comment_number=4;