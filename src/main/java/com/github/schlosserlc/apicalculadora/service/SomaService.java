package com.github.schlosserlc.apicalculadora.service;

import com.github.schlosserlc.apicalculadora.controller.SomaController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SomaService {

    private static final Logger logger = LoggerFactory.getLogger(SomaController.class);

    public static Integer somaValores(Integer val1, Integer val2) {
        logger.info("chamou o serviço");
        return val1 + val2;
    }
}
