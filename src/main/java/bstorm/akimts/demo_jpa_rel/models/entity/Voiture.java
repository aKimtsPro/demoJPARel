package bstorm.akimts.demo_jpa_rel.models.entity;

import lombok.*;
import org.springframework.data.annotation.Persistent;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "voiture")
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT")
    private Long id;

    @Column(name = "marque", nullable = false, length = 20)
    private String marque;

    @Column(name = "modele", nullable = false, length = 20)
    private String modele;

    @Column(name = "disponible", nullable = false)
    private boolean disponible;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private Carburant carburant;

    @ManyToMany(mappedBy = "voitures")
    private List<Utilisateur> proprietaires;

}