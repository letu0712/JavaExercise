package Exercise8;

//Quan ly viec muon tra sach cua cac sinh vien
public class TheMuon extends SinhVien{
	private String maPhieuMuon;
	private int ngayMuon;
	private int hanTra;
	private int soHieuSach;
	
	public TheMuon(String hoTen, int tuoi, String lop, String maPhieuMuon, int ngayMuon, int hanTra, int soHieuSach) {
		super(hoTen, tuoi, lop);
		this.maPhieuMuon = maPhieuMuon;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.soHieuSach = soHieuSach;
	}

	public String getMaPhieuMuon() {
		return maPhieuMuon;
	}

	public void setMaPhieuMuon(String maPhieuMuon) {
		this.maPhieuMuon = maPhieuMuon;
	}

	public int getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(int ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public int getHanTra() {
		return hanTra;
	}

	public void setHanTra(int hanTra) {
		this.hanTra = hanTra;
	}

	public int getSoHieuSach() {
		return soHieuSach;
	}

	public void setSoHieuSach(int soHieuSach) {
		this.soHieuSach = soHieuSach;
	}

	@Override
	public String toString() {
		return "(Ho Ten: "+this.hoTen+
				" - Tuoi: "+this.tuoi+
				" - Lop: "+this.lop+ 
				" - Ma phieu muon: "+this.maPhieuMuon+
				" - Ngay muon: "+ this.ngayMuon+ 
				" - Han tra: "+ this.hanTra+
				" - So hieu sach"+this.soHieuSach;
	}
	
	
}
