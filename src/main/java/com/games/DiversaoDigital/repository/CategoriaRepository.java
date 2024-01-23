package com.games.DiversaoDigital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.games.DiversaoDigital.model.Categoria;


public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {

public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}