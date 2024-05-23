package br.com.wine.port.output;

import br.com.wine.domain.entity.TopTresEntity;

import java.util.List;

public interface TopTresPort {

    List<TopTresEntity> buscarTopTres();

}
