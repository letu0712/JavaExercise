package Exercise12;

public class XeTai extends PTGT{
	private int trongTai;

	public XeTai(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauSac, int trongTai) {
		super(id, hangSanXuat, namSanXuat, giaBan, mauSac);
		this.trongTai = trongTai;
	}

	public int getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(int trongTai) {
		this.trongTai = trongTai;
	}
	
	@Override
	public String toString() {
		return "ID: "+this.id+
				" - Hang san xuat: "+this.hangSanXuat+
				" - Nam san xuat: "+this.namSanXuat+
				" - Gia ban: "+this.giaBan+
				" - Mau sac: "+this.mauSac+
				" - Trong tai: "+this.trongTai;
	}
	
}
