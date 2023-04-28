import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void googleTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement findField = driver.findElement(By.xpath("//textarea[@title ='Поиск']"));
        findField.sendKeys("Selenium");
        findField.sendKeys(Keys.ENTER);
        WebElement text = driver.findElement(By.xpath("//h3[text()='Selenium']"));
        Assert.assertEquals(text.getText(), "Selenium");
        Thread.sleep(2000);
        driver.close();



    }
}
