package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            int precio = 0;
            int dinero = 0;
            boolean start = true;

            do {
                System.out.println("Escriba el precio del producto en céntimos");
                precio = Integer.parseInt(br.readLine());
                System.out.println("Escriba el dinero introducido en céntimos");
                dinero = Integer.parseInt(br.readLine());

                if (dinero >= precio) {
                    System.out.println("Dinero insuficiente");

                } else {
                    if (precio % 5 != 0 && dinero % 5 != 0) {
                        System.out.println("Operación invalida");

                    } else {
                        start = true;
                    }
                }
            } while (!start);

            int cambiod = precio - dinero;

            if (cambiod == 0) {
                System.out.println("Operación  sin cambio");

            } else {
                int cambio = cambiod;

                if (cambio >= 200) {
                    int dos = cambio / 200;
                    cambio = cambio % 200;
                    System.out.print(dos);
                    System.out.println(" moneda(s) de 2€");
                }
                if (cambio >= 100) {
                    int uno = cambio / 100;
                    cambio = cambio % 100;
                    System.out.print(uno);
                    System.out.println(" moneda(s) de 1€");
                }
                if (cambio >= 50) {
                    int cincu = cambio / 50;
                    cambio = cambio % 50;
                    System.out.print(cincu);
                    System.out.println(" moneda(s) de 50 céntimos");
                }
                if (cambio >= 20) {
                    int veinte = cambio / 20;
                    cambio = cambio % 20;
                    System.out.print(veinte);
                    System.out.println(" moneda(s) de 20 céntimos");
                }
                if (cambio >= 10) {
                    int diez = cambio / 10;
                    cambio = cambio % 10;
                    System.out.print(diez);
                    System.out.println(" moneda(s) de 10 céntimos");
                }
                if (cambio >= 5) {
                    int cinco = cambio / 5;
                    System.out.print(cinco);
                    System.out.println(" moneda(s) de 5 céntimos");
                }
            }
        }
    }
}
