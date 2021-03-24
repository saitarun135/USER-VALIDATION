import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 

@FunctionalInterface
interface Validation{
	boolean checkingParameters(String parameter,String regEx);
}
public class UserValidation{

	public static void main(String args[]) {
		
		Validation chk=(parameter,regEx)->{
			Pattern pattern=Pattern.compile(regEx);
			Matcher matcher =pattern.matcher(parameter);
			return matcher.matches();
		};
		
		System.out.println("---------------FIRST_NAME-VERIFICATION-------------");
		System.out.println("First-Name:" +" " +chk.checkingParameters("Sai","[A-Z][a-z]{2,}"));
		System.out.println("First-Name:"  +" " +chk.checkingParameters("sai","[A-Z][a-z]{2,}"));
	
		System.out.println("-------------LAST-NAME-VALIDATION-----------------");
		System.out.println("Last-Name:"  +" " +chk.checkingParameters("Sai","[A-Z][a-z]{2,}"));
		System.out.println("Last-Name:"  +" " +chk.checkingParameters("sai","[A-Z][a-z]{2,}"));
		
		System.out.println("-------------MOBILE-VALIDATION-----------------");
		System.out.println("Mobile-Number:"  +" " 	+chk.checkingParameters("91-7901001572","[0-9]{2}[-][0-9]{10}"));
		System.out.println("Mobile-Number:"  +" " 	+chk.checkingParameters("917901001572","[0-9]{2}[-][0-9]{10}"));
		
		System.out.println("-------------EMAIL-VALIDATION-----------------");
		System.out.println("Email:"  +" " 	+chk.checkingParameters("saitarun800@gmail.com","^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,4})$"));
		System.out.println("Email:"  +" " 	+chk.checkingParameters("sai@gm.in","^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,4})$"));
		
		System.out.println("-------------PASSWORD-VERFICICATION-----------------");
		System.out.println("Password:"  +" " 	+chk.checkingParameters("SaItarun*1","^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&)*(-+)]).{8,}$"));
		System.out.println("password:"  +" " 	+chk.checkingParameters("Saitarun12","^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&)*(-+)]).{8,}$"));
		
		
	}
}
