package Exercise14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



class InvalidFullNameException extends Exception{
	public InvalidFullNameException(String s) {
		super(s);
	}
}

class InvalidDOBException extends Exception{
	public InvalidDOBException(String s) {
		super(s);
	}
}

class InvalidPhoneNumberException extends Exception{
	public InvalidPhoneNumberException(String s) {
		super(s);
	}
}

public class CheckRegex {
	public static void validateFullName(String fullName) throws InvalidFullNameException{
		String regex = "[a-zA-Z]{10,50}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fullName);
		if(!matcher.find()) {
			throw new InvalidFullNameException("Not valid");
		}else {
			System.out.println("Valid");
		}
	}
	
	public static void validateDOB(String doB) throws InvalidDOBException{
		String regex = "^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(doB);
		if(!matcher.find()) {
			throw new InvalidDOBException("Not valid");
		}else {
			System.out.println("Valid");
		}
	}
	
	public static void validatePhone(String phone) throws InvalidPhoneNumberException{
		String regex = "^((090)|(098)|(091)|(031)|(035)|(038)){1}\\d{7}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phone);
		if(!matcher.find()) {
			throw new InvalidPhoneNumberException("Not Valid");
		}else {
			System.out.println("Valid");
		}
	}
}
