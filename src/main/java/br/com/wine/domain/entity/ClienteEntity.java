package br.com.wine.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteEntity {

    private Long idCliente;
    private Long cpf;
    private String nome;
    private List<CompraEntity> compras;
}
