package com.gym.gym_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @Entity indica que esta clase es una tabla en la BD
 */
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private int age;
    private String membershipType;

    // Constructor vacío (requerido por JPA)
    public Member() {
    }

    // Constructor completo
    public Member(String name, int age, String membershipType) {
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
    }

    // Encapsulación → getters y setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Sobrecarga de métodos (overloading)
    public void setName(String name, String lastName) {
        this.name = name + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
