CREATE SCHEMA bd_gestion_clientes DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;

CREATE TABLE bd_gestion_clientes.clientes (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NULL,
  apellido VARCHAR(50) NULL,
  telefono VARCHAR(50) NULL,
  email VARCHAR(250) NULL,
  PRIMARY KEY (id));
  
INSERT INTO bd_gestion_clientes.clientes (id, nombre, apellido, telefono, email)
VALUES
(NULL, 'Lucas', 'Moy', '234234234', 'asd@asd.com'),
(NULL, 'Lucas', 'Cuellar', '21212234', 'lu@gmail.com'),
(NULL, 'Tony', 'Muñoz', '2344454534', 'joseasd@gmail.com');

SELECT * FROM bd_gestion_clientes.clientes;

