package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean invalido = false;
        int x;
        int y;
        int resul = 0;
        String menu;

        System.out.println("Introduzca un primer valor:");
        x = Integer.parseInt(br.readLine());
        System.out.println("Introduzca un segundo valor:");
        y = Integer.parseInt(br.readLine());

        do {
            System.out.println();
            System.out.println("MENÚ");
            System.out.println("----");
            System.out.println("a) Suma.");
            System.out.println("b) Resta. ");
            System.out.println("c) Multiplicación.");
            System.out.println("d) División. ");
            System.out.println("e) Resto.");
            System.out.println("f) Terminar. ");
            System.out.println();
            System.out.println("Introduzca una opción: ");
            menu = br.readLine();

            switch (menu.toLowerCase()) {
                case "a":
                    resul = x + y;
                    break;
                case "b":
                    resul = x - y;
                    break;
                case "c":
                    resul = x * y;
                    break;
                case "d":
                    resul = x / y;
                    break;
                case "e":
                    resul = x % y;
                    break;
                case "f":
                    invalido = true;
                    break;
                default:
                    System.out.println("Operación invalida");
                    invalido = true;
                    break;
            }

            if (!invalido) {
                System.out.println(resul);
            } else {
                invalido = false;
            }

        } while (!menu.equalsIgnoreCase("f"));
    }
}

