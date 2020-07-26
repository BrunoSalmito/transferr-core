


select * from usuario


select * from country

insert into country(id,name) values(1,'Brazil')

select * from sub_country



insert into sub_country(name,id_country) values ('Ceará',1)
--insert into sub_country(id,name,id_country) values (2,'Rio Grande do Norte',1)
--insert into sub_country(id,name,id_country) values (3,'Pernambuco',1)
--insert into sub_country(id,name,id_country) values (4,'Bahia',1)


select * from location
/*
public enum EnumLanguage {
	PT_BR,
	EN_USA
	
}

*/
--insert into location (id,name,photo_profile,id_sub_country,description) values (2,'Praia de Pipapa RN','https://www.pipa.com.br/pipa-backend/media/filer_public/ee/5e/ee5e89c3-0d29-4d71-b1ab-7ba1bc567db7/passeios-de-buggy-perfil.jpg',1,'São várias praias (baias) e uma lagoa, Lagoa Guaraíras, Baia dos Golfinhos, Praia do Amor, Madeiro, Cacimbinhas, entre outras. Cada uma com seu diferencial de atividades esportivas')

-->>>>>>> Canoa Quebrada  <<<<--
--Location
insert into location (name,photo_profile,id_sub_country,description) values ('Canoa Quebrada','http://petmooby.com.br:12569/files/canoaquebrada/1764210.jpg',1,'Caracterizada por dunas e falésias avermelhadas de até trinta metros. À noite é bem movimentada na rua principal apelidada de "Broadway".')
insert into location_description(location_id, descriptionlanguage_key, value) values(1,'PT_BR','Caracterizada por dunas e falésias avermelhadas de até trinta metros. À noite é bem movimentada na rua principal apelidada de "Broadway".')
insert into location_description(location_id, descriptionlanguage_key, value) values(1,'EN_USA','Characterized by dunes and reddish cliffs of up to thirty meters. At night it is very busy on the main street nicknamed "Broadway".')
--spain
insert into location_description(location_id, descriptionlanguage_key, value) values(1,'ES_ES','Caracterizado por dunas y acantilados rojizos de hasta treinta metros. Por la noche la calle principal es bien movimentada, por ello, es apodada de "Broadway".')
--Tour Option
select * from tour_option
insert into tour_option(description,name,value,id_location,profile_url) values ('Do not use this description','Falesias e oasis',300,1,'http://petmooby.com.br:12569/files/canoaquebrada/falesiaseoasis/Principal.jpg')
--Plan tour description
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(1,'PT_BR','Passeio completo por toda a redondeza de Canoa Quebrada. Locais visitados:
-Fálesias
-Lagoa(Oasis)
-Parque Eólico
-Tirolesa e Esquibunda
-Dunas ');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(1,'EN_USA','Tour around the surroundings of Canoa Quebrada. Places visited:
-Fálesias
-Lagoa(Oasis)
-Parque Eólico
-Tirolesa e Esquibunda
-Dunas');
--spain
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(1,'ES_ES','Tour completo por toda la redondez de Canoa Quebrada. Locales visitados:
-Fálesias
-Lagoa(Oasis)
-Parque Eólico
-Tirolesa e Esquibunda
-Dunas ');
------------------------ ---------- ----------
--plan tour short description
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(1,'PT_BR','Passeio completo por toda a redondeza de Canoa Quebrada.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(1,'EN_USA','Tour around the surroundings of Canoa Quebrada.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(1,'ES_ES','Tour completo por toda la redondez de Canoa Quebrada.');
--Imagens
insert into tour_option_images(tour_option_id,image_path) values (1,'http://petmooby.com.br:12569/files/canoaquebrada/falesiaseoasis/FT1.jpg');
insert into tour_option_images(tour_option_id,image_path) values (1,'http://petmooby.com.br:12569/files/canoaquebrada/falesiaseoasis/FT2.jpg');
insert into tour_option_images(tour_option_id,image_path) values (1,'http://petmooby.com.br:12569/files/canoaquebrada/falesiaseoasis/FT3.jpg');
insert into tour_option_images(tour_option_id,image_path) values (1,'http://petmooby.com.br:12569/files/canoaquebrada/falesiaseoasis/FT4.jpg');
insert into tour_option_images(tour_option_id,image_path) values (1,'http://petmooby.com.br:12569/files/canoaquebrada/falesiaseoasis/FT5.jpg');
insert into tour_option_images(tour_option_id,image_path) values (1,'http://petmooby.com.br:12569/files/canoaquebrada/falesiaseoasis/FT6.jpg');




-->>>>>>> Cumbuco  <<<<--
--Location
insert into location (name,photo_profile,id_sub_country,description) values ('Cumbuco','http://petmooby.com.br:12569/files/cumbuco/velas-do-cumbuco.jpg',1,'Do not use this description')
--update location set name = 'Cumbuco' where id = 2
insert into location_description(location_id, descriptionlanguage_key, value) values(2,'PT_BR','Muito próxima de Fortaleza, a Praia do Cumbuco chama a atenção pelos imensos e lindos morros de areia que são avistados por toda a sua costa.')
insert into location_description(location_id, descriptionlanguage_key, value) values(2,'EN_USA','Very close to Fortaleza, Praia do Cumbuco draws attention to the immense and beautiful sand hills that are sighted all along its coast.')
insert into location_description(location_id, descriptionlanguage_key, value) values(2,'ES_ES','Cumbuco. Muy cerca de Fortaleza, la playa de Cumbuco llama la atención por las inmensas y hermosas colinas de arena que se ven a lo largo de su costa.');
--Tour Option Lagoa do Banana
select * from tour_option
insert into tour_option(description,name,value,id_location,profile_url) values ('Do not use this description','Lagoa do Banana e Praia',300,2,'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/principal.png')
--Plan tour description
update tour_option set profile_url = 'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/principal.png' where id = 2
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(2,'PT_BR','Passeio pelas famosas Dunas e Lagoa do Banana. Na lagoa você poderá andar de banana boat, lancha, caiaque entre outras atrações.');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(2,'EN_USA','Tour of the famous Dunas and Lagoa do banana. In the lagoon you can walk to banana boat, boat, kayak and other attractions.');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(2,'ES_ES','Paseo por las las famosas dunas y báñese en la laguna bananera. En la laguna podrá andar de boat banana, lancha, kayak entre otras atracciones.');
--plan tour short description
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(2,'PT_BR','Passeio pelas famosas Dunas e banho na Lagoa do Banana.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(2,'EN_USA','Tour of the famous Dunas and Lagoa do banana.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(2,'ES_ES','Paseo por las las famosas dunas y báñese en la laguna bananera.');
--Imagens
insert into tour_option_images(tour_option_id,image_path) values (2,'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/FT1.jpg');
insert into tour_option_images(tour_option_id,image_path) values (2,'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/FT2.jpg');
insert into tour_option_images(tour_option_id,image_path) values (2,'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/FT3.jpg');
insert into tour_option_images(tour_option_id,image_path) values (2,'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/FT4.jpg');
insert into tour_option_images(tour_option_id,image_path) values (2,'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/FT5.jpg');
insert into tour_option_images(tour_option_id,image_path) values (2,'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/FT6.jpg');

--Tour Option Tour Cumbuco
select * from tour_option
insert into tour_option(description,name,value,id_location,profile_url) values ('Do not use this description','Tour Cumbuco',300,2,'http://petmooby.com.br:12569/files/cumbuco/tourcumbuco/PRINCIPAL.jpg')
--Plan tour description
--update tour_option set profile_url = 'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/principal.png' where id = 2
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(3,'PT_BR','Passeio completo pela praia do Cumbuco passando por todos os pontos turisticos. Lugares visitados: 
-Lagoa do Banana
-Tirelosa e Toboágua 
-Lagoa do Cauípe
-Lagoa do Parnamirim
-Dunas
-City Tour ');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(3,'EN_USA','Cumbuco beach tour passing through all the tourist spots. Places visited:
-Lagoa do Banana
-Tirelosa e Toboágua 
-Lagoa do Cauípe
-Lagoa do Parnamirim
-Dunas
-City Tour ');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(3,'ES_ES','Paseo completo por la playa “do combuco” pasando por todos los puntos turísticos. Locales visitados:
-Lagoa do Banana
-Tirelosa e Toboágua 
-Lagoa do Cauípe
-Lagoa do Parnamirim
-Dunas
-City Tour ');
--plan tour short description
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(3,'PT_BR','Passeio completo pela praia do Cumbuco passando por todos os pontos turisticos.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(3,'EN_USA','Cumbuco beach tour passing through all the tourist spots.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(3,'ES_ES','Paseo completo por la playa "do combuco" pasando por todos los puntos turísticos.');
--Imagens
insert into tour_option_images(tour_option_id,image_path) values (3,'http://petmooby.com.br:12569/files/cumbuco/tourcumbuco/FT1.jpg');
insert into tour_option_images(tour_option_id,image_path) values (3,'http://petmooby.com.br:12569/files/cumbuco/tourcumbuco/FT2.jpg');
insert into tour_option_images(tour_option_id,image_path) values (3,'http://petmooby.com.br:12569/files/cumbuco/tourcumbuco/FT3.jpg');
insert into tour_option_images(tour_option_id,image_path) values (3,'http://petmooby.com.br:12569/files/cumbuco/tourcumbuco/FT4.jpg');
insert into tour_option_images(tour_option_id,image_path) values (3,'http://petmooby.com.br:12569/files/cumbuco/tourcumbuco/FT5.jpg');
insert into tour_option_images(tour_option_id,image_path) values (3,'http://petmooby.com.br:12569/files/cumbuco/tourcumbuco/FT6.jpg');


-->>>>>>> Fortaleza  <<<<--
--Location
insert into location (name,photo_profile,id_sub_country,description) values ('Fortaleza','http://petmooby.com.br:12569/files/fortaleza/fortaleza_ponte_dos_ingleses.jpg',1,'Do not use this description')
--update location set name = 'Cumbuco' where id = 2
insert into location_description(location_id, descriptionlanguage_key, value) values(3,'PT_BR','A cidade tem como principal atrativo suas exuberantes praias, agitada vida noturna e agradável clima de verão a maior parte do ano.');
insert into location_description(location_id, descriptionlanguage_key, value) values(3,'EN_USA','The city''s main attraction is its lush beaches, bustling nightlife and pleasant summer weather most of the year.');
insert into location_description(location_id, descriptionlanguage_key, value) values(3,'ES_ES','Fortaleza. El principal atractivo de la ciudad son sus exuberantes playas, su animada vida nocturna y su agradable clima tropical durante la mayor parte del año.');
--Tour Option Beach Park
select * from tour_option
insert into tour_option(description,name,value,id_location,profile_url) values ('Do not use this description','Beach Park',300,3,'http://petmooby.com.br:12569/files/fortaleza/beachpark/principal.jpg')
--Plan tour description
--update tour_option set profile_url = 'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/principal.png' where id = 2
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(4,'PT_BR','Maior parque aquático da america latina. Eleito por Traveller’s Choice do TripAdvisor o segundo melhor parque aquático do mundo.
Entre suas principais atrações está o Insano, toboágua de 41 metros de altura que chega a mais de 100 km/h, que flutua em queda livre e foi considerado o maior e mais rápido do mundo. Além dele, você encontra também brinquedos como o Kalafrio, tobogã divertido feito em forma de U, o Ramubrinká, que conta com velozes tobogãs que partem de plataformas de 15 m e 25 m de altura, e outras opções.');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(4,'EN_USA','Largest water park in Latin America. Chosen by TripAdvisor Traveler''s Choice the second best water park in the world.
Among its main attractions is the Insano, a 41 meter high water slide that reaches over 100 km / h, which floats in free fall and was considered the largest and fastest in the world. In addition to it, you''ll also find toys like the Kalafrio, a fun U-shaped slide, the Ramubrinka, which features fast toboggans from 15-foot and 25-meter platforms, and other options.');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(4,'ES_ES','El parque temático más grande de América Latina. Elegido por Traveller''s TripAdvisor''s Choice el segundo mejor parque acuático del mundo.
Entre sus principales atractivos están "o insano", un tobogán de 41 metros de altura que alcanza más de 100 km/h, que flota en caída libre y que fue considerado el más grande y rápido del mundo. Además, también se pueden encontrar juguetes como el Kalafrio, un divertido tobogán en forma de U, el Ramubrinká, que tiene toboganes rápidos que parten de plataformas de 15m y 25m de altura, y otras opciones.');

--plan tour short description
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(4,'PT_BR','Maior parque aquático da america latina. Eleito por Traveller''s Choice do TripAdvisor o segundo melhor parque aquático do mundo.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(4,'EN_USA','Largest water park in Latin America. Chosen by TripAdvisor Traveler''s Choice the second best water park in the world.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(4,'ES_ES','El parque temático más grande de América Latina. Elegido por Traveller´s TripAdvisor''s Choice el segundo mejor parque acuático del mundo.');
--Imagens
insert into tour_option_images(tour_option_id,image_path) values (4,'http://petmooby.com.br:12569/files/fortaleza/beachpark/FT1.jpg');
insert into tour_option_images(tour_option_id,image_path) values (4,'http://petmooby.com.br:12569/files/fortaleza/beachpark/FT2.jpg');
insert into tour_option_images(tour_option_id,image_path) values (4,'http://petmooby.com.br:12569/files/fortaleza/beachpark/FT3.jpg');
insert into tour_option_images(tour_option_id,image_path) values (4,'http://petmooby.com.br:12569/files/fortaleza/beachpark/FT4.jpg');
insert into tour_option_images(tour_option_id,image_path) values (4,'http://petmooby.com.br:12569/files/fortaleza/beachpark/FT5.jpg');
insert into tour_option_images(tour_option_id,image_path) values (4,'http://petmooby.com.br:12569/files/fortaleza/beachpark/FT6.jpg');

--Tour Option Cumbuco
select * from tour_option
insert into tour_option(description,name,value,id_location,profile_url) values ('Do not use this description','Cumbuco',300,3,'http://petmooby.com.br:12569/files/fortaleza/cumbuco/principal.jpg')
--Plan tour description
--update tour_option set profile_url = 'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/principal.png' where id = 2
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(5,'PT_BR','Transporte lhe pega no seu hotel e lhe leva para conhecer a linda Praia do Cumbuco que chama a atenção pelos imensos e lindos morros de areia que são avistados por toda a sua costa.');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(5,'EN_USA','The transportation takes you to your hotel and takes you to see the beautiful beach of Cumbuco that draws attention to the immense and beautiful sand hills that are sighted along the entire coast.');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(5,'ES_ES','El transporte lo recoge de su hotel y lo lleva a la hermosa playa de Cumbuco que llama la atención por los inmensos y hermosos cerros de arena que se ven a lo largo de toda su costa.');
--plan tour short description
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(5,'PT_BR','Muito próxima de Fortaleza, a Praia do Cumbuco chama a atenção pelos imensos e lindos morros de areia que são avistados por toda a sua costa.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(5,'EN_USA','Very close to Fortaleza, Praia do Cumbuco draws attention to the immense and beautiful sand hills that are sighted all along its coast.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(5,'ES_ES','Muy cerca de Fortaleza, la playa de Cumbuco llama la atención por las inmensas y hermosas colinas de arena que se ven a lo largo de su costa.');
--Imagens
insert into tour_option_images(tour_option_id,image_path) values (5,'http://petmooby.com.br:12569/files/fortaleza/cumbuco/FT1.jpg');
insert into tour_option_images(tour_option_id,image_path) values (5,'http://petmooby.com.br:12569/files/fortaleza/cumbuco/FT2.jpg');
insert into tour_option_images(tour_option_id,image_path) values (5,'http://petmooby.com.br:12569/files/fortaleza/cumbuco/FT3.jpg');
insert into tour_option_images(tour_option_id,image_path) values (5,'http://petmooby.com.br:12569/files/fortaleza/cumbuco/FT4.jpg');
insert into tour_option_images(tour_option_id,image_path) values (5,'http://petmooby.com.br:12569/files/fortaleza/cumbuco/FT5.jpg');
insert into tour_option_images(tour_option_id,image_path) values (5,'http://petmooby.com.br:12569/files/fortaleza/cumbuco/FT6.jpg');


--Tour Option Lagoinha
select * from tour_option
insert into tour_option(description,name,value,id_location,profile_url) values ('Do not use this description','Lagoinha',300,3,'http://petmooby.com.br:12569/files/fortaleza/lagoinha/principal.jpg')
--Plan tour description
--update tour_option set profile_url = 'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/principal.png' where id = 2
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(6,'PT_BR','Transporte lhe pega no seu hotel e lhe leva para conhecer a linda Praia de lagoinha que é conhecida por ter inúmera lagoas de água doce, além de possuir dunas, coqueiros, lagoas e falésias.');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(6,'EN_USA','Transportation takes you to your hotel and takes you to see the beautiful Lagoinha Beach which is known for having numerous freshwater lagoons, besides having dunes, coconut trees, lagoons and cliffs.');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(6,'ES_ES','El transporte lo recoge en su hotel y lo lleva a conocer la hermosa playa de Lagoinha que es conocida por tener innumerables lagunas de agua dulce, además de tener dunas, cocoteros, lagunas y acantilados.');
--plan tour short description
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(6,'PT_BR','Conhecida por ter inúmera lagoas de água doce, além de possuir dunas, coqueiros, lagoas e falésias.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(6,'EN_USA','Known for having numerous freshwater lagoons, besides possessing dunes, coconut trees, lagoons and cliffs.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(6,'ES_ES','Conocida por tener innumerables lagunas de agua dulce, además de tener dunas, cocoteros, lagunas y acantilados.');
--Imagens
insert into tour_option_images(tour_option_id,image_path) values (6,'http://petmooby.com.br:12569/files/fortaleza/lagoinha/FT1.jpg');
insert into tour_option_images(tour_option_id,image_path) values (6,'http://petmooby.com.br:12569/files/fortaleza/lagoinha/FT2.jpg');
insert into tour_option_images(tour_option_id,image_path) values (6,'http://petmooby.com.br:12569/files/fortaleza/lagoinha/FT3.jpg');
insert into tour_option_images(tour_option_id,image_path) values (6,'http://petmooby.com.br:12569/files/fortaleza/lagoinha/FT4.jpg');
insert into tour_option_images(tour_option_id,image_path) values (6,'http://petmooby.com.br:12569/files/fortaleza/lagoinha/FT5.jpg');
insert into tour_option_images(tour_option_id,image_path) values (6,'http://petmooby.com.br:12569/files/fortaleza/lagoinha/FT6.jpg');


-->>>>>>> Jericoacoara  <<<<--
--Location
insert into location (name,photo_profile,id_sub_country,description) values ('Jericoacoara','http://petmooby.com.br:12569/files/jeri/transfer-for-jeri.png',1,'Do not use this description')
--update location set name = 'Cumbuco' where id = 2
insert into location_description(location_id, descriptionlanguage_key, value) values(4,'PT_BR','Jericoacoara é uma vila de pescadores incrivelmente linda.Em 2014, foi eleita pelo Huffington Post a quarta melhor praia da Terra.');
insert into location_description(location_id, descriptionlanguage_key, value) values(4,'EN_USA','Jericoacoara is an incredibly beautiful fishing village. In 2014, it was voted by the Huffington Post to be the fourth best beach on Earth.');
insert into location_description(location_id, descriptionlanguage_key, value) values(4,'ES_ES','Jericoacoara. es un pueblo de pescadores increíblemente hermoso. En 2014, fue elegida como la cuarta mejor playa del mundo por el Huffington Post.');

--Tour Option Litoral Leste
select * from tour_option
insert into tour_option(description,name,value,id_location,profile_url) values ('Do not use this description','Litoral Leste',300,4,'http://petmooby.com.br:12569/files/jeri/litoralleste/principal.jpg')
--Plan tour description
--update tour_option set profile_url = 'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/principal.png' where id = 2
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(7,'PT_BR','Passeio por pontos turísticos do litoral leste de Jeri. Locais visitados:
-Árvore da Preguiça
-Praia do Preá
-Lagoa Azul
-Lagoa do Paraíso
-Pedra Furada');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(7,'EN_USA','Sightseeing tour of the east coast of Jeri. Places visited:
-Árvore da Preguiça
-Praia do Preá
-Lagoa Azul
-Lagoa do Paraíso
-Pedra Furada
');

insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(7,'ES_ES','Paseo por los puntos turísticos de la costa este de Jeri. Locales visitados.
-Árvore da Preguiça
-Praia do Preá
-Lagoa Azul
-Lagoa do Paraíso
-Pedra Furada
');
--plan tour short description
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(7,'PT_BR','Passeio por pontos turísticos do litoral leste de Jeri.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(7,'EN_USA','Sightseeing tour of the east coast of Jeri.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(7,'ES_ES','Paseo por los puntos turísticos de la costa este de Jeri.');
--Imagens
insert into tour_option_images(tour_option_id,image_path) values (7,'http://petmooby.com.br:12569/files/jeri/litoralleste/FT1.jpg');
insert into tour_option_images(tour_option_id,image_path) values (7,'http://petmooby.com.br:12569/files/jeri/litoralleste/FT2.jpg');
insert into tour_option_images(tour_option_id,image_path) values (7,'http://petmooby.com.br:12569/files/jeri/litoralleste/FT3.jpg');
insert into tour_option_images(tour_option_id,image_path) values (7,'http://petmooby.com.br:12569/files/jeri/litoralleste/FT4.jpg');
insert into tour_option_images(tour_option_id,image_path) values (7,'http://petmooby.com.br:12569/files/jeri/litoralleste/FT5.jpg');
insert into tour_option_images(tour_option_id,image_path) values (7,'http://petmooby.com.br:12569/files/jeri/litoralleste/FT6.jpg');



--Tour Option Litoral Oeste
select * from tour_option
insert into tour_option(description,name,value,id_location,profile_url) values ('Do not use this description','Litoral Oeste',300,4,'http://petmooby.com.br:12569/files/jeri/litoraloeste/principal.jpg')
--Plan tour description
--update tour_option set profile_url = 'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/principal.png' where id = 2
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(8,'PT_BR','Passeio por pontos turísticos do litoral Oeste de Jeri. Locais visitados:
-Mangue Seco
-Dunas com Esquibunda
-Tatajuba 
-Passeio Ecológico Cavalo Marinho');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(8,'EN_USA','Sightseeing tour of the western coast of Jeri. Places visited:
-Mangue Seco
-Dunas com Esquibunda
-Tatajuba 
-Passeio Ecológico Cavalo Marinho
');

insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(8,'ES_ES','Paseos por la playa de Lagoinha, lagunas y alrededores.Locales visitados:
-Mangue Seco
-Dunas com Esquibunda
-Tatajuba 
-Passeio Ecológico Cavalo Marinho
');
--plan tour short description
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(8,'PT_BR','Passeio por pontos turísticos do litoral Oeste de Jeri.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(8,'EN_USA','Sightseeing tour of the western coast of Jeri.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(8,'ES_ES','Paseo por los puntos turísticos de la costa oeste de Jeri.');
--Imagens
insert into tour_option_images(tour_option_id,image_path) values (8,'http://petmooby.com.br:12569/files/jeri/litoraloeste/FT1.jpg');
insert into tour_option_images(tour_option_id,image_path) values (8,'http://petmooby.com.br:12569/files/jeri/litoraloeste/FT2.jpg');
insert into tour_option_images(tour_option_id,image_path) values (8,'http://petmooby.com.br:12569/files/jeri/litoraloeste/FT3.jpg');
insert into tour_option_images(tour_option_id,image_path) values (8,'http://petmooby.com.br:12569/files/jeri/litoraloeste/FT4.jpg');
insert into tour_option_images(tour_option_id,image_path) values (8,'http://petmooby.com.br:12569/files/jeri/litoraloeste/FT5.jpg');
insert into tour_option_images(tour_option_id,image_path) values (8,'http://petmooby.com.br:12569/files/jeri/litoraloeste/FT6.jpg');


-->>>>>>> Lagoinha  <<<<--
--Location
insert into location (name,photo_profile,id_sub_country,description) values ('Lagoinha','http://petmooby.com.br:12569/files/lagoinha/lagoinha.png',1,'Do not use this description')
--update location set photo_profile = 'http://petmooby.com.br:12569/files/lagoinha/lagoinha.jpg' where id = 5
insert into location_description(location_id, descriptionlanguage_key, value) values(5,'PT_BR','Conhecida por ter inúmera lagoas de água doce, além de possuir dunas, coqueiros, lagoas e falésias.');
insert into location_description(location_id, descriptionlanguage_key, value) values(5,'EN_USA','Known for having numerous freshwater lagoons, besides possessing dunes, coconut trees, lagoons and cliffs.');
insert into location_description(location_id, descriptionlanguage_key, value) values(5,'ES_ES','Lagoinha. Conocido por tener innumerables lagunas de agua dulce, además de tener dunas, cocoteros, lagunas y acantilados.');

--Tour Option Litoral Leste
select * from tour_option
insert into tour_option(description,name,value,id_location,profile_url) values ('Do not use this description','Lagoa das Almécegas e Praias',300,5,'http://petmooby.com.br:12569/files/jeri/litoraloeste/principal.jpg')
--Plan tour description
--update tour_option set profile_url = 'http://petmooby.com.br:12569/files/cumbuco/lagoadobanana/principal.png' where id = 9
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(9,'PT_BR','Passeio pela praia de lagoinha, lagoas e proximidades. Com paradas para banho e passeio de catamarã(Pequena Embarcação).
Locais visitados:
-Dunas
-Lagoa das Almécegas 
-Lagoa do jegue
-Passeio de catamarã(Pequena embarção)
-City Tour');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(9,'EN_USA','Lagoinha beach tour, lagoons and surroundings. With stops for bath and catamaran ride (Small Vessel). Places visited:
-Dunas
-Lagoa das Almécegas 
-Lagoa do jegue
-Passeio de catamarã(Pequena embarção)
-City Tour
');
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values(9,'ES_ES','Paseos por la playa de Lagoinha, lagunas y alrededores.  Con paradas para bañarse y paseo en caramarã (barco pequeño).Locales visitados:
-Dunas
-Lagoa das Almécegas 
-Lagoa do jegue
-Passeio de catamarã(Pequena embarção)
-City Tour
');
--plan tour short description
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(9,'PT_BR','Passeio pela praia de Lagoinha, lagoas e proximidades.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(9,'EN_USA','Lagoinha beach tour, lagoons and surroundings.');
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(9,'ES_ES','Paseos por la playa de Lagoinha, lagunas y alrededores.');
--Imagens
insert into tour_option_images(tour_option_id,image_path) values (9,'http://petmooby.com.br:12569/files/lagoinha/lagoadasalmecegas/FT1.jpg');
insert into tour_option_images(tour_option_id,image_path) values (9,'http://petmooby.com.br:12569/files/lagoinha/lagoadasalmecegas/FT2.jpg');
insert into tour_option_images(tour_option_id,image_path) values (9,'http://petmooby.com.br:12569/files/lagoinha/lagoadasalmecegas/FT3.jpg');
insert into tour_option_images(tour_option_id,image_path) values (9,'http://petmooby.com.br:12569/files/lagoinha/lagoadasalmecegas/FT4.jpg');
insert into tour_option_images(tour_option_id,image_path) values (9,'http://petmooby.com.br:12569/files/lagoinha/lagoadasalmecegas/FT5.jpg');
insert into tour_option_images(tour_option_id,image_path) values (9,'http://petmooby.com.br:12569/files/lagoinha/lagoadasalmecegas/FT6.jpg');


select * from grouping
insert into grouping(code_principal,name,stateid,telephone_principal,id_location) values (85,'Enseada Turismo','08067903000100',32191999,null)

select * from driver
insert into driver(country_register,name,birth_date,id_group,id_user,type_of_driver) values('0000000000','Ônibus 1806 - Fortaleza','1985-02-01',1,null,1);

select * from car
insert into car(car_identity,color,fl_external_equip,model,nr_seats,status,type_car,id_driver,photo) values('JJK-2000','Amarelo com Azul','t','Ônibus 2 andares',45,0,0,1,'http://petmooby.com.br:12569/files/enseada_agency.png');
--insert into driver(id,country_register,name,birth_date,id_group,id_user) values(2,'15284596578','Beltrano',19850201,1,2);
--insert into driver(id,country_register,name,birth_date,id_group,id_user) values(3,'15284596578','Cicrano Pinto',19850212,1,3);

select * from parameters
update parameters set valor = 'http://petmooby.com.br:12569' where chave = 1

--Feito para inserir os usuarios
select * from usuario

insert into usuario(email,password) values ('rafasystec@yahoo.com.br','123456');
insert into usuario(email,password) values ('bruno_salmito@hotmail.com','123456');


select * from grouping
insert into grouping(code_principal,name,stateid,telephone_principal,id_location) values (85,'Cooperativa do Cumbuco','08067903000100',32191999,2);


select * from driver
insert into driver(country_register,name,birth_date,id_group,id_user,type_of_driver,phone,whatsapp,ddd) values('047.599.598-03','Bruno Ponte','1985-02-01',2,2,0,5585987698064,5585987698064,85);
insert into driver(country_register,name,birth_date,id_group,id_user,type_of_driver) values('034.039.033-62','Antony Rocha','1985-02-06',2,1,0,5585981405021,5585985635021,85);


insert into car(car_identity,color,fl_external_equip,model,nr_seats,status,type_car,id_driver,photo,always_on_map) values('JJL-2000','BLACK','t','Hilux',7,1,0,2,null,true);
insert into car(car_identity,color,fl_external_equip,model,nr_seats,status,type_car,id_driver,photo,always_on_map) values('HOO-7556','YELLOW','t','Buggy',4,1,1,3,null,true);

insert into coordinate_car (dt_last_update,latitude,longitude,id_car) values (current_timestamp,0,0,2);
insert into coordinate_car (dt_last_update,latitude,longitude,id_car) values (current_timestamp,0,0,3);

