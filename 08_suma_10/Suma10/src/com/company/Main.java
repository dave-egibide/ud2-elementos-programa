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
            double total = 0;
            int count = 0;
            int end = 0;
            do {
                try {
            while (count < 10) {
                System.out.println("Introduzca un valor:");
                double x = Double.parseDouble(br.readLine());
                total = total + x;
                count++;
            }
            if (total % 1 == 0) {
                System.out.println(df.format(total));
            } else {
                System.out.println("La suma es: "+total);
            }
            ++end;
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida");
                }
            } while (end == 0);
        }
    }
}
