package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(0);
        {
            int correct = 0;
            int invalido = 0;
            double x = 0;
            double y = 0;
            double resul = 0;
            String menu;
            do {
                try {
                    System.out.println("Introduzca un primer valor:");
                    x = Double.parseDouble(br.readLine());
                    System.out.println("Introduzca un segundo valor:");
                    y = Double.parseDouble(br.readLine());
                    ++correct;
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida. Sólo valores numéricos.");
                }
            } while (correct == 0);
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
                        ++invalido;
                        break;
                    default:
                        System.out.println("Operación invalida");
                        ++invalido;
                        break;
                }
                if (invalido == 0) {
                    if (resul % 1 == 0) {
                        System.out.println(df.format(resul));
                    } else {
                        System.out.println(resul);
                    }
                } else {
                    --invalido;
                }
                } while (menu.equalsIgnoreCase("f") == false);
            }


        }
    }
