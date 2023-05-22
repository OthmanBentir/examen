package org.sid.examen.web.graphql;

import lombok.AllArgsConstructor;
import org.sid.examen.entities.Proprietaire;
import org.sid.examen.entities.Vehicule;
import org.sid.examen.repositories.ProprietaireRepository;
import org.sid.examen.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ImmatriculationGraphqlController {

    private ProprietaireRepository proprietaireRepository;
    private VehiculeRepository vehiculeRepository;

    @QueryMapping
    public List<Proprietaire> proprietaires(){
        return proprietaireRepository.findAll();
    }
    @QueryMapping
    public Proprietaire proprietaireById(@Argument Long id){
        return proprietaireRepository.findById(id).get();
    }

    @MutationMapping
    public Proprietaire saveProprietaire(@Argument Proprietaire proprietaire){
        return proprietaireRepository.save(proprietaire);
    }

    @QueryMapping
    public List<Vehicule> vehicules(){
        return vehiculeRepository.findAll();
    }
    @QueryMapping
    public Vehicule vehiculeById(@Argument Long id){
        return vehiculeRepository.findById(id).get();
    }

    @MutationMapping
    public Vehicule saveVehicule(@Argument Vehicule vehicule){
        return vehiculeRepository.save(vehicule);
    }


}
