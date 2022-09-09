package Exercise13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFormat {
	public static boolean checkEmail(String email) {
		/*		^[a-zA-Z]+ : bat dau bang 1 hoac nhieu chu cai
		 * 		[a-z0-9]*	:0 hoac nhieu su xuat hien cua chu cai hoac so
		 * 		@{1}		: co 1 @
		 * 		\\w			: so khop voi bat ky ky tu chu nao (chu cai va so) viet tat cua [a-zA-Z0-9]
		 * 		mail.com$	: ket thuc voi mail.com
		 * */
		String regex = "^[a-zA-Z]+[a-z0-9]*@{1}\\w+mail.com$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.find()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkPhone(String phone) {
		String regex = "^((090)|(098)|(091)|(031)|(035)|(038)){1}\\d{7}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phone);
		if(matcher.find()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkBirthday(String birthday) {
		String regex = "^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(birthday);
		if(matcher.find()) {
			return true;
		}else {
			return false;
		}
	}
}
