package org.sid.examen.web.soap;

import jakarta.xml.ws.Endpoint;
import org.sid.examen.repositories.ProprietaireRepository;
import org.sid.examen.repositories.VehiculeRepository;

public class ServerJWS {

    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new ImmatriculationSoapService());
    }
}
