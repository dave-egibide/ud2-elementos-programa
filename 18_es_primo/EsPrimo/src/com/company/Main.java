package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean primo = true;
        int x, count = 2;

        System.out.println("Introduzca un valor:");
        x = Integer.parseInt(br.readLine());

        if (x < 2) {
            System.out.println(x + " no es un número primo.");
            primo = false;

        } else while (count < x && primo) {
            if (x % count == 0) {
                System.out.println(x + " no es un número primo.");
                primo = false;
            } else ++count;
        }

        if (primo) {
            System.out.println(x + " es un número primo");
        }
    }
}
