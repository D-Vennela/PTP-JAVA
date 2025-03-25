import java.util.Scanner;
class SwitchExp{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO CALCULATOR");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
		System.out.println("SELECT AN OPTION FOR CALCULATION");
		int exp = sc.nextInt();
		System.out.println("Enter 2 values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = switch(exp){
                	case 1 -> a+b;
			case 2 -> a-b;
			case 3 -> a*b;
			case 4 -> a/b;
			default -> 0;             
		};
		System.out.println(x);
	}
}