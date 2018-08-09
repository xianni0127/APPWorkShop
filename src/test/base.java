package test;


import java.net.URL;
import java.io.IOException;
import java.io.File;

import java.net.MalformedURLException;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




public class base {



    public static  AndroidDriver Capabilities() throws MalformedURLException {
        File f= new File("src");
        File fs=new File(f,"ApiDemos-debug.apk");
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"8a2acc45");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;

    }



//    @Before
//    public void setUp()  throws IOException {

//    }

//    @Test
//    public void testYourAndroidApp()  throws  MalformedURLException{
//
//        File appDir= new File("src");
//        File app =new File(appDir, "ApiDemos-debug.apk") ;
//        DesiredCapabilities cap= new DesiredCapabilities();
//        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "8a2acc45");
//        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "20");
//        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
//        driver.scrollTo("Preference").click();
//       	List <WebElement>b=driver.findElements(By.id("android:id/text1"));
//       	System.out.println(b.get(8).getText());
//
//
//    }
//    

//    @After
//    public void tearDown (){
//        if (driver != null)
//        {
//            driver.quit();
//
//        }
//    }
}
