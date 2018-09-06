import java.util.*;
public class Second{
		public static void main(String[] x){
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the no upto which search");
		int n=Sc.nextInt();
		int a[]=new int[n];
		int i;
		int larger=0,second=0;
		for( i=0;i<n;i++)
		{
			a[i]=Sc.nextInt();
		}
		

		
		for( i=2;i<n;i++)
		{
			if(larger<a[i])
			{

				second=larger;
				larger=a[i];
			}
			else if(second<a[i])
			{
				second=a[i];
			}
		}
			System.out.println(second);
				
						System.out.println(larger);
		
		
	}
}
