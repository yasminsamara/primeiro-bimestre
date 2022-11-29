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
			System.out.println("Não é um triângulo");
		}else if (a==b && b==c) {
			System.out.println("É um triângulo equilátero");
		}else if (a!=b && b!=c && a!=c) {
			System.out.println("É um triângulo escaleno");
		}else {
			System.out.println("É um triângulo isósceles");
			in.close();
		}
	}
	}


