select * from user_info_with_gender;

select * from table(fn_get_user_param_gen('����'));
select * from table(fn_get_user_param_gen('����'));
select * from table(fn_get_user_param_gen('unknown'));


select * from table(fn_get_user_param_gen_num(1));
select * from table(fn_get_user_param_gen_num(2));
select * from table(fn_get_user_param_gen_num(3));

select * from  user_info where user_gender_num=1;


--result

select * from table(fn_get_human('�ӱ�'));

select get_gender_type(3) from dual;

select * from gender;

select * from user_info_with_gender;

select * from table(fn_get_user_param_gen('����'));

select user_nickname, user_name, user_id, get_gender_type(user_gender_num),  user_gender_num from table(fn_get_user_param_gen_num(1));