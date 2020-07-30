


/*
-Nome do passeio : PASSEIO LADO LESTE
-Descrição Resumida com até 80 caracteres 
 
PT

Está preparado para ver as lagoas mais lindas do mundo? È isso ai. O passeio do litoral leste e recheado de paisagens e muita natureza selvagem. Lagoas de água cristalina e muita areia fazem esse passeio ser o mais procurado de Jericoacoara 
	
EN
	 Are you ready to see the most beautiful lagoons in the world? That's it. The tour of the east coast is full of landscapes and lots of wild nature. Lagoons with crystal clear water and lots of sand make this tour the most sought after in Jericoacoara
	
ES
	¿Estás listo para ver las lagunas más bellas del mundo? Es eso. El recorrido por la costa este está lleno de paisajes y mucha naturaleza salvaje. Las lagunas con agua cristalina y mucha arena hacen de este recorrido el más buscado en Jericoacoara

*/


Locations 

id	   name
1 Canoa Quebrada
2 Cumbuco
3 Fortaleza
4 Jericoacoara
5 Lagoinha
//-----------------------------------------------
//Insert for PASSEIO LADO LESTE
//-----------------------------------------------

select * from tour_option 

-- Id = 10
insert into tour_option(description,name,value,id_location,profile_url) values 
('Do not use this description','Passeio Lado Leste',300,4,'http://petmooby.com.br:12569/files/jeri/ladoleste/main.png');

update tour_option set profile_url = 'http://petmooby.com.br:12569/files/jeri/ladoleste/main.jpg' where id = 10

-- Short description - will appear on main screen
--PT
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(10,'PT_BR','Está preparado para ver as lagoas mais  lindas do mundo? É isso ai. O passeio do litoral leste e recheado de paisagens e muita natureza selvagem. Lagoas de água cristalina e muita areia fazem esse passeio ser o mais procurado de Jericoacoara.');
--US
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(10,'EN_USA','Are you ready to see the most beautiful lagoons in the world? That\'s it. The tour of the east coast is full of landscapes and lots of wild nature. Lagoons with crystal clear water and lots of sand make this tour the most sought after in Jericoacoara.');
--EN
insert into tour_option_short_description(touroption_id, shortdescriptionlanguage_key, value) values(10,'ES_ES','¿Estás listo para ver las lagunas más bellas del mundo? Es eso. El recorrido por la costa este está lleno de paisajes y mucha naturaleza salvaje. Las lagunas con agua cristalina y mucha arena hacen de este recorrido el más buscado en Jericoacoara');


/*

-Descrição completa com até 2000 caracteres (BR/ES/EN)
	BR
	Está preparado para ver as lagoas mais lindas do mundo? È isso ai. O passeio do litoral leste e recheado de paisagens e muita natureza selvagem. 
O Passeio começa logo cedo. Saindo da vila, adentramos no parque nacional rumo a praia do Preá, e logo no meio do caminho temos o primeiro ponto turístico, a arvore da preguiça. Ela leva esse nome devido à ação do vento intenso da região, ela cresceu empurrada pelo vento e logo deitou. 
A próxima  parada é a praia do Preá, uma vila de pescadores, que chama a atenção pelos bons ventos que há aqui. O kitesurfe é o forte da região e atrai gente do mundo inteiro para a prática do esporte. Já foi palco de finais de mundiais de kitesurfe. 
O buraco azul é nossa próxima parada. Um lugar excêntrico e recém-descoberto pelos nativos da região. Dentro de uma propriedade particular foi cavado o terreno para se obter terra e areia para a construção do aeroporto. Que no ano seguinte a região teve a maior cheia em dez anos. Como consequência de um solo argiloso, uma agua azul turquesa de brilhar os olhos, e ótimo para um mergulho e fotos incríveis. 
Partimos para o lado mais famoso desse passeio, considerado uma das praias de agua doces mais lindas do mundo, a lagoa do Paraíso leva esse nome, por você se sentir literalmente fora desse mundo. Suas redinhas  estrategicamente posicionadas dentro na agua, nos leva a perceber que o lugar faz jus ao nome. 
Depois que um almoço incrível na lagoa do paraíso, nós partimos para dentro do parque nacional mais uma vez. Dentre dunas de areia imensas e uma área completamente preservada, ha formações periódicas de lagoas sazonais, que aparecem na época de chuva e somem no verão cearense. A Lagoa do Amâncio é a maior delas, é um desenho incrível entre dunas e lagoas em um cenário inóspito. Perfeito para se desligar e fechar o passeio do litoral leste de Jericoacoara.

	EN
	Are you ready to see the most beautiful lagoons in the world? That's right. The tour of the east coast is full of landscapes and lots of wild nature.
The Tour starts early. Leaving the village, we enter the national park towards Praia do Preá, and just in the middle of the way we have the first tourist spot, the sloth tree. It takes its name due to the action of the region's intense wind, it grew pushed by the wind and soon lay down.
The next stop is Praia do Preá, a fishing village, which draws attention due to the good winds that are here. Kitesurfing is the strength of the region and attracts people from all over the world to practice the sport. It was the stage for the kitesurfing world finals.
The blue hole is our next stop. An eccentric place and recently discovered by the natives of the region. Inside a private property, the land was dug to obtain soil and sand for the construction of the airport. That the following year the region had the biggest flood in ten years. As a result of clayey soil, turquoise blue water that shines your eyes, it is great for diving and incredible photos.
We leave for the most famous side of this tour, considered one of the most beautiful freshwater beaches in the world, Lagoa do Paraíso takes its name, because you feel literally out of this world. The hammocks are strategically positioned in the water, makes us realize that the place lives up to its name.
After an incredible lunch at the lagoon of paradise, we set off into the national park once again. Among immense sand dunes and a completely preserved area, there are periodic formations of seasonal ponds, which appear during the rainy season and disappear in the summer of Ceará. The Amâncio Lagoon is the largest of them, it is an incredible design between dunes and lagoons in an inhospitable setting. Perfect to disconnect and close the tour of the east coast of Jericoacoara.

	
ES
	¿Estás listo para ver las lagunas más bellas del mundo? Es eso. El recorrido por la costa este está lleno de paisajes y mucha naturaleza salvaje.
El recorrido comienza temprano. Al salir del pueblo, ingresamos al parque nacional hacia Praia do Preá, y justo en el medio del camino tenemos el primer lugar turístico, el árbol perezoso. Toma su nombre debido a la acción del intenso viento de la región, creció empujado por el viento y pronto se acostó.
La siguiente parada es Praia do Preá, un pueblo de pescadores, que llama la atención debido a los buenos vientos que hay aquí. El kitesurf es la fuerza de la región y atrae a personas de todo el mundo para practicar el deporte. Fue el escenario de las finales mundiales de kitesurf.
El agujero azul es nuestra próxima parada. Un lugar excéntrico y recientemente descubierto por los nativos de la región. Dentro de una propiedad privada, se cavó el terreno para obtener tierra y arena para la construcción del aeropuerto. Que al año siguiente la región tuvo la mayor inundación en diez años. Como resultado del suelo arcilloso, el agua azul turquesa que brilla tus ojos, es ideal para bucear y tomar fotos increíbles.
Nos fuimos al lado más famoso de este recorrido, considerada una de las playas de agua dulce más bellas del mundo, Lagoa do Paraíso toma su nombre porque te sientes literalmente fuera de este mundo. Sus redes estratégicamente ubicadas en el agua, nos hacen darnos cuenta de que el lugar hace honor a su nombre.
Después de un almuerzo increíble en la laguna del paraíso, partimos nuevamente al parque nacional. Entre inmensas dunas de arena y un área completamente preservada, hay formaciones periódicas de lagunas estacionales, que aparecen durante la temporada de lluvias y desaparecen en el verano de Ceará. La laguna de Amâncio es la más grande de ellas, es un diseño increíble entre dunas y lagunas en un entorno inhóspito. Perfecto para desconectar y cerrar el recorrido por la costa este de Jericoacoara.


*/


select * from tour_option_description where touroption_id = 10
//PT
insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values
(10,'PT_BR','Está preparado para ver as lagoas mais lindas do mundo? È isso ai. O passeio do litoral leste e recheado de paisagens e muita natureza selvagem. 
O Passeio começa logo cedo. Saindo da vila, adentramos no parque nacional rumo a praia do Preá, e logo no meio do caminho temos o primeiro ponto turístico, a arvore da preguiça. Ela leva esse nome devido à ação do vento intenso da região, ela cresceu empurrada pelo vento e logo deitou. 
A próxima  parada é a praia do Preá, uma vila de pescadores, que chama a atenção pelos bons ventos que há aqui. O kitesurfe é o forte da região e atrai gente do mundo inteiro para a prática do esporte. Já foi palco de finais de mundiais de kitesurfe. 
O buraco azul é nossa próxima parada. Um lugar excêntrico e recém-descoberto pelos nativos da região. Dentro de uma propriedade particular foi cavado o terreno para se obter terra e areia para a construção do aeroporto. Que no ano seguinte a região teve a maior cheia em dez anos. Como consequência de um solo argiloso, uma agua azul turquesa de brilhar os olhos, e ótimo para um mergulho e fotos incríveis. 
Partimos para o lado mais famoso desse passeio, considerado uma das praias de agua doces mais lindas do mundo, a lagoa do Paraíso leva esse nome, por você se sentir literalmente fora desse mundo. Suas redinhas  estrategicamente posicionadas dentro na agua, nos leva a perceber que o lugar faz jus ao nome. 
Depois que um almoço incrível na lagoa do paraíso, nós partimos para dentro do parque nacional mais uma vez. Dentre dunas de areia imensas e uma área completamente preservada, ha formações periódicas de lagoas sazonais, que aparecem na época de chuva e somem no verão cearense. A Lagoa do Amâncio é a maior delas, é um desenho incrível entre dunas e lagoas em um cenário inóspito. Perfeito para se desligar e fechar o passeio do litoral leste de Jericoacoara.');

insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values
(10,'EN_USA','Are you ready to see the most beautiful lagoons in the world? That\'s right. The tour of the east coast is full of landscapes and lots of wild nature.
The Tour starts early. Leaving the village, we enter the national park towards Praia do Preá, and just in the middle of the way we have the first tourist spot, the sloth tree. It takes its name due to the action of the region\'s intense wind, it grew pushed by the wind and soon lay down.
The next stop is Praia do Preá, a fishing village, which draws attention due to the good winds that are here. Kitesurfing is the strength of the region and attracts people from all over the world to practice the sport. It was the stage for the kitesurfing world finals.
The blue hole is our next stop. An eccentric place and recently discovered by the natives of the region. Inside a private property, the land was dug to obtain soil and sand for the construction of the airport. That the following year the region had the biggest flood in ten years. As a result of clayey soil, turquoise blue water that shines your eyes, it is great for diving and incredible photos.
We leave for the most famous side of this tour, considered one of the most beautiful freshwater beaches in the world, Lagoa do Paraíso takes its name, because you feel literally out of this world. The hammocks are strategically positioned in the water, makes us realize that the place lives up to its name.
After an incredible lunch at the lagoon of paradise, we set off into the national park once again. Among immense sand dunes and a completely preserved area, there are periodic formations of seasonal ponds, which appear during the rainy season and disappear in the summer of Ceará. The Amâncio Lagoon is the largest of them, it is an incredible design between dunes and lagoons in an inhospitable setting. Perfect to disconnect and close the tour of the east coast of Jericoacoara.');


insert into tour_option_description(touroption_id, descriptionlanguage_key, value) values
(10,'ES_ES','¿Estás listo para ver las lagunas más bellas del mundo? Es eso. El recorrido por la costa este está lleno de paisajes y mucha naturaleza salvaje.
El recorrido comienza temprano. Al salir del pueblo, ingresamos al parque nacional hacia Praia do Preá, y justo en el medio del camino tenemos el primer lugar turístico, el árbol perezoso. Toma su nombre debido a la acción del intenso viento de la región, creció empujado por el viento y pronto se acostó.
La siguiente parada es Praia do Preá, un pueblo de pescadores, que llama la atención debido a los buenos vientos que hay aquí. El kitesurf es la fuerza de la región y atrae a personas de todo el mundo para practicar el deporte. Fue el escenario de las finales mundiales de kitesurf.
El agujero azul es nuestra próxima parada. Un lugar excéntrico y recientemente descubierto por los nativos de la región. Dentro de una propiedad privada, se cavó el terreno para obtener tierra y arena para la construcción del aeropuerto. Que al año siguiente la región tuvo la mayor inundación en diez años. Como resultado del suelo arcilloso, el agua azul turquesa que brilla tus ojos, es ideal para bucear y tomar fotos increíbles.
Nos fuimos al lado más famoso de este recorrido, considerada una de las playas de agua dulce más bellas del mundo, Lagoa do Paraíso toma su nombre porque te sientes literalmente fuera de este mundo. Sus redes estratégicamente ubicadas en el agua, nos hacen darnos cuenta de que el lugar hace honor a su nombre.
Después de un almuerzo increíble en la laguna del paraíso, partimos nuevamente al parque nacional. Entre inmensas dunas de arena y un área completamente preservada, hay formaciones periódicas de lagunas estacionales, que aparecen durante la temporada de lluvias y desaparecen en el verano de Ceará. La laguna de Amâncio es la más grande de ellas, es un diseño increíble entre dunas y lagunas en un entorno inhóspito. Perfecto para desconectar y cerrar el recorrido por la costa este de Jericoacoara.');


--Imagens
insert into tour_option_images(tour_option_id,image_path) values (10,'http://petmooby.com.br:12569/files/jeri/ladoleste/1_passeioleste.jpg');
insert into tour_option_images(tour_option_id,image_path) values (10,'http://petmooby.com.br:12569/files/jeri/ladoleste/2_passeioleste.jpg');
insert into tour_option_images(tour_option_id,image_path) values (10,'http://petmooby.com.br:12569/files/jeri/ladoleste/3_passeioleste.jpg');
insert into tour_option_images(tour_option_id,image_path) values (10,'http://petmooby.com.br:12569/files/jeri/ladoleste/4_passeioleste.jpg');
insert into tour_option_images(tour_option_id,image_path) values (10,'http://petmooby.com.br:12569/files/jeri/ladoleste/5_passeioleste.jpg');
insert into tour_option_images(tour_option_id,image_path) values (10,'http://petmooby.com.br:12569/files/jeri/ladoleste/6_passeioleste.jpg');









