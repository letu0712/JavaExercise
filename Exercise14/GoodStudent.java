package Exercise14;

public class GoodStudent extends Student {
	private double gpa;
	private String bestRewardName; // Ten hong bong (giai thuong) cao nhat dat duoc

	public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
			String gradeLevel, double gpa, String bestRewardName) {
		super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
		this.gpa = gpa;
		this.bestRewardName = bestRewardName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getBestRewardName() {
		return bestRewardName;
	}

	public void setBestRewardName(String bestRewardName) {
		this.bestRewardName = bestRewardName;
	}

	@Override
	public String toString() {
		return "GoodStudent [gpa=" + gpa + ", bestRewardName=" + bestRewardName + ", fullName=" + fullName + ", doB="
				+ doB + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", universityName=" + universityName
				+ ", gradeLevel=" + gradeLevel + "]";
	}

	@Override
	public void showMyInfo() {
		System.out.println(this);
	}

}
