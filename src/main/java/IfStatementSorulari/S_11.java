package IfStatementSorulari;

import java.util.Scanner;

public class S_11 {
    //Kullanicidan bir sifre girmesini isteyin
    //Eger ilk harf buyukse A olup olmadigini kontrol edin.Ilk harf A ise
    // "Gecerli sifre" degilse "gecersiz sifre" yazdirin.
    //Eger ilk harf kücük harf ise "z" olup olmadigini kontrol edin.ilk harf z ise "gecerli sifre"
    // degilse "gecersiz sifre" yazdirin
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sfr = input.next();
        if (sfr.charAt(0)>='A' && sfr.charAt(0)<='Z') {
            if (sfr.charAt(0) == 'A') {
                System.out.println("gecerli sifre");

            } else {
                System.out.println( "gecersiz sifre");

            }

        }
    if (sfr.charAt(0)>='a' && sfr.charAt(0)<='z'){if(sfr.charAt(0)=='z')
    {
        System.out.println("gecerli sifre");
    }
    else{
        System.out.println("gecersiz sifre");
    }}}}
