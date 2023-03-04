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