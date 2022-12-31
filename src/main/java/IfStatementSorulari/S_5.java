package IfStatementSorulari;

import java.util.Scanner;

public class S_5 {
    //Kullanicidan gün ismi yazmasini isteyin. Girilen isim gecerli bir gun ise
    //isminin 1.2.3. harflerini buyuk geri kalani kucuk yazdirin.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gun = input.next();
        System.out.println("bir gün ismi giriniz");
        if (gun.equalsIgnoreCase("pazar || pazartesi|| sali||carsamba||persembe||cuma||cumartesi"));
        {
            System.out.println((gun.substring(0,3).toUpperCase()) + ((gun.substring(3)).toLowerCase()));
        }
    }
}
