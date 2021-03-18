import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UserValidation {
static Scanner sc = new Scanner(System.in);
	public boolean validateFirstName(String FirstName) {
		String regExp="[A-Z][a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regExp);
		Matcher m=p.matcher(FirstName);
		return m.matches();
		}
	public boolean validateLastName(String LastName) {
		String regExp="[A-Z][a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regExp);
		Matcher m=p.matcher(LastName);
		return m.matches();
		}
	
	public static void isEmailIdValid() {
		System.out.println("Enter Email-Id.");
		String emailId = sc.next();
		if (emailId == null){
	    	 System.out.println("Empty Field.");
		      }
		else{
		if(emailId.matches("^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$")) {
		 		System.out.println("E-mail Id is Valid");
		 		}
		else {
		 		System.out.println("E-mail Id is Invalid");
		        }
		    }
	   }
	public boolean validateMobile(String mobileNumber) {
		String regExp="^[0-9]{2}[-][0-9]{10}$";
		Pattern p = Pattern.compile(regExp);
		Matcher m=p.matcher(mobileNumber);
		return m.matches();
		}
	public static boolean isPasswordValidation(String password) {
		String regExp="^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&)*(-+)]).{8,}$";
		Pattern p = Pattern.compile(regExp);
		Matcher m=p.matcher(password);
		return m.matches();
	 }

public static void main(String[] args) {
	System.out.println("Enter your firstName");
	String FirstName=sc.next();
	boolean result=new UserValidation().validateFirstName(FirstName);
	System.out.println(result);
	
	System.out.println("Enter your LastName");
	String LastName=sc.next();
	boolean result1=new UserValidation().validateLastName(LastName);
	System.out.println(result1);
	
	isEmailIdValid();
	
	System.out.println("Enter Mobile-Number:");
	String mobileNumber=sc.next();
	boolean result3=new UserValidation().validateMobile(mobileNumber);
	System.out.println(result3);
	
	System.out.println("Enter your password(contains-UC,LC,Digits,Sp.Chars):");
	String password=sc.next();
	boolean result4=new UserValidation().isPasswordValidation(password);
	System.out.println(result4);
	
}
}
