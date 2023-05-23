package com.carnacorp.desafio3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carnacorp.desafio3.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
