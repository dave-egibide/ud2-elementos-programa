package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x;

        System.out.println("Introduzca un valor:");
        do {
            x = Integer.parseInt(br.readLine());
            if (x <= 0) {
                System.out.println("Error. Introduzca un valor positivo:");
            }
        } while (x <= 0);

        System.out.print("El factorial de " + x);

        for (int count = x - 1; count > 1; --count) {
            x *= count;
        }

        System.out.println(" es " + x);
    }
}
