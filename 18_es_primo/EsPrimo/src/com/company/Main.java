package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean end = false;
        int x;

        while (!end) {
            System.out.println("Introduzca un valor:");
            x = Integer.parseInt(br.readLine());

            if (x > 2) {

                for (int count = 2; count < x && !end; ) {
                    if (x % count == 0) {
                        System.out.print(x);
                        System.out.println(" no es un número primo.");
                        end = true;
                    }
                    ++count;
                }

            } else {
                System.out.print(x);
                System.out.println(" no es un número primo.");
                end = true;
            }

            if (!end) {
                System.out.print(x);
                System.out.println(" es un número primo");
                end = true;
            }
        }
    }
}
