package br.com.equipe04.CRUDCamisa10.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Animal {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String nome;
    private String raca;
    private int dentes;
}
