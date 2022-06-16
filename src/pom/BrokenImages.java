package pom;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;


public class BrokenImages extends BaseClass{
	private WebDriver driver;
	
	public BrokenImages(WebDriver driver) {
		this.driver = driver;
	}
	
	private By imgPath = By.tagName("img");
	
	public int getBrokenImage() {
		int count =0;
		
		List<WebElement> list = driver.findElements(imgPath);
		
		for(WebElement img: list) {
			if(img != null && img.getAttribute("naturalWidth").equals("0")) {
				print(img.getAttribute("outerHTML")+" is broken");
				count++;
			}
		}
		
		return count;
	}
	
	
	public int getBrokenImage2() {
		int BrokenImageCount = 0;
		List<WebElement> image_list = driver.findElements(By.tagName("img"));
        /* Print the total number of images on the page */
        System.out.println("The page under test has " + image_list.size() + " images");
        try {
        	for (WebElement img : image_list)
        	{
        		if (img != null)
        		{
        			HttpClient client = HttpClientBuilder.create().build();
        			HttpGet request = new HttpGet(img.getAttribute("src"));
        			HttpResponse response = client.execute(request);
        			/* For valid images, the HttpStatus will be 200*/ 
        			if (response.getStatusLine().getStatusCode() != 200)
        			{
        				System.out.println(img.getAttribute("outerHTML") + " is broken.");
        				BrokenImageCount++;
        			}
        		}
        	}
        }catch(Exception e) {
        	e.printStackTrace();
        	print(e.getMessage()+" error occurs");
        }

		return BrokenImageCount;
		
	}

}
