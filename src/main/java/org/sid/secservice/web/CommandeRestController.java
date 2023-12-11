package org.sid.secservice.web;

import org.sid.secservice.entities.Commande;
import org.sid.secservice.repo.CommandeRepository;
import org.sid.secservice.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommandeRestController {
   private CommandeService commandeService;
    private  CommandeRepository commandeRepository;

    public CommandeRestController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    public CommandeRestController(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Autowired
    public CommandeRestController(CommandeService commandeService, CommandeRepository commandeRepository) {
        this.commandeService = commandeService;
        this.commandeRepository = commandeRepository;
    }

    @PostMapping(path = "/addcommande")
    public Commande saveCommande (@RequestBody Commande commande) {
        return commandeService.addCommande(commande);
    }
    @GetMapping(path = "/commandes")
    public List<Commande> Commandes() {
        return commandeService.listCommande();
    }
    @PutMapping("/update-commande")
    public Commande updateCommande(@RequestBody Commande commande) {
        Commande commandesaved= commandeService.UpdateCommande(commande);
        return commandesaved;
    }
    @DeleteMapping("/remove-commande/{commande-id}")
    public void removeCommande(@PathVariable("commande-id") Long id) {
        commandeService.deleteCommande(id);
    }
}
