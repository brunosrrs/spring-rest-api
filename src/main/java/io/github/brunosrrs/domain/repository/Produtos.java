package io.github.brunosrrs.domain.repository;

import io.github.brunosrrs.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository <Produto, Integer>{

}
