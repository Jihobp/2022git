
--1�� ������ ���� �׷ȴ� ���̾�׷��� crud, pk, fk �Ἥ ������ ������ �غ�����. 
--crud : create, read, update, delete
--�߸�����Ŷ�� �����ϰų� ���ص� ��. �⺻������ ������� �л����̺� ���� ������ ��������.
create table TTK(
gunid varchar2(20) primary key,
armor varchar2(20),
helmet varchar2(20)); 


--�ѱ����� ���̺� �����
create table parts (name varchar2(20), code char(3) primary key);
insert into parts values('���Ӹ���', '001'); -- �̰� ���� ������� main table 'ttk'���� �ҷ��� �� �ִ�?
insert into parts values('�ѽž�����', '002');
insert into parts values('źâ', '003');
--������� ���̺� ���ο� �÷��߰��غ���
alter table ttk add(code char(3)); --���̺� ����, �ѱ����� �ڵ� �߰�. 
--�ܷ�Ű �߰�
--parts �� code �÷��� ����(reference)�ؼ� �������.
alter table ttk add constraint fk_parts; --���̺� ttk ����, ���ѵ� fk_stu?????????
alter table add contraint fk_parts foreign key(code) references parts(code); 
--�ٸ� ���̺� �ִ� �� �ڵ� �÷���, �ܷ�Ű�� �ؼ� ����� ���ڴ�. 

insert into TTK values('Ȳ�ݰ���','ġŲ�ҹ��','kar','001');
insert into TTK values('���ױ�','ġŲ�ҹ��','wingman','002');
insert into TTK values('Ȳ�ݰ���','Ȳ�ݶҹ��','r99','003');


