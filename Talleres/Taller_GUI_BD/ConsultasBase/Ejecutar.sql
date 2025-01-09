CREATE DATABASE Concursos;
USE Concursos;
CREATE TABLE Usuarios(
id INT auto_increment primary key,
usuario VARCHAR(30) NOT NULL UNIQUE,
correo VARCHAR(50) NOT NULL UNIQUE,
pasword VARCHAR(30) NOT NULL);
CREATE TABLE Inscripciones(
cod INT PRIMARY KEY auto_increment,
nombre VARCHAR(30) NOT NULL,
apellido VARCHAR(30) NOT NULL,
edad INT NOT NULL,
correo VARCHAR(50) NOT NULL UNIQUE);

SELECT * FROM concursos.usuarios;