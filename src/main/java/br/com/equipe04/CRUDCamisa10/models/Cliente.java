package br.com.equipe04.CRUDCamisa10.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Cliente {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String nome;
    private String cpf;
    private Date dataNasc;
}
