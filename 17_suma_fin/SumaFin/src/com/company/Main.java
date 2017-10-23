package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, total = 0;
        String x;

        do {
            System.out.println("Introduzca un valor o escriba FIN para terminar:");
            x = br.readLine();

            if (!x.equals("FIN")) {
                total += Integer.parseInt(x);
                if (Integer.parseInt(x) < min) min = Integer.parseInt(x);
                if (Integer.parseInt(x) > max) max = Integer.parseInt(x);
            }
        } while (!x.equals("FIN"));

        System.out.println("La suma total es " + total + ". El mínimo es " + min + ". El máximo es " + max + ".");
    }
}
