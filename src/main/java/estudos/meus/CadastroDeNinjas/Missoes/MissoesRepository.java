package estudos.meus.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository< A Claase observada, tipo do ID>
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {


}
