package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            boolean end = false;


            do {
                System.out.println("Escriba par o impar");
                String x = br.readLine();

                if ((new String("par").equals(x))) {
                    int par = 0;

                    System.out.println("Los 100 primeros números pares son:");
                    for (int count = 0; count < 99; count++) {
                        System.out.print(par);
                        System.out.print(", ");
                        par = par + 2;
                    }
                    System.out.println("198.");
                    end = true;

                    } else {
                    if ((new String("impar").equals(x))) {
                        int impar = 1;

                        System.out.println("Los 100 primeros números impares son:");
                        for (int count = 0; count < 99; count++) {
                            System.out.print(impar);
                            System.out.print(", ");
                            impar = impar + 2;
                        }
                        System.out.println("199.");
                        end = true;

                    } else {
                        System.out.println("Operación invalida");
                    }
                }
            } while (!end);
        }
    }
}
