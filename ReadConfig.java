package com.avactis.utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ReadConfig {

	public static void main (String [] args) throws IOException {
		
		Properties prop = new Properties ();
		
		try {
			FileInputStream input = new FileInputStream("config.properties");
			prop.load(input);
			
			String STOREURL = prop.getProperty("STORE.URL");
			String ADMINURL = prop.getProperty("ADMIN.URL");
			String AUTHORIZATIONDETAILS = prop.getProperty("AUTHORIZATION.DETAILS");
			String ADMINUSERNAME = prop.getProperty("ADMIN.USER.NAME");
			String ADMINPASSWORD = prop.getProperty("ADMIN.PASSWORD");
			String EXPLICITMINWAIT = prop.getProperty("EXPLICIT.MIN.WAIT");
			String EXPLICITMAXWAIT = prop.getProperty("EXPLICIT.MAX.WAIT");
			String HOMEPAGETITLE = prop.getProperty("HOMEPAGE.TITLE");
			String REGEMAILID = prop.getProperty("REG.EMAIL.ID");
			String REGPASSWORD = prop.getProperty("REG.PASSWORD");
			String REGREPASSWORD = prop.getProperty("REG.REPASSWORD");
			String REGFIRSTNAME = prop.getProperty("REG.FIRST.NAME");
			String REGLASTNAME = prop.getProperty("REG.LAST.NAME");
			String REGCOUNTRY = prop.getProperty("REG.COUNTRY");
			String REGSTATE = prop.getProperty("REG.STATE");
			String REGZIP = prop.getProperty("REG.ZIP");
			String REGCITY = prop.getProperty("REG.CITY");
			String REGADDRESSLINE1 = prop.getProperty("REG.ADDRESS.LINE.1");
			String REGADDRESSLINE2 = prop.getProperty("REG.ADDRESS.LINE.1");
			String REGCONTACT = prop.getProperty("REG.CONTACT");
			String EMAILID = prop.getProperty("EMAIL.ID");
			String PASSWORD = prop.getProperty("PASSWORD");
			
			System.out.println("STORE URL: " + STOREURL);
			System.out.println("ADMIN URL: " + ADMINURL);
			System.out.println("AUTHORIZATION DETAILS: " + AUTHORIZATIONDETAILS);
			System.out.println("ADMIN USERNAME: " + ADMINUSERNAME);
			System.out.println("ADMIN PASSWORD: " + ADMINPASSWORD);
			System.out.println("EXPLICIT MIN WAIT: " + EXPLICITMINWAIT);
			System.out.println("EXPLICIT MAX WAIT: " + EXPLICITMAXWAIT);
			System.out.println("HOME PAGE TITLE: " + HOMEPAGETITLE);
			System.out.println("REG EMAIL ID: " + REGEMAILID);
			System.out.println("REG PASSWORD: " + REGPASSWORD);
			System.out.println("REG REPASSWORD: " + REGREPASSWORD);
			System.out.println("REG FIRST NAME: " + REGFIRSTNAME);
			System.out.println("REG LAST NAME: " + REGLASTNAME);
			System.out.println("REG COUNTRY : " + REGCOUNTRY);
			System.out.println("REG STATE : " + REGSTATE);
			System.out.println("REG ZIP: " + REGZIP);
			System.out.println("REG CITY: " + REGCITY);
			System.out.println("REGADDRESSLINE1: " + REGADDRESSLINE1);
			System.out.println("REGADDRESSLINE2: " + REGADDRESSLINE2);
			System.out.println("REGCONTACT: " + REGCONTACT);
			System.out.println("EMAILID: " + EMAILID);
			System.out.println("PASSWORD: " + PASSWORD);
			input.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
