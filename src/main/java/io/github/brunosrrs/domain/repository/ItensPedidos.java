package io.github.brunosrrs.domain.repository;

import io.github.brunosrrs.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedidos extends JpaRepository <ItemPedido, Integer> {
}
