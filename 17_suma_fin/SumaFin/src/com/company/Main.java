package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        int y;

        System.out.println("Introduzca un valor o escriba FIN para terminar:");
        String x = br.readLine();

        if ((!new String("FIN").equals(x))) {
            do {
                y = Integer.parseInt(x);
                total = y + total;
                if (y < min) min = y;
                if (y > max) max = y;
                System.out.println("Introduzca un valor o escriba FIN para terminar:");
                x = br.readLine();
            } while ((!new String("FIN").equals(x)));

            System.out.print("La suma total es ");
            System.out.print(total);
            System.out.print(". El mínimo es ");
            System.out.print(min);
            System.out.print(". El máximo es ");
            System.out.print(max);
            System.out.println(".");
        }
    }
}
