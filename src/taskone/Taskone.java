package taskone;

import java.util.Scanner;

public class Taskone {

    public static String encryptPlainText(String a, int x) {

        String ot = "";
  
        for (int i = 0; i < a.length(); i++) {    
            char z = (char) (a.charAt(i) + x);
            ot = ot + z;
        }
        return ot;
    }

    public static void main(String[] args) {

        System.out.println("1- Lütfen bir isim giriniz ");
        Scanner yourname = new Scanner(System.in);
        String plainText = yourname.nextLine();

        System.out.println("2- Lütfen bir sayı giriniz ");
        Scanner yournumber = new Scanner(System.in);
        int key = yournumber.nextInt();

        String c = encryptPlainText(plainText, key);

        System.out.println("RESULT=" + c);
   
    }
}
