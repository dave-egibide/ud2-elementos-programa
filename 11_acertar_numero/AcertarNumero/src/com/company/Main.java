package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int random = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        boolean end = false;

        do {
            System.out.println("Introduzca un número entre 0 y 100, o escriba FIN para terminar");
            String x = br.readLine();

            if (x.equals("FIN")) {
                System.out.println("Finalizando");
                end = true;

            } else {
                double number = Double.parseDouble(x);
                if (random == number) {
                    System.out.println("¡Número correcto!");
                    end = true;

                } else {
                    if (random < number) {
                        System.out.println(("Demasiado alto"));
                    } else {
                        System.out.println(("Demasiado bajo"));
                    }
                }
            }
        } while (!end);
    }
}
