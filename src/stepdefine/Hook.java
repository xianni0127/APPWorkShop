package stepdefine;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import test.basics;
import test.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import java.util.List;
import java.net.MalformedURLException;

import java.net.URL;
import java.io.IOException;
import java.io.File;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hook {

    public static AndroidDriver driver;

    @Before
    public void beforeScenario() throws MalformedURLException  {
        File f= new File("src");
        File fs=new File(f,"ApiDemos-debug.apk");
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"8a2acc45");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    @After
    public void afterScenario()  {
        if (driver != null)
        {
            driver.quit();

        }

    }
}
