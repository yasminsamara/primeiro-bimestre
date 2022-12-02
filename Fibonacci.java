import java.util.*;
public class Fibonacci {
      public static void main (String args []){
         Scanner in= new Scanner(System.in);
         int  num, i=1, act=1, prox=0, ant;
         System.out.println("Digite um número");
         num= in.nextInt ();
         for(i=0;i<=num;i++){
               prox= act+ act;
               act= prox;
              System.out.println("O fibonnacci é");
              i++;
          
       }
     }
}

