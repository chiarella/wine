package br.com.wine.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoEntity {

    private Long codigo;
    private String tipo_vinho;
    private BigDecimal preco;
    private String safra;


}
