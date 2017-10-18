package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;

        for (int count = 0; count < 10; count++) {
            System.out.println("Introduzca un valor:");
            int x = Integer.parseInt(br.readLine());
            total = total + x;
        }

        System.out.println("La suma total es: " + total);
    }
}
