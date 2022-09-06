package Exercise13;

import java.util.Date;

public class Certificate {
	private int certificatedID;
	private String certificateName;
	private int certificatedRank;
	private String certificatedDate;

	public Certificate(int certificatedID, String certificateName, int certificatedRank, String certificatedDate) {
		this.certificatedID = certificatedID;
		this.certificateName = certificateName;
		this.certificatedRank = certificatedRank;
		this.certificatedDate = certificatedDate;
	}

	public int getCertificatedID() {
		return certificatedID;
	}

	public void setCertificatedID(int certificatedID) {
		this.certificatedID = certificatedID;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public int getCertificatedRank() {
		return certificatedRank;
	}

	public void setCertificatedRank(int certificatedRank) {
		this.certificatedRank = certificatedRank;
	}

	public String getCertificatedDate() {
		return certificatedDate;
	}

	public void setCertificatedDate(String certificatedDate) {
		this.certificatedDate = certificatedDate;
	}

	@Override
	public String toString() {
		return "Certificate [certificatedID=" + certificatedID + ", certificateName=" + certificateName
				+ ", certificatedRank=" + certificatedRank + ", certificatedDate=" + certificatedDate + "]";
	}
	
}
