import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UserValidation {
static Scanner sc = new Scanner(System.in);
	public boolean validateFirstName(String FirstName) {
		String regExp="[A-Z][a-zA-Z]{3,}";
		Pattern p = Pattern.compile(regExp);
		Matcher m=p.matcher(FirstName);
		return m.matches();
		}
	public boolean validateLastName(String LastName) {
		String regExp="[A-Z][a-zA-Z]{3,}";
		Pattern p = Pattern.compile(regExp);
		Matcher m=p.matcher(LastName);
		return m.matches();
		}
	
	 private static void isEmailIdValid() {
		 System.out.println("Enter Email-Id.");
	     String emailId = sc.next();
	     if (emailId == null){
	    	 System.out.println("Empty Field.");
		        }
	     else{
	     if (emailId.matches("^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$")) {
        System.out.println("E-mail Id is Valid");
		  }
	     else {
		   System.out.println("E-mail Id is Invalid");
		        }
		    }
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
	}
}
