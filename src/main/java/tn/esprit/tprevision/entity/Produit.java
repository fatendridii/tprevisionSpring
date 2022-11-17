package tn.esprit.tprevision.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;
    @ManyToMany
    List<Fournisseur> fournisseurs;
    @ManyToOne
    Rayon rayon;
    @ManyToOne
    Stock stock;
    @OneToOne
    DetailProduit detailProduit;
    @OneToMany(mappedBy = "produit")
    List<DetailFacture> detailFactures;

}
