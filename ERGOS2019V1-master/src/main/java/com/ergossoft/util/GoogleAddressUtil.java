package com.ergossoft.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

 
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GoogleAddressUtil {

	public static void main(String[] args) {
		
	 
	String js="";
	String output=null;
	String url="https://maps.googleapis.com/maps/api/geocode/json?address=95%20Crooked%20Stump%20Rd,%20Terra%20Alta,%20WV%2026764,%20USA&key=AIzaSyCqnk6q1an9ZcAXuzQqLnJmNGFeyNsLeOA";
	 try {
		 
		 url=url.replaceAll("\\s+","%20");
			  URL urls=new URL(url);
			  HttpURLConnection conn = (HttpURLConnection) urls.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			
			 
			while ((output = br.readLine()) != null) {
				//System.out.println(output);
				js=js+output;
			}
			 
			conn.disconnect();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }
	 
	 JSONParser parser=new JSONParser();
	 
	 try {
		JSONObject jsonObject=(JSONObject) parser.parse(js);
		
		System.out.println("jsonObject..."+jsonObject);
		
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	}
}
