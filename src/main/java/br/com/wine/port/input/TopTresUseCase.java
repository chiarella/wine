package br.com.wine.port.input;

import br.com.wine.domain.entity.TopTresEntity;

import java.util.List;

public interface TopTresUseCase {

    List<TopTresEntity> buscar();
}
