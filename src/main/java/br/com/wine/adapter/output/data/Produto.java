package br.com.wine.adapter.output.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "tipo_vinho")
    private String tipo_vinho;

    @Column(name = "preco")
    private BigDecimal preco;

    @Column(name = "safra")
    private String safra;


}
