package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNGExample {

    public WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCase1(){
      //Upcasting
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        System.out.println("Hello Everyone....");
    }

    @Test
    public void testCase2(){
        driver.navigate().to("https://testng.org/");
        driver.manage().window().maximize();
        System.out.println("Good Evening....");
    }

    @Test
    public void testCase3(){
        driver.navigate().to("https://www.amazon.in/");
    }

    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }
}
