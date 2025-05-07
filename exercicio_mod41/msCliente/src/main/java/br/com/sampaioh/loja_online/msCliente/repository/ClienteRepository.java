package br.com.sampaioh.loja_online.msCliente.repository;

import br.com.sampaioh.loja_online.msCliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}