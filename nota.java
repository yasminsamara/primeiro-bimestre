import java.util.Scanner;
public class nota {
	public static void main (String[]args) {
		double n1, n2, media , exame;
		Scanner in=new Scanner(System.in);
		System.out.println("digite a primeira nota");
		n1=in.nextDouble();
		System.out.println("digite a segunda nota");
		n2=in.nextDouble();
		System.out.println(media=(n1+n2)/2);
		if (media<=3) {
			System.out.println (" Reprovado");
		}else if(media<6){
			System.out.println("Será examinado");
			System.out.println("Coloque a nota do exame");
			exame=in.nextDouble();
			if (media>=6) {
				System.out.println("aprovado");
			}
		    System.out.println(media>=6);
			System.out.println ("Aprovado");
			
			
		}
		
		
	}
}

