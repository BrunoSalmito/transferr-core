

select * from usuario


select * from country

insert into country(id,name) values(1,'Brasil')

select * from sub_country

insert into sub_country(id,name,id_country) values (1,'Ceará',1)
insert into sub_country(id,name,id_country) values (2,'Rio Grande do Norte',1)
insert into sub_country(id,name,id_country) values (3,'Pernambuco',1)
insert into sub_country(id,name,id_country) values (4,'Bahia',1)


select * from location

insert into location (id,name,photo_profile,id_sub_country,description) values (2,'Praia de Pipapa RN','https://www.pipa.com.br/pipa-backend/media/filer_public/ee/5e/ee5e89c3-0d29-4d71-b1ab-7ba1bc567db7/passeios-de-buggy-perfil.jpg',2,'São várias praias (baias) e uma lagoa, Lagoa Guaraíras, Baia dos Golfinhos, Praia do Amor, Madeiro, Cacimbinhas, entre outras. Cada uma com seu diferencial de atividades esportivas')

update location set photo_profile = 'http://sobralonline.com.br/wp-content/uploads/2016/12/foto-lagoa-do-paraiso-jericoacoara.jpg', id_sub_country = 1
update location set description = 'E finalmente, depois de um dia de passeios intensos você e seu Buggy chegam a Lagoa da Tatajuba. Lá tem um restaurantezinho que com certeza depois deste dia cheio de informações você vai querer comer. O menu é um só'

-- INSERTING MANY LOCATIONS FOR TEST

insert into location (id,name,photo_profile,id_sub_country,description) values 
(1,'Jericoacoara','https://www.pipa.com.br/pipa-backend/media/filer_public/ee/5e/ee5e89c3-0d29-4d71-b1ab-7ba1bc567db7/passeios-de-buggy-perfil.jpg'
,1
,'Praia localizada no estado do Ceará.Foi eleita em 1994 pelo jornal estadunidense The Washington Post uma das dez praias mais bonitas do planeta. Em 2014, foi eleita pelo Huffington Post a quarta melhor praia da Terra.')

insert into location (id,name,photo_profile,id_sub_country,description) values 
(2
,'Cumbuco'
,'https://www.pipa.com.br/pipa-backend/media/filer_public/ee/5e/ee5e89c3-0d29-4d71-b1ab-7ba1bc567db7/passeios-de-buggy-perfil.jpg'
,1
,'Praia brasileira localizada no município de Caucaia, a 30 km da capital, Fortaleza no estado do Ceará. A praia está localizada a uma distância de 35 km de Fortaleza.')


insert into location (id,name,photo_profile,id_sub_country,description) values 
(5,'Praia da ilha de Lost','https://www.pipa.com.br/pipa-backend/media/filer_public/ee/5e/ee5e89c3-0d29-4d71-b1ab-7ba1bc567db7/passeios-de-buggy-perfil.jpg',2,'São várias praias (baias) e uma lagoa, Lagoa Guaraíras, Baia dos Golfinhos, Praia do Amor, Madeiro, Cacimbinhas, entre outras. Cada uma com seu diferencial de atividades esportivas')


insert into location (id,name,photo_profile,id_sub_country,description) values 
(6,'Beach Park Dunas Praia','https://www.pipa.com.br/pipa-backend/media/filer_public/ee/5e/ee5e89c3-0d29-4d71-b1ab-7ba1bc567db7/passeios-de-buggy-perfil.jpg',2,'São várias praias (baias) e uma lagoa, Lagoa Guaraíras, Baia dos Golfinhos, Praia do Amor, Madeiro, Cacimbinhas, entre outras. Cada uma com seu diferencial de atividades esportivas')


select * from Location_images

insert into Location_images(location_id,image_path) values (1,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOjrafFB5ja0XI9NwX2wh9FrQ8CPNTT_rKuVuwxAeFThS4BtDg')
insert into Location_images(location_id,image_path) values (1,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdMFh7LZPBZ-Bp5_khXgjPKTCJLR7t8lC23ZwtH5ppAelgiIoviw')




select * from driver

select * from grouping

update grouping set id_location = 1

select * from driver

select * from car

update car set photo = 'https://media-cdn.tripadvisor.com/media/photo-s/0c/44/35/61/nosso-melhor-bugueiro.jpg' where id = 1;
update car set photo = 'https://img.paraviagem.com.br/uploads/2015/09/bugueiro-dixon-apcba-dunas-natal.jpg' where id = 2;
update car set photo = 'http://2.bp.blogspot.com/-wgBCVHb_QGE/UL-WBhi-FZI/AAAAAAAAABo/D_I1gaD4a9s/s1600/2012-12-01+17.10.39.jpg' where id = 3;

select * from tour_option
insert into tour_option(id,description,name,value,id_location) values (2,'O Melhor e ainda melhor de jeri','Jeri Lagoa II',250,1)
insert into tour_option(id,description,name,value,id_location) values (3,'Venha aproveitar suas ferias com toda a tranquilidade.','Jeri Lagoa III',250,1)


select * from tour_option
insert into tour_option (id,description,name,value,id_location,profile_url) values
(1,'Passeio passa por varias locais ao leste de jericoacoara.
-Arvore da preguiça
-Praia do prea
-Lagoa Azul
-Lagoa do Paraíso
-Pedra furada','Tour leste',140,1,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOjrafFB5ja0XI9NwX2wh9FrQ8CPNTT_rKuVuwxAeFThS4BtDg')

insert into tour_option (id,description,name,value,id_location,profile_url) values
(2,'Passeio passa por varias locais ao oeste de jericoacoara.
Mangue seco
dunas
tubo agua
tirolesa
agua grande
cavalo marinho
','Tour Oeste',140,1,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvEEMVuR0T5MJcvI6HojPjrDO9luuE5MDR7hxVPMUOXmUe4583YA')
-- =========================================================================================
--For Cumbuco
select * from tour_option
insert into tour_option (id,description,name,value,id_location,profile_url) values
(3,'Passeio passa por todo o litoral do Cumbuco. Para quem gosta de Kit fazemos uma parada na lagoa que mais venta do Ceará.'
,'Praia e dunas',140,2,'http://67.205.107.224:12569/files/images-4.jpeg');

insert into tour_option (id,description,name,value,id_location,profile_url) values
(4
,'Passeio leva para a lagoa do banana situada a 10 km da praia do cumbuco. Na lagoa temos as opções de passeio com caiaque, banana boat e jetski. Tem opções de pousada pra quem quiser descansar e aproveitar a noite.'
,'Lagoa do banana'
,350
,2,'http://67.205.107.224:12569/files/images-8.jpeg');


select * from tour_option_images

insert into tour_option_images(tour_option_id,image_path) values (1,'http://67.205.107.224:12569/files/jeri1.jpg');
insert into tour_option_images(tour_option_id,image_path) values (1,'http://67.205.107.224:12569/files/jeri2.jpg');
insert into tour_option_images(tour_option_id,image_path) values (1,'http://67.205.107.224:12569/files/jeri3.jpg');
insert into tour_option_images(tour_option_id,image_path) values (1,'http://67.205.107.224:12569/files/jeri4.jpg');
insert into tour_option_images(tour_option_id,image_path) values (1,'http://67.205.107.224:12569/files/jeri5.jpg');
insert into tour_option_images(tour_option_id,image_path) values (1,'http://67.205.107.224:12569/files/jeri6.jpg');

insert into tour_option_images(tour_option_id,image_path) values (2,'http://67.205.107.224:12569/files/images-10.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (2,'http://67.205.107.224:12569/files/images-11.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (2,'http://67.205.107.224:12569/files/images-12.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (2,'http://67.205.107.224:12569/files/images-13.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (2,'http://67.205.107.224:12569/files/images-14.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (2,'http://67.205.107.224:12569/files/images-16.jpeg');



insert into tour_option_images(tour_option_id,image_path) values (3,'http://67.205.107.224:12569/files/images-25.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (3,'http://67.205.107.224:12569/files/images-26.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (3,'http://67.205.107.224:12569/files/images-27.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (3,'http://67.205.107.224:12569/files/images-28.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (3,'http://67.205.107.224:12569/files/images-29.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (3,'http://67.205.107.224:12569/files/images-30.jpeg');

insert into tour_option_images(tour_option_id,image_path) values (4,'http://67.205.107.224:12569/files/images-11.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (4,'http://67.205.107.224:12569/files/images-12.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (4,'http://67.205.107.224:12569/files/images-13.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (4,'http://67.205.107.224:12569/files/images-14.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (4,'http://67.205.107.224:12569/files/images-15.jpeg');
insert into tour_option_images(tour_option_id,image_path) values (4,'http://67.205.107.224:12569/files/images-16.jpeg');


select * from usuario
insert into usuario(id,email,password) values (1,'antonio@d.com','123456')
insert into usuario(id,email,password) values (2,'bruno_salmito@hotmail.com','123456')
insert into usuario(id,email,password) values (3,'rafasystec@yahoo.com.br','123456')


select * from driver
insert into driver(id,birth_date,country_register,name,id_group,id_user,ddd,phone,whatsapp) 
values (1,05031988,'52215461525','Antônio Silva',1,1,85,988541547,558589143638)

insert into driver(id,birth_date,country_register,name,id_group,id_user,ddd,phone,whatsapp) 
values (2,05031991,'52215461525','Bruno Salmito',1,2,85,987698064,5585987698064)

insert into driver(id,birth_date,country_register,name,id_group,id_user,ddd,phone,whatsapp) 
values (3,05031991,'4456461525','Antonio Rocha',2,3,85,981405021,5585985635021)

select * from car

insert into car(id,car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver) 
values(1,'HOC-3456','Bege','t','ToyoTa Bandeirante',12,'https://media-cdn.tripadvisor.com/media/photo-s/0c/44/35/61/nosso-melhor-bugueiro.jpg',0,0,1) 

insert into car(id,car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver) 
values(1,'HXA-9937','Preto','t','Jipe Cherokee Laredo',7,'http://2.bp.blogspot.com/-wgBCVHb_QGE/UL-WBhi-FZI/AAAAAAAAABo/D_I1gaD4a9s/s1600/2012-12-01+17.10.39.jpg',0,0,2) 


insert into car(id,car_identity,color,fl_external_equip,model,nr_seats,photo,status,type_car,id_driver) 
values(1,'HWS-3541','Branco','t','Hilux SW4',7,'jeriCar1.jpg',0,0,3) 

/*
insert into tour_option_images(tour_option_id,image_path) values (2,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-CYq0YSq5S-BX4x50jWYuJ4Y1wxDJLAIwZxtRL9qPc4oMRYMg');
insert into tour_option_images(tour_option_id,image_path) values (2,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7QUizNHRH6rBkAjO-Ionkplo0UGVKx3vaip33UJJfn7zvf748BA');
insert into tour_option_images(tour_option_id,image_path) values (2,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-CYq0YSq5S-BX4x50jWYuJ4Y1wxDJLAIwZxtRL9qPc4oMRYMg');
insert into tour_option_images(tour_option_id,image_path) values (2,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7QUizNHRH6rBkAjO-Ionkplo0UGVKx3vaip33UJJfn7zvf748BA');
insert into tour_option_images(tour_option_id,image_path) values (2,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-CYq0YSq5S-BX4x50jWYuJ4Y1wxDJLAIwZxtRL9qPc4oMRYMg');
insert into tour_option_images(tour_option_id,image_path) values (2,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7QUizNHRH6rBkAjO-Ionkplo0UGVKx3vaip33UJJfn7zvf748BA');
*/
update tour_option set profile_url = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOjrafFB5ja0XI9NwX2wh9FrQ8CPNTT_rKuVuwxAeFThS4BtDg' where id = 1;
update tour_option set profile_url = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7QUizNHRH6rBkAjO-Ionkplo0UGVKx3vaip33UJJfn7zvf748BA' where id = 2;
update tour_option set profile_url = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPvdjgc0ZtjWPCygmbSY9COeFvZCLe6vkNGZ5Br4yZ4aA_lcxPMQ' where id = 3;


select * from plain_tour

drop table plain_tour

update usuario set email =  id = 89
Passeio leva para a lagoa do banana situada a 10 km da praia do cumbuco. Na lagoa temos as opções de passeio com caiaque, banana boat e jetski. Tem opções de pousada pra quem quiser descansar e aproveitar a noite.
