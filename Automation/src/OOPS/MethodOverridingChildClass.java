package OOPS;

public class MethodOverridingChildClass extends MethodOverridingParentClass{
   public void myMethod()
   {
	   System.out.println("I am a method from ChildClass");
   }
	public static void main(String[] args) {
		/* When Parent class reference refers to the parent class object
		 * then the method of parent class (overriden method) is called.
		 */
		
		MethodOverridingParentClass obj=new MethodOverridingParentClass();
		obj.myMethod();
		/* When parent class reference refers to the child class object
		 * then the method of the child class (overriding method) is called.
		 * This we call as runtime polymorphism
		 */
		MethodOverridingParentClass Obj=new MethodOverridingChildClass();
		Obj.myMethod();

	}

}
