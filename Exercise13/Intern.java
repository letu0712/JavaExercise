package Exercise13;

import java.util.Date;
import java.util.List;

public class Intern extends Employee {
	private String majors; // Chuyen nganh dang hoc
	private String semester; // Hoc ki dang hoc
	private String universityName; // Truong dang hoc

	public Intern(String fullName, String birthDay, String phone, String email, int employeeType,
			List<Certificate> listCertificate, String majors, String semester, String universityName) {
		super(fullName, birthDay, phone, email, employeeType, listCertificate);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Override
	public String toString() {
		return "Intern [majors=" + majors + ", semester=" + semester + ", universityName=" + universityName + ", id="
				+ id + ", fullName=" + fullName + ", birthDay=" + birthDay + ", phone=" + phone + ", email=" + email
				+ ", employeeType=" + employeeType + ", listCertificate=" + listCertificate + "]";
	}

	@Override
	public void showInfo() {
		System.out.println(this);
	}

}
