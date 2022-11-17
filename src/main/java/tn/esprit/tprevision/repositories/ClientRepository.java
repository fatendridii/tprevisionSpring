package tn.esprit.tprevision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision.entity.Client;


public interface ClientRepository extends JpaRepository<Client,Integer> {
}
