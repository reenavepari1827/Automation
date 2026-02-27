package Corejava;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic Operators
		int a=20;
		int b=40;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		
		//Comparison Operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		
		//Logical Operators
		boolean p=true;
		boolean q=false;
		System.out.println(p&&q);
		System.out.println(p||q);
		System.out.println(!p);
		System.out.println(!q);
		
		
		//Increment and Decrement 
		int i=10;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		i+=5;
		System.out.println(i);
		++i;
		System.out.println(i);
		i=i+5;
		System.out.println(i);
		i-=1;
		System.out.println(i);
	}

}
