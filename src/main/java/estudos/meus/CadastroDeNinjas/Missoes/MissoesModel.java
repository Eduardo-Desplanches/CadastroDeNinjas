package estudos.meus.CadastroDeNinjas.Missoes;

import estudos.meus.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;

    //@OneToMany -> Uma única missão pode ter muitos ninjas.
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
