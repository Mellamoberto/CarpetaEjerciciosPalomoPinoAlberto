USE jardineria;

-- Ejercicio 1
SELECT codigo_oficina, ciudad
FROM oficina;

-- Ejercicio 2
SELECT ciudad, telefono
FROM oficina
WHERE pais = 'España';

-- Ejercicio 3
SELECT nombre, apellido1, apellido2, email
FROM empleado
WHERE codigo_jefe = 7;

-- Ejercicio 4
SELECT p.nombre AS nombre_puesto, e.nombre, e.apellido1, e.apellido2, e.email
FROM empleado AS e
JOIN empleado AS p ON e.codigo_jefe = p.codigo_empleado
WHERE e.codigo_empleado = 1; -- Considerando que el jefe de la empresa tiene el código 1

-- Ejercicio 5
SELECT nombre, apellido1, apellido2, puesto
FROM empleado
WHERE puesto != 'Representante de ventas';

-- Ejercicio 6
SELECT nombre_cliente, apellido_contacto
FROM cliente
WHERE pais = 'España';

-- Ejercicio 7
SELECT DISTINCT estado
FROM pedido;

-- Ejercicio 8 (Utilizando la función YEAR)
SELECT DISTINCT codigo_cliente
FROM pago
WHERE YEAR(fecha_pago) = 2008;

-- Ejercicio 8 (Utilizando la función DATE_FORMAT)
SELECT DISTINCT codigo_cliente
FROM pago
WHERE DATE_FORMAT(fecha_pago, '%Y') = '2008';

-- Ejercicio 8 (Sin utilizar funciones)
SELECT DISTINCT p1.codigo_cliente
FROM pago AS p1
WHERE EXISTS (
    SELECT 1
    FROM pago AS p2
    WHERE p1.codigo_cliente = p2.codigo_cliente AND p2.fecha_pago >= '2008-01-01' AND p2.fecha_pago < '2009-01-01'
);

-- Ejercicio 9
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
FROM pedido
WHERE fecha_entrega > fecha_esperada;

-- Ejercicio 10 (Utilizando la función ADDDATE)
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
FROM pedido
WHERE ADDDATE(fecha_entrega, -2) <= fecha_esperada;

-- Ejercicio 10 (Utilizando la función DATEDIFF)
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
FROM pedido
WHERE DATEDIFF(fecha_entrega, fecha_esperada) >= 2;

-- Ejercicio 11
SELECT *
FROM pedido
WHERE estado = 'Rechazado' AND YEAR(fecha_pedido) = 2009;

-- Ejercicio 12
SELECT *
FROM pedido
WHERE MONTH(fecha_entrega) = 1;

-- Ejercicio 13
SELECT *
FROM pago
WHERE YEAR(fecha_pago) = 2008 AND forma_pago = 'PayPal'
ORDER BY total DESC;

-- Ejercicio 14
SELECT DISTINCT forma_pago
FROM pago;

-- Ejercicio 15
SELECT *
FROM producto
WHERE gama = 'Ornamentales' AND cantidad_en_stock > 100
ORDER BY precio_venta DESC;

-- Ejercicio 16
SELECT *
FROM cliente
WHERE ciudad = 'Madrid' AND (codigo_empleado_rep_ventas = 11 OR codigo_empleado_rep_ventas = 30);