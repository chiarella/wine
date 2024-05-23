package br.com.wine.domain.entity;

import br.com.wine.adapter.output.data.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompraEntity {

    private Long idCompra;
    private Long codigo;
    private Cliente cliente;
    private Long quantidade;
    private LocalDateTime dataHoraCompra;
}
