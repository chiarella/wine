package br.com.wine.adapter.output.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_compra") private Long idCompra;

    @Column(name = "cd_produto")
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(name = "quantidade")
    private Long quantidade;

    @Column(name = "data_hora_compra")
    private LocalDateTime dataHoraCompra;

}
