package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataProvider {
	
	Properties pro;
	
	public DataProvider(){
		
		pro = new Properties();
		try {
			pro.load(new FileInputStream(new File("./Config/Config.properties")));
		} catch (Exception e) {
			
			System.out.println("Not able to load config file" +e.getMessage());
				
		
		
	}

}
	
	public String getDetails(String key){
		
		return pro.getProperty(key);
		
		
	}
	
	public String getStagingURL(){
		
		return pro.getProperty("StagingAPI");
	}
public String getUserName(){
		
		return pro.getProperty("username");
	}
public String getPassWord(){
	
	return pro.getProperty("password");
}
}
