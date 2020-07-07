package com.univaq.mobile.unicookserver.domain;

import javax.persistence.*;

@Entity
@Table(name = "ingredienti")
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INGREDIENTE", nullable = false)
    private Long IDingrediente;

    @Column(name = "NOME", nullable = false)
    private String nome;

    public Long getId() {
        return IDingrediente;
    }

    public void setId(Long id) {
        this.IDingrediente = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
