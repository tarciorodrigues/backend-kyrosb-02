package app.kyros.backend.Entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue
    private int id;
    private String Nome;
    private String Nascimento;
    private String Endereco;
    private String CpfCnpj;
    private String PfPJ;

    @ManyToMany(mappedBy="idCliente")
    List<Lancamento> lancamentos;
}