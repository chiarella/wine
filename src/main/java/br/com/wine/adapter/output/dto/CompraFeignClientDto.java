package br.com.wine.adapter.output.dto;

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
public class CompraFeignClientDto {

    private Long codigo;
    private Cliente cliente;
    private Long quantidade;
    private LocalDateTime dataHoraCompra;
}
