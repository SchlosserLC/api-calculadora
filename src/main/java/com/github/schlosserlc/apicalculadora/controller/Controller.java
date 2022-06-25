package com.github.schlosserlc.apicalculadora.controller;

import com.github.schlosserlc.apicalculadora.dto.Entrada;
import com.github.schlosserlc.apicalculadora.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @RequestMapping(value = "{tipo}", method = RequestMethod.POST)
    public Integer calcula(@RequestBody Entrada entrada, @PathVariable String tipo) throws Exception {

        if(entrada == null || entrada.getNumeros() == null || tipo == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "erro na requisição verifique os parametros");
        }

        logger.info("ação de calcula: " + tipo);

        int size = entrada.getNumeros().size();
        if(size < 2){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "tamanho invalido precisa ser mais que 2");
        } else if(size > 20){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "tamanho invalido precisa ser menor que 20");
        }

        if (Entrada.TIPO_MULTIPLICAR.equals(tipo)) {
            return Service.multiplicarTudo(entrada);
        } else if (Entrada.TIPO_SOMAR.equals(tipo)) {
            return Service.somaTudo(entrada);
        }

        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "tipo inválido");
    }

}
