CREATE DATABASE MP;
CREATE TABLE MP_BOARD(
    BNO int auto_increment NOT NULL PRIMARY KEY,
    TITLE VARCHAR(100)     NOT NULL,
    CONTENT VARCHAR(2000)  NOT NULL,
    WRITER VARCHAR(100)    NOT NULL,
    REGDATE datetime not null default now()
);

#ALTER TABLE [mp_board] AUTO_INCREMENT = [1]; -- AUTO_INCREMENT 초기화 : ALTER TABLE [TABLE명] AUTO_INCREMENT = [시작할 값];
INSERT INTO MP_BOARD( TITLE, CONTENT, WRITER)     VALUES ( '제목입니다', '내용입니다', 'MELONPEACH');

select * from mp_board;

call create_sequence('MP_BOARD');

insert into mp_board (BNO) values
('1'),
('2'),
('3');

drop table mp_board;