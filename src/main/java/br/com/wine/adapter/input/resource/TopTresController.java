package br.com.wine.adapter.input.resource;

import br.com.wine.adapter.input.response.TopTresResponse;
import br.com.wine.port.input.TopTresUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/clientes-fieis")
public class TopTresController {

    private final TopTresUseCase topTresUseCase;

    public TopTresController(TopTresUseCase topTresUseCase) {
        this.topTresUseCase = topTresUseCase;
    }

    @GetMapping
    public ResponseEntity<List<TopTresResponse>> getTop(){
        return ResponseEntity.ok(new TopTresResponse().listaTopTres(topTresUseCase.buscar()));
    }
}
