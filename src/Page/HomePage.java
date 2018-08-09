package Page;


import java.net.URL;
import java.io.IOException;
import java.io.File;
import java.util.concurrent.TimeUnit;

import java.net.MalformedURLException;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HomePage {

//   public AndroidDriver _driver;

    public HomePage(AndroidDriver driver){
//        _driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

//    public HomePage(AndroidDriver driver){
//        this.driver = driver;
////        System.out.println(driver);
//        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
//    }

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Preference']")
    public AndroidElement preference;

    public void clickPreference() {

//       _driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        preference.click();

    }


}