package estudos.meus.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

// Criar rota para o servidor
//Controller perto do usuário
//Controller faz a requisição pelo usuário

@RestController //Diz que tudo será um controller
@RequestMapping ("/missoes")//Mapea a API
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    //Post -> Manda uma requisição para criar as missões
    @PostMapping("/criar")
    public String criarMissoes(){
        return "Missão Adicionada";
    }

    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    //Get -> Manda uma requisição para mostrar as missões
    @GetMapping("/listar/{id}")
    public MissoesModel mostrarMissoesPorId(@PathVariable Long id){
        return missoesService.listarMissoesPorId(id);
    }

    //Put -> Manda uma requisição para alterar as missões
    @PutMapping("/alterarid")
    public String alterarMissoes(){
        return "Alterando missões por Id";
    }

    //Delete -> Manda uma requisição para deletar as missões
    @DeleteMapping("/deletar/{id}")
    public void deletarMissoes(@PathVariable long  id){
        missoesService.deletarMissoes(id);
    }
}
