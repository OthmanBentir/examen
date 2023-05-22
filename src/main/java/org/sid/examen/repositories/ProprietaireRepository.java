package org.sid.examen.repositories;


import org.sid.examen.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ProprietaireRepository extends JpaRepository<Proprietaire,Long> {

}
