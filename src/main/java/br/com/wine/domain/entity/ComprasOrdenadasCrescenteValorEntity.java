package br.com.wine.domain.entity;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComprasOrdenadasCrescenteValorEntity {

    private String nome;
    private Long cpf;
    private Long cdProduto;
    private Long quantidade;
    private BigDecimal valorTotal;
    private BigDecimal valorUnitario;
    private String safra;
    private String tipo;
    private LocalDateTime dataHoraCompra;

}
