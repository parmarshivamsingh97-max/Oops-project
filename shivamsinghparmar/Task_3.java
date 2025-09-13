package com.shivamsinghparmar;

class Cons{

    Cons() {
        System.out.println("No value provided");
    }

    Cons(int a) {
        System.out.println(a);
    }

    Cons(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of values: " + sum);
    }

   
}




public class Task_3 {

	public static void main(String[] args) {
		new Cons();           
        new Cons(10);        
        new Cons(10, 20);   

	}

}
