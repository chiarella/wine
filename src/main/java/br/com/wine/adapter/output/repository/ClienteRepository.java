package br.com.wine.adapter.output.repository;

import br.com.wine.adapter.output.data.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
