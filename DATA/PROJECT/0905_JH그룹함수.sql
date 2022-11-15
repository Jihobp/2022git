--함수 만들기
--OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
--이름을 받아서 성별 코드를 반환하는 함수.   >> 테이블 불러오기 
--OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
create or replace function get_gender_c(v_name varchar2)
return varchar is v_name varchar(100);
begin select name into v_name from simple_test_table where num=v_num;
return v_name;
exception when others then 
DBMS_OUTPUT.PUT_LINE('exception occurred! ('||sqlcode||'):'||sqlerrm);
return '';
end;

-- 원하는 성별 유저의 수 join, group by having  --osr 이거 참고해서 써봤는뎅 
select count(*), user_info.user_gender_num, gender.gender_type 
from user_info join gender on user_info.user_gender_num = gender.gender_num 
group by gender.gender_num, gender.gender_type, user_info.user_gender_num having gender_type='남자'
order by user_gender_num;


--내꺼 group & join & having 
--여자 성별에 따른 포스팅 수 -- 고쳐야함 ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
--여자 성별과 포스팅엔 교차점이 없으니 그 둘을 묶은 view 테이블을 만들어서 거기서 불러와야하나?ㅠㅠㅠㅠㅠㅠㅠ
--유저넘 ==포스트 유저넘
create view view_user_post as select user_num user, post_user_num posting_user, post_num post_number
from user_info
join post on user_info.user_num = post.post_user_num;
select * from view_user_post;
--
select gender_type, count(gender_type),  view_user_post.post_num, gender.gender_type
from post join view_user_post on post.post_user_num = view_user_post.post_num --일단 여기가 문제임 ㅇㅅㅇ
group by gender.gender_type, post.post_num having gender_type='여자';


--고쳐야함 ㅠㅠㅠ 2 여자 성별에 따른 팔로잉 수 
select gender_type 성별, user_count_following "팔로잉 수" from user_info join gender on user_gender_num=gender_num;
--

--성별 코드가 '2'인 유저닉네임의 성별코드와 유저명을 뷰로 생성. 이때, 성별코드를 female, 유져명을nick
--뷰 생성후 뷰를 테이블처럼 사용
create view female_nickname as select gender.gender_num as female, user_info.user_nickname as nickname
from user_info join gender
on user_info.user_gender_num = gender.gender_num
where user_info.user_gender_num='2';
select * from female_nickname;


--view  >>제일 많은 댓글 임시 테이블 만들기. 
create view find_max_comments as select max(comment_num) max_comment from comments;
select * from find_max_comments;

--JOIN, group  성별에 따른 좋아요 수 

--view, join, 이름, 성별, 좋아요 수 출력
create view view_user2 as select user_name, gender_type, like_num
from user_info
join gender on user_gender_num=gender_num
join like_info on like_user_num=user_num;
select *from view_user;

--view, group by 성별에 따른 좋아요 수 출력
select gender_type, count(gender_type) as count_gender from view_user2 group by gender_type;

--view, group by, having 남자 회원의 좋아요수 출력
select gender_type, count(gender_type) as count_gender from view_user2 group by gender_type having gender_type='남자';

-- join, 뷰. 아이디, 성별, 선호분야 출력
drop view view_user;
create view view_user as select user_nickname, gender_type, prefer_type
from user_info 
join gender on user_gender_num=gender_num 
join prefer on user_prefer_num=prefer_num;
select*from view_user;

-- 뷰, group by. 성별에 따른 선호분야 수 출력
select gender_type, count(gender_type) count_gender from view_user group by gender_type;

-- 뷰, group by, having. 여자회원의 선호분야 수 출력
select gender_type, count(gender_type) count_gender from view_user group by gender_type having gender_type='여자';



--join (교집합) 서로 다른 테이블을 하나로 합치느거. >>> 성별, 취미
select interest.interest_num prefernum, user_info.user_gender_num joingender
from interest join user_info
on interest.interest_num = user_info.user_ineterest_num;
--interest의 interest_num의 이름을 prefernum으로 이름 설정, 젠더 번호도 똑같이 
--interest 테이블의 ineterest_num이랑 user_info테이블의 user_ineterest_num이 같으면
--취미 번호랑 성별 출력하는 것. 


--이름을 받아서 성별 코드를 반환하는 함수.   >> 테이블 불러오기 

-- 번호를 통해서 이름값을 반환해내는 함수
create or replace function func_getperson(v_num int)
return varchar is v_name varchar(100);
begin select name into v_name from simple_test_table where num=v_num;
return v_name;
exception when others then 
DBMS_OUTPUT.PUT_LINE('exception occurred! ('||sqlcode||'):'||sqlerrm);
return '';
end;

--set serveroutput on; DBMS_OUTPUT 때문에 쓰라고 한 거임...




--취미에 대한 성별
--
create or replace procedure ex_prefer_gender_info
(
	prefer_type varchar2,
	gender_type int
)

is begin 
insert into prefer_gender_info 
values(prefer_type, gender_type);
end ex_prefer_gender_info;
/
exec ex_prefer_gender_info('스컬타운산책',2);



SELECT Trunc(Months_between(SYSDATE, To_date('1995-01-14', 'YYYY-MM-DD')) / 12) year,

                Trunc(MOD(Months_between(SYSDATE, To_date('1995-01-14', 'YYYY-MM-DD')),12))month,

                  Trunc(SYSDATE - Add_months(To_date('1995-01-14', 'YYYY-MM-DD'), 
                  Trunc(Months_between(SYSDATE,
                  To_date('1995-01-14', 'YYYY-MM-DD')) /12) * 12 +
                Trunc(MOD(Months_between(SYSDATE,
                To_date('19-09-1995', 'dd-mm-yyyy')), 12)))) day
 FROM dual;
