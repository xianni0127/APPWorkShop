package test;

import java.net.URL;
import java.io.IOException;
import java.io.File;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import java.util.List;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Page.HomePage;
import Page.PreferencePage;

public class basics  extends base {

    AndroidDriver driver;

    @Before
    public void setUp()  throws IOException {
        driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test() throws MalformedURLException {

        HomePage homepage = new HomePage(driver);
        homepage.clickPreference();

        PreferencePage preferencepage =  new PreferencePage(driver);
        preferencepage.clickDependencies();


    }

    @After
    public void tearDown (){
        if (driver != null)
        {
            driver.quit();

        }
    }

}
