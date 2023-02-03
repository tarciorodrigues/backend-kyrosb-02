package app.kyros.backend;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
}