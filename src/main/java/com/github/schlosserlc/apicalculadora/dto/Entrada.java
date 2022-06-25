package com.github.schlosserlc.apicalculadora.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Entrada {

    private List<Integer> numeros;

}
