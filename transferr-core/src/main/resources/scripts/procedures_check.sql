SCRIPTS



SELECT * FROM TESTAR_QTD_CADASTRO_MOTORISTA(2,2)

CREATE OR REPLACE FUNCTION TESTAR_QTD_CADASTRO_MOTORISTA(grouping_id integer,quantidadeQueDeveTerCadastrada integer)
 RETURNS VARCHAR(50)  AS $$
 Declare
	qtdCadastradas integer;
BEGIN

	select INTO qtdCadastradas (
		select count(*)
		from grouping
			inner join driver on 
				driver.id_group = grouping.id 
		where grouping.id=grouping_id ) as qtd_cadastro	;

   IF qtdCadastradas <> quantidadeQueDeveTerCadastrada THEN
        RETURN 'Quantidade incorreta';
    ELSE
	RETURN 'Quantidade OK';
    END IF; 
END;
$$ LANGUAGE plpgsql

—————————————————————————————————


select * from VerificarErros(1)

CREATE OR REPLACE FUNCTION VerificarErros(grouping_id integer)
 RETURNS TABLE(associacao varchar(100),usuario_id bigint, usuario_email varchar(200),driver_name varchar(200) , car_identity varchar(200)
 ,usuario text,driver text,car text,coordinate_car text) AS $$
 Declare
	sql text;
BEGIN

	sql:='
select grouping.name as associacao,usuario.id, usuario.email,driver.name, car.car_identity,
(CASE WHEN usuario.id is not null THEN ''OK'' ELSE ''ERRO'' end )as usuario,
(CASE WHEN driver.id is not null THEN ''OK'' ELSE ''ERRO'' end )as driver,
(CASE WHEN car.id is not null THEN ''OK'' ELSE ''ERRO'' end )as car,
(CASE WHEN coordinate_car.id is not null THEN ''OK'' ELSE ''ERRO'' end )as coordinate_car
from grouping
inner join driver on 
    driver.id_group = grouping.id
left join usuario on 
    driver.id_user = usuario.id 
left join car on 
    car.id_driver = driver.id   
left join coordinate_car on 
    coordinate_car.id_car = car.id    

where grouping.id='||grouping_id||'
and ( (CASE WHEN usuario.id is not null THEN ''OK'' ELSE ''ERRO'' end ) <> ''OK''
or (CASE WHEN driver.id is not null THEN ''OK'' ELSE ''ERRO'' end ) <> ''OK''
or (CASE WHEN car.id is not null THEN ''OK'' ELSE ''ERRO'' end ) <> ''OK''
or (CASE WHEN coordinate_car.id is not null THEN ''OK'' ELSE ''ERRO'' end ) <> ''OK'')'	;

   RETURN QUERY EXECUTE sql;
END;
$$ LANGUAGE plpgsql



——————————————————————————————————————————————





-- ver onde está o problema
select grouping.name as associacao,usuario.id, usuario.email,driver.name, car.car_identity,
(CASE WHEN usuario.id is not null THEN 'OK' ELSE 'ERRO' end )as usuario,
(CASE WHEN driver.id is not null THEN 'OK' ELSE 'ERRO' end )as driver,
(CASE WHEN car.id is not null THEN 'OK' ELSE 'ERRO' end )as car,
(CASE WHEN coordinate_car.id is not null THEN 'OK' ELSE 'ERRO' end )as coordinate_car
from grouping
inner join driver on 
    driver.id_group = grouping.id
left join usuario on 
    driver.id_user = usuario.id 
left join car on 
    car.id_driver = driver.id   
left join coordinate_car on 
    coordinate_car.id_car = car.id    

where grouping.id=1 --  alterar para o id do grupo
and ( (CASE WHEN usuario.id is not null THEN 'OK' ELSE 'ERRO' end ) <> 'OK'
or (CASE WHEN driver.id is not null THEN 'OK' ELSE 'ERRO' end ) <> 'OK'
or (CASE WHEN car.id is not null THEN 'OK' ELSE 'ERRO' end ) <> 'OK'
or (CASE WHEN coordinate_car.id is not null THEN 'OK' ELSE 'ERRO' end ) <> 'OK')
