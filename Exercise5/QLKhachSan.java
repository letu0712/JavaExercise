package Exercise5;

import java.util.ArrayList;
import java.util.List;

public class QLKhachSan {
	private List<KhachHang> dsKhachHang;

	public QLKhachSan() {
		this.dsKhachHang = new ArrayList<>();
	}

	public List<KhachHang> getDsKhachHang() {
		return dsKhachHang;
	}

	public void setDsKhachHang(List<KhachHang> dsKhachHang) {
		this.dsKhachHang = dsKhachHang;
	}
	
	//THem khach hang
	public void themKhachHang(KhachHang khachHang) {
		this.dsKhachHang.add(khachHang);
	}
	
	//Xoa khach hang theo cmnd
	public void xoaKhachHang(String cmnd) {
		this.dsKhachHang.removeIf(khachHang -> khachHang.getCmnd().equals(cmnd));
	}
	
	//Tinh tien thue phong cho khach
	public int tinhTienPhong(String cmnd) {
		KhachHang khachHang = this.dsKhachHang.stream().filter(k -> k.getCmnd().equals(cmnd)).findFirst().orElse(null);
		
		if(khachHang == null) {
			System.out.println("Khong tim thay khach hang co CMND la: "+cmnd);
			return 0;
		}
		
		switch(khachHang.getLoaiPhong().toLowerCase()) {
			case "a":{
				return khachHang.getSoNgayThue() * 500;
			}
			case "b":{
				return khachHang.getSoNgayThue() * 300;
			}
			case "c":{
				return khachHang.getSoNgayThue() * 100;
			}
			default:
				break;
		}
		return 0;
	}
	
	//Hien thi danh sach khach hang
	public void hienThiKhachHang() {
		this.dsKhachHang.forEach(khachHang -> System.out.println(khachHang));
	}

}
