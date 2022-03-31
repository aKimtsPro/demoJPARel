package bstorm.akimts.demo_jpa_rel.repository;

import bstorm.akimts.demo_jpa_rel.models.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}
