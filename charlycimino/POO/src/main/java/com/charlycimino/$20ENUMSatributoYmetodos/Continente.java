package com.charlycimino.$20ENUMSatributoYmetodos;

public enum Continente {
    AMERICA(910000000, 42330000),
    AFRICA(731000000, 10180000),
    ASIA(387900001, 43810000),
    ANTARTIDA(1000, 13720000),
    EUROPA(731000000, 43581000),
    OCEANIA(27000000, 8720710);

    private int cantHabitantes;
    private double superficie;

    private Continente(int cantHabitantes, double superficie) {
        this.cantHabitantes = cantHabitantes;
        this.superficie = superficie;
    }

    public double densidadPoblacion() {
        return this.cantHabitantes / this.superficie;
    }

    @Override
    public String toString() {
        return "Continente{" +
                "cantHabitantes=" + cantHabitantes +
                ", superficie=" + superficie +
                '}';
    }
}
