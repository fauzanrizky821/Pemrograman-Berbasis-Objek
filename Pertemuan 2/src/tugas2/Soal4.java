/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author user
 */
public class Soal4 {

    static short methodOne(long l) {
        System.out.println("long: "+l);
        int i = (int) l;
        System.out.println("int: "+i);
        System.out.println("short: "+(short) i);
        return (short) i;
    }

    public static void main(String[] args) {
        double d = 10.25;
        System.out.println("double: " + d);
        float f = (float) d;
        System.out.println("float: "+f);
        byte b = (byte) methodOne((long) f);
        System.out.println("byte: "+b);
    }

}
