package IfStatementSorulari;

import java.util.Scanner;

public class S_7 {
    // kullanicidan 100 üzerinden not isteyin. not'u harf sistemine cevirip yazdirin.
//    50'den kucukse D 50-60 arasi C, 60-80 arasi B, 80 in uzerinde ise A'
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("100 üzerinden bir not giriniz");
        int a = input.nextInt();
        if (a<50)
        {
            System.out.println("D");
    } else if (50<=a || a<60)
    {
        System.out.println("C");

        } else if (a>=60 || a<80) {
            System.out.println("B");

        } else if (a>=80 ) {
            System.out.println("A");

        }
    }}
