package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca un valor:");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Introduzca un segundo valor:");
        int b = Integer.parseInt(br.readLine());

        int resul = a * b;

        System.out.print("Su múltiplo es: ");
        System.out.println(resul);
    }
}
