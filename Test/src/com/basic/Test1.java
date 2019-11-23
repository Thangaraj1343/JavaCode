package com.basic;

class Product
{
	double price;
}
public class Test1 {
	
public void changeValue(Product prt,double price)
{
	price = price*2;
	prt.price=prt.price;
	
}
	public static void main(String[] args) {
		Product p = new Product();
		p.price=200;
		double newPrice=100;
		
		Test1 t = new Test1();
		t.changeValue(p, newPrice);
		System.out.println(p.price+" "+newPrice);
	}
	

}
