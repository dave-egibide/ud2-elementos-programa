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
        boolean end = false;
        double x;
        double count;
        while (end == false) {
            try {
                System.out.println("Introduzca un valor:");
                x = Double.parseDouble(br.readLine());
                if (x > 2 && x % 1 == 0) {
                    count = 2;
                    do {
                        if (x % count == 0) {
                            System.out.print(df.format(x));
                            System.out.println(" no es un número primo.");
                            end = true;
                        }
                        ++count;
                    } while (count >= x && end == false);
                } else {
                    if (x % 1 == 0) {
                        System.out.print(df.format(x));
                    } else {
                        System.out.print(x);
                    }
                    System.out.println(" no es un número primo.");
                    end = true;
                }
                    if (end == false) {
                        if (x % 1 == 0) {
                            System.out.print(df.format(x));
                        } else {
                            System.out.print(x);
                        }
                        System.out.println(" es un número primo.");
                        end = true;
                    }
                } catch (NumberFormatException e) {
                System.out.println("Operación invalida.");
            }
        }
    }
}
