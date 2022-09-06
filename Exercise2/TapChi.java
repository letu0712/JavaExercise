package Exercise2;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;

	public TapChi(int maTaiLieu, String nhaXuatBan, int soBan, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBan);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return "TapChi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + ", maTaiLieu=" + maTaiLieu
				+ ", nhaXuatBan=" + nhaXuatBan + ", soBan=" + soBan + "]";
	}

}
