package com.controlestoque.api_estoque.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.controlestoque.api_estoque.Entitys.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    //Adicionar findByName, findByPrice
    
}