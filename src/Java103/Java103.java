package Java103;
import java.util.Scanner;
public class Java103 {
public static void main(String[] args) {
	int a,b;
	double c;
	
	Scanner girdi = new Scanner(System.in);
	System.out.print("1. kenar:" );
	a = girdi.nextInt();
	System.out.print("2. kenar:" );
	b = girdi.nextInt();
	c = Math.sqrt((a*a)+(b*b));
	System.out.print("" +c );

}
}
