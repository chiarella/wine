package br.com.wine.adapter.output.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TopTresDto {

    private String nome;
    private Long cpf;
    private Long totalCompras;
    private BigDecimal valorTotalCompras;
    private BigDecimal precoMedio;

}
