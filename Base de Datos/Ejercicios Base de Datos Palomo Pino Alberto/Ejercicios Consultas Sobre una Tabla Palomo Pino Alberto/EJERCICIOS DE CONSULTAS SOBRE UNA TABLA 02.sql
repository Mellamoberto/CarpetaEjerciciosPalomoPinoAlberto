USE tienda;

-- Ej 1
SELECT nombre 
FROM producto;

-- Ej 2
SELECT nombre, precio 
FROM producto;

-- Ej 3
SHOW COLUMNS 
FROM producto;

-- Ej 4
SELECT nombre, precio, precio * 1.18 AS 'Dólares'
FROM producto;

-- Ej 5
SELECT nombre AS 'Nombre de producto', precio AS 'Euros', precio * 1.18 AS 'Dólares'
FROM producto;

-- Ej 6
SELECT UPPER(nombre) AS 'Nombre', precio 
FROM producto;

-- Ej 7
SELECT LOWER(nombre) AS 'Nombre', precio 
FROM producto;

-- Ej 8
SELECT nombre AS 'Fabricante', UPPER(SUBSTRING(nombre, 1, 2)) AS 'Dos Primeras Letras'
FROM fabricante;

-- Ej 9
SELECT nombre, ROUND(precio) AS 'Precio Redondeado' 
FROM producto;

-- Ej 10
SELECT nombre, TRUNCATE(precio, 0) AS 'Precio Sin Decimales' 
FROM producto;

-- Ej 11
SELECT DISTINCT codigo_fabricante 
FROM producto;

-- Ej 12
SELECT DISTINCT codigo_fabricante 
FROM producto 
WHERE codigo_fabricante IS NOT NULL;

-- Ej 13
SELECT nombre 
FROM fabricante 
ORDER BY nombre ASC;

-- Ej 14
SELECT nombre 
FROM fabricante 
ORDER BY nombre DESC;

-- Ej 15
SELECT nombre, precio 
FROM producto 
ORDER BY nombre ASC, precio DESC;

-- Ej 16
SELECT * 
FROM fabricante LIMIT 5;

-- Ej 17
SELECT * 
FROM fabricante LIMIT 2 OFFSET 3;

-- Ej 18
SELECT nombre, precio 
FROM producto 
ORDER BY precio LIMIT 1;

-- Ej 19
SELECT nombre, precio 
FROM producto 
ORDER BY precio DESC LIMIT 1;

-- Ej 20
SELECT nombre 
FROM producto 
WHERE codigo_fabricante = 2;

-- Ej 21
SELECT nombre 
FROM producto 
WHERE precio <= 120;

-- Ej 22
SELECT nombre 
FROM producto 
WHERE precio >= 400;

-- Ej 23
SELECT nombre 
FROM producto 
WHERE precio < 400;

-- Ej 24
SELECT * 
FROM producto 
WHERE precio >= 80 AND precio <= 300;

-- Ej 25
SELECT * 
FROM producto 
WHERE precio BETWEEN 60 AND 200;

-- Ej 26
SELECT * 
FROM producto 
WHERE precio > 200 AND codigo_fabricante = 6;

-- Ej 27
SELECT * 
FROM producto 
WHERE codigo_fabricante = 1 OR codigo_fabricante = 3 OR codigo_fabricante = 5;

-- Ej 28
SELECT * 
FROM producto 
WHERE codigo_fabricante IN (1, 3, 5);

-- Ej 29
SELECT nombre, precio, precio * 100 AS 'Céntimos' 
FROM producto;

-- Ej 30
SELECT nombre 
FROM fabricante 
WHERE nombre LIKE 'S%';

-- Ej 31
SELECT nombre 
FROM fabricante 
WHERE nombre LIKE '%e';

-- Ej 32
SELECT nombre 
FROM fabricante 
WHERE nombre LIKE '%w%';

-- Ej 33
SELECT nombre 
FROM fabricante 
WHERE LENGTH(nombre) = 4;

-- Ej 34
SELECT nombre 
FROM producto 
WHERE nombre LIKE '%Portátil%';

-- Ej 35
SELECT nombre 
FROM producto 
WHERE nombre LIKE '%Monitor%' AND precio < 215;

-- Ej 36
SELECT nombre, precio
FROM producto
WHERE precio >= 180
ORDER BY precio DESC, nombre ASC;