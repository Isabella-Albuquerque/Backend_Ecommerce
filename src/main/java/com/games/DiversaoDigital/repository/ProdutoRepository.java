package com.games.DiversaoDigital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.DiversaoDigital.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
 List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
