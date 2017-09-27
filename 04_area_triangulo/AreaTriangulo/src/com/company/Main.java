package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            System.out.println("Introduzca el valor de la base del triángulo:");
            Double base = Double.parseDouble(br.readLine());
            System.out.println("Introduzca el valor de la altura del triángulo:");
            Double altura = Double.parseDouble(br.readLine());
            Double area = base * altura / 2;
            if (area % 1 == 0) {
                int areaint = area.intValue();
                System.out.println("El área del triángulo es: " + areaint);
            } else {
                System.out.println("El área del triángulo es: " + area);
            }
        }
    }
}
