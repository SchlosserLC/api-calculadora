package com.github.schlosserlc.apicalculadora.controller;

import com.github.schlosserlc.apicalculadora.dto.Entrada;
import com.github.schlosserlc.apicalculadora.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

   private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @RequestMapping(value = "soma/{value1}/{value2}/", method = RequestMethod.GET)
    public Integer chamaSoma(@PathVariable Integer value1,@PathVariable Integer value2) {
        logger.info("chamou o controlador somaValores");
        return Service.somaValores(value1, value2);
    }

    @RequestMapping(value = "soma/todos/", method = RequestMethod.POST)
    public Integer chamaSoma(@RequestBody Entrada numeros) {
        logger.info("chamou o controlador somaTudo");
        return Service.somaTudo(numeros);
    }



}
