package Exercise11;

public class SoPhuc {
	private double phanThuc;
	private double phanAo;
	
	public SoPhuc(double phanThuc, double phanAo) {
		this.phanThuc = phanThuc;
		this.phanAo = phanAo;
	}

	public double getPhanThuc() {
		return phanThuc;
	}

	public void setPhanThuc(double phanThuc) {
		this.phanThuc = phanThuc;
	}

	public double getPhanAo() {
		return phanAo;
	}

	public void setPhanAo(double phanAo) {
		this.phanAo = phanAo;
	}

	@Override
	public String toString() {
		return "("+this.phanThuc+", "+this.phanAo+"j)";
	}
	
	//Cong hai so phuc
	public SoPhuc cong(SoPhuc a) {
		return new SoPhuc(this.phanThuc+a.getPhanThuc(), this.phanAo+a.getPhanAo());
	}
	
	//Nhan 2 so phuc
	public SoPhuc nhan(SoPhuc a) {
		return new SoPhuc(this.phanThuc*a.getPhanThuc() - this.phanAo*a.getPhanAo(),
				this.phanThuc*a.getPhanAo()+ this.phanAo*a.getPhanThuc());
	}
	
	//Hien thi so phuc
	public void hienThi() {
		System.out.println(this);
	}
	
	
	
	
}
