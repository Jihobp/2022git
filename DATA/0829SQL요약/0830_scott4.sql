--fx �Լ� ������
--set serveroutput on; --dbms output(�ַܼα�)������ ���ϴ� ��
--�� ���� �ּ�ó���ϰų� �̰� 1�ٸ� �ٸ� ���Ͽ��� �ϱ�... ���ϴ���? ���פƤ��ٴ�~~~~~~~

--���� ������ �Լ�
--djleee ��� �ؽ�Ʈ ��ȯ�ϴ� �Լ�

create or replace function mytest_func return varchar is
v_test varchar2(100);
begin v_test:='�̵���';
return v_test;
end;
--������ ����ְ� �̵����� �־v_test ��ȯ

/
select mytest_func() from dual; --dual �ӽ����̺�, �Լ� ����׽�Ʈ�� ����.

select * from simple_test_table where name=mytest_func();


--��ȣ�� ���ؼ� �̸����� ��ȯ�س��� �Լ�

create or replace function func_getperson(v_num int)
return varchar is v_name varchar(100);
begin select name into v_name from simple_test_table where num=v_num;
return v_name;
exception when others then 
DBMS_OUTPUT.PUT_LINE('exception occurred! ('||sqlcode||'):'||sqlerrm);
return '';
end;
/
--set serveroutput on; DBMS_OUTPUT ������ ����� �� ����...

/*
--��ƮŸ�� �Ķ���Ͱ� �ִ�. ���ڰ� ���Ű�,
���ϰ��� ����Ÿ���ε� ���̳��� �������� �����ҰŴ�.
���ܰ� �߻��ϸ� �����޼��� ���� 
������ �����ҰŴ�.
beging���� �����ϸ� ������ �����ؼ� ���̳ۿ� ���� �ִ´�, �����׽�Ʈ ���̺���, ���� ��-���̳��϶�. 

--����Ÿ���� ������ ���̳����� ��ȯ. 
--�����׽�Ʈ�� �ִ°� ����ְ�, 
--exception�� �߻�������, 
--���� �޼����� ����, --���� �޼��������� setserver on�� �϶�� �ѰŴ�.

--set serveroutput on; DBMS_OUTPUT ������ ����� �Ѱ���.*/


---
select func_getperson(1) from dual; --1�� �л��� �̸� ��ȸ
select mytest_func() from dual;--�̵��� �̸� ��ȯ

--���ν��� �ȿ� ��ȯ�� �ִ� �Լ��� �Ű������� ���� �� �ִ�.
exec add_person(50, func_getperson(1), '010-9999-9191');
exec add_person(100, mytest_func(), '010-2299-9191');

select * from simple_test_table;
