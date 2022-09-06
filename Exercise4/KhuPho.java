package Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhuPho {
	private List<HoGiaDinh> dsHoGiaDinh = new ArrayList<>();
	
	public KhuPho() {};
	
	public KhuPho(List<HoGiaDinh> dsHoGiaDinh) {
		this.dsHoGiaDinh = dsHoGiaDinh;
	}

	public List<HoGiaDinh> getDsHoGiaDinh() {
		return dsHoGiaDinh;
	}

	public void setDsHoGiaDinh(List<HoGiaDinh> dsHoGiaDinh) {
		this.dsHoGiaDinh = dsHoGiaDinh;
	}
	
	
	public void hienThiHoGiaDinh() {
		this.dsHoGiaDinh.forEach(
				hoGiaDinh -> hoGiaDinh.getDsThanhVien().forEach(
						thanhvien -> System.out.println(thanhvien)));
		
		for(int i=0; i<this.dsHoGiaDinh.size(); i++) {
			System.out.printf("Thong tin ho gia dinh %d\n",i+1);
			System.out.printf("So nha: %d\n", this.dsHoGiaDinh.get(i).getSoNha());
			for(int j=0; j<this.dsHoGiaDinh.get(i).getDsThanhVien().size(); j++) {
				System.out.println(this.dsHoGiaDinh.get(i).getDsThanhVien().get(j));
			}
		}
	}
	
	public KhuPho themHoGiaDinh() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap so ho gia dinh trong khu pho: n=");
		int soHoGiaDinh = scan.nextInt();
		
		for(int i=0; i<soHoGiaDinh; i++) {
			System.out.println("=========================================");
			System.out.printf("Nhap thong tin ve gia dinh thu %d\n", i+1);
			HoGiaDinh hoGiaDinh = new HoGiaDinh().themThanhVien();
			this.dsHoGiaDinh.add(hoGiaDinh);
			System.out.println("=========================================");
		}
		return new KhuPho(this.dsHoGiaDinh);
	}
}
