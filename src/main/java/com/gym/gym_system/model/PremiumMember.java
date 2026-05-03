package com.gym.gym_system.model;

/**
 * Polimorfismo: PremiumMember es un tipo de Member
 */
public class PremiumMember extends Member {

    private String benefits;

    public PremiumMember(String name, int age, String membershipType, String benefits) {
        super(name, age, membershipType);
        this.benefits = benefits;
    }

    public String getBenefits() {
        return benefits;
    }
}
