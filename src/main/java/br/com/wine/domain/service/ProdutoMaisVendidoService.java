package br.com.wine.domain.service;

import br.com.wine.port.input.ProdutoMaisVendidoUseCase;
import br.com.wine.port.output.ProdutoMaisVendidoPort;
import org.springframework.stereotype.Service;

@Service
public class ProdutoMaisVendidoService implements ProdutoMaisVendidoUseCase {

    private final ProdutoMaisVendidoPort produtoMaisVendidoPort;

    public ProdutoMaisVendidoService(ProdutoMaisVendidoPort produtoMaisVendidoPort) {
        this.produtoMaisVendidoPort = produtoMaisVendidoPort;
    }

    @Override
    public String buscar() {
        return produtoMaisVendidoPort.getProdutooMaisVendido();
    }
}
