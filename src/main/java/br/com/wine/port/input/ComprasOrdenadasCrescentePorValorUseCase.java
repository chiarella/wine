package br.com.wine.port.input;

import br.com.wine.domain.entity.ComprasOrdenadasCrescenteValorEntity;
import java.util.List;


public interface ComprasOrdenadasCrescentePorValorUseCase {
    List<ComprasOrdenadasCrescenteValorEntity> buscar();

}
