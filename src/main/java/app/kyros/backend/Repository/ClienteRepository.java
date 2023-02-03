package app.kyros.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.kyros.backend.Entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
    
}