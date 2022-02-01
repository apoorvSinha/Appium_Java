package Native_Apps;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Dialer {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

        dc.setCapability("appPackage", "com.google.android.dialer");
        dc.setCapability("appActivity", "com.google.android.dialer.DialtactsActivity");
        URL url = new URL("http://localhost:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);
        Thread.sleep(5000);

        driver.findElement(By.id("com.google.android.dialer:id/fab")).click();

        driver.findElement(By.id("com.google.android.dialer:id/nine")).click();
        driver.findElement(By.id("com.google.android.dialer:id/six")).click();
        driver.findElement(By.id("com.google.android.dialer:id/eight")).click();
        driver.findElement(By.id("com.google.android.dialer:id/two")).click();
        driver.findElement(By.id("com.google.android.dialer:id/nine")).click();
        driver.findElement(By.id("com.google.android.dialer:id/two")).click();
        driver.findElement(By.id("com.google.android.dialer:id/three")).click();
        driver.findElement(By.id("com.google.android.dialer:id/two")).click();
        driver.findElement(By.id("com.google.android.dialer:id/four")).click();
        driver.findElement(By.id("com.google.android.dialer:id/four")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("com.google.android.dialer:id/dialpad_floating_action_button")).click();
        Thread.sleep(10000);
        driver.quit();
    }
}
