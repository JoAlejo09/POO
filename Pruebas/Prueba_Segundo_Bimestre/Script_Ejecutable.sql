CREATE DATABASE IF NOT EXISTS Prueba_Bimestral;
USE prueba_Bimestral;
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE estudiantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cedula VARCHAR(10) NOT NULL UNIQUE,
    nombre VARCHAR(100) NOT NULL,
    estudiante1 DOUBLE NOT NULL,
    estudiante2 DOUBLE NOT NULL,
    estudiante3 DOUBLE NOT NULL,
    estudiante4 DOUBLE NOT NULL,
    estudiante5 DOUBLE NOT NULL
);
INSERT INTO usuarios(username,password) VALUES ('josepila09','contra123');
INSERT INTO estudiantes(cedula,nombre,estudiante1,estudiante2,estudiante3,estudiante4,estudiante5) VALUES ('1758994201','Juan Perez',5.6,6.7,8,9.0,7);
