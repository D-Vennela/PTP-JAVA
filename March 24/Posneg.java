import java.util.Scanner;
class Posneg{
	public static void main(String...args){
		 Scanner hehe = new Scanner(System.in);
		 int i= hehe.nextInt();
		 	if(i>0)
		 		System.out.println("i is Positive");
		 	else if(i<0)
		 		System.out.println("i is Negative");
		 	else
		 	System.out.println("the number is Zero");
		 //Ternary op
		 	System.out.println((i==0) ? "Zero":(i>0) ? "Positive":"Negative");
	 	}
}