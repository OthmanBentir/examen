package org.sid.examen.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity @NoArgsConstructor
@AllArgsConstructor @Builder @Data
public class Proprietaire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String email;
    @OneToMany(mappedBy = "proprietaire",fetch = FetchType.LAZY)
    private List<Vehicule> vehicules;
}
