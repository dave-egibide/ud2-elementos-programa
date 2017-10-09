package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            int end = 0;
            double cuadrado = 0;
            do {
                try {
                    System.out.println("Introduzca un valor:");
                    double x = Double.parseDouble(br.readLine());
                    double countdown = x;
                    if (x < 0) {
                        while (countdown < 0) {
                            cuadrado = x + cuadrado;
                            ++countdown;
                        }
                        cuadrado = cuadrado * -1;
                        if (x % 1 == 0) {
                            DecimalFormat df = new DecimalFormat("#");
                            df.setMaximumFractionDigits(0);
                            System.out.print("El cuadrado de ");
                            System.out.print(df.format(x));
                            System.out.print(" es ");
                            System.out.println(df.format(cuadrado));
                        } else {
                            System.out.print("El cuadrado de ");
                            System.out.print(x);
                            System.out.print(" es ");
                            System.out.println(cuadrado);
                        }
                        ++end;
                    } else {
                        if (x > 1) {
                            while (countdown > 0) {
                                cuadrado = x + cuadrado;
                                --countdown;
                            }
                        }
                        if (x % 1 == 0) {
                            DecimalFormat df = new DecimalFormat("#");
                            df.setMaximumFractionDigits(0);
                            System.out.print("El cuadrado de ");
                            System.out.print(df.format(x));
                            System.out.print(" es ");
                            System.out.println(df.format(cuadrado));
                        } else {
                            System.out.print("El cuadrado de ");
                            System.out.print(x);
                            System.out.print(" es ");
                            System.out.println(cuadrado);
                        }
                        ++end;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida.");
                }
            } while (end == 0);
        }
    }
}
