--update
--OR REPLACE�� �������� �����ϰ� ��Ÿ���� �� �ٽ� ����ų�
--GUI���� ��������� �Ѵ�, 
CREATE PROCEDURE UPDATE_PERSON
(
MYNUM IN INT,
CHANGENAME VARCHAR2
)
IS TEMPVAR VARCHAR2(20) :='�л�';
BEGIN TEMPVAR:=CHANGENAME || TEMPVAR; 
UPDATE SIMPLE_TEST_TABLE SET NAME=TEMPVAR WHERE
NUM=MYNUM;
END UPDATE_PERSON;

--in int �Ű�����  --������ in�� �ٿ��ִ°� �¾�.
--:= ���� int a=b;   -> ����Ŭ���� int a:=b;
-- || �ڿ� ���̱�      -> a||b a�� �ڿ� b�� ����.

/
select * from simple_test_table;
--1���� �̿��񿡼� ��ȣ�� �л����� ������Ʈ��.
exec update_person(1,'��ȣ��');
--|| ��ȣ�� ���� �̾���̱�. ����Ŭ���� �̰� �ٸ����� �̾���̴� �뵵�� ����, MYSQL���� ���� �������.

--select procedure �� cursor��� �� ��ȯ����.
--cursor��� �� ���ؼ� ����� ���
--cursor ��? sql ����� �����ϴ� �޸��� ��ġ�� ����Ű�� ������

create or replace procedure person_select(
myname in varchar2,
o_cursor out sys_refcursor)
is begin open o_cursor
for 
select num, name, phone_number from simple_test_table 
where name=myname;
exception when others then
dbms_output.put_line('sql error:' ||sqlerrm);
end person_select;

--���ν����� ���� select �ϱ⿡�� ������� ����. 
--����� ������ Ȯ�� �� �߰�
/
select * from simple_test_table;
exec add_person(5,'�̵���','010-5517-1234');
exec add_person(6,'�̵���','010-2517-1234');
exec add_person(7,'�̵���','010-3517-1234');

/
--select ���ν��� ȣ��
--����-> ȯ�漳�� ->ǥ��->���鹮��
var o_cursor refcursor 
exec person_select('�̵���', :o_cursor) 
print o_cursor;
--c ����Ҷ�ó�� ���� ��ȯ�ϰų� �ذ� �ƴϰ�, ����Ʈ�� ���ִ� �Ŵ� ������

