import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","/Users/himabinduvakada/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
//        driver.findElement(By.id("email")).sendKeys("himabindu@gmail.com");
        driver.findElement(By.cssSelector("#email")).sendKeys("hima112@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("abc123");
//        driver.findElement(By.linkText("Forgot account?")).click();
        driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
        //*[@id='u_0_2']

        // to check the xpath is accurate or not- inspect the object and copy the xpath and go to bottom
        // of the console and type $x("type the xpath copied")and click enter. verify the xpath is accurate or not
        //for css- $("paste the copied css of the object and remove # before")
        // we can also find by $x(//tagname[@attribute='value']") and we can skip tagname by placing * in place of tagname
        //for css $("tagname[attribute='value']") and also skip tagname and no need give * in place of tagname
        //for css tagname#id, tagname.classname (here also you can skip tagname example: #email)

        System.out.println(driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).getText());

    }
}
