package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;

        System.out.println("Introduzca la cantidad de números a sumar:");
        int countfin = Integer.parseInt(br.readLine());

        for (int count = 0; count < countfin; count++) {
            System.out.println("Introduzca un valor:");
            int x = Integer.parseInt(br.readLine());
            total = total + x;
        }

        System.out.println("La suma total es: ");
        System.out.println(total);
    }
}