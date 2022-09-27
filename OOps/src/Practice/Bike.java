package Practice;

public abstract class Bike {
	abstract void run();
	
}
class Test1 extends Bike{

	@Override
	void run() {
		System.out.println("Running Safely");
		// TODO Auto-generated method stub
		
	}
	
	
public static void main(String args[]) {
	Bike obj = new Test1 ();
	Bike obj2 = new Test1 ();
	Bike obj3 = new Test1 ();
	obj.run();
	obj2.run();
	obj3.run();
}
}