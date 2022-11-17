package tn.esprit.tprevision.services;


import tn.esprit.tprevision.entity.Produit;
import tn.esprit.tprevision.generique.IGeneriqueService;

public interface IProduitService extends IGeneriqueService<Produit,Integer> {
    void assignProduitToStock(Integer idProduit, Integer idStock);
}
