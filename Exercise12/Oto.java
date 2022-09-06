package Exercise12;

public class Oto extends PTGT{
	private int soChoNgoi;
	private String kieuDongCo;
	
	public Oto(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauSac, int soChoNgoi,
			String kieuDongCo) {
		super(id, hangSanXuat, namSanXuat, giaBan, mauSac);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public String getKieuDongCo() {
		return kieuDongCo;
	}

	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}

	@Override
	public String toString() {
		return "ID: "+this.id+
				" - Hang san xuat: "+this.hangSanXuat+
				" - Nam san xuat: "+this.namSanXuat+
				" - Gia ban: "+this.giaBan+
				" - Mau sac: "+this.mauSac+
				" - So cho ngoi: "+this.soChoNgoi;
	}
	
	
	
	
	
}
