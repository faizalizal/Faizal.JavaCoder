package Com.Xsis.Faizal.JavaCode;

import java.lang.annotation.Inherited;

public class Main {
	//Primitive data type
	public int umur = 40;
	
	//Polymorphism
	public Integer umur2 = 40;
	public Employee employee,programmer,director,manager;
	
	
	public void inheritanceExample(){
		director = new Director();
		manager = new Manager();
		employee = new Employee();
		programmer = new Programmer();
		
		director.setSalary(5000.0);
		System.out.println("Salary director : " + director.getSalary());
	}
	
	public static void main(String[] args) {
		
		//Encapsulation
		
		/*//empty contruktor / manual setter
		Employee emp = new Employee();
		Employee emp2 = new Employee(2,"LoL","Bogor",500.0);
		
		emp.setId(1);
		emp.setName("Izaal");
		emp.setAddress("Bogor");
		emp.setSalary(300.0);
		emp.info();
		emp2.info();*/
		
		
		//inheritance
		Main a = new Main();
		a.inheritanceExample();
	}
}
