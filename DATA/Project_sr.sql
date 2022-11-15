--seryong's drop the table yo`~~~
-- 성별 테이블
create table gender
(
    gender_num int primary key, -- 성별 번호
    gender_type varchar2(9) unique not null -- 성별 타입
);

-- 선호분야 테이블
create table prefer
(
    prefer_num int primary key, -- 선호분야 번호
    prefer_type varchar2(255) unique not null -- 선호분야 종류
);

-- 회원정보 테이블
create table user_info
(
    user_num int primary key, -- 회원번호
    user_id varchar2(255) unique not null, --회원 아이디
    user_password varchar2(255) not null, -- 비밀번호
    user_nickname varchar2(255) unique not null, -- 닉네임
    user_name varchar2(255) not null, -- 이름
    user_birth varchar2(255) not null, -- 생년월일
    user_email varchar2(255) unique not null, -- 이메일
    user_phonenum varchar(255) unique not null, -- 전화번호
    user_regdate date not null, -- 가입일
    user_profile_name varchar2(255), -- 프로필사진 파일 이름
    user_profile_path varchar2(255), -- 프로필사진 파일 경로
    user_gender_num int not null, -- 성별 외래키 설정
    user_prefer_num int, -- 선호분야 외래키 설정
    constraint fk_user_gender_num foreign key(user_gender_num) references gender(gender_num),
    constraint fk_user_prefer_num foreign key(user_prefer_num) references prefer(prefer_num)
);

-- 게시글 테이블
create table post
(
    post_num int primary key,
    post_created_at timestamp not null,
    post_user_num int, --외래키로 설정
    post_title varchar2(255) not null,
    post_content varchar2(255) not null,
    post_writer_position varchar2(255),
    post_comment_count int,
    constraint fk_post_user_num foreign key(post_user_num) references user_info(user_num)
);

-- 댓글 테이블
create table comments
(
    comment_num int primary key,
    comment_created_at timestamp not null,
    comment_user_num int, -- 외래키로 설정
    comment_post_num int, -- 외래키로 설정
    comment_content varchar2(255) not null,
    constraint fk_comment_user_num foreign key(comment_user_num) references user_info(user_num),
    constraint fk_comment_post_num foreign key(comment_post_num) references post(post_num)
);



--CRUD - crate, read, update, delete
-- 성별 테이블
create sequence gender_num;

insert into gender(gender_num, gender_type) values (gender_num.nextval, '남자');
insert into gender(gender_num, gender_type) values (gender_num.nextval, '여자');
insert into gender(gender_num, gender_type) values (gender_num.nextval, '비공개');
insert into gender(gender_num, gender_type) values (gender_num.nextval, '중성');

update gender set gender_type='unknown' where gender_type='비공개';
delete from gender where gender_type='중성';


-- 선호분야 테이블
create sequence prefer_num;
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '동물');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '드라마');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '여행');

update prefer set prefer_type='캠핑' where prefer_type='여행';
delete from prefer where prefer_type='드라마';

-- 회원정보 테이블
create sequence user_num;
insert into user_info(user_num, user_id, user_password, user_nickname, user_name, user_birth, user_email, user_phonenum, user_regdate, user_profile_name, user_profile_path, user_gender_num, user_prefer_num)
values (user_num.nextval, 'letter333', 'password1', 'letter',  '오세룡',  '1998-02-17', 'seryong12@gmail.com', '010-3194-0217', '2022-08-01', null, null, 1, 1);

insert into user_info(user_num, user_id, user_password, user_nickname, user_name, user_birth, user_email, user_phonenum, user_regdate, user_profile_name, user_profile_path, user_gender_num, user_prefer_num)
values (user_num.nextval, 'jihop379', 'pa5sword2', 'errorj',  '박지호',  '1995-01-14', 'jihop379@gmail.com', '010-1234-1234', '2022-08-02', null, null, 2, 1);

insert into user_info(user_num, user_id, user_password, user_nickname, user_name, user_birth, user_email, user_phonenum, user_regdate, user_profile_name, user_profile_path, user_gender_num, user_prefer_num)
values (user_num.nextval, 'igodda0654', 'pAssword3', 'sik',  '이범식',  '1990-01-01', 'igodda0654@gmail.com', '010-4321-4312', '2022-09-01', null, null, 1, 3);

update user_info set user_password='drowssap' where user_password='pAssword3';
delete from user_info where user_id='letter333';

-- 게시글 테이블
create sequence post_num;
insert into post(post_num, post_created_at, post_user_num, post_title, post_content, post_writer_position, post_comment_count)
values (post_num.nextval, systimestamp, 2, 'test title1', 'test content', null, 0);

insert into post(post_num, post_created_at, post_user_num, post_title, post_content, post_writer_position, post_comment_count)
values (post_num.nextval, to_timestamp('2022-08-31 15:31:26'), 3, 'test title2', 'test content22', null, 2);

insert into post(post_num, post_created_at, post_user_num, post_title, post_content, post_writer_position, post_comment_count)
values (post_num.nextval, systimestamp, 2, 'test title3', 'test content33', null, 6);

update post set post_writer_position='대구' where post_user_num=2;
delete from post where post_comment_count=0;

-- 댓글 테이블
create sequence comment_num;
insert into comments(comment_num, comment_created_at, comment_user_num, comment_post_num, comment_content)
values (comment_num.nextval, systimestamp, 2, 2, 'comment1');
insert into comments(comment_num, comment_created_at, comment_user_num, comment_post_num, comment_content)
values (comment_num.nextval, systimestamp, 3, 3, 'comment2');
insert into comments(comment_num, comment_created_at, comment_user_num, comment_post_num, comment_content)
values (comment_num.nextval, systimestamp, 3, 2, 'comment33');

update comments set comment_content='update comment' where comment_content='comment33';
delete from comments where comment_num = 1;
