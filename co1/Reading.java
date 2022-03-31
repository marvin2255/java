package marvin;
import java.util.Scanner;

public class Reading {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name,roll no, mark");
		String name=obj.nextLine();
		int age=obj.nextInt();
		Double mark=obj.nextDouble();
		System.out.println("NAME ="+name);
		System.out.println("ROLL NO ="+age);
		System.out.println("MARK ="+mark);

	}

}
