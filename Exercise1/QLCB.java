package Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
	private List<CanBo> dsCanBo;
	
	public QLCB() {
		this.dsCanBo = new ArrayList<>();
	}

	public List<CanBo> getDsCanBo() {
		return dsCanBo;
	}

	public void setDsCanBo(List<CanBo> dsCanBo) {
		this.dsCanBo = dsCanBo;
	}
	
	//Them moi can bo
	public void themCanBo(CanBo canBo) {
		this.dsCanBo.add(canBo);
	}
	
	//Tim kiem theo ho ten
	public List<CanBo> timKiemCanBo(String hoTen){
		return this.dsCanBo.stream().filter(canBo -> canBo.getHoTen().toLowerCase().equals(hoTen.toLowerCase())).collect(Collectors.toList());
	}
	
	//Hien thi danh sach can bo
	public void hienThiCanBo() {
		this.dsCanBo.forEach(canBo -> System.out.println(canBo));
	}
}
