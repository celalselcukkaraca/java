
package taskone;

import java.util.Scanner;

public class Taskone {

   
    public static void main(String[] args) {
        
        int x;
        String c;
        String ot="";
        
        System.out.println("1- Lütfen bir isim giriniz ");
        Scanner yourname= new Scanner(System.in);
        c=yourname.nextLine();
        //System.out.println("Senin  girdiğin ismin = "+c);
        
        
        System.out.println("2- Lütfen bir sayı giriniz ");
        Scanner yournumber= new Scanner(System.in);
        x=yournumber.nextInt();
        System.out.println("Senin  girdiğin sayı = "+ x);
        
        for(int i =0; i< c.length() ;i++) {       
            
           // System.out.println(c.charAt(i));
            
            char z=(char) (c.charAt(i)+x);
            
            //System.out.println(z);
            
            ot=ot+ z;
            
           
        }
            
           System.out.println("SONUÇ  ="+ ot); 
        
    }
    
    
    
}
