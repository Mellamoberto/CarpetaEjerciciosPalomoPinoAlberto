USE empleados;

-- Ej 1
SELECT * FROM empleado 
JOIN departamento 
ON empleado.codigo_departamento = departamento.codigo;

-- Ej 2
SELECT * FROM empleado JOIN departamento 
ON empleado.codigo_departamento = departamento.codigo 
ORDER BY departamento.nombre, apellido1, apellido2, empleado.nombre;

-- Ej 3
SELECT departamento.codigo, departamento.nombre 
FROM empleado JOIN departamento
ON empleado.codigo_departamento = departamento.codigo;

-- Ej 4
SELECT departamento.codigo, departamento.nombre, abs(presupuesto-gastos) AS Presupuesto_Total
FROM empleado JOIN departamento
ON empleado.codigo_departamento = departamento.codigo
GROUP BY departamento.codigo, departamento.nombre;

-- Ej 5
SELECT departamento.nombre AS nombre_departamento
FROM empleado
JOIN departamento ON empleado.codigo_departamento = departamento.codigo
WHERE empleado.nif = '38382980M';

-- Ej 6
SELECT departamento.nombre AS nombre_departamento
FROM empleado
JOIN departamento ON empleado.codigo_departamento = departamento.codigo
WHERE empleado.nombre = 'Pepe';


-- Ej 7
SELECT *
FROM empleado
JOIN departamento ON empleado.codigo_departamento = departamento.codigo
WHERE departamento.nombre = 'I+D'
ORDER BY empleado.nombre, empleado.apellido1, empleado.apellido2;

-- Ej 8
SELECT *
FROM empleado
JOIN departamento ON empleado.codigo_departamento = departamento.codigo
WHERE departamento.nombre = 'Sistemas' or departamento.nombre = 'Contabilidad' or departamento.nombre = 'I+D'
ORDER BY empleado.nombre, empleado.apellido1, empleado.apellido2;

-- Ej 9
SELECT empleado.nombre AS nombre_empleado
FROM empleado
JOIN departamento ON empleado.codigo_departamento = departamento.codigo
WHERE departamento.presupuesto < 100000 OR departamento.presupuesto > 200000;

-- Ej 10
SELECT DISTINCT departamento.nombre AS nombre_departamento
FROM empleado
JOIN departamento ON empleado.codigo_departamento = departamento.codigo
WHERE empleado.apellido2 IS NULL; 