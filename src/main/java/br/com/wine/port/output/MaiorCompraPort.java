package br.com.wine.port.output;

import br.com.wine.domain.entity.MaiorCompraEntity;

public interface MaiorCompraPort {
    MaiorCompraEntity getMaiorCompra(Long ano);

}
