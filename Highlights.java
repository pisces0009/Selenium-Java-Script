package Sport;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Highlights {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\PRASAD\\Desktop\\software\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRASAD\\Desktop\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  FirefoxDriver();
				
		        //Launch the Online Store Website
		driver.get("http://us.hotstar.com/sports");
		
		Thread.sleep(4000);		
		driver.findElement(By.xpath("//*[@id=\"myCarouselId\"]/div/article[1]/div[1]/div/div[1]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".signIn")).click();
		//facebook login
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".fb-wrap > span:nth-child(2)")).click();
		
		 String window1 = driver.getWindowHandle();
		 Set<String> windows = driver.getWindowHandles();
		 
		 for(String x:windows) {
			 if(x.equals(window1) == false) {
				 driver.switchTo().window(x);
				 break;
			 }
		 }
		
		//driver.get("https://www.facebook.com/login.php?skip_api_login=1&api_key=1439455966343706&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv2.9%2Fdialog%2Foauth%3Fchannel%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fconnect%252Fxd_arbiter%252Fr%252F2VRzCA39w_9.js%253Fversion%253D42%2523cb%253Df3b2e79156e224%2526domain%253Dus.hotstar.com%2526origin%253Dhttps%25253A%25252F%25252Fus.hotstar.com%25252Fff3858e9e2a0cc%2526relation%253Dopener%26redirect_uri%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fconnect%252Fxd_arbiter%252Fr%252F2VRzCA39w_9.js%253Fversion%253D42%2523cb%253Df333bebeb9eec08%2526domain%253Dus.hotstar.com%2526origin%253Dhttps%25253A%25252F%25252Fus.hotstar.com%25252Fff3858e9e2a0cc%2526relation%253Dopener%2526frame%253Df326bd6222c0fb%26display%3Dpopup%26scope%3Dpublic_profile%252Cemail%252Cuser_birthday%252Cuser_friends%26response_type%3Dtoken%252Csigned_request%26domain%3Dus.hotstar.com%26origin%3D1%26client_id%3D1439455966343706%26ret%3Dlogin%26sdk%3Djoey%26logger_id%3D067d6a76-8467-0db2-607d-fc312c37ac5c&cancel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2F2VRzCA39w_9.js%3Fversion%3D42%23cb%3Df333bebeb9eec08%26domain%3Dus.hotstar.com%26origin%3Dhttps%253A%252F%252Fus.hotstar.com%252Fff3858e9e2a0cc%26relation%3Dopener%26frame%3Df326bd6222c0fb%26error%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26e2e%3D%257B%257D&display=popup&locale=en_US&logger_id=067d6a76-8467-0db2-607d-fc312c37ac5c");
		Thread.sleep(9000);
		driver.findElement(By.cssSelector("#email")).sendKeys("**********");
		driver.findElement(By.cssSelector("#pass")).sendKeys("*********");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#u_0_0")).click();
		
		//Thread.sleep(5000);
		//driver.get("http://us.hotstar.com/sports");
		
		
				
		
		
		// TODO Auto-generated method stub

	}

}
