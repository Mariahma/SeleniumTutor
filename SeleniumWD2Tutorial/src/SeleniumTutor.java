import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutor {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chrome_webdriver_75v\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.manage().window().maximize();
        obj.get("https://www.google.com");
        obj.findElement(By.name("q")).sendKeys("Hello World");
        obj.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();


    }
}
