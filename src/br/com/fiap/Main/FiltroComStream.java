package br.com.fiap.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroComStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<>(Arrays.asList(
                "Homem Aranha", "Wolverine", "Hulk", "Capitão America",
                "Homem Elastico", "Pantera Negra", "Mulher Maravilha",
                "Homem de Ferro", "Miss Marvel", "Mulher Invisível", "Ciclope"));

        List<String> heroisComH = herois.stream()
                .filter(heroi -> heroi.startsWith("H"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(heroisComH);
    }
}