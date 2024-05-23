package br.com.wine.port.output.FeignClient;


import br.com.wine.domain.entity.ProdutoEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "buscarListaProdutos", url = "https://rgr3viiqdl8sikgv.public.blob.vercel-storage.com/produtos-mnboX5IPl6VgG390FECTKqHsD9SkLS.json")
public interface BuscarListaProdutosFeingClient {

   @GetMapping
   List<ProdutoEntity> buscar();
}
