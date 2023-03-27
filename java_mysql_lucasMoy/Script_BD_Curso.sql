-- crear bd
create database curso;

-- crear tabla e indicar en que bd
use curso;
create table usuarios (
	id int(11) not null auto_increment,
    nombre varchar(80) not null,
    apellido varchar(80) not null,
    fecha_nacimiento datetime null,
    primary key (id)
);

-- eliminar tabla
drop table if exists usuarios;

-- modificar tabla incluir campo
alter table curso.usuarios add column telefono varchar(45) null;

-- modificar datos de columna
alter table curso.usuarios modify column telefono varchar(30) null;

-- insertar datos
insert into usuarios (nombre, apellido, fecha_nacimiento, telefono) values
('Jesus', 'De Nazaret', '1000-12-31 11:00:00', '1231234343');

-- insertar varios datos
insert into usuarios (nombre, apellido, fecha_nacimiento, telefono) values
('Juan', 'Bautista', '1000-11-30 12:02:00', '12312534343'),
('Arcadio', 'Buendia', '1000-08-20 02:02:00', '12312781343'),
('Jose', 'Jose', '1099-01-10 10:02:00', '12875534343');

-- visualizar datos tabla
select * from curso.usuarios;

-- visualizar ciertos campos de tabla
select id, nombre, apellido from curso.usuarios;

-- actualizar/modificar datos de una columna especifica
update curso.usuarios set 
	nombre = 'Pepe',
    apellido = 'Angelini' where id = '2';

-- buscar un dato especifico AND
select * from curso.usuarios where apellido = 'De Nazaret' and nombre = 'Jesus';

-- buscar un dato OR
select * from curso.usuarios where apellido = 'Moreira' or nombre = 'Jesus';

-- contar cantidad de datos que coinciden
select count(*) from curso.usuarios where apellido = 'Moreira' or nombre = 'Jesus';

-- contar cantidad de datos que coinciden, colocando nombre a la columna de consulta
select count(*) as 'cantidad_de_jesus' from curso.usuarios where apellido = 'Moreira' or nombre = 'Jesus';

-- consulta datos que sean igual a la busqueda LIKE
select * from curso.usuarios where nombre like 'Jesus';

-- Puede aplicar like, where, and, or...
-- consulta datos que coincida con las palabras iniciales ej% sin importar el resto (Mas eficaz)
-- consulta coincidad con el texto sin importar que letras esta adelante o atras %es%
-- consulta coincidad con el texto sin importar que letras esta atras %es
select * from curso.usuarios where nombre like 'je%';

-- crear tabla con relacion foranea
create table curso.publicaciones (
	id int(11) not null auto_increment,
    autor_id int(11) not null,
    titulo varchar(80) not null,
    texto varchar(80) not null,
    primary key (id),
    foreign key (autor_id) references usuarios(id)
);

-- insertar datos 
insert into curso.publicaciones(id, autor_id, titulo, texto) values 
(null, '2', 'Don Quijote', 'Historia de dos amigos'),
(null, '1', 'La Peste', 'Historia enfermedad europea');

-- consultando 2 tablas al mismo tiempo con abreviaciones
use curso;
select p.id, p.titulo, p.texto,
concat(u.nombre, ' ', u.apellido) as 'autor'
from publicaciones p, usuarios u
where p.autor_id = u.id;

use curso;
select p.id, p.titulo, p.texto, p.apellido
from publicaciones p, usuarios u
where p.autor_id = u.id;

use curso;
select p.id, p.titulo, p.texto, u.id
from publicaciones p, usuarios u
where p.autor_id = u.id;

-- consultas más rápidas JOIN
use curso;
select p.id, p.titulo, p.texto, 
concat (u.nombre, ' ', u.apellido) as 'autor'
from publicaciones p inner join usuarios u
where p.autor_id = u.id;

-- crear tabla productos
create table curso.productos (
	id int(11) not null auto_increment,
    nombre varchar(100),
    precio double,
    primary key(id)
);

-- ingresar valores a productos
insert into curso.productos (nombre, precio) values
('zapatillas', '43'),
('pantalones', '40'),
('camisas', '35'),
('pantuflas', '13');

-- consultar tabla
select * from curso.productos;

-- consultar cantidad
select count(*) from curso.productos;

-- conocer el precio MAX
select MAX(precio) from curso.productos;

-- conocer el precio MIN
select MIN(precio) from curso.productos;

-- conocer el precio promedio AVG
select AVG(precio) from curso.productos;

-- conocer la sumatoria de precios SUM
select SUM(precio) from curso.productos;
