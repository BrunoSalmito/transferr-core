

select * from plain_tour

insert into plain_tour (id,date,is_open,seats_remaining,id_driver,id_tour_option) values(7,current_timestamp,true,2,2,2);
insert into plain_tour (id,date,is_open,seats_remaining,id_driver,id_tour_option) values(8,current_timestamp,true,1,2,2);
insert into plain_tour (id,date,is_open,seats_remaining,id_driver,id_tour_option) values(9,current_timestamp,true,3,2,2);
insert into plain_tour (id,date,is_open,seats_remaining,id_driver,id_tour_option) values(10,current_timestamp,true,0,2,2);

insert into plain_tour (id,date,is_open,seats_remaining,id_driver,id_tour_option) values(13,'2018-09-18 17:20:00.000',true,1,1,1);
insert into plain_tour (id,date,is_open,seats_remaining,id_driver,id_tour_option) values(16,'2018-09-19 16:00:00.000',true,1,1,1);
insert into plain_tour (id,date,is_open,seats_remaining,id_driver,id_tour_option) values(17,'2018-09-20 08:20:00.000',true,1,1,2);

update car set photo = 'https://photojournal.jpl.nasa.gov/jpeg/PIA07137.jpg' where id = 2


select * from tour_option


	
select * from usuario



select * from coordinate_car

select * from car

update car set status = 1 where id = 1


update users_adm_acesso set usersystem_id = 5 , acessos_id = 3 where  usersystem_id = 5 and acessos_id = 1

update users_adm_acesso set usersystem_id = 5 , acessos_id = 1 where  usersystem_id = 5 and acessos_id = 3

