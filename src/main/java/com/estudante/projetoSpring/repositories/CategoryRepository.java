package com.estudante.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.projetoSpring.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
