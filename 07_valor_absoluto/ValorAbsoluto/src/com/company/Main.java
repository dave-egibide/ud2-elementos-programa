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
            double absoluto;
            int end = 0;
            do {
                try {
            System.out.println("Introduzca un valor o introduzca 0 para finalizar.");
            double x = Double.parseDouble(br.readLine());
            if (x != 0) {
                if (x < 0) {
                    absoluto = x * -1;
                } else {
                    absoluto = x;
                }
                if (absoluto % 1 == 0) {
                    System.out.println(df.format(absoluto));
                } else {
                    System.out.println(absoluto);
                }
            } else {
                ++end;
            }
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida");
                }
            } while (end == 0);
        }

    }

}
