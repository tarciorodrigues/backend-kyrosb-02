package app.kyros.backend.Controller;

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

import app.kyros.backend.Entity.Lancamento;
import app.kyros.backend.Repository.LancamentoRepository;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class LancamentoController {
    @Autowired
    private LancamentoRepository lancamentoRepository;

    @GetMapping("/lancamento")
    public List<Lancamento> GetLancamentos() {
        return lancamentoRepository.findAll();
    }
    @GetMapping("/lancamento{id}")
    public Lancamento GetLancamento(@PathVariable Integer id) {
        return lancamentoRepository.findById(id).orElse(null);
    }
    @PostMapping("/lancamento")
    public Lancamento PostLancamento(@RequestBody Lancamento lancamento) {
        return lancamentoRepository.save(lancamento);
    }
    @PutMapping("/lancamento")
    public Lancamento PutLancamento(@RequestBody Lancamento lancamento) {
        Lancamento oldLancamento = lancamentoRepository.findById(lancamento.getId()).orElse(null);
        oldLancamento.setIdCliente(lancamento.getIdCliente());
        oldLancamento.setIdProduto(lancamento.getIdProduto());
        oldLancamento.setQuantidadeVendida(lancamento.getQuantidadeVendida());
        oldLancamento.setDataDaVenda(lancamento.getDataDaVenda());
        oldLancamento.setValorTotalDaVenda(lancamento.getValorTotalDaVenda());
        return lancamentoRepository.save(oldLancamento);
    }
    @DeleteMapping("/lancamento{id}")
    public Integer DeleteLancamento(@PathVariable Integer id) {
        lancamentoRepository.deleteById(id);
        return id;
    }
}