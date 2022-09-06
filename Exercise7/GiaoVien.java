package Exercise7;

public class GiaoVien extends Nguoi{
	private long luongCung;
	private long luongThuong;
	private long tienPhat;
	private long luongThucLinh;
	public GiaoVien(String hoTen, int tuoi, String queQuan, String msgv, long luongCung, long luongThuong,
			long tienPhat) {
		super(hoTen, tuoi, queQuan, msgv);
		this.luongCung = luongCung;
		this.luongThuong = luongThuong;
		this.tienPhat = tienPhat;
		this.luongThucLinh = this.luongCung + this.luongThuong - this.tienPhat;
	}
	public long getLuongCung() {
		return luongCung;
	}
	public void setLuongCung(long luongCung) {
		this.luongCung = luongCung;
	}
	public long getLuongThuong() {
		return luongThuong;
	}
	public void setLuongThuong(long luongThuong) {
		this.luongThuong = luongThuong;
	}
	public long getTienPhat() {
		return tienPhat;
	}
	public void setTienPhat(long tienPhat) {
		this.tienPhat = tienPhat;
	}
	
	
	@Override
	public String toString() {
		return "Ho Ten: "+this.hoTen+
				" - Tuoi: "+this.tuoi+
				" - Que Quan: "+this.queQuan+
				" - MSGV: "+this.msgv+
				" - Luong Cung: "+this.luongCung+
				" - Luong Thuong: "+this.luongThuong+
				" - Tien Phat: "+this.tienPhat+
				" - Luong Thuc Linh: "+this.luongThucLinh;
	}
	
	
	
}
