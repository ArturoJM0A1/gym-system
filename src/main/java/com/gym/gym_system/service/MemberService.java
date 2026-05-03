package com.gym.gym_system.service;

import java.util.List;

import com.gym.gym_system.dto.MemberRequestDTO;
import com.gym.gym_system.dto.MemberResponseDTO;

/**
 * Interface del servicio
 */
public interface MemberService {

    MemberResponseDTO save(MemberRequestDTO dto);

    List<MemberResponseDTO> findAll();

    MemberResponseDTO findById(Long id);

    MemberResponseDTO update(Long id, MemberRequestDTO dto);

    void delete(Long id);
}
