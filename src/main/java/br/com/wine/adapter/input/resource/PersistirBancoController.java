package br.com.wine.adapter.input.resource;

import br.com.wine.adapter.output.repository.CompraRepository;
import br.com.wine.port.input.PersistirUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/persistir")
public class PersistirBancoController {

    private final PersistirUseCase persistirUseCase;

    public PersistirBancoController(
            PersistirUseCase persistirUseCase, CompraRepository compraRepository) {
        this.persistirUseCase = persistirUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> persistir() {
        persistirUseCase.persistir();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
