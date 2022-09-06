package Exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TruongHoc {
	private List<HocSinh> dsHocSinh;
	
	public TruongHoc() {
		this.dsHocSinh = new ArrayList<>();
	}

	public List<HocSinh> getDsHocSinh() {
		return dsHocSinh;
	}

	public void setDsHocSinh(List<HocSinh> dsHocSinh) {
		this.dsHocSinh = dsHocSinh;
	}
	
	public void themHocSinhMoi(HocSinh hocSinh) {
		this.dsHocSinh.add(hocSinh);
	}
	
	public List<HocSinh> hocSinhTren20Tuoi() {
		return this.dsHocSinh.stream().filter(hocSinh -> hocSinh.getTuoi()>20).collect(Collectors.toList());
	}
	
	public int thongKeHocSinh() {	//23 tuoi va que o DN
		return (int) this.dsHocSinh.stream().filter(hocSinh -> hocSinh.getTuoi()==23 && hocSinh.getQueQuan().equals("DN")).count();
	}
}
