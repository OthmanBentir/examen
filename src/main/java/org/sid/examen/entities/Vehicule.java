package org.sid.examen.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Builder @Data
public class Vehicule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroMatricule;
    private String marque;
    private Integer puissanceFiscale;
    private String modele;
    @ManyToOne
    private Proprietaire proprietaire;
}
