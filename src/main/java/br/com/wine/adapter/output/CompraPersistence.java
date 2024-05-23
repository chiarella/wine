package br.com.wine.adapter.output;

import br.com.wine.adapter.output.dto.ComprasOrdenadasCrescenteValorDto;
import br.com.wine.adapter.output.dto.MaiorCompraDto;
import br.com.wine.adapter.output.dto.TopTresDto;
import br.com.wine.adapter.output.repository.CompraRepository;
import br.com.wine.domain.entity.ComprasOrdenadasCrescenteValorEntity;
import br.com.wine.domain.entity.MaiorCompraEntity;
import br.com.wine.domain.entity.TopTresEntity;
import br.com.wine.port.output.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CompraPersistence implements
        ComprasOrdenadasCrescentePorValorPort,
        MaiorCompraPort,
        TopTresPort,
        ProdutoMaisVendidoPort {

    private final CompraRepository compraRepository;

    public CompraPersistence(CompraRepository compraRepository ) {
        this.compraRepository = compraRepository;
    }

    @Override
    public List<ComprasOrdenadasCrescenteValorEntity> buscar() {
        List<ComprasOrdenadasCrescenteValorDto> listaDto = compraRepository.filtrar();
       return listaDto.stream().map(comprasOrdenadasCrescenteValorDto -> {
           ComprasOrdenadasCrescenteValorEntity resp = new ComprasOrdenadasCrescenteValorEntity();
            resp.setNome(comprasOrdenadasCrescenteValorDto.getNome());
            resp.setCpf(comprasOrdenadasCrescenteValorDto.getCpf());
            resp.setCdProduto(comprasOrdenadasCrescenteValorDto.getCdProduto());
            resp.setQuantidade(comprasOrdenadasCrescenteValorDto.getQuantidade());
            resp.setValorTotal(comprasOrdenadasCrescenteValorDto.getValorTotal());
            resp.setValorUnitario(comprasOrdenadasCrescenteValorDto.getValorUnitario());
            resp.setSafra(comprasOrdenadasCrescenteValorDto.getSafra());
            resp.setTipo(comprasOrdenadasCrescenteValorDto.getTipo());
            resp.setDataHoraCompra(comprasOrdenadasCrescenteValorDto.getDataHoraCompra());
            return resp;
        }).collect(Collectors.toList());
    }

    public MaiorCompraEntity getMaiorCompra(Long ano) {
        Optional<MaiorCompraDto> maiorCompra = compraRepository.maiorCompra(ano);
        return maiorCompra.stream().findFirst().map(maiorCompraDto -> new MaiorCompraEntity(
                maiorCompraDto.getNome(),
                maiorCompraDto.getCpf(),
                maiorCompraDto.getCdProduto(),
                maiorCompraDto.getQuantidade(),
                maiorCompraDto.getValorTotal(),
                maiorCompraDto.getValorUnitario(),
                maiorCompraDto.getSafra(),
                maiorCompraDto.getTipo(),
                maiorCompraDto.getDataHoraCompra()
        )).orElse(null);
    }

    @Override
    public List<TopTresEntity> buscarTopTres() {
        List<TopTresDto> listaDto = new ArrayList<>();
        //List<TopTresDto> listaDto = compraRepository.topTres();
        return listaDto.stream().map(topTresDto -> {
            TopTresEntity resp = new TopTresEntity();
            resp.setNome(topTresDto.getNome());
            resp.setCpf(topTresDto.getCpf());
            resp.setTotalCompras(topTresDto.getTotalCompras());
            resp.setValorTotalCompras(topTresDto.getValorTotalCompras());
            resp.setPrecoMedio(topTresDto.getPrecoMedio());
            return resp;
        }).collect(Collectors.toList());
    }

    @Override
    public String getProdutooMaisVendido() {
        return compraRepository.findTipoVinhoMaisVendido();
    }
}
