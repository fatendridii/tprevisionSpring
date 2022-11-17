package tn.esprit.tprevision.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.tprevision.entity.Stock;
import tn.esprit.tprevision.generique.RestControllerGenerique;

@RestController
@RequestMapping("/stock")
public class StockController extends RestControllerGenerique<Stock,Integer> {
}
