package io.github.brunosrrs.domain.repository;

import io.github.brunosrrs.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository <Pedido, Integer> {
}
