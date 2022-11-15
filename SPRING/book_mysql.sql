CREATE DATABASE yse_spring_mvc;
CREATE USER 'yse_spring_mvc_user'@'%' IDENTIFIED BY '1234';
GRANT EXECUTE,SELECT, SHOW VIEW, ALTER, ALTER ROUTINE, CREATE, CREATE ROUTINE, 
CREATE TEMPORARY TABLES, CREATE VIEW, 
DELETE, DROP, EVENT, INDEX, INSERT, 
REFERENCES, TRIGGER, UPDATE, 
LOCK TABLES ON 'yse_spring_mvc'.* TO 'yse_spring_mvc_user'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;  

CREATE TABLE `book` (
 `book_id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
 `title` VARCHAR(200) NOT NULL,
 `category` VARCHAR(200) NOT NULL DEFAULT '',
 `price` INT NULL,
 `insert_date` DATETIME NOT NULL DEFAULT NOW(),
 PRIMARY KEY (`book_id`)
)
COLLATE='utf8mb4_gebookbookbookneral_ci'
;

select * from book;
SELECT * FROM yse_spring_mvc.book;

select title, category, price, insert_date from book where book_id=1;

