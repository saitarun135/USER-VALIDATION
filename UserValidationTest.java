import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class UserValidationTest {
	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue(){
		String testString = "Sai";
		try {
			Assert.assertTrue(UserValidation.validatePattern(testString, UserValidation.firstNamePattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse(){
		String testString = "sa";
		try {
			Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.firstNamePattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue(){
		String testString = "Tarun";
		try {
			Assert.assertTrue(UserValidation.validatePattern(testString, UserValidation.lastNamePattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse(){
		String testString = "tarun";
		try {
			Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.lastNamePattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue(){
		String testString = "saitarun800@gmail.com";
		try {
			Assert.assertTrue(UserValidation.validatePattern(testString, UserValidation.emailPattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenEmail_WhenInvalid_ShouldReturnFalse(){
		String testString = "abc";
		try {
			Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.emailPattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenMobileNumber_WhenValid_ShouldReturnTrue(){
		String testString = "91-9175757555";
		try {
			Assert.assertTrue(UserValidation.validatePattern(testString, UserValidation.mobilePattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenMobileNumber_WhenInvalid_ShouldReturnFalse(){
		String testString = "+911122232";
		try {
			Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.mobilePattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue(){
		String testString = "saitarun800@gmail.com";
		try {
			Assert.assertTrue(UserValidation.validatePattern(testString, UserValidation.passwordPattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenPassword_WhenInvalid_ShouldReturnFalse(){
		String testString = "sai@.gm.in";
		try {
			Assert.assertFalse(UserValidation.validatePattern(testString, UserValidation.passwordPattern));
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
	}



}

