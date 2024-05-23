package br.com.wine.adapter.input.resource;

import br.com.wine.port.input.ProdutoMaisVendidoUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value =  "/api/recomendacao/cliente/tipo")
public class ProdutoMaisVendidoController {


    private final ProdutoMaisVendidoUseCase produtoMaisVendidoUseCase;
    public ProdutoMaisVendidoController(ProdutoMaisVendidoUseCase produtoMaisVendidoUseCase) {
        this.produtoMaisVendidoUseCase = produtoMaisVendidoUseCase;
    }

    @GetMapping
    public ResponseEntity<String> buscaProdutoMaisVendido() {
        return ResponseEntity.ok("Produto mais vendido / (Tipo do vinho): "
                +produtoMaisVendidoUseCase.buscar());
    }
}
