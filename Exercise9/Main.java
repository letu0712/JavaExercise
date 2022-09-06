package Exercise9;

public class Main {

	public static void main(String[] args) {
		QLBienLai qlBienLai = new QLBienLai();
		
		qlBienLai.themBienLai(new BienLai("Nguyen Van A", 20, "1234", 20, 100));
		qlBienLai.themBienLai(new BienLai("Pham Van B", 22, "4567", 24, 98));
		qlBienLai.themBienLai(new BienLai("Tran Thi C", 30, "6789", 19, 80));
		
		qlBienLai.xoaBienLai("1234");
		qlBienLai.hienThiBienLai();
	}

}
