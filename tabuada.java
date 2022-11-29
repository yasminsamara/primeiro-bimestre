import java.util.*;
public class tabuada {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
        int i=1,n, resultado;
        
        System.out.println("Informar um número:");
        n=in.nextInt();
             while(i <= 10){
                 resultado = n*i;
                 System.out.println(n+"x"+i+"="+resultado);   
                 i++;
             }
             in.close();
        }
	}

	
