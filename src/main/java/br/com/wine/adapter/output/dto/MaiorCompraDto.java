package br.com.wine.adapter.output.dto;

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
public class MaiorCompraDto {

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
