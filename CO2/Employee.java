package siva;
import java.util.Scanner;

public class employee {
    
    int eno;
    String ename;
    float salary;

    public static void main(String args[]) {
        employee[] obj = new employee[10];
        System.out.println("Enter the number of Employees : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter details of each Employees : ");

        for (int i = 0; i < n; ++i) {

            
            int j = i + 1;
            System.out.println("enter details of Employee " + j);
            System.out.println("enter employee number ");
            obj[i].eno = input.nextInt();
            System.out.println("enter employee name ");
            obj[i].ename = input.nextLine();
            input.nextLine();
            System.out.println("enter salary ");
            obj[i].salary = input.nextFloat();
            input.nextLine();
            
        }

        System.out.println("Enter the employee number to search:");
        int enno = input.nextInt();
        for (int i = 0 ; i < n ; ++i) {
            if (enno == obj[i].eno) {
                System.out.println("data exists..");
                System.out.println("employee name: " + obj[i].ename);
                System.out.println("Salary " + obj[i].salary);
                break;
            } 
            else {
                System.out.println("no database found");
                break;
            }
        }
    }
}
