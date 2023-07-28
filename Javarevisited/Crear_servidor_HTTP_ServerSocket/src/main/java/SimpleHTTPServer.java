import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 Crear un servidor HTTP en Java - Ejemplo de ServerSocket
 Java tiene muy buen soporte de red, le permite escribir aplicaciones cliente-servidor usando TCP Sockets.
 Crearemos un servidor HTTP simple en Java, que puede escuchar solicitudes HTTP en un puerto, digamos 80
 y puede enviar una respuesta al cliente.
 Al ser un servidor HTTP, puede conectarse a él usando su navegador, por ejemplo, Chrome, Firefox o Internet Explorer.
 Aunque HTTP es omnipresente y está presente en todas partes, Java no tiene una API dedicada para crear
 y analizar solicitudes HTTP, no hay una biblioteca de cliente HTTP incorporada en JDK.

 Aunque no falta una buena biblioteca de código abierto, por ejemplo, puede usar Jsoup para analizar HTML
 y puede usar la biblioteca Apache HttpClient para enviar solicitudes GET y POST directamente desde su programa Java.

 Dominar la programación de redes en Java, leer Java Network Programming, 4th Addition de Harold, Elliotte Rusty,
 muy completo y no solo cubre los protocolos TCP/IP y UDP, que son la columna vertebral de Internet,
 sino también profundizar en el protocolo HTTP, incluidos REST, encabezados HTTP y cookies.

 El libro está muy centrado en la práctica y encontrará muchos ejemplos interesantes relacionados con tareas comunes de red,
 por ejemplo, escribir servidores de subprocesos múltiples, usar E/S sin bloqueo y usar clases de socket de bajo nivel.
 */
public class SimpleHTTPServer {

    public static void main( String [] args) throws Exception {
        // 1. Read HTTP request from the client socket
        // 2. Prepare an HTTP response
        // 3. Send HTTP response to the client
        // 4. Close the socket

        /**
         * Primer paso crear un servidor web es crear un socket de red que pueda aceptar conexiones en un determinado puerto TCP.
         * Los servidores HTTP generalmente escuchan en el puerto 80, pero usaremos un puerto 8080 diferente para fines de prueba.
         * Usamos la clase ServerSocket en Java para crear un servidor que pueda aceptar solicitudes, como se muestra a continuación
         */
        final ServerSocket server = new ServerSocket( 8080 );

        System .out.println( "Escuchando conexión en el puerto 8080..." );

        while (true) {

            /**
             * Este es un método de bloqueo y bloquea hasta que un cliente se conecta al servidor.
             * Tan pronto como un cliente se conecta, devuelve el objeto Socket que se puede usar para leer la solicitud del cliente
             * y enviar la respuesta al cliente.
             * Una vez que haya terminado con un cliente, debe cerrar este socket y prepararse para aceptar la nueva conexión entrante
             * llamando a accept() nuevamente
             */
            final Socket clientSocket = server.accept();

            /**
             * Cuando se conecte a http://localhost:8080, su  navegador enviará una solicitud GET HTTP al servidor.
             * Puede leer el contenido de la solicitud usando InputStream abierto desde el socket del cliente.
             * Es mejor usar BufferedReader porque el navegador enviará varias líneas.
             */
            //InputStreamReader isr =  new InputStreamReader(clientSocket.getInputStream());
            //BufferedReader reader = new BufferedReader(isr);
            //String line = reader.readLine();
            //while (!line.isEmpty()) {
            //    System.out.println(line);
            //   line = reader.readLine();
            //}

            /**
             * Así que ahora nuestro servidor no solo escucha la conexión, sino que la acepta y también lee la solicitud HTTP.
             * Ahora lo único que queda es enviar una respuesta HTTP al cliente.
             * Para mantener nuestro servidor simple, solo enviaremos la fecha de hoy al cliente.
             *
             * Veamos cómo podemos hacer eso. Para enviar una respuesta, necesitamos obtener el flujo de salida del socket
             * y luego escribiremos el código de respuesta HTTP OK y la fecha de hoy en el flujo.
             */
            try (Socket socket = server.accept()) {
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream()
                        .write(httpResponse.getBytes("UTF-8"));
            }



        }
    }
}
