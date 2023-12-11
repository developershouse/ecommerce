package org.sid.secservice.service;

import org.sid.secservice.entities.Commande;

import java.util.List;

public interface CommandeService  {
    List<Commande> listCommande();
    Commande addCommande(Commande commande);
    Commande deleteCommande(Long id);
    Commande UpdateCommande(Commande commande);
}
