package Exercise12;

public class PTGT {
	protected int id;
	protected String hangSanXuat;
	protected int namSanXuat;
	protected int giaBan;
	protected String mauSac;
	
	public PTGT(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauSac) {
		this.id = id;
		this.hangSanXuat = hangSanXuat;
		this.namSanXuat = namSanXuat;
		this.giaBan = giaBan;
		this.mauSac = mauSac;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	
	
}
