package generic;

//import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners(CustomListener.class)
public class BaseTest implements IAutoConst {
	public WebDriver driver;
	static{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}
	//@Parameters({"node","browser"})
	//
	@BeforeMethod
	public void openApplication(){
		driver=new ChromeDriver();//it will open the browser in current system
		/*URL whichSystem=new URL(node);//"http://192.168.87.1:4444/wd/hub"
		DesiredCapabilities whichBrowser=new DesiredCapabilities();
		whichBrowser.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(whichSystem,whichBrowser);*/
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
	}
	@AfterMethod
	public void closeApplication(){
		driver.quit();
	}
	

}
