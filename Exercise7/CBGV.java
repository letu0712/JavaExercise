package Exercise7;

import java.util.ArrayList;
import java.util.List;

public class CBGV {
	private List<GiaoVien> dsGiaoVien;
	
	public CBGV() {
		this.dsGiaoVien = new ArrayList<>();
	}
	
	public void themGiaoVien(GiaoVien giaoVien) {
		this.dsGiaoVien.add(giaoVien);
	}
	
	public void xoaGiaoVien(String msgv) {
		for(int i=0; i<this.dsGiaoVien.size(); i++) {
			if(this.dsGiaoVien.get(i).getMsgv().equals(msgv)) {
				this.dsGiaoVien.remove(i);
			}
		}
	}
	
	public void hienThiGiaoVien() {
		this.dsGiaoVien.forEach(giaoVien -> System.out.println(giaoVien));
	}
}
