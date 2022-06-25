package com.github.schlosserlc.apicalculadora.controller;

import com.github.schlosserlc.apicalculadora.service.SomaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/soma")
public class SomaController {

   private static final Logger logger = LoggerFactory.getLogger(SomaController.class);

    @RequestMapping(value = "/{value1}/{value2}/", method = RequestMethod.GET)
    public Integer chamaSoma(@PathVariable Integer value1,@PathVariable Integer value2) {
        logger.info("chamou o controlador");
        return SomaService.somaValores(value1, value2);
    }

}
