package bstorm.akimts.demo_jpa_rel.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String rue;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private int codePostal;

    @Column(nullable = false)
    private String localite;

    @OneToOne(mappedBy = "adresse")
    private Utilisateur habitant;
}