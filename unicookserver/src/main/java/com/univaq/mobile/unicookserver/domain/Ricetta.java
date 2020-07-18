package com.univaq.mobile.unicookserver.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ricette")
public class Ricetta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RICETTA", nullable = false)
    private Long IDricetta;

    @Column(name = "NOME_RICETTA", nullable = false)
    private String nomericetta;

    @Column(name = "DESCRIZIONE", nullable = false)
    private String descrizione;

    @Column(name = "PREPARAZIONE", nullable = false, length = 2000)
    private String preparazione;

    @Enumerated(EnumType.STRING)
    private TipologiaTempoCottura tempocottura;

    @Enumerated(EnumType.STRING)
    private TipologiaDifficolta difficolta;

    @Column(name = "DATA", nullable = false)
    private Date data;

    @Column(name = "ORA", nullable = false)
    private String ora;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA", nullable = false)
    private Categoria categoria;

    @ManyToMany
    @JoinTable(name = "RICETTA_INGREDIENTI",
               joinColumns = {@JoinColumn(name = "ID_RICETTA")},
               inverseJoinColumns = {@JoinColumn(name = "ID_INGREDIENTE")})
    private Set<Ingrediente> ingredienti = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "RICETTA_IMMAGINI",
            joinColumns = {@JoinColumn(name = "ID_RICETTA")},
            inverseJoinColumns = {@JoinColumn(name = "ID_PHOTO")})
    private Set<Photo> immagini = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "ID_UTENTE", nullable = false)
    private Utente utente;

    public Long getIDricetta() {
        return IDricetta;
    }

    public void setIDricetta(Long IDricetta) {
        this.IDricetta = IDricetta;
    }

    public String getNomericetta() {
        return nomericetta;
    }

    public void setNomericetta(String nomericetta) {
        this.nomericetta = nomericetta;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getPreparazione() {
        return preparazione;
    }

    public void setPreparazione(String preparazione) {
        this.preparazione = preparazione;
    }

    public TipologiaTempoCottura getTempocottura() {
        return tempocottura;
    }

    public void setTempocottura(TipologiaTempoCottura tempocottura) {
        this.tempocottura = tempocottura;
    }

    public TipologiaDifficolta getDifficolta() {
        return difficolta;
    }

    public void setDifficolta(TipologiaDifficolta difficolta) {
        this.difficolta = difficolta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Ingrediente> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(Set<Ingrediente> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public Set<Photo> getImmagini() {
        return immagini;
    }

    public void setImmagini(Set<Photo> immagini) {
        this.immagini = immagini;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
