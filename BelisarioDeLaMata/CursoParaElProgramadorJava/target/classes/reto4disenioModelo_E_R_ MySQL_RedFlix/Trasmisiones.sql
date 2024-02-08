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