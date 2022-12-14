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
create table user_info(
    user_num int primary key, -- 회원번호
    user_id varchar2(255) unique not null, --회원 아이디
    user_password varchar2(255) not null, -- 비밀번호
    user_nickname varchar2(255) unique not null, -- 닉네임
    user_name varchar2(255) not null, -- 이름
    user_birth varchar2(255) not null, -- 생년월일
    user_email varchar2(255) unique not null, -- 이메일
    user_phonenum varchar2(255) unique not null, -- 전화번호
    user_regdate varchar2(255) not null, -- 가입일
    user_profile_name varchar2(255), -- 프로필사진 파일 이름
    user_profile_path varchar2(255), -- 프로필사진 파일 경로
    user_gender_num int not null, -- 성별 외래키 설정
    user_prefer_num int, -- 선호분야 외래키 설정
    user_count_post int, -- 작성한 게시글 수
    user_count_comment int, -- 작성한 댓글 수
    user_count_like int, -- 좋아요한 수
    user_count_following int, -- 팔로잉 수
    user_count_follower int, -- 팔로워 수
    constraint fk_user_gender_num foreign key(user_gender_num) 
    references gender(gender_num) on delete cascade, 
    constraint fk_user_prefer_num foreign key(user_prefer_num) 
    references prefer(prefer_num) on delete cascade);

-- 게시글 테이블
create table post
(
    post_num int primary key, 
    post_created_at varchar2(255) not null, 
    post_user_num int not null, --외래키로 설정
    post_title varchar2(255) not null, 
    post_content varchar2(3000) not null, 
    post_writer_position varchar2(255), 
    post_comment_count int, 
    post_like_count int, 
    constraint fk_post_user_num foreign key(post_user_num) references user_info(user_num) on delete cascade
);

-- 댓글 테이블
create table comments
(
    comment_num int primary key, 
    comment_created_at varchar2(255) not null, 
    comment_user_num int not null, -- 외래키로 설정
    comment_post_num int not null, -- 외래키로 설정
    comment_content varchar2(300) not null, 
    constraint fk_comment_user_num foreign key(comment_user_num) references user_info(user_num) on delete cascade, 
    constraint fk_comment_post_num foreign key(comment_post_num) references post(post_num) on delete cascade
);

-- 좋아요 테이블
create table like_info
(
    like_num int primary key, 
    like_create_time varchar2(20) not null, 
    like_user_num int not null, 
    like_post_num int not null, 
    like_relation varchar2(100) unique not null, 
    foreign key(like_user_num) references user_info(user_num) on delete cascade, 
    foreign key(like_post_num) references post(post_num) on delete cascade
);

-- 팔로잉 테이블
create table following_info
(
    following_num int primary key, 
    following_create_time varchar2(20) not null, 
    following_user_num int not null, 
    following_user2_num int not null, 
    following_relation varchar2(100) unique, 
    foreign key(following_user_num) references user_info(user_num) on delete cascade, 
    foreign key(following_user2_num) references user_info(user_num) on delete cascade
);



-- dbms_output.put_line('정보가 수정됩니다.');
-- 트리거. 게시글 입력시 회원정보 수정
create or replace trigger insert_post 
after insert on post 
for each row 
begin 
update user_info set user_count_post = user_count_post+1 
where :new.post_user_num = user_num;
end;
/
-- 트리거. 게시글 작성자 수정 불가
create or replace trigger update_post 
before update of post_user_num on post 
for each row 
begin 
raise_application_error(-20000, '게시글 작성자 수정 불가');
end;
/
-- 트리거. 게시글 삭제시 회원정보 수정 및 댓글, 좋아요 삭제
create or replace trigger delete_post 
before delete on post 
for each row 
begin 
update user_info set user_count_post = user_count_post-1 
where :old.post_user_num = user_num;
end;
/

-- 트리거. 댓글 입력시 회원정보, 게시글 수정
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
-- 트리거. 댓글의 관계 수정 불가
create or replace trigger update_comments 
before update of comment_user_num, comment_post_num on comments 
for each row 
begin 
raise_application_error(-20000, '댓글의 관계 수정 불가');
end;
/
-- 트리거. 댓글 삭제시 회원정보, 게시글 수정
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

-- 트리거. 좋아요 입력시 회원정보, 게시글 수정
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
-- 트리거. 좋아요 수정 불가
create or replace trigger update_like_info 
before update on like_info 
for each row 
begin 
raise_application_error(-20000, '좋아요 수정 불가');
end;
/
-- 트리거. 좋아요 삭제시 회원정보, 게시글 수정
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

-- 트리거. 팔로잉 입력시 회원정보 수정
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
-- 트리거. 팔로잉 수정 불가
create or replace trigger update_following_info 
before update on following_info
for each row 
begin 
raise_application_error(-20000, '팔로잉 수정 불가');
end;
/
-- 트리거. 팔로잉 삭제시 회원정보 수정
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

-- 프로시저. 회원정보 삭제
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
-- 프로시저. 게시글 삭제
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



-- 성별 테이블
create sequence gender_num;
insert into gender(gender_num, gender_type) values (gender_num.nextval, '남자');
insert into gender(gender_num, gender_type) values (gender_num.nextval, '여자');
insert into gender(gender_num, gender_type) values (gender_num.nextval, '비공개');
insert into gender(gender_num, gender_type) values (gender_num.nextval, '중성');

update gender set gender_type='unknown' where gender_type='비공개';
delete from gender where gender_type='중성';
select*from gender;

-- 선호분야 테이블
create sequence prefer_num;
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '동물');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '드라마');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '캠핑');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '게임');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '운동');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '호흡법');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '민트초코');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '코딩');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '야구');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '사진촬영');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '먹방');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '영화');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '수학공부');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '그림그리기');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '데이터수집');
insert into prefer(prefer_num, prefer_type) values (prefer_num.nextval, '수면');

update prefer set prefer_type='여행' where prefer_type='캠핑';
delete from prefer where prefer_type='수면';
select*from prefer;

-- 회원정보 테이블
create sequence user_num;
insert into user_info values (user_num.nextval, 'letter333', 'password1', 'letter', '오세룡', to_date('1998-02-17', 'YYYY-MM-DD'), 'seryong12@gmail.com', '010-3194-0217', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 1, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'jihop379', 'pa5sword2', 'errorj', '박지호', to_date('1995-01-14', 'YYYY-MM-DD'), 'jihop379@gmail.com', '010-1234-1234', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, 1, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'igodda0654', 'pAssword3', 'sik', '이범식', to_date('1990-01-01', 'YYYY-MM-DD'), 'igodda0654@gmail.com', '010-4321-4312', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 3, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'mong', 'mong_pass', 'mong_nick', '숭이', to_date('2000-01-01', 'YYYY-MM-DD'), 'mong@mail.com', '010-0000-0001', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 5, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'cowww', 'cowww_pass', 'cow_nick', '말랑카우', to_date('2000-01-02', 'YYYY-MM-DD'), 'cowww@mail.com', '010-0000-0002', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 3, 4, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'dog', 'dog_pass', 'dog_nick', '멍이', to_date('2000-01-03', 'YYYY-MM-DD'), 'meong@mail.com', '010-0000-0003', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 7, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'parkjiho14', 'ppp1234', 'mint', '박지호', to_date('2000-01-03', 'YYYY-MM-DD'), 'jihop379@mail.com', '010-0000-0004', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, 8, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'hacker', 'strongbeom', 'hacker19', '해커범', to_date('2000-08-18', 'YYYY-MM-DD'), 'dark_hacker19@mail.com', '010-7808-1818', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 3, 9, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'nemesis', 'rororoi', 'jormungandr', '세계수', to_date('2000-07-21', 'YYYY-MM-DD'), 'bluenight2@mail.com', '010-7859-5566', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 5, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'youluvme', 'eee22i', 'cyberpitcher',  '후루꾸시즌',  to_date('2003-11-08', 'YYYY-MM-DD'), 'powerflower@mail.com', '010-5522-8601', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 4, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'dohi', 'dohidohi', 'dohi123', '이두희', to_date('1980-05-15', 'YYYY-MM-DD'), 'dohi123@mail.com', '010-9875-4552', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, 8, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'pon noiman', 'pon noiman77', 'pon noiman199', '폰 노이만', to_date('1900-01-25', 'YYYY-MM-DD'), 'pon noiman123@mail.com', '010-9465-6578', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, 15, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'purin', 'pupurin', 'pupupurin', '푸틴', to_date('1996-01-01', 'YYYY-MM-DD'), 'pupupupurin@mail.com', '010-9999-9999', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 14, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'ctulru', 'ctulrukkk', 'ctulrukkkkk', '크툴루', to_date('0001-01-01', 'YYYY-MM-DD'), 'ctulruuuuu@mail.com', '070-8888-8888', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 3, 13, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'allen turing', 'allenallen', 'turing turing', '앨런 튜링', to_date('2010-05-30', 'YYYY-MM-DD'), 'allen turing0530@mail.com', '010-0530-0530', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 3, 12, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'dongjoon', 'dongdonglee', 'DongJoonLee34', '이동준', to_date('1990-05-18', 'YYYY-MM-DD'), 'dongdonglee@mail.com', '010-5645-2322', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 9, 0, 0, 0, 0, 0);
insert into user_info values (user_num.nextval, 'juli', 'julilkim', 'juljulkk', '김주리', to_date('1988-01-30', 'YYYY-MM-DD'), 'julijuli@mail.com', '010-6787-8363', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, null, 0, 0, 0, 0, 0);

update user_info set user_nickname='drowssap' where user_num=4;
delete from user_info where user_num=17;
exec procedure_delete_user(16);
select*from user_info;

-- 게시글 테이블
create sequence post_num;
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 2, 'test title1', 'test content', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 3, 'test title2', 'test content22', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 2, 'test title3', 'test content33', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 4, 'post_mong', 'mongmongmong', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 5, 'post_cowww', 'cowwwwwwwwwww', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 6, 'post_dog', 'meong post content', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 7, 'popopopcatcorn', '팝캣은 귀여워', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 8, '민초 커스텀 추천받습니다', '#민트초코 프라푸치노 사진, 민초는 맛있어', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 9, '넷플릭스 기묘한 이야기 꿀잼', '#넷플릭스 기묘한이야기 사진, 기묘한이야기 안보면 인생손해!', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 10, '팝캣팝캣말랑말랑', '고양이는 말랑말랑 말랑이는 말랑말랑 나라가 허락한 유일한 마약 말랑말랑 고양이;말랑이를 모르면 인생손해!', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 11, '아재개그', '아몬드가 죽으면 다이아몬드!', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 12, '헬창이 되고싶어요', '언제쯤 근성장을 이루어낼까?', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 13, '캠핑하기 좋은 장소가 어디죠?', '추천받습니다', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 14, '태풍 보내주세요ㅠㅠ', '집에 보내주세요ㅠㅠ', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 15, '아재개그', '꽃집사장이 싫어하는 도시는? (시드니)', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 15, '나는 오늘도 백준을 풀지', '하지만 답을 맞춘다고는 안했어;;', null, 0, 0);
insert into post values (post_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 5, '날먹최고', '날먹은 진짜 최고입니다.;', null, 0, 0);

update post set post_title='태풍 조심하세요ㅠㅠ' where post_num=14;
delete from post where post_num=17;
exec procedure_delete_post(16);
select*from post;

-- 댓글 테이블
create sequence comment_num;
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 1, 1, 'comment1');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 2, 2, 'comment2');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 3, 3, 'comment33');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 6, 4, 'kkkkkkk');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 7, 5, 'really?');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 10, 7, 'oh my cat!');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 4, 7, '우와 귀엽다');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 11, 10, '말랑이 사진 좀 주세요 말랑이 사진 삽니다. ');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 12, 11, '깔깔깔 아재개그 최고^-^');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 13, 8, '민초 떡볶이는 어떠세요?');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 15, 13, '캠핑 대신 1일 1커밋 잔디를 심으시죠!');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 14, 15, '니 인생이 시들고 싶니????');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 5, 8, '민트초코 피자도 맛있어요!');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 9, 12, '무게를 더 올리시는건 어떨까요');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 8, 12, '자세가 잘못 된거 아닐까요-엄금진-');
insert into comments values (comment_num.nextval, to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 15, 7, '존버는 성공합니다 포기하지말고 백준 푸세요ㅇㅅㅇ');

update comments set comment_content='update comment' where comment_num = 3;
delete from comments where comment_num = 16;
select*from comments;

-- 좋아요 테이블
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

-- 팔로잉 테이블
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



-- join. 회원번호와 아이디로 작성한 댓글 불러오기
select user_num 작성자회원번호, user_id 작성자아이디, user_name 작성자이름, comment_num 작성댓글번호, comment_content 작성댓글 
from user_info join comments on user_info.user_num = comments.comment_user_num and user_info.user_id='igodda0654';

-- join. 회원번호와 아이디로 작성한 글 불러오기
select user_num 작성자회원번호, user_id 작성자아이디, user_name 작성자이름, post_num 게시글번호, post_title 게시글제목, post_content 작성게시글 
from user_info join post on user_info.user_num = post.post_user_num and user_info.user_id='jihop379';

-- join, group by. 각 성별에 따른 유저의 수
select user_info.user_gender_num, gender.gender_type, count(*) 
from user_info join gender on user_info.user_gender_num = gender.gender_num 
group by gender.gender_num, gender.gender_type, user_info.user_gender_num 
order by user_gender_num;

-- join, group by, having. 원하는 성별 유저의 수
select user_info.user_gender_num, gender.gender_type, count(*) 
from user_info join gender on user_info.user_gender_num = gender.gender_num 
group by gender.gender_num, gender.gender_type, user_info.user_gender_num having gender_type='남자'
order by user_gender_num;



-- join. 회원정보 출력
select user_num, user_regdate, user_id, user_password, user_nickname, user_name, user_gender_num, user_birth, user_phonenum, user_email, user_prefer_num 
from user_info 
join gender on user_gender_num=gender_num 
join prefer on user_prefer_num=prefer_num;

-- join, 중첩질의, group by, having. 여자회원 수 출력
select gender_type, count(gender_type) count_gender from (select user_nickname, gender_type, prefer_type
from user_info 
join gender on user_gender_num=gender_num 
join prefer on user_prefer_num=prefer_num) group by gender_type having gender_type='여자';

-- join, view. 아이디, 성별, 선호분야 출력
create view view_user as select user_nickname, gender_type, prefer_type
from user_info 
join gender on user_gender_num=gender_num 
join prefer on user_prefer_num=prefer_num;
select*from view_user;

-- view, group by. 성별에 따른 선호분야 수 출력
select gender_type, count(gender_type) count_gender from view_user group by gender_type;

-- view, group by, having. 여자회원의 선호분야 수 출력
select gender_type, count(gender_type) count_gender from view_user group by gender_type having gender_type='여자';

-- 프로시저. 선호분야 입력
create or replace procedure insert_prefer(prefer_num in int, prefer_type in varchar2) 
is begin insert into prefer values(prefer_num, prefer_type);
end insert_prefer;
/
exec insert_prefer(prefer_num.nextval, '전쟁');
select*from prefer;

-- 함수. 게시글번호 입력시 좋아요를 가장 많이 받은 게시글과의 좋아요개수 차이 출력
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



-- join. 성별, 선호분야 출력
select gender_type 성별, prefer_type 선호분야
from user_info join gender on user_gender_num=gender_num join prefer on user_prefer_num=prefer_num;

-- view. 마지막 댓글번호 출력
create view find_max_comments as select max(comment_num) Last_comment from comments;
select * from find_max_comments;

-- join, view. 이름, 성별, 좋아요 수 출력
create view view_user2 as select user_name, gender_type, like_num
from user_info
join gender on user_gender_num=gender_num
join like_info on like_user_num=user_num;
select *from view_user2;

-- view, group by. 성별에 따른 좋아요 수 출력
select gender_type, sum(like_num) as sum_like_num  from view_user2 group by gender_type;

-- view, group by, having. 남자회원의 좋아요 수 출력
select gender_type, sum(like_num) as sum_like_num from view_user2 group by gender_type having gender_type='남자';

-- join, view. 여성회원들의 닉네임 출력
create view female_nickname as select gender.gender_num as female, user_info.user_nickname as nickname
from user_info join gender on user_info.user_gender_num = gender.gender_num
where user_info.user_gender_num='2';
select * from female_nickname;

-- 프로시저. 선호분야 입력
create or replace procedure ex_prefer_gender_info(prefer_num in int, prefer_type in varchar2) 
is begin insert into prefer values(prefer_num, prefer_type);
end ex_prefer_gender_info;
/
exec ex_prefer_gender_info(prefer_num.nextval, '스컬타운 산책');
select*from prefer;



-- join. 아이디, 이름, 성별 출력
select user_id, user_name, gender_type 
from user_info, gender where user_gender_num=gender_num;

-- 프로시저. 선호분야 삭제
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

-- 프로시저. 회원정보 넣기
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
    mycount_like int, -- 좋아요한 수
    mycount_following int, -- 팔로잉 수
    mycount_follower int -- 팔로워 수
) 
is begin 
insert into user_info values (mynum, myid, mypass, mynick, myname, mybirth, myemail, mypn, myregd, myproname, mypropath, mygender_num, myprefer_num, mycount_post, mycount_comment, mycount_like, mycount_following, mycount_follower);
end add_user;
/
exec add_user(user_num.nextval, 'prori1', 'rolripop', 'ddfs', '롤리팝', to_date('1999-12-25', 'YYYY-MM-DD'), 'rorirori123@mail.com', '010-1224-563', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 2, 15, 0, 0, 0, 0, 0);
select*from user_info;



-- 내장함수. 생년월일로 나이를 계산하여 출력
WITH TEMP AS (
    SELECT '오세룡'  NM, TO_DATE('19990702', 'YYYYMMDD') BIRTHDAY FROM DUAL UNION ALL
    SELECT '조영탁'  NM, TO_DATE('19890228', 'YYYYMMDD') BIRTHDAY FROM DUAL UNION ALL
    SELECT '김혜민'  NM, TO_DATE('19950228', 'YYYYMMDD') BIRTHDAY FROM DUAL UNION ALL
    SELECT '박지호'  NM, TO_DATE('20000528', 'YYYYMMDD') BIRTHDAY FROM DUAL UNION ALL
    SELECT '이범식' NM, TO_DATE('19820517', 'YYYYMMDD') BIRTHDAY FROM DUAL
)
SELECT NM, TO_CHAR(BIRTHDAY, 'YYYY-MM-DD') BIRTHDAY, 
    CASE WHEN TRUNC(SYSDATE) - BIRTHDAY <= 30 THEN
            TRUNC(SYSDATE) - BIRTHDAY + 1 || '일'
        WHEN MONTHS_BETWEEN(TRUNC(SYSDATE), BIRTHDAY) < 12 THEN
            TRUNC(MONTHS_BETWEEN(TRUNC(SYSDATE), BIRTHDAY)) || '개월'
        ELSE
            TRUNC(MONTHS_BETWEEN(TRUNC(SYSDATE), BIRTHDAY) / 12 ) || '세'
    END AGE
FROM TEMP
/

-- 프로시저. 회원정보 입력
create or replace procedure insert_user_info 
(
    user_num in int , -- 회원번호
    user_id varchar2, --회원 아이디
    user_password varchar2, -- 비밀번호
    user_nickname varchar2, -- 닉네임
    user_name varchar2, -- 이름
    user_birth varchar2, -- 생년월일
    user_email varchar2, -- 이메일
    user_phonenum varchar, -- 전화번호
    user_regdate varchar2, -- 가입일
    user_profile_name varchar2, -- 프로필사진 파일 이름
    user_profile_path varchar2, -- 프로필사진 파일 경로
    user_gender_num int , -- 성별 외래키 설정
    user_prefer_num int, -- 선호분야 외래키 설정
    user_count_post int, -- 작성한 게시글 수
    user_count_comment int, --댓글 수
    user_count_like int, -- 좋아요한 수
    user_count_following int, -- 팔로잉 수
    user_count_follower int -- 팔로워 수
) 
is begin 
insert into user_info values (user_num, user_id, user_password, user_nickname, user_name, user_birth, user_email, user_phonenum, user_regdate, user_profile_name,user_profile_path, user_gender_num, user_prefer_num,user_count_post,user_count_comment, user_count_like, user_count_following, user_count_follower); 
end insert_user_info;
/
exec insert_user_info (user_num.nextval,'drarke', 'rororoi', 'ddwwss', 'dualcore', to_date('2000-07-21', 'YYYY-MM-DD'), 'eisklek2@mail.com', '010-5632-7854', to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), null, null, 1, 5, 0, 0, 0, 0, 0);
select*from user_info;