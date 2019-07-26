package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test(dataProvider="getData")
	public void toLogin(String userName, String password){
		System.out.println(userName +" --- " + password);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0]="jorgecortes@jorge.com";
		data[0][1]="jorge123";
		
		data[1][0]="payupayu@payu.com";
		data[1][1]="payu123";
		
		data[2][0]="mediosdepago@mediosdepago.com";
		data[2][1]="mediosdepago123";
		
		return data;
	}

}
