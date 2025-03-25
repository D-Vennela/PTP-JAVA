import java.util.Scanner;
class Switch{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO CALCULATOR");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
		System.out.println("SELECT AN OPTION FOR CALCULATION");
		int n = sc.nextInt();
		System.out.println("Enter 2 values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		switch(n){
				case 1: 
					System.out.println("Addition:" + (a+b));
					break;
				case 2:
					System.out.println("Subtraction:" + (a-b));
					break;
				case 3:
					System.out.println("Multiplication:" + (a*b));
					break;
				case 4:
					System.out.println("Division:" + (a/b));
					break;
				default: 
					System.out.println("Exit");
 			
		}
	}
}
		