package Exercise14;

public class NormalStudent extends Student {
	private int englishScore; // Diem Toeic
	private double entryTestScore; // Diem di dau vao do cong ty to chuc

	public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
			String gradeLevel, int englishScore, double entryTestScore) {
		super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
		this.englishScore = englishScore;
		this.entryTestScore = entryTestScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public double getEntryTestScore() {
		return entryTestScore;
	}

	public void setEntryTestScore(double entryTestScore) {
		this.entryTestScore = entryTestScore;
	}

	@Override
	public String toString() {
		return "NormalStudent [englishScore=" + englishScore + ", entryTestScore=" + entryTestScore + ", fullName="
				+ fullName + ", doB=" + doB + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", universityName="
				+ universityName + ", gradeLevel=" + gradeLevel + "]";
	}
	
	@Override
	public void showMyInfo() {
		System.out.println(this);
	}
}
