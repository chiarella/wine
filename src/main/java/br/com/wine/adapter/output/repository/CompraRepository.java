package br.com.wine.adapter.output.repository;

import br.com.wine.adapter.output.data.Compra;
import br.com.wine.adapter.output.dto.ComprasOrdenadasCrescenteValorDto;
import br.com.wine.adapter.output.dto.MaiorCompraDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CompraRepository extends JpaRepository<Compra, Long> {
	@Query("SELECT new br.com.wine.adapter.output.dto.ComprasOrdenadasCrescenteValorDto" +
			"(c.nome, c.cpf, com.codigo, com.quantidade, " +
			"(com.quantidade * p.preco), p.preco, safra, tipo_vinho, com.dataHoraCompra) " +
			"FROM Compra com " +
			"JOIN com.cliente c " +
			"JOIN Produto p ON p.codigo = com.codigo " +
			"ORDER BY (com.quantidade * p.preco) ASC")
	List<ComprasOrdenadasCrescenteValorDto> filtrar();

	@Query("SELECT new br.com.wine.adapter.output.dto.MaiorCompraDto" +
			"(c.nome, c.cpf, com.codigo, com.quantidade, " +
			"(com.quantidade * p.preco), p.preco, p.safra, p.tipo_vinho, com.dataHoraCompra) " +
			"FROM Compra com " +
			"JOIN com.cliente c " +
			"JOIN Produto p ON p.codigo = com.codigo " +
			"WHERE YEAR(com.dataHoraCompra) = :ano " +
			"AND (com.quantidade * p.preco) = (" +
			"  SELECT MAX(com2.quantidade * p2.preco) " +
			"  FROM Compra com2 " +
			"  JOIN Produto p2 ON p2.codigo = com2.codigo " +
			"  WHERE YEAR(com2.dataHoraCompra) = :ano" +
			")")
	Optional<MaiorCompraDto> maiorCompra(@Param("ano") Long ano);

	@Query(value = "SELECT p.tipo_vinho " +
			"FROM compra c " +
			"JOIN produto p ON c.cd_produto = p.codigo " +
			"GROUP BY p.tipo_vinho " +
			"ORDER BY SUM(c.quantidade) DESC " +
			"LIMIT 1", nativeQuery = true)
	String findTipoVinhoMaisVendido();



}
