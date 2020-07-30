


/*
-Nome do passeio : PASSEIO LADO OESTE
-Descrição Resumida com até 80 caracteres 

BR
Um passeio repleto de aventura, pelas dunas sentido Tatajuba. Toboga e tirolesa fazem parte do passeio magnifico que ainda conta com uma visita ao berço dos cavalos marinhos, o mangue seco onde se é cultivado o caranguejo. E um almoço maravilhoso no lago grande.

EN
A tour full of adventure, through the dunes towards Tatajuba. Toboga and zip lines are part of the magnificent tour that also includes a visit to the seahorse cradle, the dry mangrove where crab is grown. And a wonderful lunch at the big lake.

ES
Un recorrido lleno de aventura, a través de las dunas hacia Tatajuba. Toboga y tirolinas son parte del magnífico recorrido que también incluye una visita a la cuna del caballito de mar, el manglar seco donde se cultiva el cangrejo. Y un maravilloso almuerzo en el gran lago.


*/


Locations 

id	   name
1 Canoa Quebrada
2 Cumbuco
3 Fortaleza
4 Jericoacoara
5 Lagoinha
//-----------------------------------------------
//Insert for PASSEIO LADO OESTE
//-----------------------------------------------

select * from tour_option 

-- Id = 11
insert into tour_option(description,name,value,id_location,profile_url) values 
('Do not use this description','Passeio Lado Oeste',300,4,'http://petmooby.com.br:12569/files/jeri/ladooeste/principal_passeiooeste.jpg');

update tour_option set profile_url = 'http://petmooby.com.br:12569/files/jeri/ladoleste/main.jpg' where id = 11

-- Short description - will appear on main screen
--PT
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(11,'PT_BR','Um passeio repleto de aventura, pelas dunas sentido Tatajuba. Toboga e tirolesa fazem parte do passeio magnifico que ainda conta com uma visita ao berço dos cavalos marinhos, o mangue seco onde se é cultivado o caranguejo. E um almoço maravilhoso no lago grande.');
--US
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(11,'EN_USA','A tour full of adventure, through the dunes towards Tatajuba. Toboga and zip lines are part of the magnificent tour that also includes a visit to the seahorse cradle, the dry mangrove where crab is grown. And a wonderful lunch at the big lake.');
--EN
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(11,'ES_ES','Un recorrido lleno de aventura, a través de las dunas hacia Tatajuba. Toboga y tirolinas son parte del magnífico recorrido que también incluye una visita a la cuna del caballito de mar, el manglar seco donde se cultiva el cangrejo. Y un maravilloso almuerzo en el gran lago.');


/*

-Descrição completa com até 2000 caracteres (BR/ES/EN)
	Descrição completa com até 2000 caracteres (BR/ES/EN)
	BR
	Esse sem duvidas é um daqueles passeios que você ira lembrar para o resto da vida. 
Saída da vila ainda pela manhã, seguimos pela praia rumo a Tatajuba, porem no caminho parecemos por alguns lugares digno de cinema. 
A primeira parada é no mangue seco. Um distrito do município de Jijoca de Jericoacoara, a atividade econômica principal da região é da pesca do caranguejo vermelho do mangue. Sua arvores com raízes expostas dão ao lugar um cenário vistos em poucos lugares no mundo. Uma breve pausa para fotos e seguimos rumo ao passeio ecológico do cavalo marinho. Um passeio de barco no berço dos cavalos marinhos da região, adentrando a sua fauna e flora. 
Seguimos rumo a Tatajuba nosso destino final, atravessamos a balsa e embarcamos na aventura do sobe e desce de dunas, um verdadeiro mar de areia que com alguns quilômetros de distância surge lagoas de formações de chuva. E que contam com tobogãs e tirolesas, com uma queda certa na agua cristalina da lagoa. 
Junto com nosso destino final, o lago grande em Tatatuja. Um lago de cor verde esmeralda, perfeito para um banho maravilhoso, também conta com uma estrutura de restaurantes e quiosques. Um final de tarde em meio ao paraíso, assim fechamos o litoral oeste de Jericoacoara.	

EN
	This is undoubtedly one of those trips that you will remember for the rest of your life.
Leaving the village in the morning, we continue on the beach towards Tatajuba, however on the way we will see some of the  places worthy of cinema.
The first stop is at the dry mangrove. A district in the municipality of Jijoca de Jericoacoara, the main economic activity of the region is fishing for red crab from the mangrove. Its trees with exposed roots give the place a setting seen in few places in the world. A brief pause for photos and we continue towards the ecological seahorse tour. A boat ride in the region's seahorse cradle, entering its fauna and flora.
We continue on towards Tatajuba our final destination, cross the ferry and embark on the adventure of the dunes rising and falling, a true sea of ​​sand that with lagoons of rain formations appears a few kilometers away. And they have toboggans and zip lines, with a certain drop in the crystal clear water of the lagoon.
Along with our final destination, the large lake in Tatatuja. An emerald green lake, perfect for a wonderful bath, also has a structure of restaurants and kiosks. A late afternoon in the middle of paradise, so we closed the west coast of Jericoacoara.


	ES
	Este es sin duda uno de esos viajes que recordará por el resto de su vida.
Al salir del pueblo por la mañana, continuamos en la playa hacia Tatajuba, sin embargo, en el camino buscamos algunos lugares dignos de cine.
La primera parada es en el manglar seco. Un distrito en el municipio de Jijoca de Jericoacoara, la principal actividad económica de la región es la pesca de cangrejo rojo del manglar. Sus árboles con raíces expuestas le dan al lugar un escenario visto en pocos lugares del mundo. Una breve pausa para fotos y continuamos hacia el recorrido ecológico del caballito de mar. Un paseo en bote por la cuna de caballitos de mar de la región, entrando en su fauna y flora.
Continuamos hacia Tatajuba, nuestro destino final, cruzamos el ferry y nos embarcamos en la aventura de las dunas subiendo y bajando, un verdadero mar de arena que con lagunas de formaciones de lluvia aparece a pocos kilómetros de distancia. Y tienen toboganes y tirolinas, con una cierta caída en el agua cristalina de la laguna.
Junto con nuestro destino final, el gran lago en Tatatuja. Un lago verde esmeralda, perfecto para un baño maravilloso, también tiene una estructura de restaurantes y quioscos. Al final de la tarde en medio del paraíso, cerramos la costa oeste de Jericoacoara.


*/


select * from tour_option_description where touroption_id = 11
//PT
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values
(11,'PT_BR','Esse sem duvidas é um daqueles passeios que você ira lembrar para o resto da vida. 
Saída da vila ainda pela manhã, seguimos pela praia rumo a Tatajuba, porem no caminho parecemos por alguns lugares digno de cinema. 
A primeira parada é no mangue seco. Um distrito do município de Jijoca de Jericoacoara, a atividade econômica principal da região é da pesca do caranguejo vermelho do mangue. Sua arvores com raízes expostas dão ao lugar um cenário vistos em poucos lugares no mundo. Uma breve pausa para fotos e seguimos rumo ao passeio ecológico do cavalo marinho. Um passeio de barco no berço dos cavalos marinhos da região, adentrando a sua fauna e flora. 
Seguimos rumo a Tatajuba nosso destino final, atravessamos a balsa e embarcamos na aventura do sobe e desce de dunas, um verdadeiro mar de areia que com alguns quilômetros de distância surge lagoas de formações de chuva. E que contam com tobogãs e tirolesas, com uma queda certa na agua cristalina da lagoa. 
Junto com nosso destino final, o lago grande em Tatatuja. Um lago de cor verde esmeralda, perfeito para um banho maravilhoso, também conta com uma estrutura de restaurantes e quiosques. Um final de tarde em meio ao paraíso, assim fechamos o litoral oeste de Jericoacoara.');

insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values
(11,'EN_USA','This is undoubtedly one of those trips that you will remember for the rest of your life.
Leaving the village in the morning, we continue on the beach towards Tatajuba, however on the way we will see some of the  places worthy of cinema.
The first stop is at the dry mangrove. A district in the municipality of Jijoca de Jericoacoara, the main economic activity of the region is fishing for red crab from the mangrove. Its trees with exposed roots give the place a setting seen in few places in the world. A brief pause for photos and we continue towards the ecological seahorse tour. A boat ride in the region\'s seahorse cradle, entering its fauna and flora.
We continue on towards Tatajuba our final destination, cross the ferry and embark on the adventure of the dunes rising and falling, a true sea of ​​sand that with lagoons of rain formations appears a few kilometers away. And they have toboggans and zip lines, with a certain drop in the crystal clear water of the lagoon.
Along with our final destination, the large lake in Tatatuja. An emerald green lake, perfect for a wonderful bath, also has a structure of restaurants and kiosks. A late afternoon in the middle of paradise, so we closed the west coast of Jericoacoara.');


insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values
(11,'ES_ES','Este es sin duda uno de esos viajes que recordará por el resto de su vida.
Al salir del pueblo por la mañana, continuamos en la playa hacia Tatajuba, sin embargo, en el camino buscamos algunos lugares dignos de cine.
La primera parada es en el manglar seco. Un distrito en el municipio de Jijoca de Jericoacoara, la principal actividad económica de la región es la pesca de cangrejo rojo del manglar. Sus árboles con raíces expuestas le dan al lugar un escenario visto en pocos lugares del mundo. Una breve pausa para fotos y continuamos hacia el recorrido ecológico del caballito de mar. Un paseo en bote por la cuna de caballitos de mar de la región, entrando en su fauna y flora.
Continuamos hacia Tatajuba, nuestro destino final, cruzamos el ferry y nos embarcamos en la aventura de las dunas subiendo y bajando, un verdadero mar de arena que con lagunas de formaciones de lluvia aparece a pocos kilómetros de distancia. Y tienen toboganes y tirolinas, con una cierta caída en el agua cristalina de la laguna.
Junto con nuestro destino final, el gran lago en Tatatuja. Un lago verde esmeralda, perfecto para un baño maravilloso, también tiene una estructura de restaurantes y quioscos. Al final de la tarde en medio del paraíso, cerramos la costa oeste de Jericoacoara.');


--Imagens
insert into tour_option_images(tour_option_id,image_path) values (11,'http://petmooby.com.br:12569/files/jeri/ladooeste/1_passeiooeste.jpg');
insert into tour_option_images(tour_option_id,image_path) values (11,'http://petmooby.com.br:12569/files/jeri/ladooeste/2_passeiooeste.jpg');
insert into tour_option_images(tour_option_id,image_path) values (11,'http://petmooby.com.br:12569/files/jeri/ladooeste/3_passeiooeste.jpg');
insert into tour_option_images(tour_option_id,image_path) values (11,'http://petmooby.com.br:12569/files/jeri/ladooeste/4_passeiooeste.jpg');
insert into tour_option_images(tour_option_id,image_path) values (11,'http://petmooby.com.br:12569/files/jeri/ladooeste/5_passeiooeste.jpg');
insert into tour_option_images(tour_option_id,image_path) values (11,'http://petmooby.com.br:12569/files/jeri/ladooeste/6_passeiooeste.jpg');









