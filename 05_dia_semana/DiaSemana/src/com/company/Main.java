package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            int end = 0;
            while (end == 0) {
                try {
                    System.out.println("Introduzca un valor entre 1 y 7:");
                    int x = Integer.parseInt(br.readLine());
                    if (x < 1 || x > 7) {
                        System.out.println("Operación invalida, introduzca un valor entre 1 y 7");
                    } else {
                        if (x == 1) {
                            System.out.println("Lunes");
                        }
                        if (x == 2) {
                            System.out.println("Martes");
                        }
                        if (x == 3) {
                            System.out.println("Miércoles");
                        }
                        if (x == 4) {
                            System.out.println("Jueves");
                        }
                        if (x == 5) {
                            System.out.println("Viernes");
                        }
                        if (x == 6) {
                            System.out.println("Sábado");
                        }
                        if (x == 7) {
                            System.out.println("Domingo");
                        }
                        ++end;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida");
                }
            }
        }
    }
}