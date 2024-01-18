DROP DATABASE IF EXISTS giftland;
CREATE DATABASE giftland CHARACTER SET utf8mb4;
USE giftland;

CREATE TABLE producto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2),
    fabricante VARCHAR(50),
    unidades INT
);

INSERT INTO producto VALUES(1, 'Asterix y Obelix en Hispania', 'Un emocionante libro para los amantes de la lectura.', 29.99, 'Editorial ABC', 50);
INSERT INTO producto VALUES(2, 'Dune', 'El mejor libro de Ciencia Ficción', 15.50, 'Editorial Marvel', 100);
INSERT INTO producto VALUES(3, 'Illiada', 'Un clásico para regalar', 50.00, 'Editorial Homero', 30);
INSERT INTO producto VALUES(4, 'Juego la batalla del Abismo de Helm', 'Juego de estrategia para divertirse en familia.', 39.99, 'Juegos Divertidos S.L.', 20);