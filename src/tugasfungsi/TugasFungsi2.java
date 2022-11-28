/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasfungsi;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class TugasFungsi2 {

    public static void max(int a, int b, int c) {
        int maks;
        System.out.println("nilai tertingginya: ");
        maks = Math.max(a, b);
        if (c > maks) {
            maks = c;
        }
        System.out.println(maks);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("masukkan nilai a: ");
        a = input.nextInt();

        System.out.println("masukkan nilai b: ");
        b = input.nextInt();

        System.out.println("masukkan nilai c: ");
        c = input.nextInt();
        max(a, b, c);
    }

}
