package io.github.brunosrrs.domain.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;


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

    public Cliente() {
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {

        this.pedidos = pedidos;
    }

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
