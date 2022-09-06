package Exercise5;

public class Nguoi {
	protected String hoTen;
	protected int tuoi;
	protected String cmnd;

	public Nguoi(String hoTen, int tuoi, String cmnd) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.cmnd = cmnd;
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

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

}
