package helper;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;

public class Utility {
	
	public static void verifyResponseCode200(int actual){
		
		Assert.assertEquals(actual, 200);
	}
public static void verifyResponseCode(int actual,int expected){
		
		Assert.assertEquals(actual, expected);
	}
public static void verifyResponseCode404(int actual){
	
	Assert.assertEquals(actual, 404);
}

public static JsonPath JSONParser(String response){
	 JsonPath path= new JsonPath(response);
	 return path;
}
public static void verifyJsonData (String response,String key, String value)
{
	JsonPath json= new JsonPath(response);
	String data =json.getString(key);
	Assert.assertEquals(data, value);
	
	
}
public static void verifyJsonDataContains (String response,String key, String value)
{
	JsonPath json= new JsonPath(response);
	String data =json.getString(key);
	Assert.assertTrue(data.contains(value));
	
	
}


public static String JsonData (String response,String key)
{
	JsonPath json= new JsonPath(response);
	String data =json.getString(key);
	return data;
	
	
}
public static XmlPath xmlParser(String response){
	XmlPath xml= new XmlPath(response);
	 return xml;
}
public static void XmlData (String response,String key, String value)
{
	XmlPath xml= new XmlPath(response);
	String data =xml.getString(key);
	Assert.assertEquals(data, value);
	
	
}

public static String xmlData (String response,String key)
{
	XmlPath xml= new XmlPath(response);
	String data =xml.getString(key);
	return data;
	
	
}

}
