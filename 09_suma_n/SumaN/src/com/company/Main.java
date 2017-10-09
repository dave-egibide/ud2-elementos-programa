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
            int countfin = 0;
            int correct = 0;
            while (correct == 0) {
                try {
                    System.out.println("Introduzca la cantidad de números a sumar:");
                    countfin = Integer.parseInt(br.readLine());
                    ++correct;
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida");
                }
            }
                while (count < countfin) {
                    System.out.println("Introduzca un valor:");
                    try {
                        double x = Double.parseDouble(br.readLine());
                        total = total + x;
                        count++;
                    } catch (NumberFormatException e) {
                        System.out.println("Operación invalida");
                    }
                }
            System.out.println("La suma es: ");
                if (total % 1 == 0) {
                    System.out.println(df.format(total));
                } else {
                    System.out.println(total);
            }
        }
    }
}