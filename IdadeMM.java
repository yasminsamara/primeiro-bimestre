import java.util.Scanner;
public class IdadeMM {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		int i=1;
		int nsc, ano, id,s;
		do {
			System.out.println("Digite seu ano de nascimento");
			nsc= in.nextInt();
			System.out.println("Digite o ano atual");
			ano= in.nextInt();
			id=ano-nsc;
	    if(id<18){ 
			System.out.println(id + "Menor de idade");
	    }	else {
	    	System.out.println(id + "Maior de idade");
	    	break;
			}
		}while(i<5);
		
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para não");
		s=in.nextInt();
		switch(s){
		case 1:
			System.out.println("Digite seu ano de nascimento");
			nsc= in.nextInt();
			System.out.println("Digite o ano atual");
			ano= in.nextInt();
			id=ano-nsc;
			if(id<18){ 
				System.out.println(id + "Menor de idade");
		    }	else {
		    	System.out.println(id + "Maior de idade");
		    	break;
				}i++;
		      break;
		case 2:
		System.out.println("Fim do programa!! Obrigada por sua assistencia!");
	
		}
	}
}


