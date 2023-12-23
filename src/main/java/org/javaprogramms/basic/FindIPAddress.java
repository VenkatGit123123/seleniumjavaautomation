package org.javaprogramms.basic;

import java.net.InetAddress;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class FindIPAddress {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		InetAddress localhost = InetAddress.getLocalHost();
		System.out.println("System IP Address :"+ (localhost.getHostAddress()).trim());
		String systemipaddress = "";
		try {
			URL url_name = new URL("http://bot.whatismyipaddress.com");
			
			BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));
			
			systemipaddress = sc.readLine();
		}catch(Exception e) {
			systemipaddress = "Cannot Execute Properly";
		}
		
		System.out.println("Public IP Address:"+systemipaddress+"\n");
	}

}
