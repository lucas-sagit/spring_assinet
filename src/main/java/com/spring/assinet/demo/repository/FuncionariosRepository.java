package com.spring.assinet.demo.repository;

import com.spring.assinet.demo.controller.FuncionariosController;
import com.spring.assinet.demo.model.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios, Long> {
    Optional<Funcionarios> findByUsuario_Email(String Email);

    Funcionarios findBynomeCompleto(String nomeCompleto);

    void deleteById(Long id);

    Optional<Funcionarios> findById(Long id);
}

