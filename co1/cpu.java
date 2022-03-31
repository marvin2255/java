package marvin;

public class cpu {
	int price;
	cpu(int priz)
	{
		price=priz;
	}
	public class processor{
		int nocore;
		String manuf;
		processor(int noc,String prod)
		{
			nocore=noc;
			manuf=prod;
		}
		void display()
		{
			System.out.println("The CPU details");
			System.out.println("price = "+price);
			System.out.println("The processor details");
			System.out.println("NO of cores = "+ nocore);
			System.out.println("Name of the manufacture = "+ manuf);
		}
		
	}
	static class ram
	{
		int mem;
		String manufa;
		ram(int size,String prod){
			mem=size;
			manufa=prod;
		}
		void display()
		{
			System.out.println("The Ram details");
			System.out.println("size of memory = "+ mem+"gb");
			System.out.println("Name of the manufacture = "+ manufa);
		}
		
	}

	public static void main(String[] args) {
		cpu obj=new cpu(7500);
		cpu.processor obj2=obj.new processor(7,"HP");
		cpu.ram obj3=new cpu.ram(8,"intel");
		obj2.display();
		obj3.display();

	}

}