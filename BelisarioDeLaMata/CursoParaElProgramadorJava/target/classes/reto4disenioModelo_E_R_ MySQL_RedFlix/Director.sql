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