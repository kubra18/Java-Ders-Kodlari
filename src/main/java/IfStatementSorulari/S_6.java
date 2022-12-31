package IfStatementSorulari;

import java.util.Scanner;

public class S_6 {
    //Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
    //ikisi de negatif ise carpimini yazdirin
    //farkli isaretlerde ise islem yapamazsin
    //sayilardan biri sifir ise sifir yutan elemandir yazdirin.
    public static void main(String[] args) {
        System.out.println("lütfen 2 tamsayi giriniz");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        int b = input1.nextInt();
        if (a < 0 && b < 0)
        {
            System.out.println(a * b);
        }
       else if (a > 0 && b > 0)
        {
            System.out.println(a + b);
        }
       else if ((a < 0 && b > 0)||(a > 0 && b < 0))
        {
            System.out.println("islem yapamazsin");
        }
       else   if (a == 0 || b == 0)
        {
            System.out.println("sifir carpmada yutan elemandir");
        }
    }}