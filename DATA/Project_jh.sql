--내 테이블 ㅇㅅㅇ-- 

create table gender
(
    gender_number int primary key,
    gender_type varchar2(255) unique not null --    male char(6) not null,  female char(6) not null, nknown char(6) not null //식으로 하면, 어떤게 뭔 성별을 가진지 모르니까.
);

create sequence gender_num;
delete from gender;
insert into gender(gender_number, gender_type) values(gender_number.nextval, 'female');
insert into gender(gender_number, gender_type) values(gender_number.nextval, 'male');
insert into gender(gender_number, gender_type) values(gender_number.nextval, '외계인');
insert into gender(gender_number, gender_type) values(gender_number.nextval, '레전드');

update into gender set gender_type='unknown' where gender_type='외계인';
delete from gender where gender_type='레전드';

select * from gender;
select * from gender where gender_type like '%female%'; --출력문 
select * from gender where gender_type like '%male%';

create table interest
(
    interest_num varchar2(255) primary key,        --선호 분야  번호
    interest_text varchar2(255) unique not null --선호 분야 죵류
);

create sequence interest_num;
insert into interest (interest_num, interest_text) values (interest_num.nextval, '민트초코');
insert into interest (interest_num, interest_text) values (interest_num.nextval, '백준못풀기');
insert into interest (interest_num, interest_text) values (interest_num.nextval, '코딩');
select * from interest;

update interest set interest_text='게임' where interest_text='코딩';

create table user_info
(
    user_num int primary key,   --회원번호
    user_id varchar2(255) not null, --회원 아이디
    user_password varchar2(255) not null,   --비밀번호
    user_nickname varchar2(255) not null,   --닉네임
    user_name varchar2(255) not null,   --이름
    user_birthdate int not null,    --생년월일
    user_phone_num int not null,    --폰번호
    user_email varchar2(255) not null,  --이메일
    user_profile_picture_name varchar2(255) not null,   --프로필 사진 파일 이름
    user_profile_path varchar2(255) not null,   --프로필 사진 파일 경로
    user_profile_timestamp varchar2(255) not null, --가입일
    user_gender_num int not null, -- 성별 외래키 설정
    user_interest_num varchar2(255), --취미 외래키 설정
    constraint fk_user_gender_number foreign key(user_gender_num) references gender(gender_number),
    constraint fk_user_interest_num foreign key(user_interest_num) references interest(interest_num)
);

--2) 테이블당 최소 데이터 3개 넣고, 1개 바꾸고, 1개 지우기 (insert, update, delete)

create sequence user_num;
insert into user_info(user_num, user_id, user_password, user_nickname, user_name, user_birthdate, user_phone_num, user_email, user_profile_picture_name, user_profile_path, user_timestamp, user_gender_num, user_interest_num)
values(user_num.nextval, 1, 'parkjiho14', 'ppp1234', 'mint', '박지호', to_date('1995-01-14','YYYY-MM-DD'), '010-1234-1493', 'jihop379@gmail.com', 'popcat', 'popopcat_pic', '20220922104408',1,3);

insert into user_info(user_num, user_id, user_password, user_nickname, user_name, user_birthdate, user_phone_num, user_email, user_profile_picture_name, user_profile_path, user_timestamp, user_gender_num, user_interest_num)
values(user_num.nextval, 2, 'ohseryong', 'strongseryong', 'letter', '오세용', to_date('1998-02-17'','YYYY-MM-DD'), '010-7777-9090', 'seryong12@gmail.com', 'malangmalang', 'malangmalang_pic', '20220923104408',2,2);

insert into user_info(user_num, user_id, user_password, user_nickname, user_name, user_birthdate, user_phone_num, user_email, user_profile_picture_name, user_profile_path, user_timestamp, user_gender_num, user_interest_num)
values(user_num.nextval, 3, 'hacker', 'strongseryong', 'hacker18', '해커범', '1999-08-18', '010-7808-1818', 'dark_hacekr18@gmail.com', 'errorerror', 'pic_hack', '20220924104408',3,1);


update user_info set name='오세룡' where num=2;
DELETE FROM  user_info WHERE num=3;
select * from user_info;




create table post
(
    post_num int primary key, -- 외래키
    post_uploader_num varchar2(255) not null, --업로더 넘버 외래키??????
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
values(post_num.nextval, 1, 1, 'mint', 'popopopcatcorn', 'popcat', 'pppp', '1090x393', null, '팝캣은 귀여워', null, null, 45, 70, '고양이');




create table comments 
(
    comment_num int primary key, --포스트
    comment_post_num varchar2(255) not null, --댓글 달린 포스트 아이디 외래키?
    comment_user_num varchar2(255) not null, --댓글 단 유저 넘버 외래키?  
    comment_timestamp int not null, --타임스탬프
    comment_contents varchar2(255) not null, --댓글 내용
    constraint fk_comment_post_num foreign key(comment_post_num) references post(post_num),
    constraint fk_comment_user_num foreign key(comment_user_num) references user_info(user_num)
);
create sequence comments_num;
insert into comments(comment_num, comment_post_num, commmet_user_num, comment_timestamp, comment_contents)
values (comment_num.nextval, 1, 1, 'user1', systimestamp, '우와 귀엽다');

--create sequence 시퀀스 이름;  >> 시퀀스는 자동으로 번호 매겨주기 위해 쓰는 것.  ????->포스트넘버, 유저넘버 등
--create sequence user_up; drop sequence gender_up;

--view  >>제일 많은 댓글 임시 테이블 만들기. 
create view find_max_comments as select max(comment_num) max_comment from comments;
select * from find_max_comments;

--join (교집합) 서로 다른 테이블을 하나로 합치느거. >>> 성별, 취미
select interest.interest_num prefernum, user_info.user_gender_num joingender
from interest join user_info
on interest.interest_num = user_info.user_ineterest_num;
--interest의 interest_num의 이름을 prefernum으로 이름 설정, 젠더 번호도 똑같이 
--interest 테이블의 ineterest_num이랑 user_info테이블의 user_ineterest_num이 같으면
--취미 번호랑 성별 출력하는 것. 

--5) 그룹 바이 ex) 회원정보에 입력한 생년월일로 10대가 몇명이고 20대 각각 몇명인지 조회하는 것.
--세대별 이용자수 정보 획득 (like netflix db, 나이별 어떤 컨텐츠에 수요가 있는지를 찾는 등 여러 기업에서 통계를 냄!!) 
--xxxx 댓글을 group by 해서 max 값을 구한다 
--1. 

select , max(comment_num)



--6) 해빙 쓰기. >> 평균 나이 avg. 


/*
create table follow
(
    follower_id varchar2(255) primary key, --팔로우 한 사람.
    follower_num int,
    following_id varchar2(255) --팔로잉 당한 사람

);

create table tagged
(
    tag_name varchar2(255) primary key, 
    tag_num int, --태그수 제한걸기? 태그 갯수, 태그 명 길이/.
    tag_id varchar2(255), --태그한 유저 아이디
    
);

create table account_info
(
    account_info_post_num primary key,  --외ㅐ래키
    account_info_comment_num varchar2(255),
    account_info_likes_num varchar2(255),
    account_info_following_num varchar2(255),
    account_info_follower_num varchar2(255)
);
insert into account_info(account_info_post_num, account_info_comment_num, account_info_likes_num, account_info_following_num, account_info_follower_num)
values(1, 122939489348, 45, 34, 59);


*/



