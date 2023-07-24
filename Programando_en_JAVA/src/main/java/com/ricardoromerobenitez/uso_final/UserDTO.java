package com.ricardoromerobenitez.uso_final;

// Creacion de clase INMUTABLE
class UserDto {

    private final String name;
    private final String lastName;
    private final int age;

    public UserDto(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}