/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author fauzan
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan angka: ");
            String nilai = input.next();
            
            try {
                long angka = Long.parseLong(nilai);
                if (angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE) {
                    System.out.println(angka + " tipe data yang cocok:");
                    System.out.println("- Long");
                    System.out.println("- Integer");
                    System.out.println("- Short");
                    System.out.println("- Byte");
                } else if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {
                    System.out.println(angka + " tipe data yang cocok:");
                    System.out.println("- Long");
                    System.out.println("- Integer");
                    System.out.println("- Short");
                } else if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                    System.out.println(angka + " tipe data yang cocok:");
                    System.out.println("- Long");
                    System.out.println("- Integer");
                } else {
                    System.out.println(angka + " tipe data yang cocok:");
                    System.out.println("- Long");
                }
            } catch (NumberFormatException e) {
                    System.out.println("tidak cocok di tipe data manapun");
            }
        }
    }

}
