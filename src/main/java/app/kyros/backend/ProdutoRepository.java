package app.kyros.backend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
    
}