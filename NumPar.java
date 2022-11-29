import java.util.*;
public class NumPar {
	public static void main(String args []) {
		Scanner in=new Scanner (System.in);
		int i;
		double num;
		i=1;
		num=in.nextDouble();
		do {
			if(num%10==0){
				System.out.println(num);		
			}i++;
	 }while (i<=500);
}
}
