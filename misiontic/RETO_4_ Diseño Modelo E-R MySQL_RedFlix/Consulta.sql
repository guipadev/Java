SELECT "Consulta 1";
SELECT titulo FROM Pelicula UNION ALL SELECT titulo FROM Serie ORDER BY titulo;

SELECT "Consulta 2";
SELECT  titulo, resumen, anio FROM Pelicula WHERE anio > 2000 ORDER BY titulo;

SELECT "Consulta 3"; 
SELECT titulo FROM Pelicula WHERE nombre_director = "Vincent Ward";

SELECT "Consulta 4";
SELECT contenido FROM Trasmisiones WHERE alias = "lucky" ORDER BY contenido;

SELECT "Consulta 5";
SELECT Usuario.alias, Usuario.nombres, Usuario.apellidos FROM Usuario, Trasmisiones WHERE Usuario.alias = Trasmisiones.alias AND contenido = "Interestelar" ORDER BY Usuario.alias;

SELECT "Consulta 6"; 
SELECT count(*) FROM Pelicula WHERE anio > 2000;