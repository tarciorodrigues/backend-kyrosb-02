package app.kyros.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.kyros.backend.Entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento,Integer> {
    
}