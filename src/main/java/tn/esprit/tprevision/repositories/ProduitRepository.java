package tn.esprit.tprevision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision.entity.Produit;


public interface ProduitRepository extends JpaRepository<Produit,Integer> {
}
