import java .util.Scanner;
class SwitchFall{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n){
			case 1,2,3,4:
				System.out.println(n);
				break;
			default:
				System.out.println("default");
		}
	}
}