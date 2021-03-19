import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class UserValidationTest {

	@Test
			public void givenFirstName_whenProper_ShouldReturnTrue() {
			UserValidation usr=new UserValidation();
			boolean result=usr.validateFirstName("Sai");
			Assert.assertTrue(result);
		
			}
	
	@Test
			public void givenFirstName_whenProper_ShouldReturnFalse() {
			UserValidation usr=new UserValidation();
			boolean result=usr.validateFirstName("Sai");
			Assert.assertEquals(false, result);

			}
	@Test
			public void givenLastName_whenProper_ShouldReturnTrue() {
			UserValidation usr=new UserValidation();
			boolean result=usr.validateLastName("Tarun");
			Assert.assertTrue(result);
	
			}
	
	@Test
			public void givenLastName_whenProper_ShouldReturnFalse() {
			UserValidation usr=new UserValidation();
			boolean result=usr.validateLastName("tarun");
			Assert.assertFalse(result);
		
			}
	
	@Test
			public void givenMob_Number_ShouldReturnTrue() {
			UserValidation usr =new UserValidation();
			boolean result=usr.validateMobile("91-7901001572");
			Assert.assertTrue(result);
			}
	@Test
			public void givenMob_Number_ShouldReturnFalse() {
			UserValidation usr =new UserValidation();
			boolean result=usr.validateMobile("7901001572");
			Assert.assertFalse(result);
			}

	@Test
			public void givenPassword_ShouldReturnTrue() {
			UserValidation usr = new UserValidation();
			boolean result=usr.isPasswordValidation("SAItarun*1");
			Assert.assertTrue(result);
			
			}
	@Test
			public void givenPassword_ShouldReturnFalse() {
			UserValidation usr = new UserValidation();
			boolean result=usr.isPasswordValidation("SAItarun1");
			Assert.assertFalse(result);
	
			}

}

