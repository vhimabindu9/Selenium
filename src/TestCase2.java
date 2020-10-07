import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

    public static void main (String[] args){

        //create driver object for firefox browser

        //we will strictly implement methods of wedDriver (because webdriver is a interface)
        //invoke .exe file first, we download gecko driver for firefox

        System.setProperty("webdriver.gecko.driver","/Users/himabinduvakada/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        // above 2 steps is common for any test

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());





    }
}
