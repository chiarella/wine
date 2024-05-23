package br.com.wine.domain.service;

import br.com.wine.domain.entity.TopTresEntity;
import br.com.wine.port.input.TopTresUseCase;
import br.com.wine.port.output.TopTresPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopTresService implements TopTresUseCase {

    public final TopTresPort topTresPort;

    public TopTresService(TopTresPort topTresPort) {
        this.topTresPort = topTresPort;
    }


    @Override
    public List<TopTresEntity> buscar() {
        return topTresPort.buscarTopTres();
    }
}
