package tn.esprit.tprevision.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import tn.esprit.tprevision.entity.Stock;
import tn.esprit.tprevision.generique.IGeneriqueServiceIMP;

@AllArgsConstructor
@Service
public class IStockServiceImp extends IGeneriqueServiceIMP<Stock,Integer> implements IStockService {
}
