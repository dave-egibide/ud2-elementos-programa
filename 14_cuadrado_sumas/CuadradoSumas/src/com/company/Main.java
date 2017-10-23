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
        if (x < 0) x *= -1;

        for (int countdown = 0; countdown < x; countdown++)
            cuadrado += x;

        System.out.println("El cuadrado de " + x + " es " + cuadrado);
    }
}
