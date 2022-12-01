create database sns_db;
CREATE USER 'sns_db_user'@'%' IDENTIFIED BY '1234';
GRANT EXECUTE,SELECT, SHOW VIEW, ALTER, ALTER ROUTINE, CREATE, CREATE ROUTINE, 
CREATE TEMPORARY TABLES, CREATE VIEW, 
DELETE, DROP, EVENT, INDEX, INSERT, 
REFERENCES, TRIGGER, UPDATE, 
LOCK TABLES ON 'sns_db'.* TO 'sns_db_user'@'%' WITH GRANT OPTION;


drop table user_table;
CREATE TABLE user_table
(
user_num int PRIMARY key,
user_id varchar(30) UNIQUE not null,
user_pass varchar(30) not null,
user_name varchar(30) not null,
user_birth varchar(20) not null,
user_phone varchar(15) unique not null,
user_mail varchar(50) unique not null,
user_regdate date not null,
user_profilfile varchar(200),
user_profilfileroute varchar(50),
post_count int,
comment_count int,
like_count int,
following_count int,
follower_count int,
gender varchar(6),
FOREIGN KEY (gender) REFERENCES gender_table(gender)
);


drop table post_table;
create table post_table
(
post_num int PRIMARY key,
created_at TIMESTAMP DEFAULT NOW(),
post_name varchar(50) not null,
post_content varchar(250) not null,
tag_content varchar(250),
location varchar(250),
post_commentcount int,
post_like int,
user_id varchar(30),
FOREIGN KEY (user_id) REFERENCES user_table(user_id)
);
-- image_url varchar(255) 
-- 태그 나중에 추가하고 싶으면 ㄱㄱㄱ 

drop table comment_table;
create table comment_table
(
comment_num int primary key,
comment_reg_time varchar(30) not null,
comment_content varchar(200),
user_id varchar(30),
created_at TIMESTAMP DEFAULT NOW(),
post_num int,
FOREIGN KEY (user_id) REFERENCES user_table(user_id),
FOREIGN KEY (post_num) REFERENCES post_table(post_num)
);

create table likes
(
user_id int not null PRIMARY key,
post_num int not null PRIMARY key,
created_at timestamp default now(),
FOREIGN KEY (user_id) REFERENCES user_table(user_id),
foreign key(post_num) references post_table(post_num)
);

create table follows
(
follower_id int not null,
followee_id int not null,
created_at timestamp default now(),
foreign key(follower_id) references users(id),
foreign key(followee_id) references users(id),
primary key(follower_id, followee_id)
);


insert into gender_table values (1,'m');
insert into gender_table values (2,'f');
insert into gender_table values (3,'?');

SELECT * from user_table;
SELECT * from gender_table;
SELECT * from post_table;
SELECT * from comment_table;
select * from likes;
select * from follows;
select * from tags;

select title, category, price, insert_date from book where book_id=1;


drop table gender_table;
CREATE table gender_table
(
gender varchar(6) primary key,
gendertype VARCHAR(20) UNIQUE not null
);

CREATE TABLE tags(
	user_id int not null,
	post_num int not null PRIMARY key,
	tag_id int not null PRIMARY key,
    tag_name VARCHAR(255) UNIQUE,
    created_at TIMESTAMP DEFAULT NOW()
	foreign key(post_num) REFERENCES post_table(post_num),
    foreign key(tag_id) REFERENCES tags(id),
);