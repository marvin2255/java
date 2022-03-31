package marvin;
import java.util.*;
public class symmetric {
	static int r,c;

	public static void main(String[] args) {
		int i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the row");
		r=in.nextInt();
		System.out.println("enter the column");
		c=in.nextInt();
		int a[][]=new int[r][c];
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				a[i][j]=in.nextInt();
			}
		}
		
		int x=1;
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				if(a[i][j]!=a[j][i])
				{
					x=0;
				}
			}
		}
		if(x==1) {
			System.out.println("the matrix is symmetric");
		}
		else {
			System.out.println("the matrix is not symmetric");
		}
		
	}

}
