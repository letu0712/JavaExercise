package Exercise9;

//Quan ly thong tin rieng cua moi ho gia dinh
public class KhachHang {
	protected String hoTen;
	protected int soNha;
	protected String msCongToDien;
	
	public KhachHang(String hoTen, int soNha, String msCongToDien) {
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.msCongToDien = msCongToDien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getSoNha() {
		return soNha;
	}

	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}

	public String getMsCongToDien() {
		return msCongToDien;
	}

	public void setMsCongToDien(String msCongToDien) {
		this.msCongToDien = msCongToDien;
	}
	
}
