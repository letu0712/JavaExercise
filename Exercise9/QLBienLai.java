package Exercise9;

import java.util.ArrayList;
import java.util.List;

public class QLBienLai {
	private List<BienLai> dsBienLai;
	
	public QLBienLai() {
		this.dsBienLai = new ArrayList<>();
	}

	public List<BienLai> getDsBienLai() {
		return dsBienLai;
	}

	public void setDsBienLai(List<BienLai> dsBienLai) {
		this.dsBienLai = dsBienLai;
	}
	
	public void themBienLai(BienLai bienLai) {
		this.dsBienLai.add(bienLai);
	}
	
	public void xoaBienLai(String msCongToDien) {
		for(int i=0; i<this.dsBienLai.size(); i++) {
			if(this.dsBienLai.get(i).getMsCongToDien().equals(msCongToDien)) {
				this.dsBienLai.remove(i);
			}
		}
	}
	
	public void hienThiBienLai() {
		this.dsBienLai.forEach(bienLai -> System.out.println(bienLai));
	}
}
