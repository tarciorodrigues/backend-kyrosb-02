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
public class Produto {
    @Id
    @GeneratedValue
    private int id;
    private String Nome;
    private String Descricao;
    private String Status;
    private int ValorUnidade;

    @ManyToMany(mappedBy="idProduto")
    List<Lancamento> lancamentos;
}