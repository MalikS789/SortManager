import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Project contains chromedriver version 84.0.4147.3 for Windows. You may need to change this for your version of Chrome and OS
 */
public class App {
	public static void main(String[] args) {
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://news.ycombinator.com/");
		webDriver.findElement(By.linkText("comments")).click();
		System.out.println(webDriver.getCurrentUrl());
		webDriver.close();
	}
}
