package Exercise2;

public class Sach extends TaiLieu {
	private String tacGia;
	private int soTrang;

	public Sach(int maTaiLieu, String nhaXuatBan, int soBan, String tacGia, int soTrang) {
		super(maTaiLieu, nhaXuatBan, soBan);
		this.tacGia = tacGia;
		this.soTrang = soTrang;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		return "Sach [tacGia=" + tacGia + ", soTrang=" + soTrang + ", maTaiLieu=" + maTaiLieu + ", nhaXuatBan="
				+ nhaXuatBan + ", soBan=" + soBan + "]";
	}

}
