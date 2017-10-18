package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dni = 0;
        boolean verificado = false;
        boolean correcto;

        while (dni == 0) {
            System.out.println("Introduzca un número de DNI:");
            dni = Integer.parseInt(br.readLine());

            if (dni < 1 || dni > 99999999) {
                System.out.println("Número inválido");
                dni = 0;
            }
        }

        do {
            System.out.println("Introduzca la letra a verificar:");
            String letra = br.readLine();

            letra = letra.toLowerCase();
            correcto = true;

            switch (letra) {
                case "t":
                    if (dni % 23 == 0) {
                        verificado = true;
                    }
                    break;
                case "r":
                    if (dni % 23 == 1) {
                        verificado = true;
                    }
                    break;
                case "w":
                    if (dni % 23 == 2) {
                        verificado = true;
                    }
                    break;
                case "a":
                    if (dni % 23 == 3) {
                        verificado = true;
                    }
                    break;
                case "g":
                    if (dni % 23 == 4) {
                        verificado = true;
                    }
                    break;
                case "m":
                    if (dni % 23 == 5) {
                        verificado = true;
                    }
                    break;
                case "y":
                    if (dni % 23 == 6) {
                        verificado = true;
                    }
                    break;
                case "f":
                    if (dni % 23 == 7) {
                        verificado = true;
                    }
                    break;
                case "p":
                    if (dni % 23 == 8) {
                        verificado = true;
                    }
                    break;
                case "d":
                    if (dni % 23 == 9) {
                        verificado = true;
                    }
                    break;
                case "x":
                    if (dni % 23 == 10) {
                        verificado = true;
                    }
                    break;
                case "b":
                    if (dni % 23 == 11) {
                        verificado = true;
                    }
                    break;
                case "n":
                    if (dni % 23 == 12) {
                        verificado = true;
                    }
                    break;
                case "j":
                    if (dni % 23 == 13) {
                        verificado = true;
                    }
                    break;
                case "z":
                    if (dni % 23 == 14) {
                        verificado = true;
                    }
                    break;
                case "s":
                    if (dni % 23 == 15) {
                        verificado = true;
                    }
                    break;
                case "q":
                    if (dni % 23 == 16) {
                        verificado = true;
                    }
                    break;
                case "v":
                    if (dni % 23 == 17) {
                        verificado = true;
                    }
                    break;
                case "h":
                    if (dni % 23 == 18) {
                        verificado = true;
                    }
                    break;
                case "l":
                    if (dni % 23 == 19) {
                        verificado = true;
                    }
                    break;
                case "c":
                    if (dni % 23 == 20) {
                        verificado = true;
                    }
                    break;
                case "k":
                    if (dni % 23 == 21) {
                        verificado = true;
                    }
                    break;
                case "e":
                    if (dni % 23 == 22) {
                        verificado = true;
                    }
                    break;
                default:
                    System.out.println("Operación inválida.");
                    correcto = false;
                    break;
            }
        } while (!correcto);

        if (verificado) {
            System.out.println("DNI correcto.");
        } else {
            System.out.println("DNI incorrecto.");
        }
    }
}
