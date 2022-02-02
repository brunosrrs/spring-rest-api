package io.github.brunosrrs.domain.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
//anotation para dizer que é uma entidade JPA
@Entity
//@Table usada a menos que o nome da entidade seja diferente do nome da tabela;
public class Cliente {

    //Definição da primary key
    @Id
    //Annotation que simboliza o AUTO_INCREMENT
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column usada quando a propriedade tem o nome diferente da coluna na tabela;
    private Integer id;
    @Column(length = 100)
    private String nome;
    @Column(name = "cpf", length = 11)
    private String cpf;

    //relacionamento com a tabela pedido
    //mappedBy - qual a propriedade que esta fazendo esse link entre as tabelas
    //por padrão o fetch é LAZY, ou seja nao tras junto os dados de outra tabela
    @JsonIgnore
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private Set<Pedido> pedidos;

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

}
