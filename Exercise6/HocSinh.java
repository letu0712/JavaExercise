package Exercise6;

public class HocSinh {
	private String hoTen;
	private int tuoi;
	private String queQuan;
	private String lopHoc;

	public HocSinh(String hoTen, int tuoi, String queQuan, String lopHoc) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
		this.lopHoc = lopHoc;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getLopHoc() {
		return lopHoc;
	}

	public void setLopHoc(String lopHoc) {
		this.lopHoc = lopHoc;
	}

	@Override
	public String toString() {
		return "(Ho Ten: " + this.hoTen + 
				" - Tuoi: " + this.tuoi + 
				" - Que Quan: " + this.queQuan + 
				" - Lop: " + this.lopHoc+")";
	}

}
