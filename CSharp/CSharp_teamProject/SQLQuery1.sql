create database HHDB
use HHDB

--사용자
create table user_table(
user_num int not null primary key, 
user_id varchar(50) not null, 
user_passWord varchar(50) not null, 
user_name varchar(50) not null, 
user_phoneNum varchar(50) not null, 
user_email varchar(50), 
user_createTime datetime
)
GO

--관리자
create table admin_table(
admin_num int not null primary key, 
admin_id varchar(50) not null, 
admin_passWord varchar(50) not null, 
admin_name varchar(50) not null, 
admin_phoneNum varchar(50) not null, 
admin_email varchar(50), 
admin_createTime datetime not null
)
GO

--숙소
create table hotel_table(
hotel_num int not null primary key, 
hotel_name varchar(50) not null, 
hotel_phoneNum varchar(50), 
hotel_address varchar(50), 
hotel_zipCode varchar(50),
hotel_coordinateX varchar(50), 
hotel_coordinateY varchar(50), 
hotel_roomCount int, 
hotel_createTime datetime not null
)
GO

--버스
create table bus_table(
bus_num int not null primary key, 
bus_name varchar(50) not null
)
GO

--날씨