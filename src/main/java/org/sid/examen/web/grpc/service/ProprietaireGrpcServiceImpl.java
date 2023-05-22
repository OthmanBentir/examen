package org.sid.examen.web.grpc.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sid.examen.entities.Proprietaire;
import org.sid.examen.mappers.ProprietaireMapperImpl;
import org.sid.examen.repositories.ProprietaireRepository;
import org.sid.examen.web.grpc.stub.ProprietaireOuterClass;
import org.sid.examen.web.grpc.stub.ProprietaireServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class ProprietaireGrpcServiceImpl extends ProprietaireServiceGrpc.ProprietaireServiceImplBase {

    @Autowired
    private ProprietaireRepository proprietaireRepository;

    @Autowired
    private ProprietaireMapperImpl proprietaireMapper;
    @Override
    public void getListProprietaire(ProprietaireOuterClass.GetListProprietaireRequest request, StreamObserver<ProprietaireOuterClass.GetListProprietaireResponse> responseObserver) {
        List<Proprietaire> proprietaires = proprietaireRepository.findAll();
        List<ProprietaireOuterClass.Proprietaire> grpcProprietaireList= proprietaires.stream().map(proprietaire -> proprietaireMapper.fromProprietaire(proprietaire)).collect(Collectors.toList());
        ProprietaireOuterClass.GetListProprietaireResponse listProprietaireResponse = ProprietaireOuterClass.GetListProprietaireResponse.newBuilder()
                .addAllProprietaire(grpcProprietaireList)
                .build();
        responseObserver.onNext(listProprietaireResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getProprietaire(ProprietaireOuterClass.GetProprietaireRequest request, StreamObserver<ProprietaireOuterClass.GetProprietaireResponse> responseObserver) {
        Long id = request.getId();
        Proprietaire proprietaire = proprietaireRepository.findById(id).orElse(null);
        if (proprietaire!=null){
            ProprietaireOuterClass.Proprietaire proprietaire1 = proprietaireMapper.fromProprietaire(proprietaire);
            /*
            * ProprietaireOuterClass.Proprietaire proprietaire1 = ProprietaireOuterClass.Proprietaire.newBuilder()
                    .setId(proprietaire.getId())
                    .setNom(proprietaire.getNom())
                    .setDateNaissance(10302)
                    .setEmail(proprietaire.getEmail())
                    .build();*/
            ProprietaireOuterClass.GetProprietaireResponse proprietaireResponse = ProprietaireOuterClass.GetProprietaireResponse.newBuilder()
                    .setProprietaire(proprietaire1)
                    .build();
            responseObserver.onNext(proprietaireResponse);
            responseObserver.onCompleted();
        }

    }
}
