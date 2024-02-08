CREATE TABLE Contenido (
  idContenido INT NOT NULL,
  idpelicula VARCHAR (50) NULL,
  idserie VARCHAR (30) NULL,
  PRIMARY KEY (idContenido), 
  FOREIGN KEY (idpelicula) REFERENCES Pelicula (idpelicula), 
  FOREIGN KEY (idserie) REFERENCES Serie (idserie)
);

INSERT INTO Contenido VALUES (1, "Los Vengadores", NULL);
INSERT INTO Contenido VALUES (2, "Interestelar", NULL);
INSERT INTO Contenido VALUES (3, "El viaje de Chihiro", NULL);
INSERT INTO Contenido VALUES (4, "Parasitos", NULL);
INSERT INTO Contenido VALUES (5, "Mas alla de los sueños", NULL);
INSERT INTO Contenido VALUES (6, NULL, "The walking dead");
INSERT INTO Contenido VALUES (7, NULL, "Viaje a las estrellas");
INSERT INTO Contenido VALUES (8, NULL, "Glow");
INSERT INTO Contenido VALUES (9, NULL, "La casa de papel");
INSERT INTO Contenido VALUES (10, NULL, "Friends");
INSERT INTO Contenido VALUES (11, NULL, "Arrow");
INSERT INTO Contenido VALUES (12, NULL, "The big bang theory");
INSERT INTO Contenido VALUES (13, NULL, "Vikingos");