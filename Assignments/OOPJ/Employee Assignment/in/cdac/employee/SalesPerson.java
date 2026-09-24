package in.cdac.employee;


public class SalesPerson extends Employee{
	float commission;
	public SalesPerson(String name, String address, int age, String gender, float basicSalary, float commission){
		super(name, address, age, gender, basicSalary);
		this.commission = commission;
	}
	public float getCommission() {
		return commission;
	}
	
}

