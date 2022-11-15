--�Լ� �����
--OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
--�̸��� �޾Ƽ� ���� �ڵ带 ��ȯ�ϴ� �Լ�.   >> ���̺� �ҷ����� 
--OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
create or replace function get_gender_c(v_name varchar2)
return varchar is v_name varchar(100);
begin select name into v_name from simple_test_table where num=v_num;
return v_name;
exception when others then 
DBMS_OUTPUT.PUT_LINE('exception occurred! ('||sqlcode||'):'||sqlerrm);
return '';
end;

-- ���ϴ� ���� ������ �� join, group by having  --osr �̰� �����ؼ� ��ôµ� 
select count(*), user_info.user_gender_num, gender.gender_type 
from user_info join gender on user_info.user_gender_num = gender.gender_num 
group by gender.gender_num, gender.gender_type, user_info.user_gender_num having gender_type='����'
order by user_gender_num;


--���� group & join & having 
--���� ������ ���� ������ �� -- ���ľ��� �ФФФФФФФФФФФФФФФФФФФФФФФФФФ�
--���� ������ �����ÿ� �������� ������ �� ���� ���� view ���̺��� ���� �ű⼭ �ҷ��;��ϳ�?�ФФФФФФ�
--������ ==����Ʈ ������
create view view_user_post as select user_num user, post_user_num posting_user, post_num post_number
from user_info
join post on user_info.user_num = post.post_user_num;
select * from view_user_post;
--
select gender_type, count(gender_type),  view_user_post.post_num, gender.gender_type
from post join view_user_post on post.post_user_num = view_user_post.post_num --�ϴ� ���Ⱑ ������ ������
group by gender.gender_type, post.post_num having gender_type='����';


--���ľ��� �ФФ� 2 ���� ������ ���� �ȷ��� �� 
select gender_type ����, user_count_following "�ȷ��� ��" from user_info join gender on user_gender_num=gender_num;
--

--���� �ڵ尡 '2'�� �����г����� �����ڵ�� �������� ��� ����. �̶�, �����ڵ带 female, ��������nick
--�� ������ �並 ���̺�ó�� ���
create view female_nickname as select gender.gender_num as female, user_info.user_nickname as nickname
from user_info join gender
on user_info.user_gender_num = gender.gender_num
where user_info.user_gender_num='2';
select * from female_nickname;


--view  >>���� ���� ��� �ӽ� ���̺� �����. 
create view find_max_comments as select max(comment_num) max_comment from comments;
select * from find_max_comments;

--JOIN, group  ������ ���� ���ƿ� �� 

--view, join, �̸�, ����, ���ƿ� �� ���
create view view_user2 as select user_name, gender_type, like_num
from user_info
join gender on user_gender_num=gender_num
join like_info on like_user_num=user_num;
select *from view_user;

--view, group by ������ ���� ���ƿ� �� ���
select gender_type, count(gender_type) as count_gender from view_user2 group by gender_type;

--view, group by, having ���� ȸ���� ���ƿ�� ���
select gender_type, count(gender_type) as count_gender from view_user2 group by gender_type having gender_type='����';

-- join, ��. ���̵�, ����, ��ȣ�о� ���
drop view view_user;
create view view_user as select user_nickname, gender_type, prefer_type
from user_info 
join gender on user_gender_num=gender_num 
join prefer on user_prefer_num=prefer_num;
select*from view_user;

-- ��, group by. ������ ���� ��ȣ�о� �� ���
select gender_type, count(gender_type) count_gender from view_user group by gender_type;

-- ��, group by, having. ����ȸ���� ��ȣ�о� �� ���
select gender_type, count(gender_type) count_gender from view_user group by gender_type having gender_type='����';



--join (������) ���� �ٸ� ���̺��� �ϳ��� ��ġ����. >>> ����, ���
select interest.interest_num prefernum, user_info.user_gender_num joingender
from interest join user_info
on interest.interest_num = user_info.user_ineterest_num;
--interest�� interest_num�� �̸��� prefernum���� �̸� ����, ���� ��ȣ�� �Ȱ��� 
--interest ���̺��� ineterest_num�̶� user_info���̺��� user_ineterest_num�� ������
--��� ��ȣ�� ���� ����ϴ� ��. 


--�̸��� �޾Ƽ� ���� �ڵ带 ��ȯ�ϴ� �Լ�.   >> ���̺� �ҷ����� 

-- ��ȣ�� ���ؼ� �̸����� ��ȯ�س��� �Լ�
create or replace function func_getperson(v_num int)
return varchar is v_name varchar(100);
begin select name into v_name from simple_test_table where num=v_num;
return v_name;
exception when others then 
DBMS_OUTPUT.PUT_LINE('exception occurred! ('||sqlcode||'):'||sqlerrm);
return '';
end;

--set serveroutput on; DBMS_OUTPUT ������ ����� �� ����...




--��̿� ���� ����
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
exec ex_prefer_gender_info('����Ÿ���å',2);



SELECT Trunc(Months_between(SYSDATE, To_date('1995-01-14', 'YYYY-MM-DD')) / 12) year,

                Trunc(MOD(Months_between(SYSDATE, To_date('1995-01-14', 'YYYY-MM-DD')),12))month,

                  Trunc(SYSDATE - Add_months(To_date('1995-01-14', 'YYYY-MM-DD'), 
                  Trunc(Months_between(SYSDATE,
                  To_date('1995-01-14', 'YYYY-MM-DD')) /12) * 12 +
                Trunc(MOD(Months_between(SYSDATE,
                To_date('19-09-1995', 'dd-mm-yyyy')), 12)))) day
 FROM dual;
