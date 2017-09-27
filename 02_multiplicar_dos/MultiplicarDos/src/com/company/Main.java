package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            System.out.println("Introduzca un valor:");
            double a = Double.parseDouble(br.readLine());
            System.out.println("Introduzca un segundo valor:");
            double b = Double.parseDouble(br.readLine());
            double resul = a * b;
            if (resul % 1 == 0) {
                int resulint = (int) resul;
                System.out.println("Su múltiplo es: " +resulint);
            } else {
                System.out.println("Su múltiplo es: " +resul);
            }
        }
    }
}
