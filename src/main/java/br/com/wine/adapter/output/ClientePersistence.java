package br.com.wine.adapter.output;

import br.com.wine.adapter.output.data.Cliente;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.wine.adapter.output.data.Compra;
import br.com.wine.adapter.output.data.Produto;
import br.com.wine.adapter.output.dto.ClienteFeignClientDto;
import br.com.wine.adapter.output.repository.ClienteRepository;
import br.com.wine.port.output.ClientePersistirPort;
import org.springframework.stereotype.Component;

@Component
public class ClientePersistence implements ClientePersistirPort {

    private final ClienteRepository clienteRepository;

    public ClientePersistence(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @Override
    public void persistir(List<ClienteFeignClientDto> listaClienteDto) {
        List<Cliente> listaCliente = listaClienteDto.stream().map(clienteDto -> {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(clienteDto.getIdCliente());
            cliente.setCpf(clienteDto.getCpf());
            cliente.setNome(clienteDto.getNome());
            cliente.setCompras(clienteDto.getCompras().stream().map(compraDto -> {

                Compra compra = new Compra();
                compra.setQuantidade(compraDto.getQuantidade());
                compra.setDataHoraCompra(LocalDateTime.now());

                Produto produto = new Produto();
                produto.setCodigo(compraDto.getCodigo());
                compra.setCodigo(compraDto.getCodigo());

                compra.setCliente(cliente);
                return compra;
            }).collect(Collectors.toList()));
            return cliente;
        }).collect(Collectors.toList());

        clienteRepository.saveAll(listaCliente);
    }
}
