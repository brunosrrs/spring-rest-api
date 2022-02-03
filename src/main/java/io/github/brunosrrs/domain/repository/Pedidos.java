package io.github.brunosrrs.domain.repository;

import io.github.brunosrrs.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface Pedidos extends JpaRepository <Pedido, Integer> {

    //pode ser que o pedido nao exista por isso OPTIONAL
    @Query("select p from Pedido p left join fetch p.itens where p.id = :id")
    Optional<Pedido> findByIdFetchItens(@Param("id") Integer id);
}
