package Exercise13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {
	private List<Employee> listEmployee;
	
	public EmployeeManager() {
		this.listEmployee = new ArrayList<>();
	}

	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}
	
	//Show Employee
	public void showListEmployee() {
		this.listEmployee.forEach(employee -> System.out.println(employee));
	}
	
	//Insert Employee
	public void addEmployee(Employee employee) {
		this.listEmployee.add(employee);
	}
	
	//Modify Employee
	public void modifyEmployee(int id, Employee newEmployee) {
		this.listEmployee.removeIf(employee -> employee.getId() == id);
		newEmployee.setId(id);
		this.listEmployee.add(newEmployee);
	}
	
	//Delete Employee
	public void removeEmployee(int id) {
		this.listEmployee.removeIf(employee -> employee.getId() == id);
	}
	
	//Find Intern Employee
	public List<Employee>	findIntern(){
		return this.listEmployee.stream().filter(employee -> employee.getEmployeeType() == 2).collect(Collectors.toList());
	}
	
	//Find Fresher Employee
	public List<Employee>	findFresher(){
		return this.listEmployee.stream().filter(employee -> employee.getEmployeeType() == 1).collect(Collectors.toList());
	}
	
	//Find Exp Employee
	public List<Employee>	findExperience(){
		return this.listEmployee.stream().filter(employee -> employee.getEmployeeType() == 0).collect(Collectors.toList());
	}
}
