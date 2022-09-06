package Exercise7;

public class Main {

	public static void main(String[] args) {
		CBGV cbgv = new CBGV();
		cbgv.themGiaoVien(new GiaoVien("Nguyen Van A", 30, "BN", "1234", 500, 100, 50));
		cbgv.themGiaoVien(new GiaoVien("Tran Van B", 32, "HN", "4567", 600, 200, 100));
		cbgv.themGiaoVien(new GiaoVien("Pham Van C", 31, "BG", "6789", 500, 200, 0));
		cbgv.themGiaoVien(new GiaoVien("Nguyen Thi C", 29, "BN", "3456", 600, 100, 100));
		
		cbgv.xoaGiaoVien("1234");
		cbgv.hienThiGiaoVien();
	}

}
