import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("http://www.docusign.com");
        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.xpath("//*[@id=\"us-login-button\"]/div"));
		link.click();
		Thread.sleep(5000);
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.click();
		usernameField.sendKeys("pmarcoccia@qualityandcompliance.com");
		WebElement continueBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/section/div[1]/div/form/div[3]/button"));
		continueBtn.click();
		Thread.sleep(5000);
		WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passwordField.click();
		passwordField.sendKeys("2testDS@@");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/section/div[1]/div/form/div[4]/button/div"));
		loginBtn.click();
		
		// At this point, test app is logged into the account.
		Thread.sleep(15000);
		WebElement profileBtn = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div[1]/div/div[1]/nav-header/div/div/ng-transclude/div[1]/div[4]/div[2]/button"));
		profileBtn.click();
		WebElement logoutBtn = driver.findElement(By.xpath("//*[@id=\"menuAccountNav\"]/ul/li[4]/a"));
		logoutBtn.click();
	
		//driver.quit();
	}

}