import java.util.Scanner;

public class DemoClass {
	public static void main(String[] args) {
		System.out.println("Sample Code");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter int: ");
		int i = sc.nextInt();
		
//		System.out.print("Enter char: ");
//		char c = sc.next().charAt(0);
		System.out.println("'" + sc.nextLine() + "'");	//\n
		System.out.print("Enter string: ");
		String s = sc.nextLine();
//		sc.nextLine(); //buffer - '\n'
//		sc.nextLine();
		
		
		System.out.println("i = " + i + "\ts = \"" + s + "\"");
		
		sc.close();
	}
}