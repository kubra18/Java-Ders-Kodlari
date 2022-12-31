package IfStatementSorulari;

import java.util.Scanner;

public class S_12 {
    //Kullanicidan 4 basamakli bir sayi girmesini isteyin. Girdigi sayi 5'e bolunuyorsa
    //son rakamini kontrol edin.son rakami 0 ise ekrana 5 e bolunen cift sayi yazdirin
    //son rakami 0 degil se 5'e bölunen tek sayi yazdirin.
    //Girdigi password 5 e bolunmuyorsa ekrana "tekrar deneyin yazdirin."
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz...");
        int a = input.nextInt();

        if (a % 5 == 0) {
            if (a % 2 == 0) {
                System.out.println("5 e bolunebilen cift sayi");
            } else {
                System.out.println("5 e bölunebilen tek sayidir.");
            }}
        else{
                System.out.println("tekrar deneyin");
            }
        }
    }