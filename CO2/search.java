package siva;
import java.util.*;
public class search {

	public static void main(String[] args) {
		int i;
		int a[]= new int[50];
		Scanner in =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=in.nextInt();
		System.out.println("enter the element");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("enter the element you want to search");
		int x=in.nextInt();
		
		int flag=1;
		for(i=0;i<n;i++) {
			if(a[i]==x) {
				System.out.println("element found at "+i+" position");
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println("element is not found");
		}
		
	}

}
