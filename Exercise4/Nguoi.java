package Exercise4;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private int tuoi;
	private String ngheNghiep;
	private String cmnd;
	
	public Nguoi() {};
	
	public Nguoi(String hoTen, int tuoi, String ngheNghiep, String cmnd) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.ngheNghiep = ngheNghiep;
		this.cmnd = cmnd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setAge(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(Ho ten: "+this.hoTen + 
				" - Tuoi: "+this.tuoi +
				" - Nghe Nghiep: "+ this.ngheNghiep +
				" - CMND: "+this.cmnd +")";
	}
	
	public Nguoi nhapThongTinNguoi() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ho ten: ");
		String ten = scan.nextLine();
		
		System.out.print("Tuoi: ");
		int tuoi = scan.nextInt();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Nghe Nghiep: ");
		String ngheNghiep = scan1.nextLine();
		
		System.out.print("CMND: ");
		String cmnd = scan1.nextLine();

		return new Nguoi(ten, tuoi, ngheNghiep, cmnd);
	}
}
