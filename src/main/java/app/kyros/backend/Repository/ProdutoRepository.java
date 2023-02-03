package app.kyros.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.kyros.backend.Entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
    
}