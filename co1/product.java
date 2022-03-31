package marvin;
import java.util.*;

public class product {
	int pcode;
	String pname;
	int price;
	public void read()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER THE PCODE");
		pcode=obj.nextInt(); 
		System.out.println("ENTER THE NAME");
		Scanner obj1=new Scanner(System.in);
		pname=obj1.nextLine();
		System.out.println("ENTER THE PRICE");
		Scanner obj2=new Scanner(System.in);
		price=obj2.nextInt();
	}
	static void lowest(int price1,int price2,int price3)
	{
		if(price1<=price2 && price1<=price3)
		{
			System.out.println("THE LOWEST PRICE IS"+price1);
		}
		else if(price2<=price1 && price2<=price3)
		{
			System.out.println("THE LOWEST PRICE IS"+price2);
		}
		else
		{
			System.out.println("THE LOWEST PRICE IS"+price3);
		}
	}

	public static void main(String args[]) {
		product pd1=new product();
		product pd2=new product();
		product pd3=new product();
		System.out.println("ENTER THE DETAILS OF PRODUCT1");
		pd1.read();
		System.out.println("ENTER THE DETAILS OF PRODUCT2");
		pd2.read();
		System.out.println("ENTER THE DETAILS OF PRODUCT3");
		pd3.read();
		lowest(pd1.price,pd2.price,pd3.price);
	}

}
