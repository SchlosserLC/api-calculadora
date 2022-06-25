package com.github.schlosserlc.apicalculadora.service;

import com.github.schlosserlc.apicalculadora.controller.Controller;
import com.github.schlosserlc.apicalculadora.dto.Entrada;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public static Integer somaValores(Integer val1, Integer val2) {
        logger.info("chamou o serviço");
        return val1 + val2;
    }

    public static Integer somaTudo(Entrada entrada) {
        logger.info("chamou o serviço soma tudo");
        Integer total = 0;
        for (Integer numero : entrada.getNumeros()) {
            total = total + numero;
        }
        return total;
    }
}
