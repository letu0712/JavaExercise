package Exercise6;

public class Main {

	public static void main(String[] args) {
		TruongHoc truongHoc = new TruongHoc();
		truongHoc.themHocSinhMoi(new HocSinh("Nguyen Van A", 24, "BN", "A1"));
		truongHoc.themHocSinhMoi(new HocSinh("Tran Thi B", 23, "DN", "B2"));
		truongHoc.themHocSinhMoi(new HocSinh("Pham Van C", 19, "BN", "A1"));
		truongHoc.themHocSinhMoi(new HocSinh("Tran Van A", 23, "DN", "C1"));
		
		//Danh Sach hoc sinh tren 20 tuoi
		truongHoc.hocSinhTren20Tuoi().forEach(
				hocSinh -> System.out.println(hocSinh));
		
		System.out.println(truongHoc.thongKeHocSinh());
		
	}

}
