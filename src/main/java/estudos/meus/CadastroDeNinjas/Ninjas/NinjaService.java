package estudos.meus.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os meus ninjas

    public List <NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaModel listarNinjasPorId(Long id){
        Optional<NinjaModel> ninjaId = ninjaRepository.findById(id);
        return ninjaId.orElse(null);
    }
}
