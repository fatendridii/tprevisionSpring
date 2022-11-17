package tn.esprit.tprevision.services;

import tn.esprit.tprevision.entity.Facture;

import java.util.List;

public interface IFactureService {
    public Facture addFacture(Facture f);
    public Facture updateFacture(Facture f);
    public Facture getById(Long idFact);
    public List<Facture> getAllFactures();
    public void removeFacture(Long idFact);
}
