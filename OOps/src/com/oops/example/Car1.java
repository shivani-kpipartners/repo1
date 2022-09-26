package com.oops.example;

public class Car1 extends Car{

	public Car1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car Maruti=new Car1();
Maruti.mileage();
Maruti.brand();
	}

	@Override
	int speed() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	String brand_1() {
		// TODO Auto-generated method stub
		return "TATA";
	}

}
