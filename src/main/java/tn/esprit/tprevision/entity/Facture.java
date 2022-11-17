package tn.esprit.tprevision.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long idFacture;
    private float montantRemise;
    private float montantFacture;
    private Date dateFacture;
    private boolean active;
    @OneToMany(mappedBy = "facture")
    List<DetailFacture> detailFactures;
    @ManyToOne
    Client client;
}
