package com.estudante.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.projetoSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
