package br.com.wine.port.input;

import br.com.wine.domain.entity.MaiorCompraEntity;

public interface MaiorCompraUseCase {
    MaiorCompraEntity buscar(Long ano);
}
