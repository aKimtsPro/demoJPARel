package bstorm.akimts.demo_jpa_rel;

import bstorm.akimts.demo_jpa_rel.models.entity.Carburant;
import bstorm.akimts.demo_jpa_rel.models.entity.Utilisateur;
import bstorm.akimts.demo_jpa_rel.models.entity.Voiture;
import bstorm.akimts.demo_jpa_rel.repository.UtilisateurRepository;
import bstorm.akimts.demo_jpa_rel.repository.VoitureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoJpaRelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoJpaRelApplication.class, args);

		VoitureRepository vRepo = ctx.getBean(VoitureRepository.class);
		UtilisateurRepository uRepo = ctx.getBean(UtilisateurRepository.class);

		Voiture v = new Voiture(
			0L,
			"marque",
			"modele",
			true,
			Carburant.ELECTRIQUE,
			null
		);
		Utilisateur u = new Utilisateur(
				10L,
				"username",
				"password",
				"nom",
				"prenom",
				null,
				null,
				null
		);

		v = vRepo.save(v);
		u.setVoitures( List.of(v) );
		u = uRepo.save(u);


	}

}
