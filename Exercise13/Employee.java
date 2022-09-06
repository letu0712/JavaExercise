package Exercise13;

import java.util.List;

public abstract class Employee {
	protected int id;
	protected String fullName;
	protected String birthDay;
	protected String phone;
	protected String email;
	protected int employeeType; // 0:Experience, 1:Fresher, 2:Intern
	protected List<Certificate> listCertificate;
	protected static int employeeCount = 0;

	public Employee(String fullName, String birthDay, String phone, String email, int employeeType,
			List<Certificate> listCertificate) {
		employeeCount++;
		this.id = employeeCount;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
		this.listCertificate = listCertificate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}

	public List<Certificate> getListCertificate() {
		return listCertificate;
	}

	public void setListCertificate(List<Certificate> listCertificate) {
		this.listCertificate = listCertificate;
	}

	// Hien thi thong tin cua nhan vien
	public abstract void showInfo();
}
