package org.sid.examen.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.sid.examen.entities.Proprietaire;
import org.sid.examen.entities.Vehicule;
import org.sid.examen.repositories.ProprietaireRepository;
import org.sid.examen.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@WebService
@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ImmatriculationSoapService {

    private ProprietaireRepository proprietaireRepository;
    private VehiculeRepository vehiculeRepository;

    @WebMethod
    public List<Proprietaire> proprietaireList(){
        return proprietaireRepository.findAll();
    }

    @WebMethod(operationName = "proprietaireById")
    public Proprietaire proprietaireById(@WebParam(name = "id") Long id){
        Proprietaire proprietaire = proprietaireRepository.findById(id).get();
        return proprietaire;
    }

    @WebMethod(operationName = "vehiculeList")
    public List<Vehicule> vehiculeList(){
        return vehiculeRepository.findAll();
    }

    @WebMethod(operationName = "vehiculeById")
    public Vehicule vehiculeById(@WebParam(name = "id") Long id){
        Vehicule vehicule = vehiculeRepository.findById(id).get();
        return vehicule;
    }

}
