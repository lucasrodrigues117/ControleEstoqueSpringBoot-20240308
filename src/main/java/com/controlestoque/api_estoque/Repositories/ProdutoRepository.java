
package com.controlestoque.api_estoque.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.controlestoque.api_estoque.Entitys.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
