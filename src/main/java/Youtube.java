import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Youtube {

	public static void main(String[] args) throws FindFailed {

		try {

			System.setProperty("webdriver.gecko.driver", "D:\\WorkSpace\\GeckoDriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.youtube.com/watch?v=7N_BfV5vVbU");

			Thread.sleep(12000);
			System.out.println("Click");

			ArrayList<WebElement> linkAds = (ArrayList<WebElement>) driver
					.findElements(By.xpath(".//div[@class='adDisplay extra-padding']//a"));

			System.out.println("size: " + linkAds.size());
			for (int i = 0; i < linkAds.size(); i++) {
				System.out.println(i + linkAds.get(i).getText());
			}

			if(linkAds.size() > 0) {
				linkAds.get(0).click();
			}

			Thread.sleep(1000);
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
