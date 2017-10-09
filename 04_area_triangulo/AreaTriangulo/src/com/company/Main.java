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
            while (end == 0) {
                try {
                    System.out.println("Introduzca el valor de la base del triángulo:");
                    Double base = Double.parseDouble(br.readLine());
                    System.out.println("Introduzca el valor de la altura del triángulo:");
                    Double altura = Double.parseDouble(br.readLine());
                    Double area = base * altura / 2;
                    System.out.print("El área del triángulo es: ");
                    if (area % 1 == 0) {
                        System.out.println(df.format(area));
                    } else {
                        System.out.println(area);
                    }
                    ++end;
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida, introduzca un valor numérico");
                }
            }
        }
    }
}