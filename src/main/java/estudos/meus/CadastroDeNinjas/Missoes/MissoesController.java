package estudos.meus.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

// Criar rota para o servidor
//Controller perto do usuário
//Controller faz a requisição pelo usuário

@RestController //Diz que tudo será um controller
@RequestMapping ("/missoes")//Mapea a API
public class MissoesController {

    //Post -> Manda uma requisição para criar as missões
    @PostMapping("/criar")
    public String criarMissoes(){
        return "Missão Adicionada";
    }
    @GetMapping("/listar")
    public String mostrarTodasMissoes(){
        return "Mostrando todas as missões";
    }

    //Get -> Manda uma requisição para mostrar as missões
    @GetMapping("/listarid")
    public String mostrarMissoesPorId(){
        return "Mostrando todas missão por Id";
    }

    //Put -> Manda uma requisição para alterar as missões
    @PutMapping("/alterarid")
    public String alterarMissoes(){
        return "Alterando missões por Id";
    }

    //Delete -> Manda uma requisição para deletar as missões
    @DeleteMapping("/deletarid")
    public String deletarMissoes(){
        return "Deletando missões por Id";
    }
}
