CREATE DATABASE sns_db;
CREATE USER 'root'@'%' IDENTIFIED BY '1234';
GRANT EXECUTE, SELECT, SHOW VIEW, ALTER, ALTER ROUTINE, CREATE, CREATE ROUTINE, CREATE TEMPORARY TABLES, CREATE VIEW, DELETE, DROP, EVENT, INDEX, INSERT, REFERENCES, TRIGGER, UPDATE, LOCK TABLES  ON `sns_db`.* TO 'root'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;


drop function currval;
drop function nextval;
drop procedure create_sequence;
drop table sequence;
drop table post;

drop table user;



create table user(
user_id varchar(30) primary key,
user_pw varchar(255) not null,
user_name varchar(50) not null,
user_gender varchar(10) default '',
user_birth varchar(10) default '',
user_email varchar(50) not null,
user_phone varchar(20) not null,
user_interest varchar(30) default '',
user_reg_date datetime not null default now()
);

create table post (
post_num int primary key not null auto_increment, 
post_comment_group int default null, 
post_reg_date  timestamp null default current_timestamp, 
post_user_id varchar(30) not null, 
post_title varchar(255) not null, 
post_content varchar(3000) not null, 
post_writer_position varchar(255) default null, 
post_comment_count int default 0, 
post_like_count int default 0, 
constraint fk_post_user_id foreign key(post_user_id) references user(user_id) on delete cascade
);

create table sequence (
name varchar(32),
currval bigint unsigned
);

delimiter ;;
create procedure create_sequence(in the_name text) 
modifies sql data 
deterministic 
begin 
delete from sequence where name = the_name;
insert into sequence values(the_name,0);
end;;

create function nextval (the_name varchar(32))
returns bigint unsigned 
modifies sql data 
deterministic 
begin 
declare ret bigint unsigned;
update sequence set currval = currval+1 where name=the_name;
select currval into ret from sequence where name=the_name limit 1;
return ret;
end;;

create function currval (the_name varchar(32)) 
returns bigint unsigned 
modifies sql data 
deterministic 
begin 
declare ret bigint unsigned;
select ifnull(max(currval),1) into ret from sequence 
where name=the_name limit 1;
return ret;
end;;

call create_sequence('post');;



select * from user;;
select * from post;;
select * from sequence;;

insert into user(user_id, user_pw, user_name, user_gender, user_birth, user_email, user_phone, user_interest) 
values ('test', 'test', 'test', 'test', '20220201', 'test@test.com', '010-1234-1234', 'test');;

insert into post(post_num, post_comment_group, post_user_id, post_title, post_content, post_writer_position) 
values (nextval('post'),currval('post'),'test','post_title','post_content','post_writer_position');;