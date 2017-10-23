package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            int precio, dinero;
            boolean start = false;

            do {
                System.out.println("Escriba el precio del producto en céntimos");
                precio = Integer.parseInt(br.readLine());
                System.out.println("Escriba el dinero introducido en céntimos");
                dinero = Integer.parseInt(br.readLine());

                if (precio > dinero) {
                    System.out.println("Dinero insuficiente");

                } else {
                    if (precio % 5 != 0 && dinero % 5 != 0) {
                        System.out.println("Operación invalida");

                    } else {
                        start = true;
                    }
                }
            } while (!start);

            int cambio = dinero - precio;

            if (cambio == 0) {
                System.out.println("Operación sin cambio");

            } else {

                if (cambio >= 200) {
                    int dos = cambio / 200;
                    cambio %= 200;
                    System.out.println(dos + " moneda(s) de 2€");
                }
                if (cambio >= 100) {
                    int uno = cambio / 100;
                    cambio %= 100;
                    System.out.println(uno + " moneda(s) de 1€");
                }
                if (cambio >= 50) {
                    int cincu = cambio / 50;
                    cambio %= 50;
                    System.out.println(cincu + " moneda(s) de 50 céntimos");
                }
                if (cambio >= 20) {
                    int veinte = cambio / 20;
                    cambio %= 20;
                    System.out.println(veinte + " moneda(s) de 20 céntimos");
                }
                if (cambio >= 10) {
                    int diez = cambio / 10;
                    cambio %= 10;
                    System.out.println(diez + " moneda(s) de 10 céntimos");
                }
                if (cambio >= 5) {
                    int cinco = cambio / 5;
                    System.out.println(cinco + " moneda(s) de 5 céntimos");
                }
            }
        }
    }
}
