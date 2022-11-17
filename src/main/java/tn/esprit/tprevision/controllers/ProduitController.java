package tn.esprit.tprevision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.tprevision.entity.Produit;
import tn.esprit.tprevision.generique.RestControllerGenerique;
import tn.esprit.tprevision.services.IProduitService;


@RestController
@RequestMapping("/produit")
public class ProduitController extends RestControllerGenerique<Produit,Integer> {
    @Autowired
    IProduitService iProduitService;

    @PutMapping("/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Integer idProduit, @PathVariable Integer idStock)
    {
        iProduitService.assignProduitToStock(idProduit,idStock);

    }
}
