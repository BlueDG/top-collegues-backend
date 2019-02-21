package dev.top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;

@RestController
@CrossOrigin // autorise les requêtes http entre des ports différents, ici 4200 pour le front et 8080 pour le back
@RequestMapping("/collegues") // le mapping c'est qu'à chaque fois que tu taperas localhost avec au bout /collegues tu mettras en application ce que tu as mis sous 
// @getmapping, à savoir ici findall, taper /collegues t'apportera donc la liste de tous tes collegues à l'écran
public class CollegueCtrl {

    @Autowired
    private CollegueRepo collegueRepo;

    // requête GET /versions
    // http://localhost:8080/versions
    @GetMapping
    public List<Collegue> findAll() {
        return this.collegueRepo.findAll();
        
        
        
    }
}
