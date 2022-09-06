package Exercise2;

public class Bao extends TaiLieu {
	private int ngayPhatHanh;

	public Bao(int maTaiLieu, String nhaXuatBan, int soBan, int ngayPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBan);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return "Bao [ngayPhatHanh=" + ngayPhatHanh + ", maTaiLieu=" + maTaiLieu + ", nhaXuatBan=" + nhaXuatBan
				+ ", soBan=" + soBan + "]";
	}

}
