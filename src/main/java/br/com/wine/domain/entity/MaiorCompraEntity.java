package br.com.wine.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MaiorCompraEntity {

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
