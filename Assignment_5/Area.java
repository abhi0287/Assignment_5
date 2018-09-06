import java.util.*;
class Rectangle{
      int l,b;
		void insert(){
		 Scanner Sc=new Scanner(System.in);
		l=Sc.nextInt();
		b=Sc.nextInt();}
		
		void get(){
		
		
		System.out.println(l*b);}
}
public class Area{
			public static void main(String[] x)
			{
				Rectangle r1=new Rectangle();
				r1.insert();
				r1.get();
			}
		}
				
				

