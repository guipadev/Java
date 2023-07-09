# Preguntas relacionadas con la arquitectura basada en micro servicios 

1. Supongamos que tenemos que diseñar un sistema basado en una arquitectura basada en micro servicios una vez que diseñamos nuestro sistema construimos y decidimos realizarlo basado en 12 pequeños servicios estos servicios se conforman de 12 servicios que tienen por supuesto cada servicio tiene asociados una configuración cada uno de estos servicios a su vez puede tener un grupo de instancias.

1.1. ¿Qué mecanismo podemos usar para poder realizar cambios de configuración en las propiedades de los servicios, sin necesidad de ir instancia por instancia?

Para realizar cambios de configuración en los servicios sin necesidad de ir instancia por instancia, puedes utilizar un sistema de gestión de configuración centralizado, como por ejemplo, Apache ZooKeeper o Consul. Estas herramientas te permiten almacenar y distribuir la configuración de los servicios de manera centralizada. De esta forma, puedes actualizar la configuración en un único lugar y los servicios pueden acceder a ella de manera automática, sin necesidad de realizar cambios individuales en cada instancia.

1.2. ¿Cómo podemos realizar estos cambios en caliente?

Para realizar cambios en caliente en la configuración de los servicios, puedes utilizar un enfoque de recarga dinámica o "hot reload". Esto implica utilizar un mecanismo que permita cargar y aplicar los cambios en tiempo de ejecución sin necesidad de reiniciar los servicios. Algunos frameworks y plataformas, como Spring Boot, proporcionan soporte para la recarga dinámica de la configuración. Puedes aprovechar esta funcionalidad para actualizar la configuración de los servicios de manera instantánea, sin interrumpir su funcionamiento.

2. Tenemos en una MSA un servicio A que llama a un servicio B usando peticiones tipo http post (api/rest).

2.1. ¿Cómo podemos evitar que una llamada de A -> B no sobrepase los 3s?

Para evitar que una llamada de A a B sobrepase los 3 segundos, puedes implementar un mecanismo de timeout en la comunicación entre los servicios. Esto implica establecer un límite de tiempo para esperar la respuesta de B. Si B no responde dentro de ese límite, A puede manejar el tiempo de espera excedido y tomar acciones correspondientes. Puedes configurar el timeout en la solicitud HTTP que A realiza hacia B, de acuerdo con las herramientas o librerías que estés utilizando para realizar las peticiones.

2.2. ¿Cómo podemos evitar que si B se pone lento o da errores inesperados (5XX), esto no termine afectando la estabilidad de A?

Para evitar que la lentitud o los errores inesperados de B afecten la estabilidad de A, puedes implementar técnicas de tolerancia a fallos. Una opción es utilizar circuit breakers o interruptores de circuito. Un circuit breaker monitorea las respuestas y el rendimiento de B y, si detecta que B está lento o devuelve errores frecuentes, puede abrir el circuito y redirigir las solicitudes hacia una respuesta predeterminada o un servicio alternativo. Esto protege a A de los problemas de B y evita que se vea afectada su estabilidad. También puedes implementar estrategias de reintentos o fallbacks para manejar de manera adecuada las respuestas inesperadas de B y garantizar la continuidad del funcionamiento de A.

3. Tenemos un servicio A, con 5 instancias cuya función es leer datos en estado final (no varían) de una base de datos MySQL y devolverlos en una API REST.

3.1. ¿Cómo podemos evitar ir a la base de datos cada vez que se requiera cargar un dato previamente leído en una misma instancia?

Para evitar tener que ir a la base de datos cada vez que se requiera cargar un dato previamente leído en una misma instancia, puedes implementar una capa de caché en el servicio A. Esta caché puede ser una memoria de acceso rápido, como Redis o Memcached, donde puedas almacenar los datos leídos de la base de datos de manera temporal. Cuando una instancia de A necesita cargar un dato, primero verifica si está presente en la caché. Si el dato se encuentra en la caché, se puede obtener directamente desde allí, evitando así la consulta a la base de datos. De esta manera, se reducirá la carga en la base de datos y se mejorará el rendimiento de las operaciones.

3.2. ¿Cómo podemos evitar ir a la base de datos cada vez que se requiera cargar un dato previamente leído en una instancia ya esta disponible para todas?

Para evitar tener que ir a la base de datos cada vez que se requiera cargar un dato previamente leído, y si dicho dato está disponible para todas las instancias, puedes utilizar una caché compartida o distribuida. En lugar de almacenar la caché en la memoria de cada instancia de A, puedes utilizar una solución de caché compartida como Redis o un servicio de almacenamiento en memoria distribuida. De esta forma, todas las instancias de A pueden acceder a la misma caché, sin importar en cuál instancia se haya realizado la lectura inicial de los datos. Al utilizar una caché compartida, se evita la necesidad de consultar la base de datos repetidamente, ya que los datos previamente leídos estarán disponibles para todas las instancias de A a través de la caché compartida. Esto mejora la eficiencia y reduce la carga en la base de datos.

4. Tenemos en un servicio A que ejecuta operaciones HTTP POST sensibles sobre una API REST.

4.1. ¿Cómo podemos asegurar que si repetimos dos veces la misma operación no se termine creando el recurso dos veces?

Para asegurar que si se repite dos veces la misma operación en el servicio A no se termine creando el recurso dos veces, se puede utilizar un mecanismo de deduplicación de solicitudes. 

Una posible estrategia es utilizar un identificador único en cada solicitud que se envía desde el servicio A. Este identificador puede ser generado y adjuntado a la solicitud antes de enviarla a la API REST. En el lado del servidor, al recibir la solicitud, se puede verificar si el identificador ya ha sido procesado anteriormente. Si se detecta que la solicitud con el mismo identificador ya ha sido procesada, se puede evitar la creación duplicada del recurso y en su lugar retornar una respuesta indicando que la operación ya ha sido realizada previamente.

Es importante que el identificador utilizado sea único y persistente en caso de fallas o reinicios del servicio A. Puede utilizarse algún identificador único como un UUID (Universally Unique Identifier) o algún valor generado a partir de los datos específicos de la solicitud que garantice su unicidad.

Esta estrategia de deduplicación ayuda a mantener la integridad de los datos y evita la creación duplicada de recursos en el sistema, asegurando que una operación repetida no tenga efectos secundarios indeseados.
