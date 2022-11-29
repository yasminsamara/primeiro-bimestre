import java.util.Scanner;
public class rodizio {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		int num;
		System.out.println("Digite o último dígito de sua placa");
		num=in.nextInt();
		// Estrutura switch-case
		switch(num) {
		case 1:
		case 2:
			System.out.println ("Segunda-feira");
			break;
		case 3:
		case 4:
			System.out.println("Terça-feira");
		    break;
		case 5:
		case 6:
			System.out.println("Quarta-feira");
			break;
		case 7:
		case 8:
			System.out.println("Quinta-feira");
		case 9:
		case 0:
			System.out.println("Sexta-feira");
		default:
			System.out.println("inválido");
		}
	}
}
