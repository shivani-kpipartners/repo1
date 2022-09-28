
public class Vehicle {
	
	void find(){System.out.println("Vehicle foun");}  
	}  

	//Creating a child class  

class Bike extends Vehicle{  
	
	  void find(){System.out.println("Bike found");}  //same method as in parent class  
	  
	  public static void main(String args[]){  
		  
	  Bike obj = new Bike();//object  
	  
	  obj.run();//method  
	  }  
	  
}
