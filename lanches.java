import java.util.Scanner;
public class lanches {
   public static void main (String[]args) {
	   Scanner in = new Scanner(System.in);
	   int c;
	   System.out.println("escolha um código");
	   c=in.nextInt();
	   //Estrutura switch-case
	   switch(c) {
	   case 1:
		   System.out.println("Cachorro Quente R$ 8,00");
		  break;
	   case 2:
		   System.out.println("Cheese Burguer R$ 12,00");
		  break; 
	   case 3:
		   System.out.println("X-Salada R$ 13,00");
				  break;
	   case 4:
		   System.out.println("Misto Quente R$ 11,00");
		  break;
	   case 5:
		   System.out.println("Pão na Chapa R$ 11,00");
		  break;
	  default:
		  System.out.println("codigo invalido");
	   }
		   
   }
}
