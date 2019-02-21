package dev.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;

@Component
public class StartupDataInit {

    @Autowired
    CollegueRepo collegueRepo;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {

    	this.collegueRepo.save(new Collegue("Lavivrière", -7, "https://www.griswoldhomecare.com/wp-content/uploads/2015/12/bigstock-Portrait-of-an-angry-senior-fr-129125954.jpg"));
    	this.collegueRepo.save(new Collegue("Dupont", 9, "https://www.syfy.com/sites/syfy/files/styles/1200x680/public/dbyxh9iu8aa-vgm.jpg-large.jpeg"));
    	this.collegueRepo.save(new Collegue("Banner", 5, "https://www.telestar.fr/var/telestar/storage/images/article/chefs-france-2-qui-est-jerome-le-banner-le-terrifiant-caid-de-la-prison-photos-252168/1561419-1-fre-FR/Chefs-France-2-qui-est-Jerome-Le-Banner-le-terrifiant-caid-de-la-prison-Photos.jpg"));
    	

    }
}
