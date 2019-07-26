package regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testCase2 {

	String expected_title = "Yahoo.com";
	String actual_title = "Gmail.com";
	
	@Test
	public void validateTitle(){		
		
		// Forma de hacerlo HardAssert, solo se ejecuta el primero
		
		/*System.out.println("Validating Titles");		
		Assert.assertEquals(expected_title, actual_title);
		
		System.out.println("Validating CheckBox");		
		Assert.assertEquals(true, false, "CheckBox not found" );
		
		System.out.println("Validating Images");		
		Assert.assertEquals(true, false, "Images not found");*/
		
		// Forma de hacerlo SoftAssert, se ejecutan todos
		
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("Validating Titles");		
		softAssert.assertEquals(expected_title, actual_title);
		
		System.out.println("Validating CheckBox");		
		softAssert.assertEquals(true, false, "CheckBox not found" );
		
		System.out.println("Validating Images");		
		softAssert.assertEquals(true, false, "Images not found");
		
		// debemos ejecutar un HardAssert al final, por que los métodos de arriba 
		// dan error, pero la puebra saldría como "pass", entonces se hace lo siguiente:
		
		softAssert.assertAll();
	}
	
}
