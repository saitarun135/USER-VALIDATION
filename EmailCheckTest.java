import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class EmailCheckTest {
	String refMail;
	boolean expectedResult;
	public EmailCheckTest(boolean expectedResult,String refMail) {
	       this.refMail = refMail;
	       this.expectedResult=expectedResult;
	    }
@Parameterized.Parameters
 public static Collection Maillists() {
	return Arrays.asList(new Object[][] {
					{true, "abc@yahoo.com"},{true, "abc-100@yahoo.com"},{true,"abc.100@yahoo.com"},{true, "abc.100@abc.com.au"},
					{true, "abc@gmail.com.com"},{true, "abc+100@gmail.com"}, {false, "abc"},{false, "abc@.com"},
	                {false, "abc123@gmail.a"},{false, "abc123@.com"},{false, "abc123@.com.com"},{false, ".abc@abc.com"},
	                {false, "abc()*@gmail.com"}, {false,"abc@%*.com"},{false, "abc..2002@gmail.com"},{false, "abc.@gmail.com"},
	                {false, "abc@gmail.com.1a"}, {false, "abc@gmail.com.aa.au"}
	        });
	    }
@Test
public void testmail() {

	        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,4})$" );

	        Matcher matcher=pattern.matcher(refMail);
	 
	        Assert.assertEquals(matcher.matches(), expectedResult);

	    }
	}
