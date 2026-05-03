package com.gym.gym_system.abstracts;

/**
 * Clase abstracta: No se puede instanciar directamente. Sirve como base para
 * otras clases.
 */
public abstract class AbstractPerson {

    protected String name;
    protected int age;

    // Método abstracto (obliga a las clases hijas a implementarlo)
    public abstract String getRole();

    // Método concreto (ya implementado)
    public String basicInfo() {
        return name + " - " + age;
    }
}
