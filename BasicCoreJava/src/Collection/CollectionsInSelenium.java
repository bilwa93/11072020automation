package Collection;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr=new ChromeDriver();
		//List is selenium
		List<WebElement> list=dr.findElements(By.xpath(""));
		//Set in selenium
		Set<String> set=dr.getWindowHandles();
	}

}
