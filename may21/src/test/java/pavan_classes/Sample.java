package pavan_classes;

interface inter{
	void face();
}

class Samplep{
	void m1() {};
}

public class Sample extends Samplep implements inter{
	void m2() {};
	public void face() {System.out.println("face");};

	public static void main(String[] args) {
		
		Samplep p=new Sample();
		p.m1();
		
		
		Sample c=new Sample();
		c.m1();
		c.m2();
		
		inter i=new Sample();
		i.face();
		
		 
		

	}

}
