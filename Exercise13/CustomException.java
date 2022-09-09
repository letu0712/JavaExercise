package Exercise13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	public static boolean validateBirthday(String birthday){
		boolean isOk;
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false); // set false để kiểm tra tính hợp lệ của date. VD: tháng 2 phải có 28-29 ngày, năm có 12 tháng,....
		try {
			df.parse(birthday); // parse dateString thành kiểu Date
			System.out.println("Valid");
			isOk = true;
		}
		catch (ParseException e) { // quăng lỗi nếu dateString ko hợp lệ
		   System.out.println("Invalid date");
		   isOk = false;
		}
		return isOk;
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
