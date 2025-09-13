package com.shivamsinghparmar;

public class ImmutableString {
	
	String name = "Deepak";
	public void print() {
		System.out.println(name);
		System.out.println(name.concat(" " + "Kumar yadav"));
	}
	public static void main(String[] args) {
		
		ImmutableString obj = new ImmutableString();
		obj.print();
		

	}

}
