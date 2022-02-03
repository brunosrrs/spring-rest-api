package io.github.brunosrrs.service;

import io.github.brunosrrs.domain.entity.Pedido;
import io.github.brunosrrs.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar (PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto (Integer id);
}
