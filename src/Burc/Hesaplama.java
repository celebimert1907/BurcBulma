package Burc;

import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gun, ay;

        System.out.print("Yilin kacinci ayinda dogdugunuzu giriniz: ");
        ay = input.nextInt();
        System.out.print("Ayin kacinci gununde dogdugunuzu giriniz: ");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun >= 22) {
                System.out.println("Kova");
            } else {
                System.out.println("Oglak");
            }
        }
        if (ay ==2) {
            if (gun >= 20) {
                System.out.println("Balik");
            } else {
                System.out.println("Kova");
            }
        }
        if (ay ==3) {
            if (gun >= 21) {
                System.out.println("Koc");
            } else {
                System.out.println("Balik");
            }
        }
        if (ay ==4) {
            if (gun >= 21) {
                System.out.println("Boga");
            } else {
                System.out.println("Koc");
            }
        }
        if (ay ==5) {
            if (gun >= 22) {
                System.out.println("Ikizler");
            } else {
                System.out.println("Boga");
            }
        }
        if (ay ==6) {
            if (gun >= 23) {
                System.out.println("Yengec");
            } else {
                System.out.println("Ikizler");
            }
        }
        if (ay ==7) {
            if (gun >= 23) {
                System.out.println("Aslan");
            } else {
                System.out.println("Yengec");
            }
        }
        if (ay ==8) {
            if (gun >= 23) {
                System.out.println("Basak");
            } else {
                System.out.println("Aslan");
            }
        }
        if (ay ==9) {
            if (gun >= 23) {
                System.out.println("Terazi");
            } else {
                System.out.println("Basak");
            }
        }
        if (ay ==10) {
            if (gun >= 23) {
                System.out.println("Akrep");
            } else {
                System.out.println("Terazi");
            }
        }
        if (ay ==11) {
            if (gun >= 22) {
                System.out.println("Yay");
            } else {
                System.out.println("Akrep");
            }
        }
        if (ay ==12) {
            if (gun >= 22) {
                System.out.println("Oglak");
            } else {
                System.out.println("Yay");
            }
        }
    }
}

