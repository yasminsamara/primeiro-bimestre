import java.util.Scanner;
public class mes {
	public static void main( String[] args) {
    Scanner in= new Scanner(System.in);
    int mes;
    System.out.println("Escreva o número correspondente ao mês");
    mes=in.nextInt();
    //Estrutura switch-case
    switch (mes) {
        case 1:
    	case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	System.out.println("Tem 31 dias");
        	break;
        case 4:
        case 6:
        case 9:
        case 11:
        	System.out.println("Tem 30 dias");
        	break;
        case 2:
        	System.out.println("Tem 28 dias");
        	break;
        default:
        	System.out.println("Mês inválido");
       


    }
    }
}
