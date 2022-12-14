
create database HHDB
use HHDB

--사용자
create table USER_Table(
user_num int IDENTITY not null primary key, 
user_id varchar(50) unique not null, 
user_passWord varchar(50) not null, 
user_name varchar(50) not null,
user_phoneNum varchar(50) not null,
user_email varchar(50), 
user_createTime datetime
)
GO

--호텔
create table HOTEL_Table(
hotel_num int IDENTITY not null primary key, 
hotel_name varchar(500) not null, 
hotel_tell varchar(50) not null, 
hotel_post varchar(30),
hotel_addr varchar(500) not null,
hotel_roomNum int, 
hotel_lat float,
hotel_lng float
)
GO

--예약
create table BOOK_Table(
book_num int IDENTITY not null primary key, 
book_id varchar(50) not null, 
book_name varchar(50) not null, 
book_hotelName varchar(200) not null,
book_hotelRoomNum int,
book_createTime datetime
)
GO

--HotelList.csv DB에 입력
BULK INSERT HOTEL_Table 
FROM 'E:\2022git\CSharp\CSharp_teamProject_1208\CSharp_teamProject\bin\Debug\HotelList.csv'
WITH
(
   FIRSTROW = 2,
   FIELDTERMINATOR = ',',
   ROWTERMINATOR = '\n',
   TABLOCK,
   BATCHSIZE=100000
)
