package com.univaq.mobile.unicookserver.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "preferiti")
public class Preferito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PREFERITO", nullable = false)
    private Long IDpreferito;

    @Column(name = "DATA", nullable = false)
    private Date data;

    @ManyToOne
    @JoinColumn(name = "ID_UTENTE", nullable = false)
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "ID_RICETTA", nullable = false)
    private Ricetta ricetta;

    public Long getIDpreferito() {
        return IDpreferito;
    }

    public void setIDpreferito(Long IDpreferito) {
        this.IDpreferito = IDpreferito;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Ricetta getRicetta() {
        return ricetta;
    }

    public void setRicetta(Ricetta ricetta) {
        this.ricetta = ricetta;
    }
}
