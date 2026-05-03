package com.gym.gym_system.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.gym_system.dto.MemberRequestDTO;
import com.gym.gym_system.dto.MemberResponseDTO;
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

    @PostMapping
    public MemberResponseDTO create(@RequestBody MemberRequestDTO dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<MemberResponseDTO> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public MemberResponseDTO getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public MemberResponseDTO update(@PathVariable Long id, @RequestBody MemberRequestDTO dto) {
        return service.update(id, dto);
    }

}
