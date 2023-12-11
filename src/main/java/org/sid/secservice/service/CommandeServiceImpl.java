package org.sid.secservice.service;

import org.sid.secservice.entities.Commande;
import org.sid.secservice.repo.CommandeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class CommandeServiceImpl implements CommandeService{
    private CommandeRepository commandeRepository;

    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public List<Commande> listCommande() {
        return null;
    }

    @Override
    public Commande addCommande(Commande commande) {
       return this.commandeRepository.save(commande);
    }

    @Override
    public Commande deleteCommande(Long id) {
        return null;
    }

    @Override
    public Commande UpdateCommande(Commande commande) {
        return null;
    }
}
