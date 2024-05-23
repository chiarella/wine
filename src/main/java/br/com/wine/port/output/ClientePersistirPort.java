package br.com.wine.port.output;

import br.com.wine.adapter.output.dto.ClienteFeignClientDto;
import java.util.List;

public interface ClientePersistirPort {
    void persistir(List<ClienteFeignClientDto> listaCliente);
}
