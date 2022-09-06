package Exercise9;

public class BienLai extends KhachHang{
	private int chiSoDienCu;
	private int chiSoDienMoi;
	private int soTien;
	
	public BienLai(String hoTen, int soNha, String msCongToDien, int chiSoDienCu, int chiSoDienMoi) {
		super(hoTen, soNha, msCongToDien);
		this.chiSoDienCu = chiSoDienCu;
		this.chiSoDienMoi = chiSoDienMoi;
		this.soTien = (this.chiSoDienMoi - this.chiSoDienCu)*5;
	}

	public int getChiSoDienCu() {
		return chiSoDienCu;
	}

	public void setChiSoDienCu(int chiSoDienCu) {
		this.chiSoDienCu = chiSoDienCu;
	}

	public int getChiSoDienMoi() {
		return chiSoDienMoi;
	}

	public void setChiSoDienMoi(int chiSoDienMoi) {
		this.chiSoDienMoi = chiSoDienMoi;
	}

	public int getSoTien() {
		return soTien;
	}

	public void setSoTien(int soTien) {
		this.soTien = soTien;
	}

	@Override
	public String toString() {
		return "Chu ho: "+this.hoTen+
				" - So nha: "+this.soNha+
				" - Ma so cong to dien: "+this.msCongToDien+
				" - Chi so dien cu: "+this.chiSoDienCu+
				" - Chi so dien moi: "+this.chiSoDienMoi+
				" - Chi so dien moi: "+this.chiSoDienMoi+
				" - So tien phai tra: "+this.soTien;
				
	}
	
	
	
}
