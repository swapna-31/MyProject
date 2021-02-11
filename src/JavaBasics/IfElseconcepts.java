package JavaBasics;

public class IfElseconcepts {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		
		if (b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		// comparison operators :
		// < , > , <= , >= , == , !=    !=(Not equal to )
		
		
		int c = 40;
		int d = 40;
		
		if (c==d) {
			System.out.println("c is equal to d");
		}
		else {
			System.out.println("c is not equal to D");
		}
		
		// write a logic to find highest number 
		
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		// nested if else
		
		if (a1>b1 & a1>c1) {  // false & false = false
			System.out.println("Print a1 is greatest");
		}
			else if (b1>c1) {  // false
				System.out.println("Print b1 is greatest");
			}
			else {
				System.out.println("Print c1 is greatest");					
		}
		
		int a2 = 5;
		int b2 = 6;
		
		if (a2!=b2) {
			System.out.println("Print a2 is equal to b2");}
		else {
			System.out.println("Print a2 is not equal to b2");
		}
				

	}

}
