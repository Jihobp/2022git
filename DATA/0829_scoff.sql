--DROP TABLE food;
--//Code sql = query = select 庚 =霜税庚
--//structed query language 姥繕 霜税 嬢.
--壕錘杏稽 覗稽詮闘 遭楳亜管, 乞牽檎 茜 姥 越. 
		--//sql庚薦 > sql 壱究繊庚薦, 尻柔 紫戚闘 しさし??????????????? 馬奄夙..args..>>因政虹希 炎買崎. 
create table food --砺戚鷺 持失
(
    num int primary key,
    name varchar2(50),
    price int,
    foodcode number, -- food_category櫛 展脊戚 業旭焼醤 敗.
    foreign key(foodcode) REFERENCES food_category(code)
);

--益軍拭亀 災姥馬壱 food 及拭 鎮軍誤 旋澗 戚政??
--1. 誤獣旋生稽 鎮軍級聖 左食爽奄 是背辞
--2. 鎧亜 据馬澗 授辞企稽 汽戚斗 隔奄 是背辞
insert into food(price, name, num) values(10000,'伐薦舛縦',5);
--3. 鎧亜 据馬澗 汽戚斗幻 隔奄 是背辞.
insert into food(num,name,price) values(1,'災壱奄',7000);
insert into food(num,name,price) values(2,'災壱奄',6000);
SELECT*FROM FOOD;
--select all from 
/*select * from 績獣砺戚鷺;
insert into 績獣砺戚鷺 values('酵走硲',1);
叔薦鎮軍(=伸)誤精 name 戚希虞亀, 益 戚硯聖 廃越 戚硯生稽 '妊獣'亜 喫
name 採歳聖 五敢虞澗 鎮軍(=伸)生稽 妊獣敗.
*/
--insert update delete

--NAME, PRICE幻 嗣焼鎧壱 粛陥--
    SELECT NAME, price from food;
    
--五敢幻 左食 爽壱 粛陥檎?
select name from food;

--6000据企稽 股聖 呪 赤澗 製縦幻 繕噺背左切.
--price 亜 6000 戚雌 7000 耕幻昔 葵幻 蟹紳陥.
select * from food where price >=6000 and price <7000;

--沿帖薦整聖 沿帖+薦整生稽 痕井
--戚硯聖 搭背辞 繕噺背亀 鞠走幻
--益係惟 鞠檎 乞窮 沿帖薦整戚 沿帖+薦整生稽 郊会
--益掘辞 戚係惟 

--亜舌 置悦拭 叔楳廃 sql庚 鉢蟹幻 害澗陥
update food set name='沿帖+薦整' where num=3;
--穣汽戚闘庚税 亜舌 笛 爽税紫牌!!!!!
--魁拭  where 箭聖 照 旋惟 鞠檎
--乞窮 汽戚斗亜 陥 析胤旋生稽 痕井戚 吉陥.
--幻鉦 食奄辞 where庚 蒸生檎 乞窮 製縦五敢亜(name))葵
--沿帖+薦整戚 鞠嬢獄鍵陥 しさしさしさしさしさしさしさししさしししさしさしさしさししさししさしさししさしさしさしさしさしし
--衣引 溌昔
--update insert delete澗 衣引 照左食捜. table 歯稽壱徴, 汽戚斗 級嬢亜暗蟹, select *from table; 団醤廃陥/
--奄沙徹研 訊\床劃檎, 鎧亜 据馬澗 汽戚斗研 郊蝦凶 汽戚斗亜 馬蟹鉱拭 蒸陥澗 左舌戚 鞠嬢赤嬢醤廃陥ち.政析廃 only one deta~~!!!
select*from food;

--insert 拝 凶 乞窮 鎮軍税 授辞研 硝壱 赤陥檎
--持繰馬壱  values採斗 旋聖 呪 赤陥.
--戚 砺戚鷺精 収切, 庚切伸, 収切税 授辞昔汽, 
--授辞研 硝壱 赤陥檎 food 及拭 鎮軍誤 持繰 亜管.
--益軍拭亀 災姥馬壱 鎮軍誤 旋澗 戚政?

insert into food(price,name,num) values(2000,'巷持辰',4);
--益軍拭亀 災姥馬壱 food 及拭 鎮軍誤 旋澗 戚政??
--1. 誤獣旋生稽 鎮軍級聖 左食爽奄 是背辞
--2. 鎧亜 据馬澗 授辞企稽 汽戚斗 隔奄 是背辞
insert into food(price, name, num) values(10000,'伐薦舛縦',5);
--3. 鎧亜 据馬澗 汽戚斗幻 隔奄 是背辞.
insert into food(num,name) values(6,'沓棋五敢');
select*from food;
--git税 commit坦軍 鎧亜 拙失廃 insert, update, delete庚聖 煽舌馬澗 依.
--commit背爽走 省壱 戚 覗稽益轡聖 襖獄軒檎 鎧亜 拙失廃
--insert update delete亜 旋遂戚 照喫/. 聡 煽舌 照馬壱 廻暗櫛 旭製
commit;

--1. food 砺戚鷺拭 製縦 10鯵幻 蓄亜背左奄
--鎮軍戚櫛 戚訓依級 陥 益企稽 増嬢隔奄
--1. 汽戚斗幻 増嬢隔奄, 2.鎧亜 舛廃 授辞企稽 隔奄, 3.鎧亜 増嬢隔壱 粛精 汽戚斗幻 隔奄.
insert into food(num,name,price) values(7,'杷切',9900);
insert into food(num,name,price) values(8,'紬虞',1000);
insert into food(num,name,price) values(9,'沿帖杷切',10000);
insert into food(num,name,price) values(10,'沿帖紬虞',100000);
insert into food(num,name,price) values(11,'沿帖帖轍',12000);
insert into food(num,name,price) values(12,'沿帖人昔',1000000);
insert into food(num,name,price) values(13,'督什展',8200);
insert into food(num,name,price) values(14,'沿帖引切',990);
insert into food(num,name,price) values(15,'軒繕暁',13500);
insert into food(num,name,price) values(16,'匙拭醤',14900);
insert into food(num,name,price) values(17,'沿帖似球是帖',4900);
insert into food(num,name,price) values(18,'肯苧段坪気剛',10000000000);
insert into food values(19,'馬人戚照杷切是税 督昔蕉巴',null);   --null 隔奄
insert into food values(20,'沿帖杷切是税 督昔蕉巴',null);     --鎧亜 増嬢隔壱 粛精 汽戚斗幻 隔奄
insert into food(name,num) values('沿帖督昔蕉巴採徴鯵',21);--鎧亜 据馬澗 授辞, 据馬澗 葵
select * from food;

--幻鉦 num税 授辞企稽 馬壱 粛陥檎?
select *from food order by num; --魁拭 asc澗 持繰亜管
select *from food order by num asc; --戚 砧鯵澗 業旭精 坪球. 
--asc : 神硯託授 舛慶, 持繰亜管
--desc:鎧顕託授, 鎧顕託授馬壱 粛生檎 持繰 馬檎 照 喫



--搾術 授辞企稽 舛慶馬壱 粛陥檎?
--desc澗 鎧顕託授聖 税耕廃陥.
select *from food order by price desc;  --鎧顕 託授

--null 葵戚 焼観 依幻 繕噺馬壱 粛陥檎?
select *from food where price is not null;      --where精 update, delete拭 床戚壱, orderby澗 舛慶拭 床昔陥./

--null 葵戚 焼観 依幻 繕噺馬壱 粛陥檎 + 亜維 搾術 授?
select * from food where price is not null order by price desc;
update food set price=1000 where price is null;

--2. 五敢誤拭 沿帖虞澗 依戚 級嬢亜澗 依幻 繕噺背左奄
SELECT * from food where name like '%沿帖%';
select * from food where name like '%杷切%';
--like 姥庚 庚切伸拭辞 床績
--%奄硲税 倶精 0越切 戚雌
--聡 '沿帖'屍 焼艦虞 '肯闘段坪 沿帖' 焼艦檎 '沿帖卓鯵'去
--沿帖虞澗 舘嬢 蒋及拭 更亜 神窮走 娃拭 沿帖亜 匂敗鞠檎
--陥 繕噺廃陥.


--3. 亜維戚 5000~7000据 紫戚昔 依幻 繕噺馬奄
select * from food where price >=5000 and price <=7000;
select * from food where price >=3000 and price <=10000;

--4. 亜維戚 null葵昔 闇 1000据生稽 繕舛
update food set price=1000 where price is null;

--5. num葵戚 1腰昔 五敢税 戚硯聖 '言赤澗 災壱奄' 虞壱 郊荷奄*/
update food set name='言赤澗 災壱奄' where num=1;
update food set name='言赤澗 肯闘段坪馬人戚照杷切' where num=2;
--陥 熱壱 蟹辞 commit

commit;
select *from food;
show autocommit;

--commit : 煽舌
--汽戚斗 蓄亜 呪舛 肢薦馬奄 穿拭 commit 馬壱
--幻鉦拭 蓄亜 呪舛 肢薦研 設公?陥檎 rollback
--舘 爽税紫牌, 
--1. rollback( =鞠宜軒奄)精 鎧亜 置悦拭  commit廃 走繊生稽幻 宜焼姶
--2. autocommit 奄管戚 佃閃赤陥檎, rollback戚 照股製.
--because, isert update delete 研 敗引 疑重拭 commit戚 吉陥.
commit;
update food set name='肯段朝傾';        --乞窮 製縦誤聖 肯段朝傾稽 郊嘩-
--乞窮 製縦聖 肯段朝傾稽 郊荷壱 commit 背獄軒檎..... 宜戚迭 呪 蒸陥.

select * from food;         
rollback; --原走厳生稽 commit廃 走繊生稽 宜顕.

--insert update select研 梅生糠稽, delete稽 背左切.
-- D E L E T E 
--update 庚引 原濁亜走稽 where 箭 照旋生檎 乞窮 鎧遂戚 陥 劾焼姶.
--delete from food where price >=50000;

--drop, truncate 虞澗 姥庚亀 赤陥.
--drop 精 砺戚鷺 切端研 熟 走趨獄軒壱, rooback(=差姥)亜 照喫.
--truncate澗 汽戚斗幻 熟 走酔壱, 砺戚鷺精 害焼 赤澗汽 (切牽陥)
--肢薦廃 汽戚斗拭 企背辞 rollback戚 照喫.
--陥楳備 delete澗 rollback戚 喫.
--truncate 亀 庚薦走幻 drop精 働備 !!!!!!!!!!!!!! 爽税背辞 潤醤敗. 砺戚鷺 切端研 熟 走趨獄軒壱 差姥亀 照鞠辞た.
--庚薦亜 朕!!!!!!!!!!!!!!!霜呪 !!赤陥!

--table税 鎮軍聖 蓄亜拝 呪 赤陥.
alter table food add recipe varchar2(1000);
--鎮軍税 紗失亀 痕井戚 亜管馬陥.
alter table food modify price not null;

select * from food;

--1. 製縦 戚硯戚 肯闘亜 級嬢娃 依 肢薦 ~亜 級嬢娃依 where name like '%%";
--delete from food where name like--'%肯闘%';
--2. 製縦 戚硯拭 馬人戚照戚 級嬢娃 依 肢薦
--delete from food where name like --'%馬人戚照%';
--3. 亜維戚 10000据 角澗 依 肢薦
--delete from food where price -->10000;
--4. 製縦亜維戚 5000据 戚馬昔 依税 傾獣杷研 'msg蓄亜' 戚虞壱 痕井
update food set recipe ='msg蓄亜' where price<=5000;
--5. 亜維戚 煽慧廃 授辞稽 舛慶背辞 左食爽奄
--瓜戚 誤獣旋生稽 旋壱 粛陥檎 魁拭 asc研 細戚檎 喫.
select *from food order by price asc; --asc vs desc 

-------------------------------------------------

select * from food;
select *from food_category;

select code 歳嫌坪球, name 歳嫌誤 from food_category;

--須掘徹 坪球澗 神展号走 ,
--須掘徹澗 砧鯵税 砺戚鷺拭辞 薦析 五昔昔 坪球 しさし

create table food_Truck
(
    num int primary key,
    name varchar2(100) not null,
    price int,
    foodcode number, -- food_category櫛 展脊戚 業旭焼醤 敗.
    foreign key(foodcode) REFERENCES food_category(code)
);

--sequence(獣碇什)
--神虞適拭 赤澗闇汽, mssql 拭 赤澗 依
--mysql拭澗 蒸嬢辞 搾汁廃 杏 魚稽 幻級嬢 操醤 敗.
create SEQUENCE food_rownum;
--獣碇什澗 析曽税 痕呪
--for 庚税 i 坦軍 葵戚 授託旋生稽 潅嬢蟹澗 依
--鎧亜 呪疑旋生稽 葵聖 隔走 省焼亀 切疑生稽 葵戚 装亜敗.
--nextval : ++i戚櫛 旭製. 聡 装亜吉 葵聖 増嬢 隔嬢 捜. ->>益 授辞亜 焼艦嬢亀 装亜吉 授辞稽 益撹 蓄亜背爽澗 暗陥 しさし
insert into food_truck values(food_rownum.nextval, '肯闘気剛',5000,5);
select * from food_truck;
--num 1 精 嬢巨穐劃檎 ばば
--insert into 拝 ?? 神嫌亜 蟹檎辞 num 葵戚 級嬢亜形陥亜 公級嬢亜壱 じ益撹 装亜喫.
create sequence dj;
insert into food_truck values(dj.nextval, '京奄朝傾', 4000,5);  
--insert into food_truck values(food_rownum.nextval, '神兄走卓鯵', 3000, 50);
--い>> 巷衣舛 薦鉦 繕闇 拭 是壕桔艦陥?!!!!!! // 朝砺壱軒拭辞 焼森 込嬢貝 葵 food code 50/
insert into food_truck values(food_rownum.nextval,'展戚嬢',30000,7);
insert into food_truck values(food_rownum.nextval,'遭促什呑走追戚滴',300,7);
select *from food_truck;

--jjion 砧砺戚鷺拭辞 因搭鞠澗 徹 葵聖 亜閃人辞
--益 葵戚 違帖澗 杏 左食層陥.
select food_truck.name 製縦誤, price, food_category.name 歳嫌 
from food_truck join food_category on food_truck.foodcode=food_category.code;

-- Q 3
-- 1. 唖 朝砺壱軒紺稽 製縦 3鯵梢 蓄亜馬室推.
insert into food (num,name,price) values(22,'馬人戚照杷切是税 肯闘段坪督昔蕉巴',9999999999);
insert into Food_Truck values(food_rownum.nextval, '肯段杷切帖綜',50000,7);
insert into food_truck values(food_rownum.nextval, '肯段獄斗滴稽巴',3000,7);
insert into food_truck values(food_rownum.nextval, '肯段獄斗滴欠人雌',2500,7);
insert into food_truck values(food_rownum.nextval, '肯段獄斗怯査戚',3900,7);
insert into food_truck values(food_rownum.nextval, '肯段獄斗焼戚什滴顕',1500,7);
select * from food_truck;
-- 2. 巨煽闘虞澗 歳嫌 蓄亜馬室推. (坪球8)
insert into food_category values(8,'巨煽闘');

-- 3. 巨煽闘 5鯵 蓄亜馬室推.
insert into food_truck values (food_rownum.nextval,'京奄虞脅', 6000, 8);
insert into food_truck values (food_rownum.nextval, '肯闘段坪虞脅', 5900, 8);
insert into food_truck values (food_rownum.nextval, '肯闘段坪覗虞祢帖葛', 5900, 8);

-- 4. jion 戚遂背辞 製縦誤, 亜維, 歳嫌 妊獣背左室推. --food_truck.name 巨煽闘誤, food_truck.price 亜維, food_category.name 歳嫌
select food_truck.name 巨煽闘誤, price 亜維, food_category.name 歳嫌 
from food_truck join food_category on food_truck.foodcode=food_category.code;
-- 5. 4腰坦軍 馬鞠 亜維授生稽 舛慶背左室推.(搾術授生稽 馬奄) 神
select food_truck.name 巨煽闘誤, price 亜維, food_category.name 歳嫌 
from food_truck join food_category on food_truck.foodcode=food_category.code order by price desc; --神硯 //asc

--join 背竺 
/*select food_truck.name 製縦誤,price, food_category.name 歳嫌
from food_truck join food_category on food_truck.foodcode=food_category.code
order by food_truck.price desc;
*/
-- group by
-- 製縦級聖 foodcode紺稽 広嬢左切.
select * from food_truck;

--穿端 汝液 亜維
select avg(price) from food_truck;
--穿端 置壱 亜維
select max(price) from food_truck;

--歳嫌(=foodcode)紺 汝液 亜維
select foodcode, avg(price) from food_truck group by foodcode;
--歳嫌紺(=foodcode) 置壱亜 製縦 亜維
select foodcode, max(price) from food_truck group by foodcode;

--爽税紫牌
--益撹 group by幻 床檎
-- 蟹袴走 葵級精 陥 息形獄顕(mysql)
-- oracle精 焼森 照 喫
--select foodcode, name from food_truck GROUP by foodcode;

-- having
-- group by廃 陥製拭 繕闇庚 床澗 依
-- group by 及税 where箭昔 依
select foodcode, max(price) from food_truck group by foodcode 
having max(price)>10000; --max葵戚 幻据戚 角澗 依幻 左食爽澗 依

select foodcode, max(price) from food_truck group by foodcode 
having max(price)<10000; --max葵戚 幻据戚 耕幻昔 依幻 左食捜


-- 掻淡 霜税
-- 置壱亜税 製縦聖 達壱 粛陥檎?
-- price葵戚 max(price)櫛 疑析廃 依税 汽戚斗研 窒径
select * from food_truck where price=(select max(price) from food_truck);
-- 汀軒庚 照拭 暁 陥献 汀軒庚戚 級嬢娃 依



-- view
-- view : 亜雌 砺戚鷺
-- select庚生稽 幻級嬢遭 亜雌税 砺戚鷺
-- create table 庚生稽 幻級嬢遭 舛縦 砺戚鷺戚 焼艦壱
-- 奄糎砺戚鷺級聖 戚遂背辞 切戟繕噺馬壱, 益 繕噺吉 切戟亜走壱 幻級嬢遭 亜雌税 砺戚鷺
-- sql plus 伸嬢辞 c## view 蓄亜

-- food_truck税 置壱亜幻 煽舌馬澗 砺戚鷺聖 幻糾
create view find_max_price as select max(price) max_price from food_truck;
select * from find_max_price;

-- view研 設 戚遂馬檎 掻淡 霜税亜 希 娃繰背匝 呪 赤陥.
select * from food_truck where price=(select * from find_max_price);

--穿端 置壱 亜維
select max(price) from food_truck;

------OSR------
--<<<<<<<<<<<<< 1. 製縦 歳嫌紺 汝液 妊獣馬鞠, 歳嫌誤亀 旭戚 窒径鞠惟 馬奄 >>>>>>>>>>>>>>>>>>
select avg(price) 汝液, food_category.name, food_truck.foodcode 
from food_truck join food_category 
on food_truck.foodcode = food_category.code
group by food_category.name, food_truck.foodcode;  
--汝液聖 food_catyegory.name引 food_truck.foodcode研 握壱人辞
--food truck 引 food category 研 繕昔馬壱 food truck
--group聖 food_cateygory.name引 food_truck.foodcode 研 広嬢辞 幻窮陥,.


--歳嫌紺(=foodcode) food 置壱亜 製縦 亜維
select foodcode, max(price) from food_truck group by foodcode;

--1-2. 汝液 葵戚 搾術 授生稽 舛慶
select avg(price) 汝液, food_category.name, food_truck.foodcode 
from food_truck join food_category 
on food_truck.foodcode = food_category.code
group by food_category.name, food_truck.foodcode order by avg(price) desc;

--1-3. 汝液 葵戚 煽慧廃 授生稽 舛慶
select avg(price) 汝液, food_category.name, food_truck.foodcode 
from food_truck join food_category 
on food_truck.foodcode = food_category.code
group by food_category.name, food_truck.foodcode order by avg(price) asc;

select * from food_truck;

----join猿走 拝舛亀澗 馬澗惟 疏陥
--2. 歳嫌紺稽 亜舌 搾術 製縦級 妊獣馬奄
--select foodcode, max(price) from food group by foodcode having max(price);
-- price葵戚 max(price)櫛 疑析廃 依税 汽戚斗研 窒径
create view max_price as select max(price) max_price, food_category.name from food_truck 
join food_category on food_truck.foodcode = food_category.code 
group by food_category.name;

select * from max_price;

create view food_price_category as select food_truck.name food_truck_name, price, food_category.name food_category_name
from food_truck
join food_category on food_truck.foodcode = food_category.code;

select * from food_price_category;

select food_truck_name, price, max_price.name from food_price_category
join max_price on food_price_category.price = max_price.max_price and 
food_price_category.food_category_name = max_price.name;



--3. 歳嫌紺稽 亜舌 煽慧廃 製縦級 妊獣馬奄
--price 葵戚 min(price)櫛 疑析廃 依税 汽戚斗研 窒径
create view min_price as select min(price) min_price, food_category.name from food_truck 
join food_category on food_truck.foodcode = food_category.code 
group by food_category.name;

select * from min_price;

select food_truck_name, price, min_price.name from food_price_category
join min_price on food_price_category.price = min_price.min_price and 
food_price_category.food_category_name = min_price.name;



--4. 汝液旋生稽 瑳 凶 製縦戚 亜舌 煽慧廃 畷昔 製縦歳嫌澗?
create view avg_price_code as select avg(price) avg, foodcode from food_truck group by foodcode;
select * from avg_price_code;
select min(avg) min from avg_price_code;
create view min_code as select foodcode from avg_price_code where avg = (select min(avg) from avg_price_code);
select food_category.name from food_category where code = (select * from min_code);


--5. 汝液旋生稽 瑳 凶 製縦戚 亜舌 搾術 畷昔 製縦歳嫌澗? 
select max(avg) max from avg_price_code;
create view max_code as select foodcode from avg_price_code where avg = (select max(avg) from avg_price_code);
select * from max_code;
select food_category.name from food_category where code = (select * from max_code);

--nullable > false 澗 ??葵x true澗 ??o

--view : join聖 捉惟,
/*
join : (嘘増杯) 辞稽陥献 砺戚鷺聖 馬蟹税 砺戚鷺稽 杯帖澗暗.
掻淡霜税 : select 庚 照拭辞 select 庚戚 暁 蟹神澗 暗....   
crud - > create read=select update delete..
sequence(獣碇什) 神虞適, mssql 拭 赤澗依. my sql殖 蒸陥.
獣碇什澗 析曽税 痕呪.
for 庚税 i 坦軍 葵戚 授託旋生稽 潅嬢蟹壱, 鎧亜 呪疑旋生稽 葵聖 隔走 省焼亀 切疑生稽 逢 装亜. 
nextval聖 ざぱ檎 益 授辞亜 焼艦嬢亀 装亜吉 授辞稽 蓄亜背爽牛戚 装亜 葵聖 隔嬢捜.
--animal_id 授生稽 繕噺馬澗 sql 庚 拙失.
--SELECT * from animal_ins order by animal_id;
--疑弘 左硲社拭 級嬢紳 乞窮 疑弘税 戚硯引 左硲獣拙析 繕噺, animla_id 蝕授
--SELECT name, datetime from animal_ins order by animal_id desc;
--疑弘 左硲社拭 級嬢紳 疑弘 掻 焼蚤 疑弘1税 焼戚巨人 戚硯聖 繕噺馬澗 SQL 庚聖 拙失背爽室推. 戚凶 衣引澗 焼戚巨 授生稽 繕噺背爽室推.
--SELECT animal_id, name from animal_ins where intake_condition like '%sick%' order by animal_id;
--疑弘 左硲社拭 級嬢紳 疑弘 掻 線精 疑弘1税 焼戚巨人 戚硯聖 繕噺馬澗-->!='aged'仙須,  SQL 庚聖 拙失背爽室推. 戚凶 衣引澗 焼戚巨 授生稽 繕噺背爽室推.
--SELECT animal_id, name from animal_ins where intake_condition !='aged' order by animal_id; 

SELECT animal_id, name, datetime from animal_ins order by name, datetime desc;
-- 舘, 戚硯戚 旭精 疑弘戚檎 !!!! 左硲研 蟹掻拭 獣拙廃 疑弘聖 胡煽 左食操醤 廃陥????? 
-- 掻淡霜税? select 照税 select !! datetime ? 戚 蟹掻昔 井酔!! 
-- SELECT name from animal_ins where datetime=(select min(datetime) from animal_ins);
-- SELECT animal_id, name, datetime from animal_ins where 'name=name' order by datetime desc; zzzせせせせせせせせせせせせせせせせ

-- 掻淡霜税? select 照税 select !! 亜舌 胡煽 級嬢紳 疑弘税 戚硯??  datetime 戚 匙献 井酔. 
SELECT name from animal_ins where datetime=(select min(datetime) from animal_ins);*/



select * from food_truck;
select * from food_category;

-- 歳嫌 '坪球紺稽' 汝液聖 妊獣背左奄
select foodcode, avg(price) from food_truck group by foodcode;
-- => 唖 坪球亜 税耕馬澗 郊研 襲惟 政蓄拝 呪 蒸陥.

--<<<<<<<<<<<<<<<1. 製縦 歳嫌紺 汝液 妊獣馬鞠, 歳嫌誤亀 旭戚 窒径鞠惟 馬奄>>>>>>>>>>>>>>>
-- 因搭繊 : 砧 鯵税 砺戚鷺聖 広嬢辞 古暢獣徹澗 依

-- view 蒸戚 祢澗 号狛(=掻淡霜税) select select -->>> view研 slect馬檎 slect 廃 衣引亜 益企稽 蟹紳陥. view研 搭廃 娃繰鉢
select name, avgprice from 
(select foodcode, avg(price) avgprice from food_truck 
group by foodcode) a
join 
food_category 
on a.foodcode=food_category.code; --foodcode櫛 foodcategory.code 亜 旭生檎.

--from () a 虞澗 績獣砺戚鷺聖 幻級嬢辞 =view櫛 搾汁. 
--foodcode研 亜閃神壱 food category研  join馬澗 依. 
--foodcode 櫛 亜維税 汝液聖 識澱馬澗汽, food_truck拭辞採斗 亜閃人辞 groupby foodcode 稽 広澗陥. 
--avg(price)研 avgprice稽 竺舛廃 依. 
--a税 祢球坪球櫛 祢球朝砺壱軒税 坪球櫛 旭生檎 戚硯引 汝液亜維聖 窒径馬澗 依.


--view 戚遂背辞 祢澗 号狛
create view groupby_foodcode_avg as
select foodcode, avg(price) avgprice from food_truck
group by foodcode;


select * from groupby_foodcode_avg;


select name, avgprice from food_category join groupby_foodcode_avg 
on food_category.code=groupby_foodcode_avg.foodcode;

-- 1-2. 汝液葵戚 搾術 授
select name, avgprice from food_category join groupby_foodcode_avg 
on food_category.code=groupby_foodcode_avg.foodcode 
order by avgprice desc;
-- 1-3. 汝液葵戚 煽慧廃 授
select name, avgprice from food_category join groupby_foodcode_avg 
on food_category.code=groupby_foodcode_avg.foodcode 
order by avgprice asc; --asc澗 持繰戚 亜管敗


-- <2. 歳嫌紺稽 亜舌 搾術 製縦級 妊獣馬奄 > 

-- 1. group by 戚遂背辞 唖 坪球紺稽 搾術 製縦聖 妊獣背醤 敗.
--select foodcode, max(price) maxprice from food_truck group by foodcode;
--create view max_food as 
--select foodcode, max(price) maxprice from food_truck group by foodcode; --max food view 持失 しさし 
-- 1. join 聖 戚遂背辞 唖 製縦税 朝砺壱軒誤(=歳嫌誤) 妊獣背醤 敗.
-- distinct : 掻差 薦暗 徹趨球. 
select distinct food_truck.name foodname, price, food_category.name categoryname 
from food_truck join food_category 
on food_truck.foodcode = food_category.code;
--food_category.name categoryname  精 祢球 朝砺壱軒 革績税 戚硯 竺舛. 
--food_category.name (as) categoryname  ~~~~~~ 
--衆妊研 潤辞 紗失聖 旋壱, 益陥製 蟹神澗 戚硯生稽 旋嬢爽澗 依. 
--製縦戚硯戚 旭精 井酔研 薦暗.

--food_category.拭 赤澗 戚硯精 categoryname 戚陥.
-- 1腰引 2腰聖 join ?      益穿拭 --->> view 研 潤辞 1, 2腰聖 匝食醤 廃陥. しさし> 
create view food_category_truck as
select distinct food_truck.name foodname, price, food_category.name categoryname
from food_truck join food_category
on food_truck.foodcode = food_category.code;
--create view ~ as (是拭 赤澗  select 庚 差紫敗 しさし)


--select * from max_food; -- 坪球紺 置壱亜
select * from food_category_truck; -- 唖 製縦紺 朝砺壱軒 妊獣馬澗 依
-->select distinct food_truck.name foodname, price, food_category.name categoryname 
--from food_truck join food_category 
--on food_truck.foodcode = food_category.code; view稽 幻窮暗 益切端--slect研 slect廃暗.

--2. 製縦聖 朝砺壱軒誤紺稽 歳嫌馬惟 鞠醸陥.
--益君糠稽 朝砺壱軒誤紺稽 max 葵聖(view研) 陥獣 group by 廃陥.
select categoryname, max(price) maxprice from food_category_truck 
group by categoryname;

--categoryname生稽 広嬢辞 categoryname戚櫛 置企亜維聖 亜閃紳陥. max(price) as maxprice


--drop view max_food;
--view 幻級 凶 爽税紫牌 : avg蟹 max 去 敗呪税 衣引澗 暁 陥献 戚硯生稽 帖発背醤 敗
create view max_food as
select categoryname, max(price) maxprice from food_category_truck 
group by categoryname;
--as 及採斗 嬢恐杏 view稽 幻級走 硝形爽澗暗.

select * from max_food;


-- 3.  1腰引 2腰聖 join廃陥.
select foodname, price, max_food.categoryname from max_food 
join food_category_truck  --view
on max_food.categoryname=food_category_truck.categoryname and 
max_food.maxprice=food_category_truck.price;
--置企 亜維昔 製縦 歳嫌亜 蟹紳陥. (廃縦 掻縦) 
--max food櫛 category join(聡 view 砧鯵 繕昔廃依)
--益 製縦戚 杭走澗 乞牽走幻, 亜維戚 践 株精暗 蓄窒 亜管 しさし



-- <<<<<<<<<<<<<<<<<<<<<< 3. 歳嫌紺稽 亜舌 煽慧廃 製縦 妊獣 >>>>>>>>>>>>>>>>>>>>> 
--1.製縦誤, 朝砺壱軒誤戚 蟹神澗 砺戚鷺 幻級奄(2腰拭辞 幻糾, food_category
--2. food_category_truck拭 赤澗 製縦聖 group by 背辞 min 葵聖 姥廃陥, 
select categoryname, min(price) minprice from food_category_truck
group by categoryname;
create view min_food as
select categoryname, min(price) minprice from food_category_truck
group by categoryname;

-- 3腰 舛岩
select foodname, price, min_food.categoryname from 
food_category_truck join min_food on 
food_category_truck.categoryname = min_food.categoryname and 
food_category_truck.price = min_food.minprice;

--groupby, view 幻級嬢黍杏稽 join 設背辞 掻淡霜税猿走 馬檎 吉陥壱..^^??? ^^???????????????
-- <<<<<<<<<<<<<<4腰 汝液旋生稽 瑳凶 製縦戚 亜舌 煽慧廃 畷昔 製縦 歳嫌? >>>>>>>>>>>>>>
--1腰拭辞 幻窮暗 亜閃身.
select * from groupby_foodcode_avg;
--坪球紺稽 亜維 広醸澗汽, 唖 坪球拭 古暢鞠澗 戚硯亀 蓄亜(join 戚遂)
select name, groupby_foodcode_avg.foodcode, avgprice 
from groupby_foodcode_avg 
join food_category 
on 
groupby_foodcode_avg.foodcode=food_category.code;

--戚硯戚櫛 groupby_foodcode_avg.~拭辞~ 祢球坪球研 亜閃尽壱, avgprice 亀 亜閃人緒. 
--group_foodcode_avg 櫛 food_category研 join 廃陥. 
--groupby_foodcode_avg税 祢球坪球櫛, food_category税 坪球櫛 違張凶. 

create view group_avg_food as 
select name, groupby_foodcode_avg.foodcode, avgprice 
from groupby_foodcode_avg 
join food_category 
on 
groupby_foodcode_avg.foodcode=food_category.code;

--group_avg_food 坂研 幻窮陥
--戚硯戚櫛 groupby_foodcode_avg.~拭辞~ 祢球坪球研 亜閃尽壱, avgprice亀 亜閃尽陥. 
--on - 繕昔馬澗 繕闇戚 groupby_foodcode_avg.foodcode=food_category.code戚 旭聖 凶, 
--from group_foodcode_avg税 戚硯, 坪球,引 汝液亜維聖 窒径馬澗 依.
--蒋拭辞採斗 石壱 及拭辞 薦企稽 託悦託悦 

select * from group_avg_food;

--掻淡霜税 (view晦軒 掻淡霜税) slect slect 鞠艦猿. 
select * from group_avg_food where avgprice=
(select min(avgprice) from group_avg_food);


--avgprice亜 及拭蟹紳 漆刑闘 覗虞戚什(min(avgprice) from group_avg_food)-置社葵戚櫛櫛 旭聖?. 
--avg price 坂研 窒径廃陥. 


-- <<<<<<<<<<<<<<<<<<< 5腰 汝液旋生稽 瑳 凶 製縦戚 亜舌 搾術畷昔 製縦 歳嫌? >>>>>>>>>>>>>> 
--4腰 細食兜壱 MAX 稽 郊荷檎 魁 しさし
select * from group_avg_food where avgprice=
(select max(avgprice) from group_avg_food);




-- 覗稽獣煽_敗呪_闘軒暗 獣拙_insert,delete,update,select,古鯵痕呪_鋼発葵赤澗敗呪_醗遂

