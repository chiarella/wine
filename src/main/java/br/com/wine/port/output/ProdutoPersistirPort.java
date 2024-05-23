package br.com.wine.port.output;

import br.com.wine.domain.entity.ProdutoEntity;
import java.util.List;

public interface ProdutoPersistirPort {
    void persistir(List<ProdutoEntity> listaProduto);
}
