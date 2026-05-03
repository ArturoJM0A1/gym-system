package com.gym.gym_system.dto;

/**
 * DTO para enviar datos al cliente
 */
public class MemberResponseDTO {

    private Long id;
    private String name;
    private String membershipType;

    public MemberResponseDTO(Long id, String name, String membershipType) {
        this.id = id;
        this.name = name;
        this.membershipType = membershipType;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return membershipType;
    }
}
