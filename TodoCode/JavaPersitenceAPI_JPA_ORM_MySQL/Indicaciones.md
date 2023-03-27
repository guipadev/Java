# Proyecto en NetBeans CRUD conexion a BD MySQL

## Material teorico
En el archivo JPA.pptx esta una presentación teorica de los conceptos antes de empezar el proyecto

## Ejecucion de aplicacion
- En el paquete Logica se encuentra la principal de inicio "TestJPA"
- Se encuentran varias lineas de código comentadas, las cuales puedes descomentar para ejecutar la acción respectiva
- Antes de ejecuta debes tener creada y configurada la conexion a la BD
- Al ejecutar y crear un usuario ademas de registrar los datos en BD tambien crear la tabla ALUMNO

## Configurar conexion a BD
En la ruta del proyecto "src/main/resources" el paquete "META-INF" persistence.xml en la opción Source 
Se encontrara toda la configuración para realizar los cambios como nombre BD, usuario y clave para conectar.

## Script SQL
- Crea BD
CREATE SCHEMA escuela DEFAULT CHARACTER SET utf8 ;

- Consulta tabla
SELECT * FROM escuela.ALUMNO;
