import java.util.Scanner;
public class imc {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	double imc, altura, peso;
	System.out.println("coloque seu peso");
	peso=in.nextDouble();
	System.out.println("Coloque sua altura");
	altura=in.nextDouble();
	imc=(peso/(altura*altura));
	System.out.println(imc);
	
	System.out.println(imc);
	if(imc<=18.5) {
		System.out.println("excesso de magreza");
	}else if(imc<=25) {
		System.out.println("peso normal");
	}else if(imc<=30) {
		System.out.println("excesso de peso");
	}else if (imc<=35) {
		System.out.println("obesidade 1");
	} else if (imc<=40) {
		System.out.println("obesidade 2");
	} else {
		System.out.println ("obesidade 3");
	}
}
}
