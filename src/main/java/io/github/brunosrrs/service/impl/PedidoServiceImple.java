package io.github.brunosrrs.service.impl;

import io.github.brunosrrs.domain.repository.Pedidos;
import io.github.brunosrrs.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImple implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImple(Pedidos repository) {
        this.repository = repository;
    }
}
