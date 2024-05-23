package br.com.wine.adapter.input.response;

import br.com.wine.domain.entity.MaiorCompraEntity;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MaiorCompraResponse {

    private String nome;
    private Long cpf;
    private Long cdProduto;
    private Long quantidade;
    private BigDecimal valorTotal;
    private BigDecimal valorUnitario;
    private String safra;
    private String tipo;
    private LocalDateTime dataHoraCompra;

    public MaiorCompraResponse maiorCompra(MaiorCompraEntity entity) {
        MaiorCompraResponse resp = new MaiorCompraResponse();
        resp.setNome(entity.getNome());
        resp.setCpf(entity.getCpf());
        resp.setCdProduto(entity.getCdProduto());
        resp.setQuantidade(entity.getQuantidade());
        resp.setValorTotal(entity.getValorTotal());
        resp.setValorUnitario(entity.getValorUnitario());
        resp.setSafra(entity.getSafra());
        resp.setTipo(entity.getTipo());
        resp.setDataHoraCompra(entity.getDataHoraCompra());
        return resp;
    }


}
