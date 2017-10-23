package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca el valor de la base del triángulo:");
        int base = Integer.parseInt(br.readLine());
        System.out.println("Introduzca el valor de la altura del triángulo:");
        int altura = Integer.parseInt(br.readLine());

        double area = (double) (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);
    }
}