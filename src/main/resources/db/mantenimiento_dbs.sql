CREATE DATABASE mantenimiento_dbs;

USE mantenimiento_dbs;

CREATE TABLE Equipos (
    id CHAR(36) PRIMARY KEY DEFAULT (UUID()),
    nombre VARCHAR(100) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    fecha_adquisicion DATE NOT NULL
);

CREATE TABLE Mantenimientos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    equipo_id CHAR(36),
    fecha_mantenimiento DATE NOT NULL,
    descripcion TEXT NOT NULL,
    costo DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (equipo_id) REFERENCES Equipos(id)
);

CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(15) NOT NULL
);

CREATE TABLE UsuariosEquipos (
    usuario_id INT,
    equipo_id CHAR(36),
    PRIMARY KEY (usuario_id, equipo_id),
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(id),
    FOREIGN KEY (equipo_id) REFERENCES Equipos(id)
);

select * from Usuarios;