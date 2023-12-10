USE empleados;

-- Ej 1
SELECT DISTINCT e.codigo, e.nombre, e.apellido1, e.apellido2
FROM empleado e
WHERE e.codigo_departamento IS NOT NULL
ORDER BY e.apellido1, e.apellido2, e.nombre;

-- Ej 2
SELECT *
FROM empleado e
LEFT JOIN departamento d ON e.codigo_departamento = d.codigo
ORDER BY e.apellido1, e.apellido2, e.nombre;

-- Ejercicio 3
SELECT *
FROM departamento d
LEFT JOIN empleado e ON d.codigo = e.codigo_departamento
ORDER BY d.nombre, e.apellido1, e.apellido2, e.nombre;

-- Ejercicio 4
SELECT *
FROM departamento d
LEFT JOIN empleado e ON d.codigo = e.codigo_departamento
ORDER BY d.nombre, e.apellido1, e.apellido2, e.nombre;

-- Ejercicio 5
SELECT *
FROM empleado e
JOIN departamento d ON e.codigo_departamento = d.codigo
WHERE d.presupuesto BETWEEN 50000 AND 200000
ORDER BY e.apellido1, e.apellido2, e.nombre;

-- Ejercicio 6
SELECT e.nombre, e.apellido1, e.apellido2
FROM empleado e
WHERE e.codigo_departamento IS NULL
ORDER BY e.apellido1, e.apellido2, e.nombre;

-- Ejercicio 7
SELECT d.nombre
FROM departamento d
LEFT JOIN empleado e ON d.codigo = e.codigo_departamento
WHERE e.codigo_departamento IS NULL
ORDER BY d.nombre;

-- Ej 1
SELECT *
FROM cliente AS c
LEFT JOIN pedido AS p ON c.id = p.id_cliente
ORDER BY c.apellido1, c.apellido2, c.nombre;

-- Ej 2
SELECT *
FROM comercial co
LEFT JOIN pedido p ON co.codigo = p.codigo_comercial
ORDER BY co.apellido1, co.apellido2, co.nombre;

-- Ej 3
SELECT *
FROM cliente c
LEFT JOIN pedido p ON c.codigo = p.codigo_cliente
WHERE p.codigo IS NULL;

-- Ej 4
SELECT *
FROM comercial co
LEFT JOIN pedido p ON co.codigo = p.codigo_comercial
WHERE p.codigo IS NULL;

-- Ej 5
SELECT *
FROM cliente c
LEFT JOIN pedido p ON c.codigo = p.codigo_cliente
WHERE p.codigo IS NULL
UNION
SELECT co.*
FROM comercial co
LEFT JOIN pedido p ON co.codigo = p.codigo_comercial
WHERE p.codigo IS NULL
ORDER BY apellido1, apellido2, nombre;



