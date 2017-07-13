package Com.Xsis.Faizal.JavaCode;

public class Employee {
	public Employee(){
		
	}
	
	public Employee(int id, String name, String address, Double salary, String noHp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.noHp = noHp;
	}



	//Property
	private int id;	
	private String name;
	private String address;
	private Double salary;
	private String noHp;
	
	public String getNoHp() {
		return noHp;
	}

	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void info(){
		System.out.println("ID : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Address : " + this.address);
		System.out.println("Salary : " + this.salary);
	}
}
