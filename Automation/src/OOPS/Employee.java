package OOPS;

public class Employee {
    int EmpId;
    String Ename;
    String Ejob;
    int Esal;
    
    Employee(String Ename, int EmpId, String Ejob, int Esal)
    {
    	    this.Ename=Ename;
    	    this.EmpId=EmpId;
    	    this.Ejob=Ejob;
    	    this.Esal=Esal;
    }
    
    void Display() {
    	System.out.println("EmpId is : " + EmpId);
    	System.out.println("Ename is : " + Ename);
    	System.out.println("Ejob is : " + Ejob);
    	System.out.println("Esal is : " + Esal);
    }
    
    void Show() {
    	System.out.println("Next Employee data is");
    }
	public static void main(String[] args) {
		Employee Emp1=new Employee("Reena", 1234, "Tester", 70000);
		Emp1.Display();
		Emp1.Show();
		
		Employee Emp2=new Employee("Sija", 1374, "QA", 60000);
		Emp2.Display();
		Emp2.Show();
	}

}
