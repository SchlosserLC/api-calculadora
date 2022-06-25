package com.github.schlosserlc.apicalculadora.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Entrada {

    public static String TIPO_SOMAR = "somar";
    public static String TIPO_MULTIPLICAR = "multiplicar";

    private List<Integer> numeros;

}
