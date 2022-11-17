package tn.esprit.tprevision.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tprevision.entity.Client;

import tn.esprit.tprevision.generique.RestControllerGenerique;

@RestController
@RequestMapping("/client")
public class ClientController extends RestControllerGenerique<Client,Integer> {
}
