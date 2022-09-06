package Exercise8;

public class Main {

	public static void main(String[] args) {
		QLTheMuon qlTheMuon = new QLTheMuon();
		qlTheMuon.themTheMuon(new TheMuon("Nguyen Van A", 23, "A1", "ABC", 5, 25, 1));
		qlTheMuon.themTheMuon(new TheMuon("Tran Thi B", 24, "B1", "HJF", 2, 20, 2));
		qlTheMuon.themTheMuon(new TheMuon("Nguyen Thi C", 21, "C1", "IHN", 6, 31, 3));
		qlTheMuon.themTheMuon(new TheMuon("Nguyen Van D", 23, "A1", "OIG", 4, 24, 4));
		
		qlTheMuon.xoaTheMuon("ABC");
		qlTheMuon.hienThiThongTin();

	}

}
