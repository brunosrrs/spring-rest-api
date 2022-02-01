package io.github.brunosrrs.service;

import io.github.brunosrrs.domain.entity.Pedido;
import io.github.brunosrrs.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar (PedidoDTO dto);
}
