import java.util.Scanner;
public class exercicioUm {
	public static void main(String[] args) {
		//vetor A
		Scanner ler= new Scanner(System.in);
		final int TAM=10;
		int i, a[], b[];
		
		a= new int[TAM];
		b = new int[TAM];
		for(i=0; i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor");
			a[i]=ler.nextInt();
			b[i]=a[i];
			
		}
		//Apresentar vetor B
		for (i=0; i<TAM ; i++) {
			System.out.print(b[i]=a[i]*a[i]);
		}
		

	}

}
