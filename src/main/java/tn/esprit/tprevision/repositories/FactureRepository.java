package tn.esprit.tprevision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision.entity.Facture;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
