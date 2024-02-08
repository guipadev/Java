-- crear BD
CREATE SCHEMA bd_universidad DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;

-- crear tabla academias
CREATE TABLE bd_universidad.academias (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(100) NULL,
  telefono VARCHAR(45) NULL,
  web VARCHAR(100) NULL,
  PRIMARY KEY (id));

-- crear tabla profesores  
CREATE TABLE bd_universidad.profesores (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(80) NULL,
  apellido VARCHAR(80) NULL,
  telefono VARCHAR(45) NULL,
  email VARCHAR(255) NULL,
  academia_id INT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (academia_id) REFERENCES bd_universidad.academias(id) 
  );

-- Crear tabla alumnos
CREATE TABLE bd_universidad.alumnos (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(80) NULL,
  apellido VARCHAR(80) NULL,
  telefono VARCHAR(45) NULL,
  email VARCHAR(255) NULL,
  academia_id INT NULL,
  PRIMARY KEY (id)
  );

-- En esta caso creamos tabla alumnos, pero ahora realizamos la relación con la tabla academia
ALTER TABLE bd_universidad.alumnos ADD CONSTRAINT academia_alumno_fk FOREIGN KEY (academia_id) REFERENCES academias(id) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Crear tabla cursos
CREATE TABLE bd_universidad.cursos (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(100) NULL,
  descripcion TEXT NULL,
  profesor_id INT NULL,
  PRIMARY KEY (id)
  );
  
-- En esta caso creamos tabla cursos y realizamos la relación con la tabla profesores
ALTER TABLE bd_universidad.cursos ADD CONSTRAINT profesor_curso_fk FOREIGN KEY (profesor_id) REFERENCES profesores(id) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Creación de tabla intermedia
CREATE TABLE bd_universidad.alumnos_x_cursos (
  id INT NOT NULL AUTO_INCREMENT,
  alumno_id INT NULL,
  curso_id INT NULL,
  PRIMARY KEY (id)
  );
  
  -- En esta caso creamos tabla alumnos_x_cursos y realizamos la relación con la tabla alumnos y cursos
ALTER TABLE bd_universidad.alumnos_x_cursos ADD CONSTRAINT alumno_curso_fk FOREIGN KEY (alumno_id) REFERENCES alumnos(id) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE bd_universidad.alumnos_x_cursos ADD CONSTRAINT curso_alumno_fk FOREIGN KEY (curso_id) REFERENCES cursos(id) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- crear tabla notas con relaciones a tablas cursos y alumnos 
CREATE TABLE bd_universidad.notas (
  id INT NOT NULL AUTO_INCREMENT,
  nota FLOAT NULL,
  curso_id INT NULL,
  alumno_id INT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (curso_id) REFERENCES bd_universidad.cursos(id),
  FOREIGN KEY (alumno_id) REFERENCES bd_universidad.alumnos(id) 
  );

-- Insertar datos a tabla academias
insert into bd_universidad.academias (id, nombre, telefono, web) values
(null, 'Academia Online de Argentina', '5234234123123', 'academiaonlinedeargentina.com');

-- Visualizar datos tabla academias
SELECT * FROM bd_universidad.academias;
