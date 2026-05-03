package com.gym.gym_system.service;

import com.gym.gym_system.dto.MemberRequestDTO;
import com.gym.gym_system.dto.MemberResponseDTO;
import com.gym.gym_system.model.Member;

public class MemberMapper {

    public static Member toEntity(MemberRequestDTO dto) {
        return new Member(
                dto.getName(),
                dto.getAge(),
                dto.getMembershipType()
        );
    }

    public static MemberResponseDTO toDTO(Member member) {
        return new MemberResponseDTO(
                member.getId(),
                member.getName(),
                member.getMembershipType()
        );
    }
}
