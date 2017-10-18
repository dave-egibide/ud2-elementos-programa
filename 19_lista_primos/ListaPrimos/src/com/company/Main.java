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

        System.out.print("Números primos hasta ");
        System.out.print(x);
        System.out.println(":");

        for (int lista = 2; x >= lista; ) {

            if (lista == count) {
                if (!noesprimo) {
                    System.out.println(lista);
                }
                lista++;
                count = 2;
                noesprimo = false;

            } else {
                if (lista % count == 0 && lista != count) {
                    noesprimo = true;
                }
                ++count;
            }

        }
    }
}
