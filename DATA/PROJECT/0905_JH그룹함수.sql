--敗呪 幻級奄
--OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
--戚硯聖 閤焼辞 失紺 坪球研 鋼発馬澗 敗呪.   >> 砺戚鷺 災君神奄 
--OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
create or replace function get_gender_c(v_name varchar2)
return varchar is v_name varchar(100);
begin select name into v_name from simple_test_table where num=v_num;
return v_name;
exception when others then 
DBMS_OUTPUT.PUT_LINE('exception occurred! ('||sqlcode||'):'||sqlerrm);
return '';
end;

-- 据馬澗 失紺 政煽税 呪 join, group by having  --osr 戚暗 凧壱背辞 潤挫澗記 
select count(*), user_info.user_gender_num, gender.gender_type 
from user_info join gender on user_info.user_gender_num = gender.gender_num 
group by gender.gender_num, gender.gender_type, user_info.user_gender_num having gender_type='害切'
order by user_gender_num;


--鎧襖 group & join & having 
--食切 失紺拭 魚献 匂什特 呪 -- 壱団醤敗 ばばばばばばばばばばばばばばばばばばばばばばばばばばば
--食切 失紺引 匂什特殖 嘘託繊戚 蒸生艦 益 却聖 広精 view 砺戚鷺聖 幻級嬢辞 暗奄辞 災君人醤馬蟹?ばばばばばばば
--政煽角 ==匂什闘 政煽角
create view view_user_post as select user_num user, post_user_num posting_user, post_num post_number
from user_info
join post on user_info.user_num = post.post_user_num;
select * from view_user_post;
--
select gender_type, count(gender_type),  view_user_post.post_num, gender.gender_type
from post join view_user_post on post.post_user_num = view_user_post.post_num --析舘 食奄亜 庚薦績 しさし
group by gender.gender_type, post.post_num having gender_type='食切';


--壱団醤敗 ばばば 2 食切 失紺拭 魚献 独稽跡 呪 
select gender_type 失紺, user_count_following "独稽跡 呪" from user_info join gender on user_gender_num=gender_num;
--

--失紺 坪球亜 '2'昔 政煽莞革績税 失紺坪球人 政煽誤聖 坂稽 持失. 戚凶, 失紺坪球研 female, 政閃誤聖nick
--坂 持失板 坂研 砺戚鷺坦軍 紫遂
create view female_nickname as select gender.gender_num as female, user_info.user_nickname as nickname
from user_info join gender
on user_info.user_gender_num = gender.gender_num
where user_info.user_gender_num='2';
select * from female_nickname;


--view  >>薦析 弦精 奇越 績獣 砺戚鷺 幻級奄. 
create view find_max_comments as select max(comment_num) max_comment from comments;
select * from find_max_comments;

--JOIN, group  失紺拭 魚献 疏焼推 呪 

--view, join, 戚硯, 失紺, 疏焼推 呪 窒径
create view view_user2 as select user_name, gender_type, like_num
from user_info
join gender on user_gender_num=gender_num
join like_info on like_user_num=user_num;
select *from view_user;

--view, group by 失紺拭 魚献 疏焼推 呪 窒径
select gender_type, count(gender_type) as count_gender from view_user2 group by gender_type;

--view, group by, having 害切 噺据税 疏焼推呪 窒径
select gender_type, count(gender_type) as count_gender from view_user2 group by gender_type having gender_type='害切';

-- join, 坂. 焼戚巨, 失紺, 識硲歳醤 窒径
drop view view_user;
create view view_user as select user_nickname, gender_type, prefer_type
from user_info 
join gender on user_gender_num=gender_num 
join prefer on user_prefer_num=prefer_num;
select*from view_user;

-- 坂, group by. 失紺拭 魚献 識硲歳醤 呪 窒径
select gender_type, count(gender_type) count_gender from view_user group by gender_type;

-- 坂, group by, having. 食切噺据税 識硲歳醤 呪 窒径
select gender_type, count(gender_type) count_gender from view_user group by gender_type having gender_type='食切';



--join (嘘増杯) 辞稽 陥献 砺戚鷺聖 馬蟹稽 杯帖汗暗. >>> 失紺, 昼耕
select interest.interest_num prefernum, user_info.user_gender_num joingender
from interest join user_info
on interest.interest_num = user_info.user_ineterest_num;
--interest税 interest_num税 戚硯聖 prefernum生稽 戚硯 竺舛, 賎希 腰硲亀 業旭戚 
--interest 砺戚鷺税 ineterest_num戚櫛 user_info砺戚鷺税 user_ineterest_num戚 旭生檎
--昼耕 腰硲櫛 失紺 窒径馬澗 依. 


--戚硯聖 閤焼辞 失紺 坪球研 鋼発馬澗 敗呪.   >> 砺戚鷺 災君神奄 

-- 腰硲研 搭背辞 戚硯葵聖 鋼発背鎧澗 敗呪
create or replace function func_getperson(v_num int)
return varchar is v_name varchar(100);
begin select name into v_name from simple_test_table where num=v_num;
return v_name;
exception when others then 
DBMS_OUTPUT.PUT_LINE('exception occurred! ('||sqlcode||'):'||sqlerrm);
return '';
end;

--set serveroutput on; DBMS_OUTPUT 凶庚拭 床虞壱 廃 暗績...




--昼耕拭 企廃 失紺
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
exec ex_prefer_gender_info('什鎮展錘至奪',2);



SELECT Trunc(Months_between(SYSDATE, To_date('1995-01-14', 'YYYY-MM-DD')) / 12) year,

                Trunc(MOD(Months_between(SYSDATE, To_date('1995-01-14', 'YYYY-MM-DD')),12))month,

                  Trunc(SYSDATE - Add_months(To_date('1995-01-14', 'YYYY-MM-DD'), 
                  Trunc(Months_between(SYSDATE,
                  To_date('1995-01-14', 'YYYY-MM-DD')) /12) * 12 +
                Trunc(MOD(Months_between(SYSDATE,
                To_date('19-09-1995', 'dd-mm-yyyy')), 12)))) day
 FROM dual;
