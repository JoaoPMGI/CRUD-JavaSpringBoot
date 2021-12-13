package br.com.equipe04.CRUDCamisa10.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "coloracao")
    private String cor;

    private double quilometragem;
    private boolean seguro;
    private String chassi;
    private Date anoLancamento;
}
