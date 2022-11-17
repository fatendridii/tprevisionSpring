package tn.esprit.tprevision.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tprevision.entity.Client;

import tn.esprit.tprevision.generique.IGeneriqueServiceIMP;
@AllArgsConstructor
@Service
public class IClientServiceImp extends IGeneriqueServiceIMP<Client,Integer> implements IClientService{
}
