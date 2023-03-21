package com.mitocode.java8._10anotaciones;

public @interface AnnotacionCustom {

	String nombre();
	boolean habilitado() default true;
}
