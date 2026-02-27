package OOPS;

public class CompileTime_Polymorphism {
    void myMethod(int a)
    {
      	System.out.println("Value of a is " + a);
    }
    void myMethod(int a, int b)
    {
    	    System.out.println("Value of a is " + a + " and Value of b is " + b);
    }
    void myMethod(String a)
    {
    	    System.out.println(a);
    }
	public static void main(String[] args) {
		CompileTime_Polymorphism obj=new CompileTime_Polymorphism();
		obj.myMethod(2);
		obj.myMethod(4, 6);
		obj.myMethod("My Name is Reena");

	}

}
