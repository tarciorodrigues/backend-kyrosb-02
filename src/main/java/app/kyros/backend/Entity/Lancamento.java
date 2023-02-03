package app.kyros.backend.Entity;

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
public class Lancamento {
    @Id
    @GeneratedValue
    private int id;
    private int idCliente;
    private int idProduto;
    private int QuantidadeVendida;
    private String DataDaVenda;
    private int ValorTotalDaVenda;
       
}    

    
