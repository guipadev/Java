--  Crear BD
CREATE SCHEMA RedFlixPro DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

use RedFlixPro;

CREATE TABLE Pelicula (
  idpelicula INT NOT NULL,
  titulo VARCHAR(50) NOT NULL,
  resumen VARCHAR(255) NULL,
  anio INT NULL,
  nombre_director VARCHAR(50),
  PRIMARY KEY (idpelicula)
);

INSERT INTO Pelicula (idpelicula, titulo, resumen, anio, nombre_director)
VALUES
(1, "Los Vengadores", "Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra.", 1990, "Joss Whedon"),
(2, "Interestelar", "Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar.", 2014, "Christopher Nolan"),
(3, "El viaje de Chihiro", "Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.", 2001, "Hayo Miyazaki"),
(4, "Parasitos", "Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano.", 2019, "Bong Joon-ho"),
(5, "Mas alla de los sueños", "Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.", 1998, "Vincent Ward");

CREATE TABLE Director (
  idDirector INT NOT NULL,
  nombre_direc VARCHAR(45) NOT NULL,
  apellido_direc VARCHAR(45) NOT NULL,
  nacionalidad_direc VARCHAR(45) NULL,
  PRIMARY KEY (idDirector)
);

INSERT INTO Director (idDirector, nombre_direc, apellido_direc, nacionalidad_direc) 
VALUES 
(1, "Hayo", "Miyazaki", "japones"),
(2, "Joss", "Whedon", "estadounidense"),
(3, "Christopher", "Nolan", "estadounidense"),
(4, "Bong", "Joon-ho", "coreano"),
(5, "Vincent", "Ward", "neozelandes");

CREATE TABLE Usuario (
  alias VARCHAR(45) NOT NULL,
  nombres VARCHAR(45) NOT NULL,
  apellidos VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  celular VARCHAR(45) NULL,
  contrasena INT NOT NULL,
  fechanacimiento DATE NULL,
  PRIMARY KEY (alias)
);

INSERT INTO Usuario (alias, nombres, apellidos, email, celular, contrasena, fechanacimiento)
VALUES
("lucky", "Pedro", "Perez", "pedro.perez@tic.co",  3103101010, "123", "1995-01-29"),
("malopez", "Maria", "Lopez", "maria.lopez@tic.co",  3183102010, "123", "1990-07-21"),
("diva", "Ana", "Diaz", "ana.diaz@tic.co",  3002311285, "123", "1989-01-29"),
("dreamer", "Luis", "Rojas", "luis.rojas@tic.co",  3187539876, "123", "1985-03-29"),
("ninja", "Andres", "Cruz", "andres.cruz@tic.co",  3119317589, "123", "1986-04-29"),
("neon", "Nelson", "Ruiz", "nelson.ruiz@tic.co",  3193101010, "123", "1992-05-29"),
("rose", "Claudia", "Mendez", "claudia.mendez@tic.co",  3013191010, "123", "1991-06-29"),
("green", "Jorge", "Rodriguez", "jorge.rodriguez@tic.co",  3234572145, "123", "1991-07-29");

CREATE TABLE Trasmisiones (
  idtrasmision INT PRIMARY KEY,
  alias VARCHAR(45) NOT NULL,
  contenido VARCHAR(55) NOT NULL,
  fechatrasmision DATETIME NOT NULL,
  FOREIGN KEY (alias) REFERENCES Usuario(alias)
);

INSERT INTO Trasmisiones (idtrasmision, alias, contenido, fechatrasmision)
VALUES
(1, "lucky", "Los Vengadores", "2017-10-25 20:00:00"),
(2, "lucky", "Parasitos", "2019-03-15 18:30:00"),
(3, "lucky", "La casa de papel", "2019-05-20 20:30:00"),
(4, "malopez", "Los Vengadores", "2018-05-20 20:30:00"),
(5, "malopez", "La casa de papel", "2020-01-20 20:30:00"),
(6, "diva", "Interestelar", "2019-05-20 20:30:00"),
(7, "diva", "El viaje de Chihiro", "2018-06-22 21:30:00"),
(8, "diva", "The walking dead", "2020-03-17 15:30:20"),
(9, "dreamer", "The walking dead", "2020-03-17 15:30:20"),
(10, "dreamer", "Viaje a las estrellas: la serie original", "2020-04-10 18:30:20"),
(11, "ninja", "Glow", "2020-02-17 20:30:20"),
(12, "ninja", "La casa de papel", "2020-02-20 16:30:20"),
(13, "ninja", "Arrow", "2020-03-27 18:30:20"),
(14, "rose", "Friends", "2020-03-20 21:30:20"),
(15, "green", "Interestelar", "2020-01-10 17:30:20"),
(16, "green", "Parasitos", "2020-02-15 20:30:20"),
(17, "green", "Mas alla de los sueños", "2020-03-17 18:30:20");

CREATE TABLE Contenido (
  idContenido INT NOT NULL,
  idpelicula VARCHAR (50) NULL,
  idserie VARCHAR (30) NULL,
  PRIMARY KEY (idContenido), 
  FOREIGN KEY (idpelicula) REFERENCES Pelicula (idpelicula), 
  FOREIGN KEY (idserie) REFERENCES Serie (idserie)
);

INSERT INTO Contenido VALUES (1, "Los Vengadores", NULL);
INSERT INTO Contenido VALUES (2, "Interestelar", NULL);
INSERT INTO Contenido VALUES (3, "El viaje de Chihiro", NULL);
INSERT INTO Contenido VALUES (4, "Parasitos", NULL);
INSERT INTO Contenido VALUES (5, "Mas alla de los sueños", NULL);
INSERT INTO Contenido VALUES (6, NULL, "The walking dead");
INSERT INTO Contenido VALUES (7, NULL, "Viaje a las estrellas");
INSERT INTO Contenido VALUES (8, NULL, "Glow");
INSERT INTO Contenido VALUES (9, NULL, "La casa de papel");
INSERT INTO Contenido VALUES (10, NULL, "Friends");
INSERT INTO Contenido VALUES (11, NULL, "Arrow");
INSERT INTO Contenido VALUES (12, NULL, "The big bang theory");
INSERT INTO Contenido VALUES (13, NULL, "Vikingos");

-- MODIFICAR

UPDATE Pelicula SET anio = 2012 WHERE idpelicula = 1; 

UPDATE Usuario SET celular = 3115678432 WHERE alias="ninja";

DELETE FROM Trasmisiones WHERE idtrasmision = 16;

-- CONSULTAS

SELECT "Consulta 1";
SELECT titulo FROM Pelicula UNION ALL SELECT titulo FROM Serie ORDER BY titulo;

SELECT "Consulta 2";
SELECT  titulo, resumen, anio FROM Pelicula WHERE anio > 2000 ORDER BY titulo;

SELECT "Consulta 3"; 
SELECT titulo FROM Pelicula WHERE nombre_director = "Vincent Ward";

SELECT "Consulta 4";
SELECT contenido FROM Trasmisiones WHERE alias = "lucky" ORDER BY contenido;

SELECT "Consulta 5";
SELECT Usuario.alias, Usuario.nombres, Usuario.apellidos FROM Usuario, Trasmisiones WHERE Usuario.alias = Trasmisiones.alias AND contenido = "Interestelar" ORDER BY Usuario.alias;

SELECT "Consulta 6"; 
SELECT count(*) FROM Pelicula WHERE anio > 2000;
