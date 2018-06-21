package br.edu.unievangelica.domain.carrinho;

import br.edu.unievangelica.core.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoService extends AbstractService<Carrinho> {

    @Autowired
    public CarrinhoRepository carrinhoRepository;
    public Carrinho save(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }
}
