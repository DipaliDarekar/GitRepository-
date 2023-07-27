package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
public static void main(String[] args) throws IOException {
	
	//Read the data from config.properties File
	
	FileInputStream fis = new FileInputStream("./data/config.properties");
	
	//Create object of propert class
	
	  Properties prop = new Properties();
	  //make a file file ready for read
	  prop.load(fis);
	  //read the particular property
	  String data = prop.getProperty("Password");
	  
	  System.out.println(data);
	 
	  
	  
	
}
}
