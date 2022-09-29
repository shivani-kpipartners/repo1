package practice;

public class Vehicle {
	
	void find(){System.out.println("Vehicle foun");}  
	}  

	//Creating a child class  

class Bike2 extends Vehicle{  
	
	  void find(){System.out.println("Bike found");}  //same method as in parent class  
	  
	  public static void main(String args[]){  
		  
	  Bike2 obj = new Bike2();//object  
	  
	  obj.find();//method  
	  }  
	  
}
 