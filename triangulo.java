import java.util.Scanner;
public class triangulo {
	public static void main(String[]args)  {
		float a, b , c;
		Scanner in=new Scanner(System.in);
		System.out.println("digite o valor do primeiro lado");
		a=in.nextFloat();
		System.out.println("digite o valor do segundo lado");
		b=in.nextFloat();
		System.out.println("digite o valor do terceiro lado");
		c=in.nextFloat();
		if (a>b+c) {
			System.out.println("N�o � um tri�ngulo");
		}else if (a==b && b==c) {
			System.out.println("� um tri�ngulo equil�tero");
		}else if (a!=b && b!=c && a!=c) {
			System.out.println("� um tri�ngulo escaleno");
		}else {
			System.out.println("� um tri�ngulo is�sceles");
			in.close();
		}
	}
	}


