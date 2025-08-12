package com.spring.assinet.demo.repository;

import com.spring.assinet.demo.model.Funcionarios;
import com.spring.assinet.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
//    Optional<Usuario> findByEmail(String email);
Optional<Usuario> findBynomeCompleto(String nomeCompleto);
}



