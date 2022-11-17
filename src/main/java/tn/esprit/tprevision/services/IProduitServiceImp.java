package tn.esprit.tprevision.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import tn.esprit.tprevision.entity.Produit;
import tn.esprit.tprevision.entity.Stock;
import tn.esprit.tprevision.generique.IGeneriqueServiceIMP;
import tn.esprit.tprevision.repositories.ProduitRepository;
import tn.esprit.tprevision.repositories.StockRepository;


@AllArgsConstructor
@Service
public class IProduitServiceImp extends IGeneriqueServiceIMP<Produit,Integer> implements IProduitService{
    ProduitRepository produitRepository;
    StockRepository stockRepository;
    @Override
    public void assignProduitToStock(Integer idProduit, Integer idStock) {
        Produit produit = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);

        if (produit!=null && stock!=null){

            produit.setStock(stock);
            produitRepository.save(produit);
        }
    }
}
