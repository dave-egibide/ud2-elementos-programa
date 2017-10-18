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
        boolean noesprimo = false;
        double x = 0;
        double lista = 2;
        double count = 2;
        boolean start = false;
        while (!start) {
            try {
                System.out.println("Introduzca un valor:");
                x = Double.parseDouble(br.readLine());
                start = true;
            } catch (NumberFormatException e) {
                System.out.println("Operación invalida.");
            }
        }
        System.out.print("Números primos hasta ");
        if (x % 1 == 0) {
            System.out.print(df.format(x));
        } else {
            System.out.print(x);
        }
        System.out.println(":");
        while (x >= lista) {
            if (lista == count) {
                if (!noesprimo) {
                    System.out.println(df.format(lista));
                }
                ++lista;
                count = 2;
                noesprimo = false;
            } else {
                if (lista % count == 0 && lista != count) {
                    noesprimo = true;
                }
                ++count;
            }
        }
    }
}
		