/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author Данил
 */
public class Factorial {

   public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int n;
          long res;
        System.out.println("Input digit:");
        n=input.nextInt();
        res=fact(n);
        System.out.println("Factorial is:" +res);
        
        
    }
    public static long fact(int n){
     if(n==0)    
        return 1;
     else
         return n * fact(n-1);
    }
    
}
