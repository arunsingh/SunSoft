/*
 * @Author : Arun Singh, New Delhi, India | arunsingh.in@gmail.com
 * 
 * Problem statement: Surya Software Systems Pvt Ltd, Bengaluru-560 082, KA, India
 * 
 * */


package bhawnas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.*;
import org.commonjava.web.json.*;
import org.apache.http.impl.client.HttpClientBuilder;

import org.json.JSONException;
import org.json.JSONObject;






@SuppressWarnings("unused")

public class SunSofProb {
	
	public static void main (String args[]) {
		
		
		
		//Exception Handling
		
		try {
			
			//create Http Client
			
		HttpClient httpClient = HttpClientBuilder.create().build();
		
		  //Create fresh GET  request for mentioned URL in Prob Stmt
		
		
		HttpGet getRequest = new HttpGet ("http://surya-interview.appspot.com/message");
			
		 // Add header to accept getRequest which accepts application/JSON data
		
		getRequest.addHeader("accept:X-Surya-arunsingh.in@gmail.com", "application/json");
		
		//Execute request and fetch response
		
		HttpResponse response = httpClient.execute(getRequest);
		
		
		// Check for HTTP Response code 200/404/500
		
		if (response.getStatusLine().getStatusCode() != 200) {
			
			throw new RuntimeException("Failed:Http error code: " + response.getStatusLine().getStatusCode()); 
					} 
	//	else {
			//throw new RuntimeException("Error reported code:" + response.getStatusLine().getStatusCode());		
						
				//	}						
		
		//Capture GET complete application/json  body response
		
		BufferedReader br = new BufferedReader (new InputStreamReader((InputStream) response.getEntity().getContentType()));
		
		String output;
		System.out.println("================Output:===================");
		
		
		//iteration through simple JSON response and depict on console
		
		while ((output = br.readLine()) != null) {
			
			System.out.println(output);
			
		}
			
					
		} catch (ClientProtocolException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
		
	}

}
