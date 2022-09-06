package Exercise13;

import java.util.Date;
import java.util.List;

public class Fresher extends Employee {
	private String graduationDate; // Thoi gian tot nghiep
	private String graduationRank; // Xep loai tot nghiep
	private String education; // Truong tot nghiep

	public Fresher(String fullName, String birthDay, String phone, String email, int employeeType,
			List<Certificate> listCertificate, String graduationDate, String graduationRank, String education) {
		super(fullName, birthDay, phone, email, employeeType, listCertificate);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	public String getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	@Override
	public void showInfo() {
		System.out.print(this);
	}

	@Override
	public String toString() {
		return "Fresher [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", education="
				+ education + ", id=" + id + ", fullName=" + fullName + ", birthDay=" + birthDay + ", phone=" + phone
				+ ", email=" + email + ", employeeType=" + employeeType + ", listCertificate=" + listCertificate + "]";
	}

}
