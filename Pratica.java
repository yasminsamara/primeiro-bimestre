package vetores;
import java.util.Scanner;
public class Pratica {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		int i,a[],b[];
		final int TAM = 5;
		a = new int [TAM];
		b = new int [TAM];
		
		System.out.println (" VETOR A: ");
		for (i=0;i<TAM;i++) {
			
			System.out.println (" digite o " +(i+1)+ " valor: ");
			a[i] = leitura.nextInt();
		}
		
		System.out.println (" VETOR B: ");
		for (i=0;i<TAM;i++) {	
			b[i] = a[i]*a[i];
			System.out.println (" resultado do valor " +(i+1)+ " : " +b[i]);
			
		}

	}

}

