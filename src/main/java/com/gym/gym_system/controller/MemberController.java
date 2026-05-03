package com.gym.gym_system.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.gym_system.model.Member;
import com.gym.gym_system.service.MemberService;

/**
 * Controlador REST
 */
@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService service;

    public MemberController(MemberService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Member create(@RequestBody Member member) {
        return service.save(member);
    }

    // READ ALL
    @GetMapping
    public List<Member> getAll() {
        return service.findAll();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Member getById(@PathVariable Long id) {
        return service.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Member update(@PathVariable Long id, @RequestBody Member member) {
        return service.update(id, member);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
