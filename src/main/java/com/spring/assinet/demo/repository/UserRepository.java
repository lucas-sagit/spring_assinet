package com.spring.assinet.demo.repository;

import com.spring.assinet.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, String> {

}
