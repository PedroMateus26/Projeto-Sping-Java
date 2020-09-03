package com.estudante.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.projetoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
