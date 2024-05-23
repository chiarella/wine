package br.com.wine.adapter.output.repository;

import br.com.wine.adapter.output.data.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
