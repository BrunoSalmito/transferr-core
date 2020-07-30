


select * from grouping
insert into grouping(code_principal,name,stateid,telephone_principal,id_location) values (88,'Discovery Jeri','26760274000172',997817010,4);--id 4
insert into grouping(code_principal,name,stateid,telephone_principal,id_location) values (88,'Junior Tour','35199070000103',988311953,4); -- id 5

select * from driver
insert into driver(country_register,name,birth_date,id_group,id_user,type_of_driver) values('26760274000172','Discovery Jeri','1985-02-01',4,null,1); -- 10
insert into driver(country_register,name,birth_date,id_group,id_user,type_of_driver) values('35199070000103','Junior Tour','1985-02-01',5,null,1); -- 11


update driver set ddd = 88, phone = 997817010, whatsapp = 5588997817010 where id = 10;
update driver set ddd = 88, phone = 988311953, whatsapp = 5588988311953 where id = 11;




select * from car order by id asc
insert into car(car_identity,color,fl_external_equip,model,nr_seats,status,type_car,id_driver,photo) values('WWW-2020','Amarelo com Azul','t','Discovery Jeri',4,0,2,10,'http://petmooby.com.br:12569/files/car/10/profile.jpg');
insert into car(car_identity,color,fl_external_equip,model,nr_seats,status,type_car,id_driver,photo) values('WWW-2020','Amarelo com Azul','t','Junior Tour',4,0,2,11,'http://petmooby.com.br:12569/files/car/11/profile.jpg');


update car set color = 'YELLOW' where color = 'Amarelo com Azul'

insert into tour_driver(id_tour_option,id_driver) values (10,10);
insert into tour_driver(id_tour_option,id_driver) values (10,11);
insert into tour_driver(id_tour_option,id_driver) values (11,10);
insert into tour_driver(id_tour_option,id_driver) values (11,11);