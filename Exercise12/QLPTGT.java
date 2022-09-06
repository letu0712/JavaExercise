package Exercise12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLPTGT {
	private List<PTGT> dsPTGT;

	public QLPTGT() {
		this.dsPTGT = new ArrayList<>();
	}

	public List<PTGT> getDsPTGT() {
		return dsPTGT;
	}

	public void setDsPTGT(List<PTGT> dsPTGT) {
		this.dsPTGT = dsPTGT;
	}
	
	//Hien thi danh sach PTGT
	public void hienThiDsPTGT() {
		this.dsPTGT.forEach(ptgt -> System.out.println(ptgt));
	}
	
	//Them PTGT
	public void themPTGT(PTGT ptgt) {
		this.dsPTGT.add(ptgt);
	}

	//Xoa PTGT theo Id
	public void xoaPTGT(int id) {
		this.dsPTGT.removeIf(ptgt -> ptgt.getId() == id);
	}
	
	//Tim theo hang san xuat
	public List<PTGT> timTheoHangSX(String hangSanXuat){
		return this.dsPTGT.stream().filter(ptgt -> ptgt.getHangSanXuat().toLowerCase().equals(hangSanXuat.toLowerCase()))
									.collect(Collectors.toList());
	}
	
	//Tim theo mau sac
	public List<PTGT> timTheoMauSac(String mauSac){
		return this.dsPTGT.stream().filter(ptgt -> ptgt.getMauSac().toLowerCase().equals(mauSac.toLowerCase()))
								   .collect(Collectors.toList());
	}
}
