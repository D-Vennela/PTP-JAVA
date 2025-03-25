import java.util.Scanner;
class Roots{
	public static void main(String...args){
		Scanner hehe= new Scanner(System.in);
		int a=hehe.nextInt();
		int b=hehe.nextInt();
		int c=hehe.nextInt();
		//roots of qe
		double d=Math.sqrt(b*b  -4*a*c);
		//System.out.println("r1  -"+ ((-b)+((int)Math.sqrt((b*b)-4*a*c))/(2*a)));
		//System.out.println("r2  -"+((-b)-((int)Math.sqrt((b*b)-4*a*c))/(2*a)));
	System.out.println(((-b+d)/(2*a)) + " and "+ ((-b-d)/(2*a)));
	//System.out.println("r2  -"+((-b-d)/(2*a)));	

	}
}