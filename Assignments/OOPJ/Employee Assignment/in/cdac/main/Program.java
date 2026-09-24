package in.cdac.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.calculator.ConsoleInput;

import in.cdac.employee.Employee;
import in.cdac.employee.Engineer;
import in.cdac.employee.Manager;
import in.cdac.employee.SalesPerson;
import in.cdac.utils.CompareByNameAscending;
import in.cdac.utils.CompareByNameDescending;
public class Program {
//Manager(String name, String address, int age, char gender, float basicSalary, float hra)
//SalesPerson(String name, String address, int age, char gender, float basicSalary, float commission)
//Engineer(String name, String address, int age, char gender, float basicSalary, float overtime)
	
	static final int ADD_MANAGER = 1;
	static final int ADD_ENGINEER = 2;
	static final int ADD_SALESPERSON = 3;
	static final int SORT_ASC = 1;
	static final int SORT_DESC = 2;
	static final int DELETE_BY_NAME = 1;
	static void employeeCreation(List<Employee> empList, int typeToAdd) {
	
		System.out.println("Enter Name: ");
		String name = ConsoleInput.getString();
		
		System.out.println("Enter Address: ");
		String address = ConsoleInput.getString();
		
		System.out.println("Enter Gender: ");
		String gender = ConsoleInput.getString();
		
		System.out.println("Enter Age: ");
		int age = ConsoleInput.getInteger();
		
		System.out.println("Enter Salary: ");
		float basicSalary = ConsoleInput.getFloat();
		
		if(typeToAdd == ADD_MANAGER) {
			System.out.println("Enter HRA: ");
			float hra = ConsoleInput.getFloat();
			Manager mObj = new Manager(name, address, age, gender, basicSalary, hra);
			empList.add(mObj);
		}
		else if(typeToAdd == ADD_ENGINEER) {
			System.out.println("Enter Overtime: ");
			float overtime = ConsoleInput.getFloat();
			Engineer eObj = new Engineer(name, address, age, gender, basicSalary, overtime);
			empList.add(eObj);
		}
		else if(typeToAdd == ADD_SALESPERSON) {
			System.out.println("Enter Commission: ");
			float commission = ConsoleInput.getFloat();
			SalesPerson sObj = new SalesPerson(name, address, age, gender, basicSalary, commission);
			empList.add(sObj);
		}
		
	}
	
	static void displayAll(List<Employee> empList) {
		Iterator<Employee> iter = empList.iterator();
		
		while(iter.hasNext()) {
			Employee currEmployee = iter.next();
			System.out.println("Name : " + currEmployee.getName());
			System.out.println("Age : " + currEmployee.getAge());
			System.out.println("Gender : " + currEmployee.getGender());
			System.out.println("Salary : " + currEmployee.getBasicSalary());
			
			if(currEmployee instanceof Manager mObj) {
				System.out.println("HRA : " + mObj.getHra());
			}
			else if(currEmployee instanceof Engineer eObj) {
				System.out.println("Overtime : " + eObj.getOvertime());
			}
			else if(currEmployee instanceof SalesPerson sObj) {
				System.out.println("Commission : " + sObj.getCommission());
			}
			System.out.println("-------------------------------------");
		}
	}
	
	private static void deleteEmployeeByName(List<Employee> listEmployee) {
		System.out.println("Enter the name you want to remove:");
		String nameToRemove = ConsoleInput.getString();
		Iterator<Employee> iter = listEmployee.iterator();
		while(iter.hasNext()) {
			Employee eObj = iter.next();
			if(eObj.getName().equals(nameToRemove)) {
				System.out.println("Found Name, Removing It");
				iter.remove();
			}
		}
	}
	
	static void saveEmployeeInFile(List<Employee> empList) {
		try(FileOutputStream fileStream = new FileOutputStream("D:\\CDAC\\Misc\\OOPJ\\CDACObject.txt");
			ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
				){
			for(Employee eObj : empList) {
				objectStream.writeObject(eObj);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void displayFromFile(Object obj) {
		Employee employeeRef = (Employee) obj;
		System.out.println("Name: " + employeeRef.getName());
		System.out.println("Age: " + employeeRef.getAge());
		System.out.println("Gender : " + employeeRef.getGender());
		System.out.println("Salary : " + employeeRef.getBasicSalary());
		
		if(employeeRef instanceof Manager mObj) {
			System.out.println("HRA : " + mObj.getHra());
		}
		else if(employeeRef instanceof Engineer eObj) {
			System.out.println("Overtime : " + eObj.getOvertime());
		}
		else if(employeeRef instanceof SalesPerson sObj) {
			System.out.println("Overtime : " + sObj.getCommission());
		}
		System.out.println("---------------------------------------");
	}
	
	static void loadEmployeeFromFile() {
		try(FileInputStream fileStream = new FileInputStream("D:\\CDAC\\Misc\\OOPJ\\CDACObject.txt");
			ObjectInputStream objectStream = new ObjectInputStream(fileStream);
				){
			while(fileStream.available() > 0) {
				Object obj = objectStream.readObject();
				displayFromFile(obj);
			}
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		List<Employee> listEmployee = new ArrayList<>();
		int choice = 0;
		do {
			System.out.println("---------------Menu For Program---------------");
			System.out.println("1.Add\n2.Display\n3.Remove\n4.Sort\n5.Load\n6.Save\n7.Exit");
			choice = ConsoleInput.getInteger();
			switch(choice) {
			case 1:
				int choiceAdd = 0;
				do {
					System.out.println("---------------Menu For Adding---------------");
					System.out.println("1.Manager\n2.Engineer\n3.Salesperson\n4.Exit");
					choiceAdd = ConsoleInput.getInteger();
					if(choiceAdd == ADD_MANAGER) { 
						employeeCreation(listEmployee, ADD_MANAGER);
					}
					else if(choiceAdd == ADD_ENGINEER) { 
						employeeCreation(listEmployee, ADD_ENGINEER);
					}
					else if(choiceAdd == ADD_SALESPERSON) {
						employeeCreation(listEmployee, ADD_SALESPERSON);
					}
				}
				while(choiceAdd != 4);
				break;
			case 2:
				displayAll(listEmployee);
				break;
			case 3:
				int choiceRemove = 0;
				do {
					System.out.println("---------------Menu For Deleting---------------");
					System.out.println("1.Delete By Name\n2.Exit");
					choiceRemove = ConsoleInput.getInteger();
					if(choiceRemove == DELETE_BY_NAME) {
						deleteEmployeeByName(listEmployee);
					}
				}
				while(choiceRemove != 2);
				break;
			case 4:
				int choiceSort = 0;
				do {
					System.out.println("---------------Menu For Sorting---------------");
					System.out.println("1.Ascending Sort\n2.Descending Sort\n3.Exit");
					choiceSort = ConsoleInput.getInteger();
					if(choiceSort == SORT_ASC) {
						Collections.sort(listEmployee, new CompareByNameAscending());
					}
					else if(choiceSort == SORT_DESC) {
						Collections.sort(listEmployee, new CompareByNameDescending());
					}
				}
				while(choiceSort != 3);
				break;
			case 5:
				loadEmployeeFromFile();
				break;
			case 6:
				saveEmployeeInFile(listEmployee);
				break;
			case 7:
				return;
			default:
				break;
				
			}
		}while(choice != 7);
		
	}

}





















