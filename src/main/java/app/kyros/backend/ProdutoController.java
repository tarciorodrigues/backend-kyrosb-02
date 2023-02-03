package app.kyros.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/produto")
    public List<Produto> GetProdutos() {
        return produtoRepository.findAll();
    }
    @GetMapping("/produto{id}")
    public Produto GetProduto(@PathVariable Integer id) {
        return produtoRepository.findById(id).orElse(null);
    }
    @PostMapping("/produto")
    public Produto PostProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
    @PutMapping("/produto")
    public Produto PutProduto(@RequestBody Produto produto) {
        Produto oldProduto = produtoRepository.findById(produto.getId()).orElse(null);
        oldProduto.setNome(produto.getNome());
        oldProduto.setDescricao(produto.getDescricao());
        oldProduto.setStatus(produto.getStatus());
        oldProduto.setValorUnidade(produto.getValorUnidade());
        return produtoRepository.save(oldProduto);
    }
    @DeleteMapping("/produto{id}")
    public Integer DeleteProduto(@PathVariable Integer id) {
        produtoRepository.deleteById(id);
        return id;
    }
}