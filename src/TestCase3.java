import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase3 {

    public static void main (String[] args) {

        //create driver object for firefox browser

        //we will strictly implement methods of wedDriver (because webdriver is a interface)
        //invoke .exe file first, we download gecko driver for firefox

        System.setProperty("webdriver.ie.driver", "/Users/himabinduvakada/Downloads/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        // above 2 steps is common for any test

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }

    }
