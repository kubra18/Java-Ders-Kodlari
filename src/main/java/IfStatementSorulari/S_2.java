package IfStatementSorulari;

import java.util.Scanner;

public class S_2 {
    //kullanicidan gün isimlerinden birinin ilk harfini istedyin
    // ve o harfle baslayan günleri yazdirin.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        String harf = input.next();
        if (harf.equalsIgnoreCase("P")) {
            System.out.println("Persembe," + "Pazar,"+"Pazartesi");
        }
        else if (harf.equalsIgnoreCase("S")) {
            System.out.println("Sali");
        } else if (harf.equalsIgnoreCase("C")) {
            System.out.println("Carsamba,"+"Cuma,"+"Cumartesi");

        } else  {
            System.out.println("gecerli bir harf giriniz");

        }
    }}