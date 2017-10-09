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
        int end = 0;
        while (end == 0) {
            try {
                    System.out.println("Introduzca un valor:");
                    double a = Double.parseDouble(br.readLine());
                    System.out.println("Introduzca un segundo valor:");
                    double b = Double.parseDouble(br.readLine());
                    double resul = a * b;
                System.out.print("Su múltiplo es: ");
                if (resul % 1 == 0) {
                    System.out.println(df.format(resul));
                } else {
                    System.out.println(resul);
                }
                        ++end;
            } catch (NumberFormatException e) {
                System.out.println("Operación invalida, introduzca un valor numérico");
            }
        }
    }
}
