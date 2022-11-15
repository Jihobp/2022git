create table gamer_info(
gamer_num int primary key,  --게이머 고유 번호
gamer_id varchar2(255) unique not null, --게이머 아이디
gamer_password varchar2(255) not null,  --게이머 비밀번호
gamer_nickname varchar2(255) not null,    --게이머 닉네임 외래키 설정
gamer_gun_num int,   --총기 이름 외래키 설정
constraint fk_gamer_gun_num foreign key(gamer_gun_num) references weapon(gun_num) on delete cascade,
constraint fk_gamer_nickname foreign key(gamer_nickname) references nickname(nickname) on delete cascade
);

select * from gamer_info;
select * from nickname;
select * from weapon;

create sequence gamer_information;

insert into nickname values('제노인트');
insert into nickname values('디지몬친구들');
insert into nickname values('말랑카우');
insert into nickname values('사냥꾼');
insert into nickname values('치터');
insert into nickname values('헌터고양이');


insert into gamer_info values (gamer_information.nextval, 'Xenoint', 'djlee', '제노인트', 1);
insert into gamer_info values (gamer_information.nextval, 'jihoppop', 'pass123', '디지몬친구들', 1);
insert into gamer_info values (gamer_information.nextval, 'letter33', 'pa98ss', '말랑카우', 2);
insert into gamer_info values (gamer_information.nextval, 'catcatpow', 'p1a4s34s', '사냥꾼', 3);
insert into gamer_info values (gamer_information.nextval, 'hacker818', 'ch23ete', '치터', 1);

update gamer_info set gamer_nickname='헌터고양이' where gamer_num=4;
delete from gamer_info where gamer_nickname='치터';
select*from gamer_info;

drop table nickname;
create table nickname(
nickname varchar2(255) primary key    --게이머 닉네임
);
--nickname_num int primary key,    -- 게이머 번호 pk


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


--er diagram : chen 모델 >>관계 표시 db diagram, 테이블
--학생테이브로가 학과 테이블 
--pk, fk, insert deta, update,delete
--코드 캡쳐, 데이터 표시