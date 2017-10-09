package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            int correct = 0;
            while (correct == 0) {
                System.out.println("Escriba par o impar");
                String x = br.readLine();
                if ((new String("par").equals(x)) == true) {
                    System.out.println("Los 100 primeros números pares son:");
                    int countdown = 99;
                    int par = 0;
                    while (countdown > 0) {
                        System.out.print(par);
                        System.out.print(", ");
                        par = par + 2;
                        --countdown;
                    }
                    System.out.println("198.");
                    ++correct;
                    } else {
                    if ((new String("impar").equals(x)) == true) {
                        System.out.println("Los 100 primeros números impares son:");
                        int countdown = 99;
                        int impar = 1;
                        while (countdown > 0) {
                            System.out.print(impar);
                            System.out.print(", ");
                            impar = impar + 2;
                            --countdown;
                        }
                        System.out.println("199.");
                        ++correct;
                    } else {
                        System.out.println("Operación no valida");
                    }
                }

            }
        }
    }
}
