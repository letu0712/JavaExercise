package Exercise13;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	//Certificate(int certificatedID, String certificateName, int certificatedRank, String certificatedDate)
	public static List<Certificate> enterCertificate(){
		List<Certificate> listCertificate = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of list certificate: ");
		int numCertificate = scan.nextInt();
		for(int i=0; i<numCertificate; i++) {
			System.out.println("Certificate No. "+i);
			System.out.print("ID: ");
			int id = scan.nextInt();
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Rank: ");
			int rank = scan.nextInt();
			
			scan.nextLine();
			String date;
			while(true) {
				System.out.print("Date: ");
				date = scan.nextLine();
				if(CustomException.validateBirthday(date)) {
					break;
				}
			}
			listCertificate.add(new Certificate(id, name, rank, date));
		}
		return listCertificate;
	}
	
	//Employee(int id, String fullName, String birthDay, String phone, String email, int employeeType, List<Certificate> listCertificate)
	public static Employee enterEmployee() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
//		scan.nextLine();
		String fullName = scan.nextLine();
		
		String birthDay;
		while(true) {
			System.out.print("Birthday: ");
			birthDay = scan.nextLine();
			if(CustomException.validateBirthday(birthDay)) {
				break;
			}
		}
		String phone;
		while(true) {
			System.out.print("Phone: ");
			phone = scan.nextLine();
			try {
				CustomException.validatePhone(phone);
				break;
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}

		String email;
		while(true) {
			System.out.print("Email: ");
			email = scan.nextLine();
			try {
				CustomException.validateEmail(email);
				break;
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}
		System.out.print("Employee Type (0: Experience, 1: Fresher, 2: Intern): ");
		int employeeType = scan.nextInt();
		System.out.print("List Certificate: ");
		List<Certificate> listCertificate = enterCertificate();
		
		
		//Experience(String fullName, String birthDay, String phone, String email, int employeeType,
		//List<Certificate> listCertificate, int expInYear, String proSkill) 
		if(employeeType == 0) {		//If experience
			System.out.print("Exp in year: ");		//So nam kinh nghiem
			int expInYear = scan.nextInt();
			System.out.print("ProSkill: ");			//Ky nang chuyen mon
			String proSkill = scan.nextLine();
			return new Experience(fullName, birthDay, phone, email, employeeType, listCertificate, expInYear, proSkill);
		}		
		
		switch(employeeType) {
		//Experience(String fullName, String birthDay, String phone, String email, int employeeType,
		//List<Certificate> listCertificate, int expInYear, String proSkill) 
			case 0:{
				System.out.print("Exp in year: ");		//So nam kinh nghiem
				int expInYear = scan.nextInt();
				System.out.print("ProSkill: ");			//Ky nang chuyen mon
				String proSkill = scan.nextLine();
				return new Experience(fullName, birthDay, phone, email, employeeType, listCertificate, expInYear, proSkill);
			}
			
			//Fresher(String fullName, String birthDay, String phone, String email, int employeeType,
	//		List<Certificate> listCertificate, Date graduationDate, String graduationRank, String education)
			case 1:{
				scan.nextLine();
				String graduationDate;
				while(true) {
					System.out.print("Graduation Date: ");
					graduationDate = scan.nextLine();
					if(CustomException.validateBirthday(graduationDate)) {
						break;
					}

				}

				System.out.print("Graduation Rank: "); 	//Tot nghiep loai gi
				String graduationRank = scan.nextLine();
				System.out.print("Education: ");			//Truong dai hoc 
				String education = scan.nextLine();
				return new Fresher(fullName, birthDay, phone, email, employeeType, listCertificate, graduationDate, graduationRank, education);
			}
			//Intern(String fullName, String birthDay, String phone, String email, int employeeType,
//			List<Certificate> listCertificate, String majors, String semester, String universityName)
			case 2:{
				System.out.print("Majors: ");		//Chuyen nganh
				scan.nextLine();
				String majors = scan.nextLine();
				System.out.print("Semester: ");		//Hoc ki 
				String semester = scan.nextLine();
				System.out.print("University: ");	//Truong dai hoc dang hoc
				String universityName = scan.nextLine();
				return new Intern(fullName, birthDay, phone, email, employeeType, listCertificate, majors, semester, universityName);
			}
		}
		return null;
	}
	
	public static void run() {
		EmployeeManager employeeManager = new EmployeeManager();
		Scanner input = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("Enter No. of function");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Remove Employee");
			System.out.println("4. Show all Employee");
			System.out.println("5. Find Employee by Employee Type");
			System.out.println("6. Writing file (all employee)");
			System.out.println("7. Exit");
			String select = input.nextLine();
			switch(select) {
				case "1":{
					Employee employee = enterEmployee();
					employeeManager.addEmployee(employee);
					break;
				}
				case "2":{
					System.out.println("Enter EmployeeID to Update");
					int idUpdate = input.nextInt();
					Employee newEmployee = enterEmployee();
					employeeManager.modifyEmployee(idUpdate, newEmployee);
					break;
				}
				case "3":{
					System.out.println("Enter EmployeeID to remove");
					int idRemove = input.nextInt();
					employeeManager.removeEmployee(idRemove);
					break;
				}
				case "4":{
					employeeManager.showListEmployee();
					break;
				}
				case "5":{
					System.out.println("Enter EmployeeType to Search: (0:Exp, 1:Fresher, 2:Intern)");
					String employeeType = input.nextLine();
					switch(employeeType) {
						case "0":{
							System.out.println(employeeManager.findExperience());
							break;
						}
						case "1":{
							System.out.println(employeeManager.findFresher());
							break;
						}
						case "2":{
							System.out.println(employeeManager.findIntern());
							break;
						}
						default:{
							System.out.println("Invalid EmployeeType");
							break;
						}
					}
				}
				case "6":{
					try {
						FileWriter fw = new FileWriter("output.txt");
						String content = "";
						for(Employee employee : employeeManager.getListEmployee()) {
							content += employee + "\n";
						}
						fw.write(content);
						fw.close();
					}catch (Exception e) {
						System.out.println(e);
					}
					break;
				}
				
				case "7":{
					run = false;
					break;
				}
				default:{
					System.out.println("Invalid selection");
					break;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {	
		run();
	}

}
