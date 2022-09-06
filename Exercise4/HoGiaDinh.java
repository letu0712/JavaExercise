package Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoGiaDinh {
	private int soNha;
	private List<Nguoi> dsThanhVien = new ArrayList<>();
	
	public HoGiaDinh() {};
	
	public HoGiaDinh(int soNha, List<Nguoi> dsThanhVien) {
		this.soNha = soNha;
		this.dsThanhVien = dsThanhVien;
	}

	public int getSoNha() {
		return soNha;
	}

	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}

	public List<Nguoi> getDsThanhVien() {
		return dsThanhVien;
	}

	public void setDsThanhVien(List<Nguoi> dsThanhVien) {
		this.dsThanhVien = dsThanhVien;
	}
	
	public void hienThiThanhVien() {
		this.dsThanhVien.forEach(thanhvien -> System.out.println(thanhvien));
	}
	
	public void themThanhVien(Nguoi thanhVien) {
		this.dsThanhVien.add(thanhVien);
	}
	
	public HoGiaDinh themThanhVien() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap so nha: ");	
		int soNha = scan.nextInt();
		System.out.print("Nhap so thanh vien trong ho gia dinh: ");	
		int soThanhVien = scan.nextInt();
		
		System.out.println("Nhap thong tin tung thanh vien");
		for(int i=0; i<soThanhVien; i++) {
			Nguoi thanhVien = new Nguoi().nhapThongTinNguoi();
			this.dsThanhVien.add(thanhVien);
		}
		return new HoGiaDinh(soNha, this.dsThanhVien);
	}
}
