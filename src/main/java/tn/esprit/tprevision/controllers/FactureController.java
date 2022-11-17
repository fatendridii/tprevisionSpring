package tn.esprit.tprevision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tprevision.entity.Facture;
import tn.esprit.tprevision.services.IFactureService;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController {
    @Autowired
    IFactureService iFactureService ;


    @PostMapping
    public Facture addFacture(@RequestBody Facture f)
    {
        return iFactureService.addFacture(f);
    }
    @DeleteMapping("/{idFact}")
    public void removeFacture(@PathVariable long idFact)
    {
        iFactureService.removeFacture(idFact);
    }
    @PutMapping
    public Facture updateFacture(@RequestBody Facture f)
    {
        return iFactureService.updateFacture(f);
    }
    @GetMapping
    public List<Facture> findAllFactures()
    {
        return iFactureService.getAllFactures();
    }
    @GetMapping("/{idFact}")
    public Facture findFactureById(@PathVariable long idFact)
    {
        return iFactureService.getById(idFact);
    }
}
