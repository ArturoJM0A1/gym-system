package com.gym.gym_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

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
    public Member save(Member member) {
        return repository.save(member);
    }

    @Override
    public List<Member> findAll() {
        return repository.findAll();
    }

    @Override
    public Member findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Member update(Long id, Member member) {
        Member existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(member.getName());
            existing.setAge(member.getAge());
            existing.setMembershipType(member.getMembershipType());
            return repository.save(existing);
        }

        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
