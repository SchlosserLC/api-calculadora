package com.github.schlosserlc.apicalculadora.service;

import com.github.schlosserlc.apicalculadora.controller.Controller;
import com.github.schlosserlc.apicalculadora.dto.Entrada;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public static Integer somaTudo(Entrada entrada) {
        logger.info("chamou o serviço soma tudo");
        Integer total = 0;
        for (Integer numero : entrada.getNumeros()) {
            total = total + numero;
        }
        return total;
    }

    public static Integer multiplicarTudo(Entrada entrada) {
        logger.info("chamou o serviço multiplicar tudo");
        Integer total = 1;
        for (Integer numero : entrada.getNumeros()) {
            total = total * numero;
        }
        return total;
    }

}
