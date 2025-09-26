package com.cpifppiramide.demo.Clases;

public class User {

    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\n" + "Edad: " +age;
    }
}
