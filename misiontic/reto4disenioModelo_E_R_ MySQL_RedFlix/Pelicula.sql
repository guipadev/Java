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