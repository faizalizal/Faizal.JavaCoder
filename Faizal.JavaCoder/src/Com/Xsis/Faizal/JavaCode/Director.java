package Com.Xsis.Faizal.JavaCode;

public class Director extends Manager {
	@Override
	public void setSalary(Double salary) {
		// TODO Auto-generated method stub
		super.setSalary(salary * 3);
	}
}
