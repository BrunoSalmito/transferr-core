select * from location

-- First thing is to create a group - cumbuco has id 2
select * from grouping
--Exemple
insert into grouping(code_principal,name,stateid,telephone_principal,id_location) values (85,'COOPBJ','CNPJ',32260000,1)
--TEST

insert into grouping(code_principal,name,stateid,telephone_principal,id_location) values (85,'ASSOCIAÇAO DE CARROS DE CUMBUCO','2556454000179',985474747,1)

--update usuario set email = 'm3@gmail.com' where id = 6

-- Than regiter each user
select * from usuario
--Exemplo
insert into usuario(email,password) values ('emeil@motorista.com','senha_provisoria')
--TEST -- ASSOCIAÇÃO CUMBUCO ID 3
insert into usuario(email,password) values ('m1@gmail.com','123456');
insert into usuario(email,password) values ('m2@gmail.com','123456');
insert into usuario(email,password) values ('m3@gmail.com','123456');
insert into usuario(email,password) values ('m4@gmail.com','123456');
insert into usuario(email,password) values ('m555555@gmail.com','123456');
-- After we need to add the driver
--Insert driver
select * from driver ORDER BY ID
--Example
insert into driver(country_register,name,id_group,id_user,ddd,phone,whatsapp,birth_date,type_of_driver) values ('CPF','Nome do motorista',ID_GROUP,ID_USER,DDD,PHONE,ZAP,BIRTH_DATE,TYPE_DRIVER)
/*
WHEN
 TYPE_DRIVER : 
	0 - DRIVER,
	1 - TOURISM_AGENCY)
*/
--TEST - ASSOCIAÇÃO CUMBUCO ID 3
insert into driver(country_register,name,id_group,id_user,ddd,phone,whatsapp,birth_date,type_of_driver) values ('34396060076','RAFAEL DA SILVA SANTOS',3,4,85,985635021,'5585985635021','2019-05-23',0);
insert into driver(country_register,name,id_group,id_user,ddd,phone,whatsapp,birth_date,type_of_driver) values ('89364114035','BRUNO DA SILVA SANTOS PEREIRA',3,5,12,987698064,'5585987698064','2019-04-11',0);
insert into driver(country_register,name,id_group,id_user,ddd,phone,whatsapp,birth_date,type_of_driver) values ('89364114035','RODRIGO PEREIRA SILVA',3,6,55,987698000,'5585987698000','1988-04-11',0);
insert into driver(country_register,name,id_group,id_user,ddd,phone,whatsapp,birth_date,type_of_driver) values ('89364114035','FENANDO MENDES JUNIOR',3,7,55,987677850,'5585987644000','1988-09-11',0);
insert into driver(country_register,name,id_group,id_user,ddd,phone,whatsapp,birth_date,type_of_driver) values ('89364114035','MAURICIO DE SOUSA',3,8,55,987688850,'5585988844000','1988-09-11',0);
--insert into driver(country_register,name,id_group,id_user,ddd,phone,whatsapp,birth_date,type_of_driver) values ('89364114035','ITALO SILVA GOMES',3,9,55,987644450,'5585944444000','1988-09-05',0);

SELECT * FROM CAR ORDER BY ID
--Example
insert into car (car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver,always_on_map)
values ('PLATE',COLOR,false,'Model',NR_SEATS,'',STATUS,TYPE_CAR,ID_DRIVER,false)
/*
@ - COLOR:

	0 - WHITE   ,
	BLACK   ,
	SILVER  ,
	YELLOW  ,
	BEIGE   ,
	RED     ,
	PURPLE  ,
	GREEN   ,
	BLUE    ,
	9 - GREY	

@ - NR_SEATS - NUMBER OF THE SEATS
@ - STATUS: 
	WAITING_CLIENT_TRANSFER, 
	WAITING_CLIENT_TOUR, 
	OFFLINE
@ - TYPE_CAR :
	0 - X_4,
	1 - BUGGY,
	2 - BUS

*/
--TEST driver from 5 until 9
insert into car (car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver,always_on_map)
values ('HRX-3333','WHITE',false,'HILUX',7,'',2,0,5,false);

insert into car (car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver,always_on_map)
values ('HVR-3333','BLACK',false,'BUGGY',4,'',2,1,6,false);

insert into car (car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver,always_on_map)
values ('GGG-4321','BLACK',false,'JEEP',4,'',2,0,7,false);

insert into car (car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver,always_on_map)
values ('HHH-4444','YELLOW',false,'AMAROK',4,'',2,0,8,false);

insert into car (car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver,always_on_map)
values ('HYZ-4578','PURPLE',false,'ÔNIBUS',70,'',2,2,9,false);



SELECT * FROM COORDINATE_CAR
-- To avoid to check every time if the register already exist
INSERT INTO COORDINATE_CAR (DT_LAST_UPDATE,LATITUDE,LONGITUDE,ID_CAR) VALUES (CURRENT_TIMESTAMP,0,0,ID_CAR)

--TEST
INSERT INTO COORDINATE_CAR (DT_LAST_UPDATE,LATITUDE,LONGITUDE,ID_CAR) VALUES (CURRENT_TIMESTAMP,0,0,5);
INSERT INTO COORDINATE_CAR (DT_LAST_UPDATE,LATITUDE,LONGITUDE,ID_CAR) VALUES (CURRENT_TIMESTAMP,0,0,6);
INSERT INTO COORDINATE_CAR (DT_LAST_UPDATE,LATITUDE,LONGITUDE,ID_CAR) VALUES (CURRENT_TIMESTAMP,0,0,7);
INSERT INTO COORDINATE_CAR (DT_LAST_UPDATE,LATITUDE,LONGITUDE,ID_CAR) VALUES (CURRENT_TIMESTAMP,0,0,8);
INSERT INTO COORDINATE_CAR (DT_LAST_UPDATE,LATITUDE,LONGITUDE,ID_CAR) VALUES (CURRENT_TIMESTAMP,0,0,9);







