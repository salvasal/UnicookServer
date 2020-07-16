package com.univaq.mobile.unicookserver;

import com.univaq.mobile.unicookserver.business.impl.repositories.*;
import com.univaq.mobile.unicookserver.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;

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

            Photo img1 = new Photo();
            img1.setWebviewpath("images/antipasto.jpg");
            photoRepository.save(img1);

            Photo img2 = new Photo();
            img2.setWebviewpath("images/primo.jpg");
            photoRepository.save(img2);

            Photo img3 = new Photo();
            img3.setWebviewpath("images/secondo.jpg");
            photoRepository.save(img3);

            Photo img4 = new Photo();
            img4.setWebviewpath("images/contorno.jpg");
            photoRepository.save(img4);

            Photo img5 = new Photo();
            img5.setWebviewpath("images/dolce.jpg");
            photoRepository.save(img5);

            Ricetta antipastomisto = new Ricetta();
            antipastomisto.setNomericetta("Antipasto misto");
            antipastomisto.setDescrizione("Questa è una ricetta fake per verificare se il contenuto del campo descrizione sia totalmente leggibile");
            antipastomisto.setPreparazione("Questa è una ricetta fake per verificare se il contenuto del campo preparazione sia totalmente leggibile");
            antipastomisto.setTempocottura(TipologiaTempoCottura.trenta);
            antipastomisto.setDifficolta(TipologiaDifficolta.MEDIO);
            antipastomisto.setData(java.sql.Date.valueOf("2020-06-24"));
            antipastomisto.setOra("10:30");
            antipastomisto.setCategoria(antipasto);
            Set<Ingrediente> ingredientiRicetta1 = new HashSet<>();
            ingredientiRicetta1.add(ingr1);
            ingredientiRicetta1.add(ingr2);
            antipastomisto.setIngredienti(ingredientiRicetta1);
            Set<Photo> photosRicetta1 = new HashSet<>();
            photosRicetta1.add(img1);
            antipastomisto.setImmagini(photosRicetta1);
            antipastomisto.setUtente(lorenzo);
            ricettaRepository.save(antipastomisto);

            Ricetta carbonara = new Ricetta();
            carbonara.setNomericetta("Carbonara");
            carbonara.setDescrizione("Questa è una ricetta fake per verificare se il contenuto del campo descrizione sia totalmente leggibile");
            carbonara.setPreparazione("Questa è una ricetta fake per verificare se il contenuto del campo preparazione sia totalmente leggibile");
            carbonara.setTempocottura(TipologiaTempoCottura.trenta);
            carbonara.setDifficolta(TipologiaDifficolta.FACILE);
            carbonara.setData(java.sql.Date.valueOf("2020-06-24"));
            carbonara.setOra("10:30");
            carbonara.setCategoria(primi);
            Set<Ingrediente> ingredientiRicetta2 = new HashSet<>();
            ingredientiRicetta2.add(ingr3);
            ingredientiRicetta2.add(ingr4);
            ingredientiRicetta2.add(ingr5);
            ingredientiRicetta2.add(ingr6);
            carbonara.setIngredienti(ingredientiRicetta2);
            Set<Photo> photosRicetta2 = new HashSet<>();
            photosRicetta2.add(img2);
            carbonara.setImmagini(photosRicetta2);
            carbonara.setUtente(lorenzo);
            ricettaRepository.save(carbonara);

            Ricetta bistecca = new Ricetta();
            bistecca.setNomericetta("Bistecca ai ferri");
            bistecca.setDescrizione("Questa è una ricetta fake per verificare se il contenuto del campo descrizione sia totalmente leggibile");
            bistecca.setPreparazione("Questa è una ricetta fake per verificare se il contenuto del campo preparazione sia totalmente leggibile");
            bistecca.setTempocottura(TipologiaTempoCottura.trenta);
            bistecca.setDifficolta(TipologiaDifficolta.FACILE);
            bistecca.setData(java.sql.Date.valueOf("2020-06-24"));
            bistecca.setOra("10:30");
            bistecca.setCategoria(secondi);
            Set<Ingrediente> ingredientiRicetta3 = new HashSet<>();
            ingredientiRicetta3.add(ingr7);
            ingredientiRicetta3.add(ingr8);
            ingredientiRicetta3.add(ingr9);
            bistecca.setIngredienti(ingredientiRicetta3);
            Set<Photo> photosRicetta3 = new HashSet<>();
            photosRicetta3.add(img3);
            bistecca.setImmagini(photosRicetta3);
            bistecca.setUtente(ludovico);
            ricettaRepository.save(bistecca);

            Ricetta bastoncini = new Ricetta();
            bastoncini.setNomericetta("Bastoncini di zucchine");
            bastoncini.setDescrizione("Questa è una ricetta fake per verificare se il contenuto del campo descrizione sia totalmente leggibile");
            bastoncini.setPreparazione("Questa è una ricetta fake per verificare se il contenuto del campo preparazione sia totalmente leggibile");
            bastoncini.setTempocottura(TipologiaTempoCottura.trenta);
            bastoncini.setDifficolta(TipologiaDifficolta.DIFFICILE);
            bastoncini.setData(java.sql.Date.valueOf("2020-06-24"));
            bastoncini.setOra("10:30");
            bastoncini.setCategoria(contorni);
            Set<Ingrediente> ingredientiRicetta4 = new HashSet<>();
            ingredientiRicetta4.add(ingr10);
            bastoncini.setIngredienti(ingredientiRicetta4);
            Set<Photo> photosRicetta4 = new HashSet<>();
            photosRicetta4.add(img4);
            bastoncini.setImmagini(photosRicetta4);
            bastoncini.setUtente(ludovico);
            ricettaRepository.save(bastoncini);

            Ricetta tiramisu = new Ricetta();
            tiramisu.setNomericetta("Tiramisù");
            tiramisu.setDescrizione("Questa è una ricetta fake per verificare se il contenuto del campo descrizione sia totalmente leggibile");
            tiramisu.setPreparazione("Questa è una ricetta fake per verificare se il contenuto del campo preparazione sia totalmente leggibile");
            tiramisu.setTempocottura(TipologiaTempoCottura.sessanta);
            tiramisu.setDifficolta(TipologiaDifficolta.MEDIO);
            tiramisu.setData(java.sql.Date.valueOf("2020-06-24"));
            tiramisu.setOra("10:30");
            tiramisu.setCategoria(dolci);
            Set<Ingrediente> ingredientiRicetta5 = new HashSet<>();
            ingredientiRicetta5.add(ingr3);
            ingredientiRicetta5.add(ingr11);
            ingredientiRicetta5.add(ingr12);
            ingredientiRicetta5.add(ingr13);
            ingredientiRicetta5.add(ingr14);
            tiramisu.setIngredienti(ingredientiRicetta5);
            Set<Photo> photosRicetta5 = new HashSet<>();
            photosRicetta5.add(img5);
            tiramisu.setImmagini(photosRicetta5);
            tiramisu.setUtente(salvatore);
            ricettaRepository.save(tiramisu);
        };
    }

}
