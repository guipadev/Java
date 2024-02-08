DROP SCHEMA IF EXISTS redflix183;
CREATE SCHEMA redflix183;
USE redflix183;

-- Tabla Director ---
CREATE TABLE director (
	dir_id integer primary key,
	dir_nombre varchar(20),
    dir_apellido varchar(20),
    dir_nacionalidad varchar(40)
);

insert into director values (101, "Hayo","Miyazaki", "japones");
insert into director values (102, "Joss", "Whedon", "estadounidense");
insert into director values (103, "Christopher", "Nolan", "estadounidense");
insert into director values (104, "Bong", "Joon-ho", "coreano");
insert into director values (105, "Vincent", "Ward", "neozelandes");

-- Tabla Pelicula ---
CREATE TABLE pelicula (
	pel_id integer primary key,
	pel_titulo varchar(50),
    pel_resumen varchar(500),
    pel_ano integer,
    dir_id integer,
    FOREIGN KEY (dir_id) REFERENCES director(dir_id)
);

insert into pelicula values (1001, 'Los Vengadores', 'Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra.', 1990, 102);
insert into pelicula values (1002, 'Interestelar', 'Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar.', 2014, 103);
insert into pelicula values (1003, 'El viaje de Chihiro', 'Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.', 2001, 101);
insert into pelicula values (1004, 'Parasitos', 'Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano.', 2019, 104);
insert into pelicula values (1005, 'Mas alla de los sueños', 'Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.', 1998, 105);

-- Tabla Serie ---
CREATE TABLE serie (
	ser_id integer primary key,
	ser_titulo varchar(50),
    ser_temporadas integer,
    ser_episodios integer
);

insert into serie values (2001, 'The walking dead', 11, 153);
insert into serie values (2002, 'Viaje a las estrellas: la serie original', 3, 80);
insert into serie values (2003, 'Glow', 3, 30);
insert into serie values (2004, 'La casa de papel', 4, 31);
insert into serie values (2005, 'Friends', 10, 236);
insert into serie values (2006, 'Arrow', 8, 170);
insert into serie values (2007, 'The big bang theory', 12, 279);
insert into serie values (2008, 'Vikingos', 6, 79);

-- Tabla Usuario ---
CREATE TABLE usuario (
	usu_alias varchar(30) primary key,
	usu_contrasena varchar(30),
    usu_nombre varchar(30),
    usu_apellido varchar(30),
    usu_email varchar(50),
    usu_celular varchar(20),
    usu_fecha_nacimiento date
);

insert into usuario values ('lucky', '$$lucky', 'Pedro', 'Perez', 'lucky@gmail.com', '3005023369', '2000-11-10');
insert into usuario values ('malopez', '$$malopez', 'Maria', 'Lopez', 'malopez@hotmail.com', '3115025898', '2002-08-18');
insert into usuario values ('diva', '$$diva', 'Ana', 'Diaz', 'diva@gmail.com', '3145874122', '1998-01-25');
insert into usuario values ('dreamer', '$$dreamer', 'Luis', 'Rojas', 'dreamer@hotmail.com', '3015549821', '2001-12-15');
insert into usuario values ('ninja', '$$ninja', 'Andres', 'Cruz', 'ninja@hotmail.com', '3204288794', '1995-05-19');
insert into usuario values ('neon', '$$neon', 'Nelson', 'Ruiz', 'neon@gmail.com', '3005471139', '2000-02-05');
insert into usuario values ('rose', '$$rose', 'Claudia', 'Mendez', 'rose@gmail.com', '3215611098', '1995-10-18');
insert into usuario values ('green', '$$green', 'Jorge', 'Rodriguez', 'green@hotmail.com', '3115945478', '1992-08-01');

-- Tabla Transmision ---
CREATE TABLE transmision (
	tra_id integer primary key,
	tra_alias varchar(30),
	tra_titulo varchar(50),
    tra_fecha TIMESTAMP
);

insert into transmision values (3001, 'lucky', 'Los Vengadores', date('2017-10-25 20:00:00'));
insert into transmision values (3002, 'lucky', 'Parasitos', date('2019-03-15 18:30:00'));
insert into transmision values (3003, 'lucky', 'La casa de papel', date('2019-05-20 20:30:00'));
insert into transmision values (3004, 'malopez', 'Los Vengadores', date('2018-05-20 20:30:00'));
insert into transmision values (3005, 'malopez', 'La casa de papel', date('2020-01-20 20:30:00'));
insert into transmision values (3006, 'diva', 'Interestelar', date('2019-05-20 20:30:00'));
insert into transmision values (3007, 'diva', 'El viaje de Chihiro', date('2018-06-22 21:30:00'));
insert into transmision values (3008, 'diva', 'The walking dead', date('2020-03-17 15:30:20'));
insert into transmision values (3009, 'dreamer', 'The walking dead', date('2020-03-17 15:30:20'));
insert into transmision values (3010, 'dreamer', 'Viaje a las estrellas: la serie original', date('2020-04-10 18:30:20'));
insert into transmision values (3011, 'ninja', 'Glow', date('2020-02-17 20:30:20'));
insert into transmision values (3012, 'ninja', 'La casa de papel', date('2020-02-20 16:30:20'));
insert into transmision values (3013, 'ninja', 'Arrow', date('2020-03-27 18:30:20'));
insert into transmision values (3014, 'rose', 'Friend', date('2020-03-20 21:30:20'));
insert into transmision values (3015, 'green', 'Interestelar', date('2020-01-10 17:30:20'));
insert into transmision values (3016, 'green', 'Parasitos', date('2020-02-15 20:30:20'));
insert into transmision values (3017, 'green', 'Mas alla de los sueños', date('2020-03-17 18:30:20'));
