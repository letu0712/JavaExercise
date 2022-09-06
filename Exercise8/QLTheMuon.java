package Exercise8;

import java.util.ArrayList;
import java.util.List;

//Quan ly the muon
public class QLTheMuon {
	private List<TheMuon> dsTheMuon;
	
	public QLTheMuon() {
		this.dsTheMuon = new ArrayList<>();
	}

	public List<TheMuon> getDsTheMuon() {
		return dsTheMuon;
	}

	public void setDsTheMuon(List<TheMuon> dsTheMuon) {
		this.dsTheMuon = dsTheMuon;
	}
	
	public void themTheMuon(TheMuon theMuon) {
		this.dsTheMuon.add(theMuon);
	}
	
	public void xoaTheMuon(String maPhieuMuon) {
		for(int i=0; i<this.dsTheMuon.size(); i++) {
			if(this.dsTheMuon.get(i).getMaPhieuMuon().equals(maPhieuMuon)) {
				this.dsTheMuon.remove(i);
			}
		}
	}
	
	public void hienThiThongTin() {
		this.dsTheMuon.forEach(theMuon -> System.out.println(theMuon));
	}
}
