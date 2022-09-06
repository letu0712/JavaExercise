package Exercise12;

public class XeMay extends PTGT{
	private int congSuat;

	public XeMay(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauSac, int congSuat) {
		super(id, hangSanXuat, namSanXuat, giaBan, mauSac);
		this.congSuat = congSuat;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	
	@Override
	public String toString() {
		return "ID: "+this.id+
				" - Hang san xuat: "+this.hangSanXuat+
				" - Nam san xuat: "+this.namSanXuat+
				" - Gia ban: "+this.giaBan+
				" - Mau sac: "+this.mauSac+
				" - Cong suat: "+this.congSuat;
	}
}
