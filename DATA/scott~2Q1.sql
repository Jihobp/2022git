
--1번 본인이 직접 그렸던 다이어그램을 crud, pk, fk 써서 실제로 구현을 해보세요. 
--crud : create, read, update, delete
--잘못만든거라면 수정하거나 안해도 됨. 기본적으로 만들었던 학생테이블 등을 실제로 만들어보세요.
create table TTK(
gunid varchar2(20) primary key,
armor varchar2(20),
helmet varchar2(20)); 


--총기파츠 테이블 만들기
create table parts (name varchar2(20), code char(3) primary key);
insert into parts values('개머리판', '001'); -- 이걸 먼저 해줘야지 main table 'ttk'에서 불러올 수 있다?
insert into parts values('총신안정기', '002');
insert into parts values('탄창', '003');
--무기장비 테이블에 새로운 컬럼추가해보기
alter table ttk add(code char(3)); --테이블 수정, 총기파츠 코드 추가. 
--외래키 추가
--parts 의 code 컬럼을 참고(reference)해서 만들었다.
alter table ttk add constraint fk_parts; --테이블 ttk 변경, 제한된 fk_stu?????????
alter table add contraint fk_parts foreign key(code) references parts(code); 
--다른 테이블에 있는 이 코드 컬럼을, 외래키로 해서 참고로 쓰겠다. 

insert into TTK values('황금갑바','치킨뚝배기','kar','001');
insert into TTK values('난닝구','치킨뚝배기','wingman','002');
insert into TTK values('황금갑바','황금뚝배기','r99','003');


