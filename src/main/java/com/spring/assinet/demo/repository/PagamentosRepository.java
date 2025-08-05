package com.spring.assinet.demo.repository;

import com.spring.assinet.demo.model.Pagamentos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PagamentosRepository extends JpaRepository<Pagamentos, Long> {

    void deleteById(Long id);

    @Override
    Optional<Pagamentos> findById(Long id);
}
