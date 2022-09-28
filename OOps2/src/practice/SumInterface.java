package practice;

public interface SumInterface {
	
	public void cube(int a);
	
	default void sum(int a,int b) {
	} 

}

class DefaultMethod2 implements SumInterface {

	@Override
	public void cube(int a) {
		int b = 0;
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	
public static void main(String args[])
{ DefaultMethod2 c= new DefaultMethod2();
c.sum(5,9);
	
c.cube(5);
}
}

