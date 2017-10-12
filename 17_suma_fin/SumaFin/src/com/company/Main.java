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
	double min = Double.MAX_VALUE;
	double max = Double.MIN_VALUE;
	double total = 0;
	double y = 0;
	boolean isNumeric;
        System.out.println("Introduzca un valor o escriba FIN para terminar:");
        String x = br.readLine();
        do {
            if ((new String("FIN").equals(x)) == false) {
                try {
                    y = Double.parseDouble(x);
                    isNumeric = true;
                } catch (NumberFormatException nfe) {
                    isNumeric = false;
                }
                if (isNumeric == false) {
                    System.out.println("Operación invalida.");
                } else {
                    total = y + total;
                    if (y < min) min = y;
                    if (y > max) max = y;
                }
                System.out.println("Introduzca un valor o escriba FIN para terminar:");
                x = br.readLine();
            }
        } while ((new String("FIN").equals(x)) == false);
        System.out.print("La suma total es ");
        if (total % 1 == 0) {
            System.out.print(df.format(total));
        } else {
            System.out.print(total);
        }
        System.out.print(". El mínimo es ");
        if (min % 1 == 0) {
            System.out.print(df.format(min));
        } else {
            System.out.print(min);
        }
        System.out.print(". El máximo es ");
        if (max % 1 == 0) {
            System.out.print(df.format(max));
        } else {
            System.out.print(max);
        }
        System.out.println(".");
    }
}
