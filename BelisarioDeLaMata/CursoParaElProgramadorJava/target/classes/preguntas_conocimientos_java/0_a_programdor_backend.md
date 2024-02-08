## Internet

- Cómo funciona Internet?
- Qué significa HTTP y HTTPS?
- Qué son los navegadors y cómo funcionan?
- Qué significa DNS y cómo funciona?
- Qué es un domain name?
- Qué es un hosting?

## Elegir en que Framework vamos a Programar

A diferencia del Frontend donde primero se aprende JavaScript y luego elegimos un Framework.

En el caso del Backend primero se debe elegir el Framework, porque varian mucho entre si.

Language		Framework
Rust			Rocket
Go				Gin
C#				.NET
Python			django
**Java 			Spring**
**JavaScript	NodeJs**
Ruby			Ruby on Rails
PHP				Laravel

## Git & Control de Versiones

- Git
- GitHub

## Sistemas Operativos
- Uso de la terminal
- Cómo funciona el sistema operativo en general
- Gestión de memoria (Memory management)
- Comunicación procesos (Interprocess Communication)
- Hilos y concurrencia (Threads and Concurrency)
- Gestión de procesos (Process Management)

## Bases de datos

- Relacionales
	- **PostgresSQL**
	- MySQL
	- Microsoft SQL
	- MariaDB
	- Oracle

- No Relacionales
	- **MongoDB**
	- Cassandra
	- **Firebase**
	- InfluxDB
	- Oracle redis

## Application Programming Interface API's

Permitir la comunicación entre dos aplicaciones

- **REST** con base de datos relacionales
- **JSON APIs** con base de datos no relacionales
- gRPC (Remote Procedure Call)
- GraphQL

Las API's funcionan con protocolos, y si o si debes saber el de Autenticación

- OAuth
- **Basic Auth**
- Token Auth
- **JWT (Json web token)**
- Cookie based

## Testing

- **Pruebas unitarias** (Unit testing)

Se comprueba unidades individuales como módulos, fucniones o métodos del software. Permite comprobar que los componentes mas pequeños funcionan correctamente.

- **Pruebas de Integración** (Integration testing)

Probar/testear módulos en forma de grupo, ver como interaccionan entre sí en caso que tengan que hacerlo. Ej. la interacción de una API con un servicio backend o un servicio con una BD.

- Pruebas de funcionalidad (e2e testing)

Teste código en general como un conjunto. Llamada back box, donde no vemos el código. El teste prueba la app dado los inputs requeridos, comparando con los outpus o resultados esperados.

## CI/CD Continuous Integration - Continuous Deployment

Practica de automatizar la creacion, pruebas y despliegue de nuestras aplicaciones con el objetivo detectar errores a fases tempranas, previo al despliegue en producción.**Jenkis**

**GitHub Actions**

## Patrones de Arquitectura
- **Aplicaciones monolíticas (Monolithic Apps)**
- **Microservicios (Microservices)**
- SOA (Service-Oriented Architecture)
- Sin Servidor (Serverless)
- Malla de Servicios (Service Mesh)
- Aplicaciones de doce factores(Twelve-Factor Apps)

## Contenedores & MV
- **Docker**
Plataforma para trabajar aplicaciones en contenedores

Lo que hace es empaquetar toda nuestra App con el código, pruebas unitarias, test, imagenes, todo lo que la aplicación conlleva en un paquete/contenedor que luego Deployen en un Servidor.

Para manejar distintos contenedores que pueden tener distintas versiones de tus aplicaciones se usa **Kubernete**

## Web Servers

- SW Hardware 
Un servidor web de hardware es un ordenador que aloja software de servidor web y los archivos que componen un sitio web (archivos HTML, imagenes, CSS, JS)

- SW Software
Un servidor web de software tiene una serie de componentes de software que regulan la forma en los usuarios en linea accedera a los archivos alojados
	- **NGinx**
	- **Apache**
	- Caddy
	- Microsoft IIS

## Construir a Escala
- Acoplamiento (Coupling)
- Observabilidad (Observability)
- Evolucionabilidad (Evolvability)
- Infraestructura (Infrastructure)

