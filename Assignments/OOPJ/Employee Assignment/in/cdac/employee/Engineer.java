package in.cdac.employee;


public class Engineer extends Employee{
	float overtime;
	
	public Engineer(String name, String address, int age, String gender, float basicSalary, float overtime){
		super(name, address, age, gender, basicSalary);
		this.overtime = overtime;
	}
	
	public float getOvertime() {
		return overtime;
	}
	
	
}
