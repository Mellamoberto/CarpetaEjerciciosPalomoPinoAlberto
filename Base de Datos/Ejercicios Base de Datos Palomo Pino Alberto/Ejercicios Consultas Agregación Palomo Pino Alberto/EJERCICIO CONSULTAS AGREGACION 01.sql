USE tienda;

-- Ej 1
SELECT COUNT(*) AS Numero_Productos
FROM producto;

-- Ej 2
SELECT COUNT(*) AS Numero_Fabricantes
FROM fabricante;

-- Ej 3
SELECT COUNT(DISTINCT codigo_fabricante) AS codigos_fabricante
FROM producto;

-- Ej 4
SELECT ROUND(AVG(precio), 2) AS Precio_Medio
FROM producto;

-- Ej 5
SELECT MIN(precio) AS Precio_Minimo
FROM producto;

-- Ej 6
SELECT MAX(precio) AS Precio_Maximo
FROM producto;

-- Ej 7
SELECT nombre, precio
FROM producto
ORDER BY precio limit 1;

-- Ej 7 Alternativo
SELECT nombre, precio
FROM producto
WHERE precio = (SELECT MIN(precio) FROM producto);

-- Ej 8
SELECT nombre, precio
FROM producto
ORDER BY precio desc limit 1;

-- Ej 9
SELECT SUM(precio) AS Precio_Total_Productos
FROM producto;

-- Ej 10
SELECT COUNT(*)
FROM producto
JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE fabricante.nombre = 'Asus';

-- Ej 11
SELECT TRUNCATE(AVG(producto.precio), 2)
FROM producto
JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE fabricante.nombre = 'Asus';

-- Ej 12
SELECT MIN(precio)
FROM producto
JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE fabricante.nombre = 'Asus';

-- Ej 13
SELECT producto.nombre, MAX(precio)
FROM producto
JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE fabricante.nombre = 'Asus';

-- Ej 14
SELECT SUM(producto.precio) AS Precio_Total
FROM producto
JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE fabricante.nombre = 'Asus';

-- Ej 15
SELECT MAX(producto.precio), MIN(producto.precio), AVG(producto.precio), COUNT(*)
FROM producto
JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE fabricante.nombre = 'Crucial';

-- Ej 16
SELECT COUNT(producto.nombre), fabricante.nombre
FROM producto
RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
GROUP BY fabricante.nombre ORDER BY 1 DESC;

-- Ej 17
SELECT MAX(producto.precio), MIN(producto.precio), AVG(producto.precio), fabricante.nombre
FROM producto
RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
GROUP BY fabricante.nombre;

-- Ej 18
SELECT MAX(producto.precio), MIN(producto.precio), AVG(producto.precio),
COUNT(*), codigo_fabricante, fabricante.nombre
FROM producto
RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
GROUP BY codigo_fabricante HAVING AVG(precio)>200;

-- Ej 19
SELECT MAX(producto.precio), MIN(producto.precio), AVG(producto.precio),
COUNT(*), fabricante.nombre
FROM producto
RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
GROUP BY producto.codigo_fabricante HAVING AVG(precio)>200;

-- Ej 20
SELECT COUNT(*)
FROM producto
WHERE precio >= 180;

-- Ej 21
SELECT COUNT(*), codigo_fabricante 
FROM producto
WHERE precio >= 180
GROUP BY codigo_fabricante;

-- Ej 22
SELECT AVG(producto.precio), codigo_fabricante
FROM producto
GROUP BY codigo_fabricante;

-- Ej 23
SELECT AVG(producto.precio), fabricante.nombre
FROM producto
JOIN fabricante ON codigo_fabricante = fabricante.codigo
GROUP BY codigo_fabricante;

-- Ej 24
SELECT AVG(producto.precio), fabricante.nombre
FROM producto
JOIN fabricante ON codigo_fabricante = fabricante.codigo
GROUP BY producto.codigo_fabricante HAVING AVG(producto.precio)>150;

-- Ej 25
SELECT COUNT(*), fabricante.nombre
FROM producto
JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
GROUP BY producto.codigo_fabricante HAVING COUNT(*)>=2;

-- Ej 26
SELECT COUNT(*), fabricante.nombre
FROM producto
JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
WHERE producto.precio >= 220
GROUP BY producto.codigo_fabricante
ORDER BY 1 DESC;

-- Ej 27
SELECT fabricante.nombre, COUNT(DISTINCT producto.nombre)
FROM fabricante
LEFT JOIN producto ON fabricante.codigo = producto.codigo_fabricante
WHERE producto.precio >= 220 
GROUP BY fabricante.nombre
UNION
SELECT fabricante.nombre, 0
FROM fabricante
LEFT JOIN producto ON fabricante.codigo = producto.codigo_fabricante
WHERE fabricante.nombre NOT IN (SELECT fabricante.nombre FROM fabricante LEFT JOIN
producto ON fabricante.codigo = producto.codigo_fabricante WHERE producto.precio >= 220
GROUP BY fabricante.nombre) ORDER BY 2 DESC;

-- Ej 28
SELECT fabricante.nombre, SUM(producto.precio)
FROM fabricante
JOIN producto ON fabricante.codigo = producto.codigo_fabricante
GROUP BY fabricante.nombre HAVING SUM(producto.precio) > 1000;