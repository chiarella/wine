package br.com.wine.adapter.output;

import br.com.wine.adapter.output.data.Produto;
import br.com.wine.adapter.output.repository.ProdutoRepository;
import br.com.wine.domain.entity.ProdutoEntity;
import br.com.wine.port.output.ProdutoPersistirPort;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;


@Component
public class ProdutoPersistence implements ProdutoPersistirPort {

    private final ProdutoRepository produtoRepository;

    public ProdutoPersistence(
            ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public void persistir(List<ProdutoEntity> produtoEntityList) {
        List<Produto> produtos = produtoEntityList.stream()
                .map(produtoEntity -> {
                    Produto produto = new Produto();
                    produto.setCodigo(produtoEntity.getCodigo());
                    produto.setTipo_vinho(produtoEntity.getTipo_vinho());
                    produto.setPreco(produtoEntity.getPreco());
                    produto.setSafra(produtoEntity.getSafra());
                    return produto;
                })
                .collect(Collectors.toList());
        produtoRepository.saveAll(produtos);
    }
}
