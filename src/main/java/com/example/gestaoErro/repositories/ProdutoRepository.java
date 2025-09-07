package com.example.gestaoErro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestaoErro.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {

}
