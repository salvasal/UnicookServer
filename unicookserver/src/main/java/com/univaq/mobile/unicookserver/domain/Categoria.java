package com.univaq.mobile.unicookserver.domain;

import javax.persistence.*;

@Entity
@Table(name = "categorie")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA", nullable = false)
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
