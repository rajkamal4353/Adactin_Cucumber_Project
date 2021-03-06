package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader_Adactin {

	public static Properties p;     // ---> null
	
	public Configuration_Reader_Adactin()throws Throwable {
		
		File f = new File(
				"C:\\Users\\M.Rajkamal\\apache-maven-3.8.3\\apache-maven-3.8.3\\bin\\AdactinCucumber\\src\\main\\java\\com\\configuration\\properties\\Configuration.Properties");		
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);    // load the file inputstream into properties

	}
	
	public  String getUrl() throws Throwable {
			
			// retrieve the url
			
			String url = p.getProperty("url");
			
			return url;
    }
		
	public  String getUsername() throws Throwable {
			
			// retrieve the username
			
			String username = p.getProperty("username");
			
			return username;
	}
		
	   public  String getPassword() throws Throwable {
			
			// retrieve the password
			
			String password = p.getProperty("password");
			
			return password;
	}
	   
	   public  String getCreditCardNo() throws Throwable {
			
			// retrieve the creditcardno
			
			String CreditCardNo = p.getProperty("CreditCardNo");
			
			return CreditCardNo;
	}
	   
	   public  String getCvv() throws Throwable {
			
			// retrieve the cvv
			
			String Cvv = p.getProperty("Cvv");
			
			return Cvv;
	}
	    
}
