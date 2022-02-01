package Native_Apps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");
        URL url = new URL("http://localhost:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);
        Thread.sleep(5000);

        WebElement seven = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        seven.click();
        WebElement plus  =driver.findElement(By.id("com.android.calculator2:id/op_add"));
        plus.click();
        WebElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        three.click();
        WebElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();


        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        if(result.equals("10")){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test Failed");
        }
        driver.quit();
    }

}
