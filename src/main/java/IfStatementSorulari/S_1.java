package IfStatementSorulari;

import java.util.Scanner;

public class S_1 {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi isteyin ve tek veya cift oldugunu yazdirin..
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("sayi cift sayidir");
        } else {
            System.out.println("sayi tektir");
        }


    }}