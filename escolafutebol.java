import java.util.Scanner;
public class escolafutebol {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int id;
		System.out.println("Digite sua idade");
		id=in.nextInt();
			  if (id==6) {
			      System.out.println("Dente de leite");
			  }else if (id==7) {
				  System.out.println("Júnior");
			  }else if(id==8) {
				  System.out.println("Júnior max");
			  }else if (id==9){
				  System.out.println("Júnior master");
			  }else if(id==10) {
				  System.out.println("Master");
			  }else if(id<5 && id<10) {
				  System.out.println("Idade Inválida");
			  }
	}
}



