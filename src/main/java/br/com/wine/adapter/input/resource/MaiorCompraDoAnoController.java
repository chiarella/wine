package br.com.wine.adapter.input.resource;

import br.com.wine.adapter.input.response.MaiorCompraResponse;

import br.com.wine.port.input.MaiorCompraUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/maior-compra")
public class MaiorCompraDoAnoController {

    private final MaiorCompraUseCase maiorCompraUseCase;
    public MaiorCompraDoAnoController(MaiorCompraUseCase maiorCompraUseCase) {
        this.maiorCompraUseCase = maiorCompraUseCase;
    }

    @GetMapping(value= "/{ano}")
    public ResponseEntity<MaiorCompraResponse> getMaiorCompra(@PathVariable(value = "ano") Long ano){
        return ResponseEntity.ok(new MaiorCompraResponse()
                .maiorCompra(maiorCompraUseCase.buscar(ano)));
    }

}
