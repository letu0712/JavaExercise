package Exercise13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidBirthdayFormat extends Exception{
	public InvalidBirthdayFormat(String s) {
		super(s);
	}
}

class InvalidPhoneFormat extends Exception{
	public InvalidPhoneFormat(String s) {
		super(s);
	}
}

class InvalidEmailFormat extends Exception{
	public InvalidEmailFormat(String s) {
		super(s);
	}
}

public class CustomException {
	public static void validateBirthday(String birthday) throws InvalidBirthdayFormat{
		String regex = "^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher((CharSequence) birthday);
		if(!matcher.find()) {
			throw new InvalidBirthdayFormat("Not valid");
		}else {
			System.out.println("Valid");
		}
	}
	
	public static void validatePhone(String phone) throws InvalidPhoneFormat{
		String regex = "^((090)|(098)|(091)|(031)|(035)|(038)){1}\\d{7}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phone);
		if(!matcher.find()) {
			throw new InvalidPhoneFormat("Not Valid");
		}else {
			System.out.println("Valid");
		}
	}
	
	public static void validateEmail(String email) throws InvalidEmailFormat{
		String regex = "^[a-zA-Z]+[a-z0-9]*@{1}\\w+mail.com$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(!matcher.find()) {
			throw new InvalidEmailFormat("Not valid");
		}else {
			System.out.println("Valid");
		}
	}
}
