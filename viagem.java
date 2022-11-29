import java.util.Scanner;
public class viagem {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double lugar, valor, dia;
		System.out.println("digite 1 se você for para ilha bela, Digite 2 se for para Fernando de Noronha ");
		lugar=in.nextDouble();
		if (lugar==1) {
			System.out.println("Digite quantos dias vão ser");
			dia= in.nextDouble();
			if (dia<=5) {
				valor=dia*240;
				System.out.println("o valor será"+valor);
			}else if (dia<=10){
				valor=dia*220+130;
				System.out.println("o valor será"+valor);
			}else {
				valor=dia*210+150;
				System.out.println("o valor será"+valor);
			}
			}else if(lugar==2){
				System.out.println("Digite quantos dias vão ser");
				dia= in.nextDouble();
				if  (dia<=5) {
					valor=dia*400+100;
					System.out.println("o valor será"+valor);
				}else if(dia<=10) {
					valor=dia*410+150;
					System.out.println("o valor será"+valor);
				}else {
					valor=dia*420+200;
					in.close();
					
				}
			}
					
		}
		}
		

