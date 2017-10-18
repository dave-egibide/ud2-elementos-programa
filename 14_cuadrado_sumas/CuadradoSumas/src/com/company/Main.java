package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cuadrado = 0;

        System.out.println("Introduzca un valor:");
        int x = Integer.parseInt(br.readLine());

        // en caso de ser un número negativo
        if (x < 0) {
            for (int countdown = 0; countdown > x; countdown--) {
                cuadrado = x + cuadrado;
            }
            cuadrado = cuadrado * -1;
            System.out.print("El cuadrado de ");
            System.out.print(x);
            System.out.print(" es ");
            System.out.println(cuadrado);

        } else {
            for (int countdown = 0; countdown < x; countdown++) {
                cuadrado = x + cuadrado;
            }
        }
        System.out.print("El cuadrado de ");
        System.out.print(x);
        System.out.print(" es ");
        System.out.println(cuadrado);
    }
}
