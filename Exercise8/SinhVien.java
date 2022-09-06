package Exercise8;

//Quan ly thong tin moi SInh vien muon sach
public class SinhVien {
	protected String hoTen;
	protected int tuoi;
	protected String lop;
	
	public SinhVien(String hoTen, int tuoi, String lop) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.lop = lop;
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

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	
	
}
