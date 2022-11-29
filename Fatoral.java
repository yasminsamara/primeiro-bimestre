
import java.util.Scanner;
public class fatorial {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int base, potencia=1;
		int expoente, i=1;
		System.out.println ("Insira a base");
		base = in.nextInt ();
		System.out.println ("Insira o expoente");
		expoente = in.nextInt ();
		while (i<=expoente) {
			potencia=potencia*base;
			i++;
		}
		System.out.println ("O resultado é"+potencia);
		
		in.close();	
		}
	}


