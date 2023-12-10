USE tienda;

-- Ej 1
SELECT *
FROM producto
WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo');

-- Ej 2
SELECT *
FROM producto
WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante =
(SELECT codigo FROM fabricante WHERE nombre = 'Lenovo'));

-- Ej 3
SELECT nombre FROM producto WHERE codigo_fabricante = (SELECT codigo FROM
fabricante WHERE nombre = 'Lenovo') AND precio = (SELECT MAX(precio) FROM producto
WHERE codigo_fabricante = producto.codigo_fabricante);

-- Ej 4
SELECT nombre FROM producto WHERE codigo_fabricante = (SELECT codigo FROM
fabricante WHERE nombre = 'Hewlett-Packard') AND precio = (SELECT MIN(precio) FROM
producto WHERE codigo_fabricante = producto.codigo_fabricante);

-- Ej 5
SELECT nombre FROM producto WHERE precio >= (SELECT MAX(precio) FROM
producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre =
'Lenovo'));

-- Ej 6
SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante 
WHERE nombre = 'Asus') AND precio > (SELECT AVG(precio) FROM producto
WHERE codigo_fabricante = p.codigo_fabricante);