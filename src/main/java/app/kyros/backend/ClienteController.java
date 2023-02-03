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
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public List<Cliente> GetClientes() {
        return clienteRepository.findAll();
    }
    @GetMapping("/cliente{id}")
    public Cliente GetCliente(@PathVariable Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }
    @PostMapping("/cliente")
    public Cliente PostCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    @PutMapping("/cliente")
    public Cliente PutCliente(@RequestBody Cliente cliente) {
        Cliente oldCliente = clienteRepository.findById(cliente.getId()).orElse(null);
        oldCliente.setNome(cliente.getNome());
        oldCliente.setNascimento(cliente.getNascimento());
        oldCliente.setEndereco(cliente.getEndereco());
        oldCliente.setCpfCnpj(cliente.getCpfCnpj());
        oldCliente.setPfPJ(cliente.getPfPJ());
        return clienteRepository.save(oldCliente);
    }
    @DeleteMapping("/cliente{id}")
    public Integer DeleteCliente(@PathVariable Integer id) {
        clienteRepository.deleteById(id);
        return id;
    }
}