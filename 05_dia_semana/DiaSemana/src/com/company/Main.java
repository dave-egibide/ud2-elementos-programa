package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            int x;
            do {
                try {
                    System.out.println("Introduzca un valor entre 1 y 7:");
                    x = Integer.parseInt(br.readLine());
            switch (x) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Operación invalida.");
                    x = -1;
                    break;
            }
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida.");
                    x = -1;
                }
            } while (x == -1);

        }
    }
}
