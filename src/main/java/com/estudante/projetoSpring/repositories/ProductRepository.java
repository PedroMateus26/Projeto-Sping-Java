package com.estudante.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.projetoSpring.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
