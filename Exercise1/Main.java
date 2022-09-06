package Exercise1;

import java.io.FileWriter;
import java.util.Scanner;

import Exercise13.Employee;

public class Main {
	// CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac)
	// KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String
	// nganhDaoTao)
	// NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String
	// congViec)

	public static CongNhan nhapCongNhan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap thong tin cong nhan:");
		System.out.print("Ho Ten: ");
		String hoTen = scan.nextLine();
		System.out.print("Tuoi: ");
		int tuoi = scan.nextInt();
		System.out.print("Gioi tinh: ");
		scan.nextLine();
		String gioiTinh = scan.nextLine();
		System.out.print("Dia chi: ");
		String diaChi = scan.nextLine();
		System.out.print("Bac: ");
		int bac = scan.nextInt();
		return new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
	}

	public static KySu nhapKySu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap thong tin ky su:");
		System.out.print("Ho Ten: ");
		String hoTen = scan.nextLine();
		System.out.print("Tuoi: ");
		int tuoi = scan.nextInt();
		System.out.print("Gioi tinh: ");
		scan.nextLine();
		String gioiTinh = scan.nextLine();
		System.out.print("Dia chi: ");
		String diaChi = scan.nextLine();
		System.out.print("Nganh dao tao: ");
		String nganhDaoTao = scan.nextLine();
		return new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
	}

	public static NhanVien nhapNhanVien() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap thong tin nhan vien:");
		System.out.print("Ho Ten: ");
		String hoTen = scan.nextLine();
		System.out.print("Tuoi: ");
		int tuoi = scan.nextInt();
		System.out.print("Gioi tinh: ");
		scan.nextLine();
		String gioiTinh = scan.nextLine();
		System.out.print("Dia chi: ");
		String diaChi = scan.nextLine();
		System.out.print("Cong viec: ");
		String congViec = scan.nextLine();
		return new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
	}

	public static void chayChuongTrinh() {
		QLCB qlcb = new QLCB();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
			
			System.out.println("Chon chuc nang:");
			System.out.println("[1] Them can bo");
			System.out.println("[2] Tim kiem can bo theo ten");
			System.out.println("[3] Hien thi danh sach can bo");
			System.out.println("[4] Ghi file (danh sach can bo)");
			System.out.println("[5] Thoat khoi chuong chinh");
			
			String select = scan.nextLine();
			switch(select) {
				case "1":{			//Them can bo
					System.out.println("Chon can bo can nhan thong tin");
					System.out.println("[A] Cong nhan");
					System.out.println("[B] Ky su");
					System.out.println("[C] Nhan vien");
					String type = scan.nextLine().toLowerCase();
					switch(type) {
						case "a":{
							qlcb.themCanBo(nhapCongNhan());
							break;
						}
						case "b":{
							qlcb.themCanBo(nhapKySu());
							break;
						}
						case "c":{
							qlcb.themCanBo(nhapNhanVien());
							break;
						}
						default:{
							System.out.println("Moi nhap lai");
							break;
						}
					}
					break;
				}
				case "2":{
					System.out.print("Nhap ten can bo can tim kiem: ");
					String hoTen = scan.nextLine();
					System.out.println("Ket qua tim kiem: ");
					qlcb.timKiemCanBo(hoTen).forEach(canBo -> System.out.println(canBo));
					break;
				}
				case "3":{
					qlcb.hienThiCanBo();
					break;
				}
				case "4":{
					try {
						FileWriter fw = new FileWriter("output.txt");
						String content = "";
						for(CanBo canbo : qlcb.getDsCanBo()) {
							content += canbo + "\n";
						}
						fw.write(content);
						fw.close();
					}catch (Exception e) {
						System.out.println(e);
					}
					break;
				}
				case "5":{
					run = false;
					break;
				}
				default:{
					System.out.println("Moi nhap lai");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
//		QLCB qlcb = new QLCB();
//		qlcb.themCanBo(new CongNhan("Nguyen Van A", 21, "Nam", "BN", 2));
//		qlcb.themCanBo(new KySu("Tran Van B", 22, "Nam", "HN", "CNTT"));
//		qlcb.themCanBo(new NhanVien("Nguyen Thi C", 20, "Nu", "BG", "Le tan"));
//
//		System.out.println(qlcb.timKiemCanBo("nguyen van a"));
//		qlcb.hienThiCanBo();
		
		
		chayChuongTrinh();
	}

}
