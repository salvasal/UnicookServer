package com.univaq.mobile.unicookserver;

import com.univaq.mobile.unicookserver.business.impl.repositories.*;
import com.univaq.mobile.unicookserver.domain.Categoria;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UnicookserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnicookserverApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(CategoriaRepository categoriaRepository, IngredienteRepository ingredienteRepository, PhotoRepository photoRepository, PreferitoRepository preferitoRepository, RicettaRepository ricettaRepository, UtenteRepository utenteRepository, ValutazioneRepository valutazioneRepository) {
        return (args) -> {
            Categoria antipasto = new Categoria();
            antipasto.setNome("Antipasti");
            categoriaRepository.save(antipasto);

            Categoria primi = new Categoria();
            primi.setNome("Primi Piatti");
            categoriaRepository.save(primi);

            Categoria secondi = new Categoria();
            secondi.setNome("Secondi Piatti");
            categoriaRepository.save(secondi);

            Categoria contorni = new Categoria();
            contorni.setNome("Contorni");
            categoriaRepository.save(contorni);

            Categoria dolci = new Categoria();
            dolci.setNome("Dolci");
            categoriaRepository.save(dolci);
        };
    }

}
