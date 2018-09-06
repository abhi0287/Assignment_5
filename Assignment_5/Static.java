class A{
	static int count=0;
	void display(){
		count++;
		System.out.println(count);
			}
	
}
public class Static{
		public static void main(String x[]){
		A c1=new A();
		A c2=new A();
		A c3=new A();
		c1.display();
		c2.display();
		c3.display();

		}
}
