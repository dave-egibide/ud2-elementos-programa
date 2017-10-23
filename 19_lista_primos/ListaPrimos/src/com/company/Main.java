package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean noesprimo = false;
        int count = 2;

        System.out.println("Introduzca un valor:");
        int x = Integer.parseInt(br.readLine());

        System.out.println("Números primos hasta " + x + ":");

        for (int lista = 2; x >= lista; ++lista) {
            while (lista != count) {
                if (lista % count == 0) {
                    noesprimo = true;
                }
                ++count;
            }
            if (!noesprimo) {
                System.out.println(lista);
            }
            count = 2;
            noesprimo = false;
        }
    }
}
