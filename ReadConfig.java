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
			
			String STOREURL = prop.getProperty("store.Url");
			String ADMINURL = prop.getProperty("admin.Url");
			String AUTHORIZATIONDETAILS = prop.getProperty("authorization.details");
			String ADMINUSERNAME = prop.getProperty("admin.User.Name");
			String ADMINPASSWORD = prop.getProperty("admin.Password");
			String EXPLICITMINWAIT = prop.getProperty("explicit.Min.Wait");
			String EXPLICITMAXWAIT = prop.getProperty("explicit.Max.Wait");
			String HOMEPAGETITLE = prop.getProperty("homepage.Title");
			String REGEMAILID = prop.getProperty("reg.Email.id");
			String REGPASSWORD = prop.getProperty("reg.Password");
			String REGREPASSWORD = prop.getProperty("reg.Repassword");
			String REGFIRSTNAME = prop.getProperty("reg.First.Name");
			String REGLASTNAME = prop.getProperty("reg.Last.Name");
			String REGCOUNTRY = prop.getProperty("reg.Country");
			String REGSTATE = prop.getProperty("reg.State");
			String REGZIP = prop.getProperty("reg.Zip");
			String REGCITY = prop.getProperty("reg.City");
			String REGADDRESSLINE1 = prop.getProperty("reg.Address.Line.1");
			String REGADDRESSLINE2 = prop.getProperty("reg.Address.Line.2");
			String REGCONTACT = prop.getProperty("reg.Contact");
			String EMAILID = prop.getProperty("email.Id");
			String DBPASSWORD = prop.getProperty("db.password");
			
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
			System.out.println("PASSWORD: " + DBPASSWORD);
			input.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
