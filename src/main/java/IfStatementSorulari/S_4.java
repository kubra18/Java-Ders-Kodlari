package IfStatementSorulari;

import java.util.Scanner;

public class S_4 {
    //kullanicidan dikdortgenin kenar uzunluklarini isteyin ve kare olup olmadigini soyleyin
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 1.kenari  giriniz");
        int kenar1 = input.nextInt();
        System.out.println("lütfen 2.kenari giriniz");
        Scanner input1 = new Scanner(System.in);
        int kenar2 = input1.nextInt();
        System.out.println("lütfen 3.kenari giriniz");
        Scanner input2 = new Scanner(System.in);
        int kenar3 = input2.nextInt();
        System.out.println("lütfen 4.kenari giriniz");
        Scanner input3 = new Scanner(System.in);
        int kenar4 = input3.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar3 == kenar4) {
            System.out.println("karedir");


        } else {
            System.out.println("kare degildir");
        }
    }}