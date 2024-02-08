# ¿Qué diferencia IoC (Inversión de Control) de DI (Inyección de Dependencia)?

## Inversión of Control (IoC)

Por ejemplo Java, cuando usamos Swing, usamos funciones ya creadas para crear la interfaces de usuario

Otro ejemplo cuando usamos express, solo con llamar funciones para crear un servidor.
```
app = express()

app.get("/", () => {
    res.
})

app.listen()
```
El framework nos abstrae de usar el 100% del programa, pasamos a ser personas que dirige a ser simples actores que pasamos callback o funciones que queremos que ocurra en determinado ciclo de la aplicación

## Dependency Injection (DC)

