package in.cdac.employee;

import java.io.Serializable;

public abstract class Employee implements Serializable, Comparable<Employee>{

	protected String name;
	protected String address;
	protected int age;
	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
	}

	protected String gender;
	protected float basicSalary;
	
	Employee(String name, String address, int age, String gender, float basicSalary){
		this.name = name;
		this.address = address;
		this.age = setAge(age);
		this.gender = gender;
		this.basicSalary = basicSalary;
	}
	
	int setAge(int age) {
		if(age < 18 || age > 65) return 21;
		return age;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public float getBasicSalary() {
		return basicSalary;
	}
}
