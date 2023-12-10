USE instituto;


-- EJERCICIOS DE CONSULTAS SOBRE UNA TABLA 01


/*

-- Ej 1
select * from alumno where id = 1;

-- Ej 2
select * from alumno where teléfono =692735409;

-- Ej 3
select nombre from alumno where es_repetidor = ‘si’;

-- Ej 4
select nombre from alumno where es_repetidor = 'no';

-- Ej 5
select * from alumno where fecha_nacimiento <= '1993/01/01';

-- Ej 6
select * from alumno where fecha_nacimiento >= '1994/01/01';


-- Ej 7
select * from alumno where fecha_nacimiento >= '1994/01/01' and es_repetidor = 'no';


-- Ej 8
select * from alumno where fecha_nacimiento >= '1998/01/01' and fecha_nacimiento <=
'1998/12/31';

-- Ej 9
select * from alumno where fecha_nacimiento <= '1998/01/01' or fecha_nacimiento >=
'1998/12/31';

*/


/*
BETWEEN

select * from alumno where fecha_nacimiento between 1998/01/01 and 1998/05/31;

*/


/*
-- Operadores y Funciones

-- Ej 1
SELECT nombre,
REVERSE(nombre) AS nombre_al_reves
FROM alumno;

-- Ej 2
SELECT CONCAT(nombre, ' ', apellido1, ' ', apellido2) AS Nombre_Alumno,
REVERSE(CONCAT(nombre, ' ', apellido1, ' ', apellido2)) AS Nombre_Invertido
FROM alumno;

-- Ej 3
SELECT UPPER (CONCAT(nombre, ' ', apellido1, ' ', apellido2)) AS NOMBRE_MAYUSCULA,
LOWER (REVERSE(CONCAT(nombre, ' ', apellido1, ' ', apellido2))) AS Nombre_Minuscula
FROM alumno;

-- Ej 4
SELECT CONCAT(nombre, ' ', apellido1, ' ', apellido2) AS Nombre_Alumno,
LENGTH(CONCAT(nombre, apellido1, apellido2)) - 1 AS num_caracteres
FROM alumno;

-- Ej 5
SELECT CONCAT(nombre,' ', apellido1, ' ',apellido2) AS nombre, 
lower(CONCAT(nombre, '.',
apellido1, '@iescelia.org')) AS correo FROM alumno;

-- Ej 6
SELECT CONCAT(nombre,' ', apellido1,' ', apellido2) AS nombre, 
lower(CONCAT(nombre, '.',apellido1, '@iescelia.org')) AS correo, 
CONCAT(reverse(apellido2), RIGHT(year(fecha_nacimiento),3)) AS contraseña 
FROM alumno;
*/

-- FUNCIONES FECHA Y HORA

-- Ej1
/*
SELECT nombre, fecha_nacimiento,
DAY(fecha_nacimiento) AS Dia,
MONTH(fecha_nacimiento) AS Mes,
YEAR(fecha_nacimiento) AS Anho
FROM alumno;

-- Ej2
SELECT nombre, fecha_nacimiento,
DAYNAME (fecha_nacimiento) AS Nombre_Dia,
MONTHNAME (fecha_nacimiento) AS Nombre_Mes
FROM alumno;

-- Ej 3
SELECT fecha_nacimiento,
DATEDIFF(NOW(), fecha_nacimiento) AS dias
FROM alumno;

-- Ej 4
SELECT fecha_nacimiento,
TRUNCATE(DATEDIFF (NOW(), fecha_nacimiento)/365.25,0) AS dias
FROM alumno;
*/

