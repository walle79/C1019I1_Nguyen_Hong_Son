create database case_study;
use case_study;

create table type_customer (
 id_type_customer int auto_increment not null primary key,
 name_type_customer varchar(45)
 );
create table type_rent (
 id_type_rent int auto_increment not null primary key,
 name_type_rent varchar(45),
 price int
 );
create table type_service (
 id_type_service int auto_increment not null primary key,
 name_type_service varchar(45)
 );
create table accompanied_service (
 id_accompanied_service int auto_increment not null primary key,
 name_accompanied_service varchar(45), 
 price int,
 unit int,
 status varchar(45)
 );
create table position (
 id_position int auto_increment not null primary key,
 name_position varchar(45)
 );
create table grade (
 id_grade int auto_increment not null primary key,
 name_grade varchar(45)
 );
create table part (
 id_part int auto_increment not null primary key,
 name_part varchar(45)
 );
create table staff (
 id_staff int auto_increment not null primary key,
 staff_name varchar(45),
 id_position int,
 foreign key (id_position) references position (id_position),
 id_grade int,
 foreign key (id_grade) references grade (id_grade),
 id_part int,
 foreign key (id_part) references part (id_part),
 dob DATE,
 idCard_number varchar(45),
 salary varchar(45),
 phone_number varchar(45),
 email varchar(45),
 address varchar(45)
 );
create table contract_detail (
 id_contract_detail int auto_increment not null primary key,
 id_contract int,
 foreign key ( id_contract) references contract ( id_contract),
 id_accopanied_service int,
 foreign key (id_accopanied_service) references accompanied_service ( id_accompanied_service),
 amount int
 );
create table contract (
 id_contract int auto_increment not null primary key,
 id_staff int,
 foreign key (id_staff) references staff (id_staff),
 id_customer int,
 foreign key (id_customer) references customer (id_customer),
 id_service int,
 foreign key (id_service) references service (id_service),
 contract_day DATE,
 contract_end DATE,
 previous_payment int,
 total_payment int
 );
create table customer (
 id_customer int auto_increment not null primary key,
 id_type_customer int,
 foreign key ( id_type_customer) references type_customer (id_type_customer),
 customer_name varchar(45),
 dob DATE,
 idCard_number varchar(45),
 phone_number varchar(45),
 email varchar(45),
 address varchar(45)
 );
create table service (
 id_service int auto_increment not null primary key,
 service_name varchar(45),
 area int,
 number_of_floor int,
 max_people varchar(45),
 fee_rent varchar(45),
 id_type_rent int,
 foreign key (id_type_rent) references type_rent (id_type_rent),
 id_type_service int,
 foreign key (id_type_service) references type_service (id_type_service),
 status varchar(45)
 );
 
insert into type_rent (name_type_rent,price) values ('hour','3');
insert into type_rent (name_type_rent,price) values ('day','50');
insert into type_rent (name_type_rent,price) values ('month','1200');
insert into type_rent (name_type_rent,price) values ('year','10000');
insert into type_customer (name_type_customer) values ('Diamond');
insert into type_customer (name_type_customer) values ('Platinum');
insert into type_customer (name_type_customer) values ('Gold');
insert into type_customer (name_type_customer) values ('Silver');
insert into type_customer (name_type_customer) values ('Member');
insert into position (name_position) values ('Director');
insert into position (name_position) values ('Leader');
insert into position (name_position) values ('Manager');
insert into position (name_position) values ('Staff');
insert into grade (name_grade) values ('Uni');
insert into grade (name_grade) values ('Col');
insert into grade (name_grade) values ('Other');
insert into part (name_part) values ('Receptionist');
insert into part (name_part) values ('Restaurant');
insert into part (name_part) values ('Finance');
insert into part (name_part) values ('Technique');
insert into part (name_part) values ('Security');
insert into staff (staff_name,id_position,id_grade,id_part,dob,idCard_number,salary,phone_number,email,address) 
values ('Hoang Thi Hong',4,2,2,'1996-11-11','222222222','3000000','01122444','honght@gmail.com','Da Nang');
insert into staff (staff_name,id_position,id_grade,id_part,dob,idCard_number,salary,phone_number,email,address)
values ('Nguyen Minh Tung',4,3,3,'1995-01-01','333333333','5000000','0778899221','honght@gmail.com','Quang Nam');
insert into staff (staff_name,id_position,id_grade,id_part,dob,idCard_number,salary,phone_number,email,address) 
values ('Hoang Lan',4,1,1,'1994-11-08','444444444','8000000','0332255110','honght@gmail.com','Hue');
insert into staff (staff_name,id_position,id_grade,id_part,dob,idCard_number,salary,phone_number,email,address) 
values ('Nguyen Thi Hue',4,2,1,'1992-10-11','666666666','8000000','0995522001','honght@gmail.com','Gia Lai');
insert into staff (staff_name,id_position,id_grade,id_part,dob,idCard_number,salary,phone_number,email,address) 
values ('Dang Thi Thu Thuy',3,3,1,'1998-07-10','777777777','9000000','0665522118','honght@gmail.com','Da Nang');
insert into staff (staff_name,id_position,id_grade,id_part,dob,idCard_number,salary,phone_number,email,address) 
values ('Duong Minh Tuyen',4,1,2,'1996-04-05','999999999','7000000','0997788663','honght@gmail.com','Hue');
insert into staff (staff_name,id_position,id_grade,id_part,dob,idCard_number,salary,phone_number,email,address) 
values ('Kha Banh',4,1,2,'1997-01-03','111111111','9000000','0445522330','honght@gmail.com','Quang Nam');
insert into staff (staff_name,id_position,id_grade,id_part,dob,idCard_number,salary,phone_number,email,address) 
values ('Tran Quoc Viet',4,3,2,'1999-09-09','112233445','7000000','0779988224','honght@gmail.com','Da Nang');
insert into accompanied_service (name_accompanied_service,price,unit,status)
values ('Massage',300000,1,'Available');
insert into accompanied_service (name_accompanied_service,price,unit,status)
values ('Karaoke',150000,1,'Available');
insert into accompanied_service (name_accompanied_service,price,unit,status)
values ('Food',50000,1,'Available');
insert into accompanied_service (name_accompanied_service,price,unit,status)
values ('Drink',30000,1,'Available');
insert into accompanied_service (name_accompanied_service,price,unit,status)
values ('Moto for rent',50000,1,'Not available');
insert into contract_detail (id_contract,id_accopanied_service,amount) 
values (1,1,1);
insert into contract_detail (id_contract,id_accopanied_service,amount) 
values (3,2,1);
insert into contract_detail (id_contract,id_accopanied_service,amount) 
values (2,1,3);
insert into customer (id_type_customer,customer_name,dob,idCard_number,phone_number,email,address)
values (3,'Son','1995-12-18','191870245','0964091274','1995hongson@gmail.com','Da Nang');
insert into customer (id_type_customer,customer_name,dob,idCard_number,phone_number,email,address)
values (2,'Minh','1993-01-06','171819161','023456789','minhminh@gmail.com','Hue');
insert into customer (id_type_customer,customer_name,dob,idCard_number,phone_number,email,address)
values (4,'Thuy','1998-10-07','112233445','0778767185','thuydang98dn@gmail.com','Da Nang');
insert into type_service (name_type_service) values ('Vip');
insert into type_service (name_type_service) values ('Normal');
insert into service (service_name,area,number_of_floor,max_people,fee_rent,id_type_rent,id_type_service,status)
values ('Villa',500,4,8,1000,3,2,'Available');
insert into service (service_name,area,number_of_floor,max_people,fee_rent,id_type_rent,id_type_service,status)
values ('House',300,2,4,500,2,2,'Available');
insert into service (service_name,area,number_of_floor,max_people,fee_rent,id_type_rent,id_type_service,status)
values ('Room',20,0,2,50,2,2,'Available');
insert into contract (id_staff,id_customer,id_service,contract_day,contract_end,previous_payment,total_payment)
values (4,2,2,'2019-12-12','2019-12-25',null,null);
insert into contract (id_staff,id_customer,id_service,contract_day,contract_end,previous_payment,total_payment)
values (12,1,1,'2019-12-12','2020-01-19',null,null);
insert into contract (id_staff,id_customer,id_service,contract_day,contract_end,previous_payment,total_payment)
values (8,3,3,'2019-12-19','2020-01-23',null,null);





 
 