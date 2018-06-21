package br.edu.unievangelica.domain.carrinho;

import br.edu.unievangelica.core.controller.ResponseAbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/carrinho")
public class CarrinhoController extends ResponseAbstractController {

    @Autowired
    CarrinhoService carrinhoService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Carrinho carrinho) {
        return new ResponseEntity<>(carrinhoService.save(carrinho), HttpStatus.OK);
    }

}
