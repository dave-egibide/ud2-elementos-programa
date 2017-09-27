package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            double absoluto;
            System.out.println("Introduzca un valor.");
            System.out.println("Introduzca 0 para finalizar.");
            double x = Double.parseDouble(br.readLine());
            if (x != 0) {
                if (x < 0) {
                    absoluto = x * -1;
                } else {
                    absoluto = x;
                }
                if (absoluto % 1 == 0) {
                    int absolutoint = (int) absoluto;
                    System.out.print(absolutoint);
                } else {
                    System.out.println(absoluto);
                }
            }
        }

    }

}
