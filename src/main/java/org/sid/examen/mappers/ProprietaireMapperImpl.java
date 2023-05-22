package org.sid.examen.mappers;

import org.sid.examen.entities.Proprietaire;
import org.sid.examen.web.grpc.stub.ProprietaireOuterClass;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProprietaireMapperImpl {
    public ProprietaireOuterClass.Proprietaire fromProprietaire(Proprietaire proprietaire){
        ProprietaireOuterClass.Proprietaire proprietaire1 = ProprietaireOuterClass.Proprietaire.newBuilder()
                .setId(proprietaire.getId())
                .setNom(proprietaire.getNom())
                .setDateNaissance(10302)
                .setEmail(proprietaire.getEmail())
                .build();
        return proprietaire1;
    }
    public Proprietaire fromGrpcProprietaire(ProprietaireOuterClass.Proprietaire proprietaire){
        Proprietaire proprietaire1 = new Proprietaire();
        proprietaire1.setId(proprietaire.getId());
        proprietaire1.setNom(proprietaire.getNom());
        proprietaire1.setDateNaissance(new Date(1999,12,1));
        proprietaire1.setEmail(proprietaire.getEmail());
        return proprietaire1;
    }
}
