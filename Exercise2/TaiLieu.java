package Exercise2;

public class TaiLieu {
	protected int maTaiLieu;
	protected String nhaXuatBan;
	protected int soBan;

	public TaiLieu(int maTaiLieu, String nhaXuatBan, int soBan) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.nhaXuatBan = nhaXuatBan;
		this.soBan = soBan;
	}

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getSoBan() {
		return soBan;
	}

	public void setSoBan(int soBan) {
		this.soBan = soBan;
	}

}
