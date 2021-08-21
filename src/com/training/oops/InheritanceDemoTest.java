package com.training.oops;

class Bc {
	int a=10;
	public void display() {
		System.out.println("Bc.display()1111");
	}
	public void room() {
		System.out.println("this room used for office purpose1");
		System.out.println("this room used for office purpose2");
		System.out.println("this room used for office purpose3");
		System.out.println("this room used for office purpose4");
	}
}


class Dc extends Bc{
	int b;
	public void show() {
		System.out.println("Dc.show()");
		System.out.println("super class Bc 'a' value-->"+super.a);
		a=20;
		System.out.println("a value in Child class-->"+a);
	}
	
	@Override
	public void room() {
		super.room();
		System.out.println("this room modified for Glossary shop purpose ");
	}
}


public class InheritanceDemoTest {

	public static void main(String[] args) {
		Dc d= new Dc();
		d.show();
		//d.display();
		//d.room();//
	}

}
