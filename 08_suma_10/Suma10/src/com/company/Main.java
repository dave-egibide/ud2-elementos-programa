package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            double total = 0;
            int count = 0;
            while (count < 10) {
                System.out.println("Introduzca un valor:");
                double x = Double.parseDouble(br.readLine());
                total = total + x;
                count++;
            }
            if (total % 1 == 0) {
                int totalint = (int) total;
                System.out.print("La suma es: ");
                System.out.println(totalint);
            } else {
                System.out.print("La suma es: ");
                System.out.println(total);
            }
        }
    }
}
