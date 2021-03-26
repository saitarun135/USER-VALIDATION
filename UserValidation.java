import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 

/*@FunctionalInterface
interface Validation{
	boolean checkingParameters(String parameter,String regEx);
}*/
/*Validation chk=(parameter,regEx)->{
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
}*/
public class UserValidation{

	public static final String firstNamePattern =  "^[A-Z][a-zA-Z]{3,3}";
	public static final String lastNamePattern =  "^[A-Z][a-zA-Z]{3,3}";
	public static final String emailPattern =  "^([^\\.][a-zA-Z]+[\\.+_-]{0,1}[0-9][^\\.]@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}[\\.][a-z^la]*)$";
	public static final String mobilePattern =  "^(91\\s*[7-9][0-9]{9})$";
	public static final String passwordPattern =  "^(?=.[A-Z])(?=.[0-9])(?=.*[!@#&()-[{}]:;',?/~$^+=<>]).{8,8}$";

	public static boolean validatePattern(String argument, String regExp) throws UserValidationException {
		
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(argument);
		if(matcher.matches()) {
			return true;
		}else {
			
			throw new UserValidationException("please enter valid input which is not null");
		}
}
public static void ifValidOuput(String regExpString, String[] testSamples) {
	Arrays.stream(testSamples).forEach( testString -> {
		try {
			if (validatePattern(testString, regExpString)) {
				System.out.println(" Valid : ");
			}else
				System.out.println(" Invalid : ");
		} catch (UserValidationException e) {
			System.out.println(e.getMessage());
		}
	}
			);
}

				public static void main(String[] args) {
			System.out.println("Welcome to User Registration system to ensure all Validations");
			System.out.println("Enter your first name");
			String[] firstName = {"Sai", "sa", "sai"};
			ifValidOuput(firstNamePattern, firstName);
			
			System.out.println("Enter your last name");
			String[] lastName = {"Tarun", "tarun", "Ta"};
			ifValidOuput(lastNamePattern, lastName);

			System.out.println("Enter your email");
			String[] email = {"saitarun800@gmail.com", "abc-100@gmail.com", "sai@yahoo.com"};
			ifValidOuput(emailPattern, email);

	        System.out.println("Enter your mobile format");
	        String[] mobileFormat = {"91-7901001572", "97901001572", "7901001572"};
			ifValidOuput(mobilePattern, mobileFormat);

			System.out.println("Enter your password rules");
			String[] passwordRules = {"SAItarun*1", "SAITARUN1", "sai13"};
			ifValidOuput(passwordPattern, passwordRules);


			
		}

	}
		