import java.util.*;
class complex{
		int r,i;
		void get()
		{
			Scanner Sc=new Scanner(System.in);
			r=Sc.nextInt();
			i=Sc.nextInt();}
			void display()
			{
				System.out.println(r+"+"+i+"i");
			}
}
public class Complex{
	public static void main(String[] x)
	{
		complex c1=new complex();

		c1.get();
		c1.display();
	}
	
}		
