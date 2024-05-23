package br.com.wine.domain.service;

import br.com.wine.domain.entity.ComprasOrdenadasCrescenteValorEntity;
import br.com.wine.port.input.ComprasOrdenadasCrescentePorValorUseCase;
import br.com.wine.port.output.ComprasOrdenadasCrescentePorValorPort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ComprasOrdenadasCrescentePorValorService implements
        ComprasOrdenadasCrescentePorValorUseCase {

    private final ComprasOrdenadasCrescentePorValorPort comprasOrdenadasCrescentePorValorPort;

    public ComprasOrdenadasCrescentePorValorService(
            ComprasOrdenadasCrescentePorValorPort comprasOrdenadasCrescentePorValorPort) {
        this.comprasOrdenadasCrescentePorValorPort = comprasOrdenadasCrescentePorValorPort;
    }

    @Override
    public List<ComprasOrdenadasCrescenteValorEntity> buscar() {
        return comprasOrdenadasCrescentePorValorPort.buscar();
    }
}
