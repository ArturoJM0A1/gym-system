package com.gym.gym_system.service;

import java.util.List;

import com.gym.gym_system.model.Member;

/**
 * Interface del servicio
 */
public interface MemberService {

    Member save(Member member);

    List<Member> findAll();

    Member findById(Long id);

    Member update(Long id, Member member);

    void delete(Long id);
}
