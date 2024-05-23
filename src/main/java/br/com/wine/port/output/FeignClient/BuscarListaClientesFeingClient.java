package br.com.wine.port.output.FeignClient;

import br.com.wine.adapter.output.dto.ClienteFeignClientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "buscarListaClientes", url = "https://rgr3viiqdl8sikgv.public.blob.vercel-storage.com/clientes-Vz1U6aR3GTsjb3W8BRJhcNKmA81pVh.json")
public interface BuscarListaClientesFeingClient {
    @GetMapping
    List<ClienteFeignClientDto> buscar();

}
