DROP DATABASE IF EXISTS empresa1;
CREATE DATABASE IF NOT EXISTS empresa1;
USE empresa1;


CREATE TABLE contabilidad (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    salario DECIMAL(10, 2)
);


CREATE TABLE informatica (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    puesto VARCHAR(50)
);


CREATE TABLE administracion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    departamento VARCHAR(50)
);

