package com.controlestoque.api_estoque.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.controlestoque.api_estoque.Entitys.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    //Adicionar findByName, findByPrice
    
}