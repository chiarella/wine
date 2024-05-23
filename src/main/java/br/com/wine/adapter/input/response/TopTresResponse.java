package br.com.wine.adapter.input.response;

import br.com.wine.domain.entity.TopTresEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TopTresResponse {

    private String nome;
    private Long cpf;
    private Long totalCompras;
    private BigDecimal valorTotalCompras;
    private BigDecimal precoMedio;

    public List<TopTresResponse> listaTopTres(
            List<TopTresEntity> listaEntity) {
        return listaEntity.stream().map(topTresEntity -> {
            TopTresResponse resp = new TopTresResponse();
            resp.setNome(topTresEntity.getNome());
            resp.setCpf(topTresEntity.getCpf());
            resp.setTotalCompras(topTresEntity.getTotalCompras());
            resp.setValorTotalCompras(topTresEntity.getValorTotalCompras());
            resp.setPrecoMedio(topTresEntity.getPrecoMedio());
            return resp;
        }).collect(Collectors.toList());
    }
}
