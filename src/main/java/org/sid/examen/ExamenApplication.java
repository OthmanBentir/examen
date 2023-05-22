package org.sid.examen;

import jakarta.xml.ws.Endpoint;
import org.sid.examen.entities.Proprietaire;
import org.sid.examen.entities.Vehicule;
import org.sid.examen.repositories.ProprietaireRepository;
import org.sid.examen.repositories.VehiculeRepository;
import org.sid.examen.web.soap.ImmatriculationSoapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.*;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ExamenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository){

     return args -> {Proprietaire proprietaire = Proprietaire.builder()
             .nom("othman")
             .dateNaissance(new Date(1999,1,1))
             .email("othma@enset.com")
             .build();
         proprietaireRepository.save(proprietaire);
         Vehicule vehicule01 = Vehicule.builder()
                 .marque("audi")
                 .modele("a3")
                 .numeroMatricule("123456")
                 .puissanceFiscale(8)
                 .proprietaire(proprietaire)
                 .build();
         vehiculeRepository.save(vehicule01);
         Vehicule vehicule02 = Vehicule.builder()
                 .marque("bmw")
                 .modele("serie3")
                 .numeroMatricule("123456")
                 .puissanceFiscale(9)
                 .proprietaire(proprietaire)
                 .build();
         vehiculeRepository.save(vehicule02);
     };

    }




}
