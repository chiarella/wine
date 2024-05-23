package br.com.wine.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TopTresEntity {

    private String nome;
    private Long cpf;
    private Long totalCompras;
    private BigDecimal valorTotalCompras;
    private BigDecimal precoMedio;
}
