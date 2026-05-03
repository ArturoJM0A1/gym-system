package com.gym.gym_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.gym_system.model.Member;

/**
 * JpaRepository ya trae CRUD automático
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}
