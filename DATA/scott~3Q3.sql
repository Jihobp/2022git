-- drop table table1; ���ʿ� ���� �����ϴ°�.
-- /**/ �ּ�

--�ǽ����� 0818- 2,3������ .
--ctrl ���� ������ ����� �� ���� �������� �Ф�
-- ������ --�� ���ΰ�ħ !!!!!!! --for���� ���������� �Ȱ���. 1���� 9999 max���� ����ϰ� ����.
-- ���������� �����ؾ� �ϴ� ���� ���� �� ���� ��
-- ����Ŭ ������ ������ ���ΰ�... �Ф�
create sequence myrow;
create sequence myseq;

--samsung ���� ���� Ǭ��
--������ �̸��� ������ �̸��� ���� ����� ��. �̸�, ������ id, ������ id��  ����Ǵ°�.
create table samsungpeople
(boss varchar2(100) primary key, name varchar2(100), id number,
foreign key(id) references song(id) );  

insert into samsungpeople values (myrow.nextval, '�̰���', 1);

----------------------------------------------------------


--1���� 1�� ����, 100�Ǹ� �ٽ� 1�� ���ƿ�.
create sequence myseqtest start with 1 increment by 1 maxvalue 100
cycle NOCACHE;


--���������� �����ϴ� ����
--drop table song;
create table song
( i_d number primary key, title varchar2(100), price number); --����� �տ� ����
--drop table singer;
create table singer 
(id number primary key, name varchar2(100), hit_song_id number,
foreign key(hit_song_id) references song(i_d));


insert into song values (myrow.nextval, 'dragon night', 10000);
insert into song values (myrow.nextval, '��ȣ��', 9000);
insert into song values (myrow.nextval, 'let it be', 8000);
insert into song values (myrow.nextval, 'bad guy', 7000);
insert into song values (myrow.nextval, '��ȫ�Ź�', 5000);
--123456�� ������ ������ �� �ʿ䰡 ����.


select * from song;

--hit song�� ���߿� �߰��Ϸ��� �̷��� ���� �˰� �ִ� ���� --�̹� �����ϴ� �뷡�� ���°�. 
-- �÷�(=��)�� ���´�.
insert into singer(id,name) values(myseq.nextval, '�̹���');
insert into singer(id,name) values(myseq.nextval, '��ī�̳���͸�');
insert into singer(id,name) values(myseq.nextval, '����');

select * from singer;

update singer set hit_song_id=2 where id =1;
update singer set hit_song_id=1 where id =2;

insert into singer values(myseq.nextval,'��Ʋ��',3); --�Ѳ����� ����

select * from singer;

--join ������ ???????????????????????????????????????????????????????????????????????????????????????????
select name, title from song join singer on song.i_d=singer.hit_song_id;

select name, title from song right join singer on song.i_d=singer.hit_song_id; --�����ʿ� �ִ� �͸� ���δ�. --������ ���� ������
select name, title from song left join singer on song.i_d=singer.hit_song_id; --����Ʈ �ִ� �͸� ���δ�. --���� ���� ������.


select myrow.nextval from dual;
--�����ؼ� ù���� ������ش�. ��ũ��Ʈ ���� f5 ����. ctrl+enter �ؼ� ������ �������ش�.