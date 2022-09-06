package Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySach {
	private List<TaiLieu> dsTaiLieu;
	
	public QuanLySach() {
		this.dsTaiLieu = new ArrayList<>();
	}

	public List<TaiLieu> getDsTaiLieu() {
		return dsTaiLieu;
	}

	public void setDsTaiLieu(List<TaiLieu> dsTaiLieu) {
		this.dsTaiLieu = dsTaiLieu;
	}
	
	//Them moi tai lieu
	public void themTaiLieu(TaiLieu taiLieu) {
		this.dsTaiLieu.add(taiLieu);
	}
	
	//Xoa tai lieu theo ma tai lieu
	public void xoaTaiLieu(int maTaiLieu) {
		this.dsTaiLieu.removeIf(taiLieu -> taiLieu.getMaTaiLieu() == maTaiLieu);
	}
	
	//Hien thi thong tin ve tai lieu
	public void hienThiTaiLieu() {
		this.dsTaiLieu.forEach(taiLieu -> System.out.println(taiLieu));
	}
	
	//Tim kiem tai lieu theo loai: Sach, TapChi, bao
	public List<TaiLieu> timTaiLieu(String loaiTaiLieu) {
		switch(loaiTaiLieu.toLowerCase()) {
			case "sach":{
				return this.dsTaiLieu.stream().filter(taiLieu -> taiLieu instanceof Sach).collect(Collectors.toList());
			}
			case "tapchi":{
				return this.dsTaiLieu.stream().filter(taiLieu -> taiLieu instanceof TapChi).collect(Collectors.toList());
			}
			case "bao":{
				return this.dsTaiLieu.stream().filter(taiLieu -> taiLieu instanceof Bao).collect(Collectors.toList());
			}
			default:{
				System.out.println("Khong tim thay tai lieu");
			}
		}
		return null;
		
	}
	
}
