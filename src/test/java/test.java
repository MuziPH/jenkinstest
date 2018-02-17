import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class test {

    public static void main(String[]args) throws InterruptedException {

        /*File file = new File("/home/muzi/temp/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();*/

        File file = new File("/home/muzi/temp/geckodriver");
        System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
        WebDriver driver = new FirefoxDriver();

        Thread.sleep(10000);
        //driver.navigate().to("http://10.182.218.194/EAppIntranet/flow/capture/termsnca.aspx");
        driver.navigate().to("http://www.google.com");
    }

}
