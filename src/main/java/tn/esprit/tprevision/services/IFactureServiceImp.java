package tn.esprit.tprevision.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tprevision.entity.Facture;
import tn.esprit.tprevision.repositories.FactureRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class IFactureServiceImp implements IFactureService {
    FactureRepository factureRepository;
    @Override
    public Facture addFacture(Facture f) {
        return factureRepository.save(f);
    }

    @Override
    public Facture updateFacture(Facture f) {
        return factureRepository.save(f);
    }

    @Override
    public Facture getById(Long idFact) {
        return factureRepository.findById(idFact).orElse(null);
    }

    @Override
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void removeFacture(Long idFact) {
        factureRepository.deleteById(idFact);
    }
}
