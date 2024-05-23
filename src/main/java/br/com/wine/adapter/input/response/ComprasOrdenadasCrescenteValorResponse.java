package br.com.wine.adapter.input.response;

import br.com.wine.domain.entity.ComprasOrdenadasCrescenteValorEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComprasOrdenadasCrescenteValorResponse {
    private String nome;
    private Long cpf;
    private Long cdProduto;
    private Long quantidade;
    private BigDecimal valorTotal;
    private BigDecimal valorUnitario;
    private String safra;
    private String tipo;
    private LocalDateTime dataHoraCompra;

    public List<ComprasOrdenadasCrescenteValorResponse> listCompras(
            List<ComprasOrdenadasCrescenteValorEntity> listaEntity) {
        return listaEntity.stream().map(comprasOrdenadasCrescenteValorEntity -> {
            ComprasOrdenadasCrescenteValorResponse resp = new ComprasOrdenadasCrescenteValorResponse();
            resp.setNome(comprasOrdenadasCrescenteValorEntity.getNome());
            resp.setCpf(comprasOrdenadasCrescenteValorEntity.getCpf());
            resp.setCdProduto(comprasOrdenadasCrescenteValorEntity.getCdProduto());
            resp.setQuantidade(comprasOrdenadasCrescenteValorEntity.getQuantidade());
            resp.setValorTotal(comprasOrdenadasCrescenteValorEntity.getValorTotal());
            resp.setValorUnitario(comprasOrdenadasCrescenteValorEntity.getValorUnitario());
            resp.setSafra(comprasOrdenadasCrescenteValorEntity.getSafra());
            resp.setTipo(comprasOrdenadasCrescenteValorEntity.getTipo());
            resp.setDataHoraCompra(comprasOrdenadasCrescenteValorEntity.getDataHoraCompra());
            return resp;
        }).collect(Collectors.toList());
    }


}
