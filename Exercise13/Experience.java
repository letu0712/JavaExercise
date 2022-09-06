package Exercise13;

import java.util.Date;
import java.util.List;

public class Experience extends Employee {
	private int expInYear; // So nam kinh nghiem
	private String proSkill; // Ky nang chuyen mon

	public Experience(String fullName, String birthDay, String phone, String email, int employeeType,
			List<Certificate> listCertificate, int expInYear, String proSkill) {
		super(fullName, birthDay, phone, email, employeeType, listCertificate);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Experience [expInYear=" + expInYear + ", proSkill=" + proSkill + ", id=" + id + ", fullName=" + fullName
				+ ", birthDay=" + birthDay + ", phone=" + phone + ", email=" + email + ", employeeType=" + employeeType
				+ ", listCertificate=" + listCertificate + "]";
	}

	@Override
	public void showInfo() {
		System.out.print(this);
	}

}
