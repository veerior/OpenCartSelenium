package pavan_classes;

public class MultipleInheritance implements I1,I2
{

	public void m1( )
	{
		System.out.println(" this is m1...");
	}
	
	
	
	public void m2()
	{
		System.out.println("this is m2...");
	}
	
	public static void main(String[] args) {
		
		MultipleInheritance mi=new MultipleInheritance();
		mi.m1();
		mi.m2();
		
		System.out.println(mi.x);
		System.out.println(mi.y);
		
		I1 i=new MultipleInheritance();
		i.m1();
		System.out.println(i.x);

	}

}
