package com.mycompany.sdet.CommonOps;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Navigate {
	public void navigateTo(WebDriver driver, String url){
		driver.get(url);
		Assert.assertTrue(getResponseCode(url)==200);
	}
	
	/*Returns Response Code*/
	public int getResponseCode(String url) {
		
        try {
            return Request.Get(url).execute().returnResponse().getStatusLine()
                    .getStatusCode();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
	
}
