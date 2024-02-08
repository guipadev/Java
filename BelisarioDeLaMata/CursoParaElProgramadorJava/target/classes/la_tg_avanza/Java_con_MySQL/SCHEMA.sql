--- CREAR BD
CREATE SCHEMA `bd_registros` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

--- CREAR TABLA
CREATE TABLE `bd_registros`.`empleados` (
  `id` INT(50) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `profesion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));


