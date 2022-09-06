package Exercise11;

import java.util.Scanner;

public class Main {
	
	//Nhap so phuc
	public static SoPhuc nhapSoPhuc() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap phan thuc: ");
		double phanThuc = scan.nextDouble();
		System.out.print("Nhap phan ao: ");
		double phanAo = scan.nextDouble();
		return new SoPhuc(phanThuc, phanAo);
	}
	
	
	public static void main(String[] args) {
		SoPhuc a = nhapSoPhuc();
		SoPhuc b = nhapSoPhuc();
		a.hienThi();
		System.out.println(a.cong(b));
		System.out.println(a.nhan(b));
	}

}
