package com.estudante.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.projetoSpring.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
