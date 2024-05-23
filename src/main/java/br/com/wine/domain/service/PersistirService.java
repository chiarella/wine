package br.com.wine.domain.service;


import br.com.wine.adapter.output.dto.ClienteFeignClientDto;
import br.com.wine.adapter.output.repository.ClienteRepository;
import br.com.wine.domain.entity.ProdutoEntity;
import br.com.wine.port.input.PersistirUseCase;
import br.com.wine.port.output.FeignClient.BuscarListaClientesFeingClient;
import br.com.wine.port.output.FeignClient.BuscarListaProdutosFeingClient;
import br.com.wine.port.output.ClientePersistirPort;
import br.com.wine.port.output.ProdutoPersistirPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersistirService implements PersistirUseCase {

    private final BuscarListaProdutosFeingClient buscarListaProdutosFeingClient;
    private final BuscarListaClientesFeingClient buscarListaClientesFeingClient;
    private final ProdutoPersistirPort produtoPersistirPort;
    private final ClientePersistirPort clientePersistirPort;


    public PersistirService(BuscarListaProdutosFeingClient buscarListaProdutosFeingClient,
                            BuscarListaClientesFeingClient buscarListaClientesFeingClient,
                            ProdutoPersistirPort produtoPersistirPort,
                            ClientePersistirPort clientePersistirPort) {
        this.buscarListaProdutosFeingClient = buscarListaProdutosFeingClient;
        this.buscarListaClientesFeingClient = buscarListaClientesFeingClient;
        this.produtoPersistirPort = produtoPersistirPort;
        this.clientePersistirPort = clientePersistirPort;
    }

    @Override
    public void persistir() {

        List<ProdutoEntity>  listaEntity = buscarListaProdutosFeingClient.buscar();
        produtoPersistirPort.persistir(buscarListaProdutosFeingClient.buscar());

        List<ClienteFeignClientDto> lista = buscarListaClientesFeingClient.buscar();
        clientePersistirPort.persistir(lista);

    }
}
