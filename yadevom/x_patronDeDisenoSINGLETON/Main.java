package com.yadevom.x_patronDeDisenoSINGLETON;

/**
 * Patron de diseño singleton es un patron de creacione de clases, donde tendremos un único objeto
 * para una clase en concreta, eso nos ayuda en reducir el uso de memoria y además de poder usar
 * propiedades de forma global
 */
public class Main {

    Version version = Version.getInstance();

    UsuarioServicio usuarioServicio = new UsuarioServicio(version);
    CarritoDeCompraServicio carritoDeCompraServicio = new CarritoDeCompraServicio(version);
}
