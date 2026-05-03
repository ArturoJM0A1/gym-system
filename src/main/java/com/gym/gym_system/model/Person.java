package com.gym.gym_system.model;

import com.gym.gym_system.abstracts.AbstractPerson;

/**
 * Herencia: Person hereda de AbstractPerson
 */
public class Person extends AbstractPerson {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getRole() {
        return "Basic Person";
    }
    /**
     * Override indicar explícitamente que un método de una subclase está
     * sobrescribiendo (reemplazando) el método de la clase padre.
     */
}
