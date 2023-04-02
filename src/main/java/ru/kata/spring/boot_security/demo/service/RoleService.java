package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.Role;
import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<String> findAll();
    Optional<Role> findByRole(String role);
    void saveRole(Role role);
}
