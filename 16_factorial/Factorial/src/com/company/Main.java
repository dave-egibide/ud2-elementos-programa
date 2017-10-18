package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(0);
        double x = 0;
        double fact = 0;
        System.out.println("Introduzca un valor:");
        do {
            try {
                x = Double.parseDouble((br.readLine());
                if (x <= 0 || x % 1 != 0) {
                    System.out.println("Error. Introduzca un valor entero positivo:");
                } else fact = x;
            } catch (NumberFormatException e) {
                System.out.println("Operación invalida. Introduzca un valor numérico:");
            }
        } while (fact <= 0);
        double count = x;
        while (count > 2) {
            --count;
            x = x * count;
        }
        System.out.print("El factorial de ");
        System.out.print(df.format(fact));
        System.out.print(" es ");
        System.out.println(df.format(x));
    }

}
