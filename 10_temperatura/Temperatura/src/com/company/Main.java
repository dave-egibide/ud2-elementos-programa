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
            int end = 0;
            int correct = 0;
            double temp = 0;
            do {
                System.out.println("Introduzca una temperatura en grados centígrados:");
                try {
                    temp = Double.parseDouble(br.readLine());
                    ++correct;
                } catch (NumberFormatException e) {
                    System.out.println("Operación invalida");
                }
            } while (correct == 0);
                do {
                    System.out.println("Introduzca F para convertir a Fahrenheit o introduzca K para convertir a Kelvin:");
                    try {
                        String x = br.readLine();
                    if ((new String("F").equals(x)) == true) {
                        double fahr = temp * 9 / 5 + 32;
                        if (temp % 1 == 0) {
                            System.out.print(df.format(temp));
                        } else {
                            System.out.print(temp);
                        }
                        System.out.print(" ºC son ");
                        if (fahr % 1 == 0) {
                            System.out.print(df.format(fahr));
                        } else {
                            System.out.print(fahr);
                        }
                        System.out.println(" ºF");
                        ++end;
                    } else {
                        if ((new String("K").equals(x)) == true) {
                            double kelvin = temp + 273.15;
                            if (temp % 1 == 0) {
                                System.out.println(df.format(temp));
                            } else {
                                System.out.print(temp);
                            }
                            System.out.print("ºC son ");
                            System.out.print(kelvin);
                            System.out.println("ºK");
                            ++end;
                        } else {
                            System.out.println("No valido");
                        }
                    }
                    } catch (NumberFormatException e) {
                        System.out.println("Operación invalida");
                    }
                } while (end == 0);

            }
        }
    }
