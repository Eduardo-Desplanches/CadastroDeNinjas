package estudos.meus.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository< A Claase observada, tipo do ID>
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
