USE tienda;

SET SQL_SAFE_UPDATES = 0;

-- Ej 1
INSERT INTO fabricante VALUES (10, 'Apple');

-- Ej 2
INSERT INTO fabricante VALUES (null, 'BQ');

-- Ej 3
INSERT INTO producto VALUES (12, 'Iphone 11 PLUS', 950.10);

-- Ej 4
INSERT INTO producto(nombre, precio, codigo_fabricante) VALUES ('Iphone X', 775, 10);

-- Ej 5
CREATE TABLE `fabricante_producto` (
    `nombre_fabricante` VARCHAR(100) NOT NULL,
    `nombre_producto` VARCHAR(100) NOT NULL,
    `precio` DECIMAL(10, 2) DEFAULT NULL,
    PRIMARY KEY (`nombre_fabricante`, `nombre_producto`)
);
INSERT INTO fabricante_producto SELECT f.nombre, p.nombre, p.precio FROM fabricante f
JOIN producto p ON f.codigo = p.codigo_fabricante;

-- Ej 6
DELETE FROM fabricante WHERE nombre = 'Asus';

-- Ej 7
DELETE FROM fabricante WHERE nombre = 'Xiaomi';

-- Ej 8
UPDATE fabricante SET codigo = 20 WHERE nombre = 'Lenovo';

-- Ej 9
UPDATE fabricante SET codigo = 30 WHERE nombre = 'Huawei';

-- Ej 10
UPDATE producto SET precio = precio + 5;

-- Ej 11
DELETE FROM producto WHERE nombre LIKE '%impresora%' AND precio < 200;