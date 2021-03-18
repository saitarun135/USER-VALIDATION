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
	public static void main(String[] args) {
		System.out.println("Enter your firstName");
		String FirstName=sc.next();
		boolean result=new UserValidation().validateFirstName(FirstName);
		System.out.println(result);
		System.out.println("Enter your LastName");
		String LastName=sc.next();
		boolean result1=new UserValidation().validateLastName(LastName);
		System.out.println(result1);
	
	}

}
