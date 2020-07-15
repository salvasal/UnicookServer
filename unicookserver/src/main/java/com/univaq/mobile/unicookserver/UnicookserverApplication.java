package com.univaq.mobile.unicookserver;

import com.univaq.mobile.unicookserver.business.impl.repositories.*;
import com.univaq.mobile.unicookserver.domain.Categoria;
import com.univaq.mobile.unicookserver.domain.Ingrediente;
import com.univaq.mobile.unicookserver.domain.TipologiaSesso;
import com.univaq.mobile.unicookserver.domain.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class UnicookserverApplication {
    @Autowired
    private PasswordEncoder passwordEncoder;

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

            Ingrediente ingr1 = new Ingrediente();
            ingr1.setNome("Formaggio");
            ingredienteRepository.save(ingr1);

            Ingrediente ingr2 = new Ingrediente();
            ingr2.setNome("Salumi");
            ingredienteRepository.save(ingr2);

            Ingrediente ingr3 = new Ingrediente();
            ingr3.setNome("Uova");
            ingredienteRepository.save(ingr3);

            Ingrediente ingr4 = new Ingrediente();
            ingr4.setNome("Pasta");
            ingredienteRepository.save(ingr4);

            Ingrediente ingr5 = new Ingrediente();
            ingr5.setNome("Guanciale");
            ingredienteRepository.save(ingr5);

            Ingrediente ingr6 = new Ingrediente();
            ingr6.setNome("Pecorino");
            ingredienteRepository.save(ingr6);

            Ingrediente ingr7 = new Ingrediente();
            ingr7.setNome("Carne");
            ingredienteRepository.save(ingr7);

            Ingrediente ingr8 = new Ingrediente();
            ingr8.setNome("Sale");
            ingredienteRepository.save(ingr8);

            Ingrediente ingr9 = new Ingrediente();
            ingr9.setNome("Pepe");
            ingredienteRepository.save(ingr9);

            Ingrediente ingr10 = new Ingrediente();
            ingr10.setNome("Zucchine");
            ingredienteRepository.save(ingr10);

            Ingrediente ingr11 = new Ingrediente();
            ingr11.setNome("Mascarpone");
            ingredienteRepository.save(ingr11);

            Ingrediente ingr12 = new Ingrediente();
            ingr12.setNome("Cacao");
            ingredienteRepository.save(ingr12);

            Ingrediente ingr13 = new Ingrediente();
            ingr13.setNome("Caffè");
            ingredienteRepository.save(ingr13);

            Ingrediente ingr14 = new Ingrediente();
            ingr14.setNome("Savoiardi");
            ingredienteRepository.save(ingr14);

            Utente lorenzo = new Utente();
            lorenzo.setUsername("lorsalvi");
            lorenzo.setPassword(passwordEncoder.encode("ciao"));
            lorenzo.setChiaverecupero("c1");
            lorenzo.setNome("Lorenzo");
            lorenzo.setCognome("Salvi");
            lorenzo.setSesso(TipologiaSesso.UOMO);
            lorenzo.setDatanascita(java.sql.Date.valueOf("1993-08-10"));
            utenteRepository.save(lorenzo);

            Utente salvatore = new Utente();
            salvatore.setUsername("salvasal");
            salvatore.setPassword(passwordEncoder.encode("salvatore96"));
            salvatore.setChiaverecupero("c2");
            salvatore.setNome("Salvatore");
            salvatore.setCognome("Salernitano");
            salvatore.setSesso(TipologiaSesso.UOMO);
            salvatore.setDatanascita(java.sql.Date.valueOf("1996-05-01"));
            utenteRepository.save(salvatore);

            Utente ludovico = new Utente();
            ludovico.setUsername("ludodif");
            ludovico.setPassword(passwordEncoder.encode("cillo96"));
            ludovico.setChiaverecupero("cillo");
            ludovico.setNome("Ludovico");
            ludovico.setCognome("Di Federico");
            ludovico.setSesso(TipologiaSesso.UOMO);
            ludovico.setDatanascita(java.sql.Date.valueOf("1996-10-01"));
            utenteRepository.save(ludovico);
        };
    }

}
