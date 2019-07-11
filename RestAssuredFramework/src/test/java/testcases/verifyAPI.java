package testcases;

import org.testng.annotations.Test;

import helper.BaseClass;
import helper.Utility;

import static io.restassured.RestAssured.*;

public class verifyAPI  extends BaseClass{
	
	
	@Test
	public void verifyStatus(){
		
		
	/*	int response = given().get().getStatusCode();
		Utility.verifyResponseCode200(response);  */
		
		Utility.verifyResponseCode200(given().get().getStatusCode());
		
	}
	
	@Test
	public void verifyContent(){
		
		Utility.verifyJsonData(given().get().body().asString(), "userId", "1");
	}
	

}
