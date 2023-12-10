USE empleados;

-- Ej 1
SELECT apellido1 
FROM empleado;

-- Ej 2
SELECT DISTINCT apellido1 
FROM empleado;

-- Ej 3
SHOW COLUMNS 
FROM empleado;

-- Ej 4
SELECT nombre, apellido1, apellido2 
FROM empleado;

-- Ej 5
SELECT codigo_departamento 
FROM empleado;

-- Ej 6
SELECT DISTINCT codigo_departamento 
FROM empleado 
WHERE codigo_departamento IS NOT NULL;

-- Ej 7
SELECT CONCAT(nombre, ' ', apellido1, ' ', IFNULL(apellido2, '')) AS 'Nombre Completo' 
FROM empleado;

-- Ej 8
SELECT UPPER(CONCAT(nombre, ' ', apellido1, ' ', IFNULL(apellido2, ''))) AS 'Nombre Completo en Mayúsculas' 
FROM empleado;

-- Ej 9
SELECT LOWER(CONCAT(nombre, ' ', apellido1, ' ', IFNULL(apellido2, ''))) AS 'Nombre Completo en Minúsculas' 
FROM empleado;

-- Ej 10
SELECT codigo, SUBSTRING(nif, 1, LENGTH(nif) - 1) AS 'NIF Numerico', 
RIGHT(nif, 1) AS 'Letra NIF' 
FROM empleado;

-- Ej 11
SELECT d.nombre AS 'Nombre Departamento', presupuesto - gastos AS 'Presupuesto Actual'
FROM departamento d;

-- Ej 12
SELECT nombre AS 'Nombre Departamento', presupuesto - gastos AS 'Presupuesto Actual'
FROM departamento 
ORDER BY 'Presupuesto Actual' ASC;

-- Ej 13
SELECT nombre 
FROM departamento 
ORDER BY nombre ASC;

-- Ej 14
SELECT nombre 
FROM departamento 
ORDER BY nombre DESC;

-- Ej 15
SELECT apellido1, apellido2, nombre 
FROM empleado 
ORDER BY apellido1 ASC, apellido2 ASC, nombre ASC;

-- Ej 16
SELECT nombre, presupuesto 
FROM departamento 
ORDER BY presupuesto DESC LIMIT 3;

-- Ej 17
SELECT nombre, presupuesto 
FROM departamento 
ORDER BY presupuesto ASC LIMIT 3;

-- Ej 18
SELECT nombre, gastos 
FROM departamento 
ORDER BY gastos DESC LIMIT 2;

-- Ej 19
SELECT nombre, gastos 
FROM departamento 
ORDER BY gastos ASC LIMIT 2;

-- Ej 20
SELECT * 
FROM empleado LIMIT 2, 5;

-- Ej 21
SELECT nombre, presupuesto 
FROM departamento 
WHERE presupuesto >= 150000;

-- Ej 22
SELECT nombre, gastos 
FROM departamento 
WHERE gastos < 5000;

-- Ej 23
SELECT nombre, presupuesto 
FROM departamento 
WHERE presupuesto >= 100000 AND presupuesto <= 200000;

-- Ej 24
SELECT nombre 
FROM departamento 
WHERE presupuesto < 100000 OR presupuesto > 200000;

-- Ej 25
SELECT nombre 
FROM departamento 
WHERE presupuesto BETWEEN 100000 AND 200000;

-- Ej 26
SELECT nombre 
FROM departamento 
WHERE NOT (presupuesto BETWEEN 100000 AND 200000);

-- Ej 27
SELECT nombre, gastos, presupuesto 
FROM departamento 
WHERE gastos > presupuesto;

-- Ej 28
SELECT nombre, gastos, presupuesto 
FROM departamento 
WHERE gastos < presupuesto;

-- Ej 29
SELECT nombre, gastos, presupuesto 
FROM departamento 
WHERE gastos = presupuesto;

-- Ej 30
SELECT * 
FROM empleado 
WHERE apellido2 IS NULL;

-- Ej 31
SELECT * 
FROM empleado 
WHERE apellido2 IS NOT NULL;

-- Ej 32
SELECT * 
FROM empleado 
WHERE apellido2 = 'López';

-- Ej 33
SELECT * 
FROM empleado 
WHERE apellido2 = 'Díaz' OR apellido2 = 'Moreno';

-- Ej 34
SELECT * 
FROM empleado 
WHERE apellido2 IN ('Díaz', 'Moreno');

-- Ej 35
SELECT nombre, apellido1, nif 
FROM empleado 
WHERE codigo_departamento = 3;

-- Ej 36
SELECT nombre, apellido1, nif 
FROM empleado 
WHERE codigo_departamento IN (2, 4, 5);