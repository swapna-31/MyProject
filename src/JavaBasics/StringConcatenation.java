package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		double c = 10.22;
		double d = 10.28;
		
		String x = "Hello";
		String y = "World";
		
		// in println it left to right execution,  always starts from left and adds to next value
		// + ssign is Concatenation operator
		System.out.println(a+b);
		System.out.println(x + y);
		System.out.println(a + b + x + y);
		System.out.println(a + x + y + b);
		System.out.println(x+y+a+b);
		System.out.println(x + y + (a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println("HelloWorld");
		System.out.println("India");
		System.out.println(b);
		System.out.println("The Value of a :"+a);
		System.out.println("The addition of a and b is "+ (a+b));
		System.out.println("Hello");
		System.out.println("Selenium");
		// if we remove "ln" from println it will print on same line not jump to next line (ln = line new) 		
		System.out.print("hello");
		System.out.println("selenium");
		
		

	}

}
