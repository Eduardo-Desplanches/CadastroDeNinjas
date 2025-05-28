package estudos.meus.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    /*Devem se minúsculo as rotas*/
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }


    //Mostrar todos os ninjas(READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja";
    }


    //Mostrar ninja por id (READ)
    @GetMapping("/todosid")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar Ninja por Id";
    }


    //Altera dados dos ninjas (UPDATE)
    @PutMapping("/alterarid")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por Id";
    }

    //Deletar ninja (DELETE)
    @DeleteMapping("/deletarid")
    public String deletarNinjaPorId(){
        return  "Deletar Ninja por Id";
    }
}
