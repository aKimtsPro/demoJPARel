package bstorm.akimts.demo_jpa_rel.repository;

import bstorm.akimts.demo_jpa_rel.models.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
