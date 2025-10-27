package org.sid.springdatatp1;

import org.sid.springdatatp1.enums.Genre;
import org.sid.springdatatp1.model.Etudiant;
import org.sid.springdatatp1.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataTp1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataTp1Application.class, args);
    }
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public void run (String... args) throws Exception{
        Etudiant et1= Etudiant.builder()
                .nom("Algui")
                .prenom("Rania")
                .genre(Genre.Femme)
                .build();
        etudiantRepository.save(et1);

        Etudiant et2= Etudiant.builder()
                .nom("Idrissi Khamlichi")
                .prenom("Abdelhadi")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et2);

        Etudiant et3= Etudiant.builder()
                .nom("Chtiken")
                .prenom("Khaoula")
                .genre(Genre.Femme)
                .build();
        etudiantRepository.save(et3);
    }
}
