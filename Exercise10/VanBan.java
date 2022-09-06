package Exercise10;

public class VanBan {
	private String str;
	
	public VanBan() {};
	
	public VanBan(String str) {
		this.str = str;
	}
	
	public int demSoTu() {
		return this.str.split(" ").length;
	}
	
	public int demKyTuA() {
		int count = 0;
		for(int i=0; i<this.str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}
}
