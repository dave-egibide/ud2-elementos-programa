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
            int end = 0;
            do {
                try {
                    System.out.println("Introduzca un valor:");
                    Double a = Double.parseDouble(br.readLine());
                    System.out.println("Introduzca un segundo valor:");
                    Double b = Double.parseDouble(br.readLine());
                    System.out.println("Introduzca un tercer valor:");
                    Double c = Double.parseDouble(br.readLine());
                    if (c % 1 == 0) {
                        System.out.println(df.format(c));
                    } else {
                        System.out.println(c);
                    }
                    if (b % 1 == 0) {
                        System.out.println(df.format(b));
                    } else {
                        System.out.println(b);
                    }
                    if (a % 1 == 0) {
                        System.out.println(df.format(a));
                    } else {
                        System.out.println(a);
                    }
                    ++end;
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida, introduzca un valor numérico");
                }
            } while (end == 0);
        }
    }
}
