package com.controlestoque.api_estoque.Repositories;

import com.controlestoque.api_estoque.Entitys.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}