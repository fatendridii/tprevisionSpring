package tn.esprit.tprevision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tprevision.entity.Stock;


public interface StockRepository extends JpaRepository<Stock,Integer> {
}
