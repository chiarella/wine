package br.com.wine.adapter.input.resource;


import br.com.wine.adapter.input.response.ComprasOrdenadasCrescenteValorResponse;

import br.com.wine.port.input.ComprasOrdenadasCrescentePorValorUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/compras")
public class ComprasOrdenadasCrescentePorValorController {

    private final ComprasOrdenadasCrescentePorValorUseCase comprasOrdenadasCrescentePorValorUseCase;
    public ComprasOrdenadasCrescentePorValorController(
            ComprasOrdenadasCrescentePorValorUseCase comprasOrdenadasCrescentePorValorUseCase) {
        this.comprasOrdenadasCrescentePorValorUseCase = comprasOrdenadasCrescentePorValorUseCase;
    }

    @GetMapping
    public ResponseEntity<List<ComprasOrdenadasCrescenteValorResponse>> getCompras() {
        List<ComprasOrdenadasCrescenteValorResponse> listaRetorno = new ComprasOrdenadasCrescenteValorResponse()
                .listCompras(comprasOrdenadasCrescentePorValorUseCase.buscar());
        return ResponseEntity.ok(listaRetorno);
    }

}
