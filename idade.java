import java.util.*;
public class idade {
	public static void main(String args[]) {
		Scanner in= new Scanner (System.in);
		int i=1;
		int id;
			do {
				System.out.println("Digite sua idade");
				id=in.nextInt();
				if(id<=15) {
					System.out.println("Faxa Etária 1");
				} 
				if(id>=16 & id<=30) {
					System.out.println("Faixa Etária 2");
				}
				if(id>=31 & id<=45) {
					System.out.println("Faixa Etária 3");
				}
				if (id>=46 & id<=60) {
					System.out.println("Faixa Etária 4");
				}if (id>=61){
					System.out.println("Faixa Etária 5");
				}
			}while(i<=15);
			System.out.println();
			
		}
		
		
		
	}


