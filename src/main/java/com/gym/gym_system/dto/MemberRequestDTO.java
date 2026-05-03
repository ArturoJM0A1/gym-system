package com.gym.gym_system.dto;

/**
 * DTO para recibir datos del cliente (POST / PUT)
 */
public class MemberRequestDTO {

    private String name;
    private int age;
    private String membershipType;

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
