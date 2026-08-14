package br.com.fiap.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FiltroSemStream {
    static void main() {
        ArrayList<String> herois = new ArrayList<>(Arrays.asList("Homem Aranha", "Wolverine", "Hulk", "Capitão America", "Homem Elastico", "Pantera Negra", "Mulher Maravilha", "Homem de Ferro", "Miss Marvel", "Mulher Invisível", "Ciclope"));
        ArrayList<String> heroisComH = new ArrayList<>();

        for (String heroi : herois) {
            if (heroi.startsWith("H")) {
                heroisComH.add(heroi);
            }
        }
        Collections.sort(heroisComH);

        System.out.println(heroisComH);

    }
}
