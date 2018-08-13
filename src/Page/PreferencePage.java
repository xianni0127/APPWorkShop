package Page;


import java.net.URL;
import java.io.IOException;
import java.io.File;


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




public class PreferencePage {

    public PreferencePage(AndroidDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }


    @AndroidFindBy(xpath ="//android.widget.TextView[@text='3. Preference dependencies']")
    public AndroidElement dependencies;


    public void clickDependencies() {


       dependencies.click();
       System.out.println(dependencies);
    }

}