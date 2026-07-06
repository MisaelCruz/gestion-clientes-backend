package com.gestion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.entidad.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
