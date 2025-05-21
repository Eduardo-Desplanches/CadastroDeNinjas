package estudos.meus.CadastroDeNinjas.Ninjas;
import estudos.meus.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity -> transforma uma class em uma entidade do BD (Banco de dados)

// JPA = Java Persistence API

// ORM -> Mapeamento objeto-relacional -> Faz a tradução dos tipos de dados do Java para o banco de dados, mapeando os objetos da classe e traduz para banco de dados
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "") -> decide o nome da coluna se quisermos especificar se não é nome da variável.
    private Long id;
    private String nome;


    private String imgUrl;

    @Column(unique = true)
    private String email;
    private int idade;

    //  @ManytoOne -> muitos ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrageira -> FK
    private MissoesModel missoes;


}




