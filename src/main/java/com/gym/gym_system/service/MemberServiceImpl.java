package com.gym.gym_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gym.gym_system.dto.MemberRequestDTO;
import com.gym.gym_system.dto.MemberResponseDTO;
import com.gym.gym_system.model.Member;
import com.gym.gym_system.repository.MemberRepository;

/**
 * Implementación del servicio
 */
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository repository;

    public MemberServiceImpl(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public MemberResponseDTO save(MemberRequestDTO dto) {
        Member member = MemberMapper.toEntity(dto);
        Member saved = repository.save(member);
        return MemberMapper.toDTO(saved);
    }

    @Override
    public List<MemberResponseDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(MemberMapper::toDTO)
                .toList();
    }

    @Override
    public MemberResponseDTO findById(Long id) {
        Member member = repository.findById(id).orElse(null);
        return member != null ? MemberMapper.toDTO(member) : null;
    }

    @Override
    public MemberResponseDTO update(Long id, MemberRequestDTO dto) {
        Member existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(dto.getName());
            existing.setAge(dto.getAge());
            existing.setMembershipType(dto.getMembershipType());

            Member updated = repository.save(existing);
            return MemberMapper.toDTO(updated);
        }

        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
