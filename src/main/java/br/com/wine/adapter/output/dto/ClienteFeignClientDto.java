package br.com.wine.adapter.output.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ClienteFeignClientDto {

    private Long idCliente;
    private Long cpf;
    private String nome;

    private List<CompraFeignClientDto> compras;
}
