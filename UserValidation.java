import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UserValidation {
	public boolean validFirstName(String FirstName) {
		String regExp="[A-Z][a-zA-Z]{3,}";
		Pattern p = Pattern.compile(regExp);
		Matcher m=p.matcher(FirstName);
		return m.matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your firstName");
		String FirstName=sc.next();
		boolean result=new UserValidation().validFirstName(FirstName);
		System.out.println(result);
	}

}
