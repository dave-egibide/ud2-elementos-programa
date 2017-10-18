package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int absoluto;

        System.out.println("Introduzca un valor o introduzca 0 para finalizar.");
        int x = Integer.parseInt(br.readLine());

        if (x != 0) {
            if (x < 0) {
                absoluto = x * -1;
            } else {
                absoluto = x;
            }
            System.out.println(absoluto);
        }
    }
}