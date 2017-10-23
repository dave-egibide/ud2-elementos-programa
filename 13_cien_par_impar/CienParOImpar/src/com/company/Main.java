package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            int y = 0;
            boolean end = false;

            do {
                System.out.println("Escriba par o impar:");
                String x = br.readLine();

                if (x.equals("par")) {
                    y = 2;
                    System.out.print("Los 100 primeros números pares son:\n0");
                } else if (x.equals("impar")) {
                    y = 3;
                    System.out.print("Los 100 primeros números impares son:\n1");

                } else System.out.println("Operación invalida");

                if (y != 0) {
                    for (int count = 0; count < 100; count++) {
                        System.out.print(", " + y);
                        y += 2;
                    }
                    System.out.println(".");
                    end = true;
                }
            } while (!end);
        }
    }
}
