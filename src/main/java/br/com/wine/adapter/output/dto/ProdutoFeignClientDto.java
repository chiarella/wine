package br.com.wine.adapter.output.dto;

import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoFeignClientDto {

    private Long codigo;
    private String tipo_vinho;
    private BigDecimal preco;
    private String safra;

}
