package io.github.brunosrrs;

import io.github.brunosrrs.domain.entity.Cliente;
import io.github.brunosrrs.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class VendasApplication {


    //inicio da aplicação spring
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
