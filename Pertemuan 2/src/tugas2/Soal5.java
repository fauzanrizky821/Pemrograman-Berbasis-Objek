/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Soal5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("A: ");
        String a = input.next();
        
        System.out.print("B: ");
        String b = input.next();
        
        String aa = a.substring(0,1);
        String aaa = aa.toUpperCase();
        a = a.replaceFirst(aa, aaa);
        
        String bb = b.substring(0,1);
        String bbb = bb.toUpperCase();
        b = b.replaceFirst(bb, bbb);
        
        System.out.println(a.length() + b.length());
        
        if (a.compareTo(b) < 0) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
        
        System.out.println(a + " " + b);
       
    }
}
