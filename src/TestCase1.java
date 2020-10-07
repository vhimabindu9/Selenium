import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    public static void main (String[] args){

        //create driver object for chrome browser

        //we will strictly implement methods of wedDriver (because webdriver is a interface)
        //invoke .exe file first

        System.setProperty("webdriver.chrome.driver","/Users/himabinduvakada/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        // above 2 steps is common for any test

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        driver.get("https:yahoo.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();//closes current browser
        driver.quit();//closes all the browsers opened by selenium script





    }
}
