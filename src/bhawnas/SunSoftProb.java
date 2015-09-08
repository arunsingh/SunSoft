/*
 * @Author: Arun Singh, arunsingh.in@gmail.com
 * 
 * Problem statement: Surya Software Systems Pvt Ltd, Bengaluru-560 082, KA, India
 * */

package bhawnas;

import java.io.*;
import java.lang.*;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.nio.charset.*;

//import org.json.JSONException;
//import org.json.JSONObject;
//import org.apache.*;

public class SunSoftProb { 
	
	public static void main (String [] args) {
		
		System.out.println("\n Output : \n"+ callURL("http://surya-interview.appspot.com/message"));
		
			}
	public static String callURL(String myURL) {
		
		System.out.println("Requested URL:"+ myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn=null;
		InputStreamReader in=null;
		
		try {
			
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			
			if (urlConn != null)
				urlConn .setReadTimeout(60*1000);
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(),
						Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null){
					int cp;
					while ((cp = bufferedReader.read()) != -1){
						
						sb.append((char) cp);
					}
					bufferedReader.close();
					
				}
			}
			in.close();
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:"+myURL, e);
			
		}
		
		return sb.toString();
	}
	
	
}
