package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca un valor:");
        int x = Integer.parseInt((br.readLine()));

        if (x % 2 == 0) {
            System.out.print(x);
            System.out.println(" es un número par");
        } else {
            System.out.print(x);
            System.out.println(" es un número impar");
        }
    }
}
