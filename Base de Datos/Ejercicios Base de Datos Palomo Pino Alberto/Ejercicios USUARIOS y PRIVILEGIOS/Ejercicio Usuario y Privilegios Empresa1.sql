-- Crear usuarios
CREATE USER 'contabilidad_Jefe'@'localhost' IDENTIFIED BY 'contrasena1';
CREATE USER 'contabilidad_administrativo'@'localhost' IDENTIFIED BY 'contrasena2';
CREATE USER 'contabilidad_becario'@'localhost' IDENTIFIED BY 'contrasena3';
CREATE USER 'informatica_admin'@'localhost' IDENTIFIED BY 'contrasena4';
CREATE USER 'informatico'@'localhost' IDENTIFIED BY 'contrasena5';
CREATE USER 'informatica_becario'@'localhost' IDENTIFIED BY 'contrasena6';
CREATE USER 'administracion_jefe'@'localhost' IDENTIFIED BY 'contrasena7';
CREATE USER 'administracion_administrativo'@'localhost' IDENTIFIED BY 'contrasena8';
CREATE USER 'administracion_becario'@'localhost' IDENTIFIED BY 'contrasena9';

-- Asignar permisos a usuarios
-- Usuario "contabilidad_Jefe"
GRANT ALL PRIVILEGES ON empresa1.contabilidad TO 'contabilidad_Jefe'@'localhost';

-- Usuario "contabilidad_administrativo"
GRANT SELECT, INSERT ON empresa1.contabilidad TO 'contabilidad_administrativo'@'localhost';

-- Usuario "contabilidad_becario"
GRANT SELECT ON empresa1.contabilidad TO 'contabilidad_becario'@'localhost';

-- Usuario "informatica_admin"
GRANT ALL PRIVILEGES ON empresa1.informatica TO 'informatica_admin'@'localhost';

-- Usuario "informatico"
GRANT SELECT, INSERT ON empresa1.informatica TO 'informatico'@'localhost';

-- Usuario "informatica_becario"
GRANT SELECT ON empresa1.informatica TO 'informatica_becario'@'localhost';

-- Usuario "administracion_jefe"
GRANT ALL PRIVILEGES ON empresa1.administracion TO 'administracion_jefe'@'localhost';

-- Usuario "administracion_administrativo"
GRANT SELECT, INSERT ON empresa1.administracion TO 'administracion_administrativo'@'localhost';

-- Usuario "administracion_becario"
GRANT SELECT ON empresa1.administracion TO 'administracion_becario'@'localhost';

-- Actualizar privilegios
FLUSH PRIVILEGES;