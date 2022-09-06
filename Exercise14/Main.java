package Exercise14;

public class Main {

	public static void main(String[] args) {
		try {
			CheckRegex.validatePhone("0921234567");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		try {
			CheckRegex.validateFullName("pppppppppp");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
