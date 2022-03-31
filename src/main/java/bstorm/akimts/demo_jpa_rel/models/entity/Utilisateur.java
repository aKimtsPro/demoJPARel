package bstorm.akimts.demo_jpa_rel.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @Column(name = "num_nat", nullable = false)
    private Long numNational;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false, length = 30)
    private String nom;

    @Column(nullable = false, length = 30)
    private String prenom;

    @ManyToMany
    private List<Voiture> voitures;

    @OneToMany(mappedBy = "detenteur")
    private List<Permis> permis;

    @OneToOne
    private Adresse adresse;
}