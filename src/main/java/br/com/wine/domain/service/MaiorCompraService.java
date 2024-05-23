package br.com.wine.domain.service;

import br.com.wine.domain.entity.MaiorCompraEntity;
import br.com.wine.port.input.MaiorCompraUseCase;
import br.com.wine.port.output.MaiorCompraPort;
import org.springframework.stereotype.Service;


@Service
public class MaiorCompraService implements MaiorCompraUseCase {

    private final MaiorCompraPort maiorCompraPort;

    public MaiorCompraService(MaiorCompraPort maiorCompraPort) {
        this.maiorCompraPort = maiorCompraPort;
    }

    @Override
    public MaiorCompraEntity buscar(Long ano) {
        return maiorCompraPort.getMaiorCompra(ano);
    }
}
