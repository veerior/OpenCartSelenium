package pavan_classes;

interface Shape
{
	int length=10;   // final and static
	int width=20;  // final and static
	
	void circle();   // abstract method
	
	default void square()
	{
		System.out.println("this is square - default method....");
	}
	
	static void rectangle()
	{
		System.out.println("this is rectangle - static method...");
	}
}




public class InterfaceDemo implements Shape 
{

	class Pratap{void pratarp(){System.out.println("pratap");}};
	
	public void circle()
	{
		System.out.println(" this is circle - abstract method...");
	}
	
	void triangle()
	{
		System.out.println("this is triangle..");
	}
	
	static void sample() {};
	
	public static void main(String[] args) {
		
		//Scenario 1
		InterfaceDemo  idobj=new InterfaceDemo();
		idobj.circle();  // abstract
		idobj.square();  //default
		Shape.rectangle(); // static 
		
		System.out.println(Shape.length+Shape.width);
		//System.out.println(idobj.length+idobj.width);
		
		idobj.triangle();
		
		Pratap pr=idobj.new Pratap();
		pr.pratarp(); 
		
		
		//Scenario 2
		
		Shape sh=new InterfaceDemo();
		
		sh.circle();
		sh.square();
		//sh.rectangle();  //cannot access
		Shape.rectangle();
		sample();
		//sh.triangle() ; //cannot access
		
	}

}




