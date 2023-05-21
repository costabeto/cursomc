package com.acosta.cursomc.repositories;

import org.springframework.stereotype.Repository;

import com.acosta.cursomc.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
