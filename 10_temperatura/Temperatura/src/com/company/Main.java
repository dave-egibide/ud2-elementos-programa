package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean end = false;

        System.out.println("Introduzca una temperatura en grados centígrados:");
        int temp = Integer.parseInt(br.readLine());

        do {
            System.out.println("Introduzca F para convertir a Fahrenheit o introduzca K para convertir a Kelvin:");
            String x = br.readLine();

            if (x.equals("F")) {
                double fahr = temp * 9 / 5 + 32;
                System.out.println(temp + "Cº son" + fahr + "ºF");
                end = true;

            } else {
                if (x.equals("K")) {
                    double kelvin = temp + 273.15;
                    System.out.println(temp + "Cº son" + kelvin + "ºK");
                    end = true;
                } else {
                    System.out.println("No valido.");
                }
            }
        } while (!end);
    }
}
