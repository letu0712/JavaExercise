package Exercise5;

public class KhachHang extends Nguoi {
	private int soNgayThue;
	private String loaiPhong; // A(500), B(300), C(100)

	public KhachHang(String hoTen, int tuoi, String cmnd, int soNgayThue, String loaiPhong) {
		super(hoTen, tuoi, cmnd);
		this.soNgayThue = soNgayThue;
		this.loaiPhong = loaiPhong;
	}

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	public String getLoaiPhong() {
		return loaiPhong;
	}

	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	@Override
	public String toString() {
		return "KhachHang [soNgayThue=" + soNgayThue + ", loaiPhong=" + loaiPhong + ", hoTen=" + hoTen + ", tuoi="
				+ tuoi + ", cmnd=" + cmnd + "]";
	}

}
