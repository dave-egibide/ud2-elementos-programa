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
        {
            System.out.println("Introduzca un valor:");
            int end = 0;
            while (end == 0) {
                try {
                    Double x = Double.parseDouble((br.readLine()));
                    if (x % 2 == 0) {
                        System.out.print(df.format(x));
                        System.out.println(" es un número par");
                    } else {
                        if (x % 1 == 0) {
                            System.out.println(df.format(x));
                        } else {
                            System.out.print(x);
                        }
                        System.out.println(" es un número impar");
                    }
                    ++end;
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida. Introduzca un valor numérico.");
                }
            }
        }
    }
}
