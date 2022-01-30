package GoogleTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;
//import com.codeborne.selenide.Selenide;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selectors.*;

public class GoogleTest {
    WebDriver webDriver;
    @Test
    public void googleTest() {
        File fileChromdriver = new File("chromdriver.exe");
        System.setProperty("webdriver.chrom.driver", fileChromdriver.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://google.com");
        webDriver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("maven selenium java");
        webDriver.findElement(By.cssSelector("input.gNO89b")).click();
        webDriver.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
        //<input class="gLFyf gsfi"
        // <input class="gNO89b"
        // <h3 class="LC20lb MBeuO DKV0Md"
    }
}
