

select * from coordinate_car

insert into coordinate_car values (1,-3.73674356,-38.49615601,1);
insert into coordinate_car values (2,-3.73957428,-38.4938627,2);
insert into coordinate_car values (3,-3.73682921,-38.48748711,3);



select * from grouping
insert into grouping(id,code_principal,name,stateid,telephone_principal,id_location) values (1,85,'Bugeuiros Jeri','1863168513515',95845263,null)

select * from usuario

insert into usuario values(1,'rafael','123456');
insert into usuario values(2,'rafasyste@gmail.com','123456');
insert into usuario values(3,'rafasystec@yahoo.com.br','123456');

select * from driver
insert into driver(id,country_register,name,birth_date,id_group,id_user) values(1,'15284596578','Beltrano',19850201,1,1);
insert into driver(id,country_register,name,birth_date,id_group,id_user) values(2,'15284596578','Beltrano',19850201,1,2);
insert into driver(id,country_register,name,birth_date,id_group,id_user) values(3,'15284596578','Cicrano Pinto',19850212,1,3);


select * from car
insert into car(id,car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver) values(1,'JJK-2000','bege desert','t','Toyota Hilux SW4',4,'',0,0,1);
insert into car(id,car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver) values(2,'HHW-9870','azul','t','Toyota Hilux'        ,4,'',0,0,2);
insert into car(id,car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver) values(3,'JYO-6598','prata','t','Toyota Bandeirantes',6,'',0,0,3);


select * from location
insert into location(id,name,photo_profile,id_sub_country) values(1,'Lagoa encantada de Jeri','',null)

select * from Location_images
insert into Location_images(location_id,image_path) values(1,'https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Anderps_067.JPG/1200px-Anderps_067.JPG')


select * from tour_option
insert into tour_option(id,description,name,value,id_location) values(1,'Melhor lagoa de Jeri está qui.','Lagoa de Jeri',300,1)



insert into plain_tour(id,date,seats_remaining,id_driver,id_tour_option,is_open) values(1,current_timestamp,2,1,1,'t');
insert into plain_tour(id,date,seats_remaining,id_driver,id_tour_option,is_open) values(2,current_timestamp,1,1,1,'t'); 



--alter table plain_tour add is_open boolean default 't'  

