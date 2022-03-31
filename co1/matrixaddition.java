package marvin;
import java.util.*;
public class matrixaddition {

	public static void main(String[] args) {
		int row,cols,i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("print the number of rows");
		row=in.nextInt();
		System.out.println("enter the number of cols");
		cols=in.nextInt();
		int a[][]=new int[row][cols];
		int b[][]=new int[row][cols];
		int c[][]=new int[row][cols];
		System.out.println("enter the first matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<cols;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		System.out.println("enter the second matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<cols;j++)
			{
				b[i][j]=in.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<cols;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The sum of the matrix is\n");
		for(i=0;i<row;i++)
		{
			for(j=0;j<cols;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}

	}

}
