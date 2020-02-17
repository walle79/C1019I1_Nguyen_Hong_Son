-- yc 2
select * from staff where (staff_name like 'h%' or staff_name 
like 'k%' or staff_name like 't%') and length(staff_name)<15;
-- yc 3
select * from customer where address in('Quang Tri','Da Nang') 
and (curdate()-dob>(18*30*365) and curdate()-dob<(50*30*365));
-- yc 4
select customer.customer_name, count(contract.id_contract) as solan_datphong from customer inner join contract on customer.id_customer = contract.id_customer
inner join type_customer on customer.id_type_customer = type_customer.id_type_customer where type_customer.name_type_customer = 'Diamond'
group by customer.id_customer order by solan_datphong;
-- yc 5
select customer.id_customer, customer.customer_name, type_customer.name_type_customer, contract.id_contract, contract.contract_day, contract.contract_end, service.service_name,
sum(service.fee_rent+contract_detail.amount*accompanied_service.price) as Tongtien from customer
left join type_customer on customer.id_type_customer = type_customer.id_type_customer
left join contract on customer.id_customer = contract.id_customer
left join service on contract.id_service = service.id_service
left join contract_detail on contract.id_contract = contract_detail.id_contract
left join accompanied_service on contract_detail.id_accopanied_service = accompanied_service.id_accompanied_service
group by contract.id_contract;
-- yc 6
select service.id_service, service.service_name, service.area, service.fee_rent, type_service.name_type_service from service
inner join type_service on service.id_service = type_service.id_type_service
where not exists (select contract.id_service from contract where (contract.contract_day between "2019-01-01" and "2019-03-31") and contract.id_service = service.id_service );
-- yc 7
select service.id_service, service.service_name, service.area, service.max_people, service.fee_rent, type_service.name_type_service from service
inner join type_service on type_service.id_type_service = service.id_type_service
where exists (select contract.id_contract from contract where year (contract.contract_day) = '2018' and contract.id_service = service.id_service)
and not exists (select contract.id_contract from contract where year (contract.contract_day) = '2019' and contract.id_service = service.id_service)
-- yc 8 
select distinct customer.customer_name from customer;
select customer.customer_name from customer group by customer.customer_name;
select customer.customer_name from customer union select customer.customer_name from customer;
-- yc 9
select temp.month, count(month(contract.contract_day)) as so_khach_hang_dang_ky, sum(contract.total_payment) as Tong_tien from
(select 1 as month
union select 2 as month 
union select 3 as month 
union select 4 as month 
union select 5 as month 
union select 6 as month 
union select 7 as month 
union select 8 as month 
union select 9 as month 
union select 10 as month 
union select 11 as month 
union select 12 as month) as temp  
left join contract on month(contract.contract_day) = temp.month
left join customer on customer.id_customer = contract.id_customer
where year (contract.contract_day) = '2019' or year (contract.contract_day) is null or month (contract.contract_day) is null
group by temp.month
order by temp.month;
-- yc 10
select contract.id_contract, contract.contract_day, contract.contract_end, contract.previous_payment, count(contract_detail.id_accopanied_service) as soluong_dichvudikem
from contract inner join contract_detail on contract.id_contract = contract_detail.id_contract group by contract.id_contract;
-- yc 11
select accompanied_service.name_accompanied_service, accompanied_service.price, accompanied_service.unit from contract
inner join contract_detail on contract.id_contract = contract_detail.id_contract
inner join accompanied_service on contract_detail.id_accopanied_service = accompanied_service.id_accompanied_service
inner join customer on customer.id_customer = contract.id_customer
inner join type_customer on customer.id_type_customer = type_customer.id_type_customer
where type_customer.name_type_customer = "Diamond" and customer.address in ("Vinh", "Quang Ngai")
-- yc 12
select contract.id_contract, contract.total_payment, contract.previous_payment, staff.staff_name, customer.customer_name, customer.phone_number, service.service_name, 
count(contract_detail.id_accompanied_service) as solan_sudung from contract
inner join staff on contract.id_staff = staff.id_staff
inner join customer on contract.id_customer = customer.id_customer
inner join service on service.id_service = contract.id_service
inner join contract_detail on contract.id_contract = contract_detail.id_contract
where not exists (select contract.id_contract where contract.contract_day between "2019-01-01" and "2019-06-31")
and exists (select contract.id_contract where contract.contract_day between "2019-09-01" and "2019-12-31")
-- yc 13
create temporary table temp
select accompanied_service.name_accompanied_service as tendichvu_dikem, count(contract_detail.id_accopanied_service) as solan_sudung from contract_detail
inner join accompanied_service on accompanied_service.id_accompanied_service = contract_detail.id_accopanied_service
group by accompanied_service.name_accompanied_service;
select * from temp;

create temporary table temp1
select max(temp.solan_sudung) as maxsolan_sudung from temp;
select * from temp1;

select temp.tendichvu_dikem, temp.solan_sudung from temp inner join temp1 on temp.solan_sudung = temp1.maxsolan_sudung;
drop temporary table temp;
drop temporary table temp1;
-- yc 14
select contract.id_contract, type_service.name_type_service, accompanied_service.name_accompanied_service, count(contract_detail.id_accopanied_service) as solan_sudung
from contract inner join service on service.id_service = contract.id_service
inner join type_service on type_service.id_type_service = service.id_type_service
inner join contract_detail on contract_detail.id_contract = contract.id_contract
inner join accompanied_service on accompanied_service.id_accompanied_service = contract_detail.id_accopanied_service
group by (accompanied_service.name_accompanied_service) having solan_sudung = 1;
-- yc 15
select staff.id_staff, staff.staff_name, staff.phone_number, staff.address, grade.name_grade, position.name_position, count(contract.id_staff) as solan_taohopdong
from staff inner join grade on grade.id_grade = staff.id_grade
inner join position on position.id_position = staff.id_position
inner join contract on contract.id_staff = staff.id_staff
where contract.contract_day between "2018-01-01" and "2019-12-31"
group by staff.staff_name
having solan_taohopdong<4;
-- yc 16
delete from staff where not exists (select staff.id_staff from contract
where contract.contract_day between "2017-01-01" and "2019-12-31" and contract.id_staff = staff.id_staff);
-- yc 17 
update customer, (select contract.id_customer as id, sum(contract.total_payment) as Tong_tien from contract
where year(contract.contract_day) = 2019
group by contract.id_customer
having Tong_tien > 10000000) as temp set customer.id_type_customer = (select type_customer.id_type_customer from type_customer where type_customer.name_type_customer="Diamond")
where  customer.id_type_customer = (select type_customer.id_type_customer from type_customer where type_customer.name_type_customer="Platium")
and temp.id = customer.id_customer;
-- yc 18
delete customer, contract, contract_detail from customer inner join contract on customer.id_customer = contract.id_customer
inner join contract_detail on contract.id_contract = contract_detail.id_contract
where not exists (select contract.id_contract where year(contract.contract_day)>2016 and customer.id_customer = contract.id_customer);
-- yc 19
update accompanied_service inner join (select accompanied_service.name_accompanied_service as tendichvu_dikem from contract_detail inner join accompanied_service
on accompanied_service.id_accompanied_service = contract_detail.id_accopanied_service group by accompanied_service.id_accompanied_service
having count(contract_detail.id_accopanied_service)>3) as temp set accompanied_service.price = accompanied_service.price*2
where accompanied_service.name_accompanied_service = temp.tendichvu_dikem;
-- yc 20
select staff.id_staff as ID, staff.staff_name, staff.email, staff.phone_number, staff.dob, staff.address, "staff" as FromTable
from staff
union all
select customer.id_customer as ID, customer.customer_name, customer.email, customer.phone_number, customer.dob, customer.address, "customer" as FromTable
from customer;







