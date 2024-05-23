package br.com.wine.port.output;

import br.com.wine.domain.entity.ComprasOrdenadasCrescenteValorEntity;

import java.util.List;

public interface ComprasOrdenadasCrescentePorValorPort {
    List<ComprasOrdenadasCrescenteValorEntity> buscar();
}
