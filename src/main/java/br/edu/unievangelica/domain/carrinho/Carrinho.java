package br.edu.unievangelica.domain.carrinho;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Getter
@Setter
@Entity
@Table(name = "carrinho")
public class Carrinho implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carrinho_id_seq")
    @SequenceGenerator(name = "carrinho_id_seq", sequenceName = "carrinho_id_seq", allocationSize = 1)
    @Column(name = "id")
    @Getter
    private long id;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "nome")
    private String nome;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "sobrenome")
    private String sobrenome;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "cpf")
    private String cpf;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "cep")
    private Double cep;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "complemento")
    private String complemento;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "rua")
    private String rua;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "numero")
    private String numero;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "cidade")
    private String cidade;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "estado")
    private String estado;

}