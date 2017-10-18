package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x;
        int fact = 0;

        System.out.println("Introduzca un valor:");
        do {
            x = Integer.parseInt(br.readLine());
            if (x <= 0) {
                System.out.println("Error. Introduzca un valor positivo:");
            } else fact = x;
        } while (fact <= 0);

        for (int count = x; count > 2; ) {
            --count;
            x = x * count;
        }

        System.out.print("El factorial de ");
        System.out.print(fact);
        System.out.print(" es ");
        System.out.println(x);
    }
}
