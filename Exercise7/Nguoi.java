package Exercise7;

public class Nguoi {
	protected String hoTen;
	protected int tuoi;
	protected String queQuan;
	protected String msgv;
	
	public Nguoi(String hoTen, int tuoi, String queQuan, String msgv) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
		this.msgv = msgv;
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

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getMsgv() {
		return msgv;
	}

	public void setMsgv(String msgv) {
		this.msgv = msgv;
	}
	
	
}
