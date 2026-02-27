package OOPS;

public class EncapsulationClassTwo {

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		//setting the values of a private variable
		obj.setAge(9);
		obj.setName("Anwith");
		//Getting the values of a private variable through public methods
		System.out.println("My name is : " + obj.getName());
		System.out.println("My age is : " + obj.getAge());

	}

}
