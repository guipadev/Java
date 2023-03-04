CREATE TABLE Serie (
  idserie INT PRIMARY KEY,
  titulo VARCHAR(30) NOT NULL,
  ntemporada INT,
  nepisodio INT
);

INSERT INTO Serie (idserie, titulo, ntemporada, nepisodio)
VALUES
(1, "The walking dead", 11, 153),
(2, "Viaje a las estrellas: la serie original", 3, 80),
(3, "Glow", 3, 30),
(4, "La casa de papel", 4, 31),
(5, "Friends", 10, 236),
(6, "Arrow", 8, 170),
(7, "The big bang theory", 12, 279),
(8, "Vikingos", 6, 79);