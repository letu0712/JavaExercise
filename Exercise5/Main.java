package Exercise5;

public class Main {
	//KhachHang(String hoTen, int tuoi, String cmnd, int soNgayThue, String loaiPhong)
	public static void main(String[] args) {
		QLKhachSan qlKS = new QLKhachSan();
		qlKS.themKhachHang(new KhachHang("Nguyen Van A", 23, "123456789", 5, "A"));
		qlKS.themKhachHang(new KhachHang("Tran Van B", 23, "987654321", 2, "B"));
		

		System.out.println(qlKS.tinhTienPhong("987654"));
		System.out.println(qlKS.tinhTienPhong("123456789"));
		qlKS.xoaKhachHang("123456789");
		qlKS.hienThiKhachHang();
	}
}
