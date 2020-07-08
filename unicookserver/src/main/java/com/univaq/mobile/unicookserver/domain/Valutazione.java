package com.univaq.mobile.unicookserver.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "valutazioni")
public class Valutazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_VALUTAZIONE", nullable = false)
    private Long IDvalutazione;

    @Column(name = "DATA", nullable = false)
    private Date data;

    @Column(name = "LIKE", nullable = false)
    private String like;

    @Column(name = "UNLIKE", nullable = false)
    private String unlike;

    @ManyToOne
    @JoinColumn(name = "ID_UTENTE", nullable = false)
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "ID_RICETTA", nullable = false)
    private Ricetta ricetta;

    public Long getIDvalutazione() {
        return IDvalutazione;
    }

    public void setIDvalutazione(Long IDvalutazione) {
        this.IDvalutazione = IDvalutazione;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getUnlike() {
        return unlike;
    }

    public void setUnlike(String unlike) {
        this.unlike = unlike;
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
