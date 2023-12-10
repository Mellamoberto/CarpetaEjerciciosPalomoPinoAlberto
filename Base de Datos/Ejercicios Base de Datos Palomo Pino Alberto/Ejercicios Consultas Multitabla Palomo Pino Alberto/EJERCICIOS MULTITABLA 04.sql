USE tienda;

-- Ejercicio 1
SELECT *
FROM fabricante AS f
LEFT JOIN producto AS p ON f.codigo = p.codigo_fabricante;

-- Ejercicio 2
SELECT *
FROM fabricante AS f
LEFT JOIN producto AS p ON f.codigo = p.codigo_fabricante
WHERE p.codigo_fabricante IS NULL;

USE empleados;

-- Ejercicio 1
SELECT *
FROM empleado AS e
LEFT JOIN departamento AS d ON e.codigo_departamento = d.codigo;

-- Ejercicio 2
SELECT *
FROM empleado AS e
LEFT JOIN departamento AS d ON e.codigo_departamento = d.codigo
WHERE e.codigo_departamento IS NULL;

-- Ejercicio 3
SELECT *
FROM departamento AS d
LEFT JOIN empleado AS e ON d.codigo = e.codigo_departamento
WHERE e.codigo_departamento IS NULL;

-- Ejercicio 4
SELECT *
FROM empleado
LEFT JOIN departamento ON empleado.codigo_departamento = departamento.codigo
UNION
SELECT * FROM empleado RIGHT JOIN departamento ON empleado.codigo_departamento = departamento.codigo
ORDER BY 8;

-- Ejercicio 5
SELECT *
FROM empleado
RIGHT JOIN departamento ON empleado.codigo_departamento = departamento.codigo
WHERE empleado.codigo_departamento IS NULL
UNION
SELECT *
FROM empleado
LEFT JOIN departamento ON empleado.codigo_departamento = departamento.codigo
WHERE departamento.nombre IS NULL 
ORDER BY 8;