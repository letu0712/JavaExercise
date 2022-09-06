package Exercise12;

public class Main {
	//XeMay(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauSac, int congSuat)
	//XeTai(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauSac, int trongTai)
	public static void main(String[] args) {
		QLPTGT qlpt = new QLPTGT();
		qlpt.themPTGT(new Oto(1, "BMW", 2019, 300000, "Den", 4, "Dong co 1"));
		qlpt.themPTGT(new XeMay(2, "Honda", 2020, 2500, "Den", 10000));
		qlpt.themPTGT(new XeTai(3, "Suzuki", 2020, 10000, "Trang", 10));
		
//		qlpt.xoaPTGT(1);
		qlpt.hienThiDsPTGT();
		System.out.println(qlpt.timTheoHangSX("honda"));		//Tim theo hang san xuat
		System.out.println(qlpt.timTheoMauSac("Den"));			//Tim theo mau sac
		
		
	}

}
