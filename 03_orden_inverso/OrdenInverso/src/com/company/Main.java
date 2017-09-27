package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            System.out.println("Introduzca un valor:");
            Double a = Double.parseDouble(br.readLine());
            System.out.println("Introduzca un segundo valor:");
            Double b = Double.parseDouble(br.readLine());
            System.out.println("Introduzca un tercer valor:");
            Double c = Double.parseDouble(br.readLine());
            if (c % 1 == 0) {
                int cc = c.intValue();
                System.out.println(cc);
            } else {
                System.out.println(c);
            }
            if (b % 1 == 0) {
                int bb = b.intValue();
                System.out.println(bb);
            } else {
                System.out.println(b);
            }
            if (a % 1 == 0) {
                int aa = a.intValue();
                System.out.println(aa);
            } else {
                System.out.println(a);
        }
        }
    }
}
