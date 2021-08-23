package com.training.oops;

abstract class Wishes {

	public abstract void sayHi();
}

public class MethodOvrirdingEx2 extends Wishes{

	@Override
	public void sayHi() {
		System.out.println("Welcome to OOPs");
		
	}

}
