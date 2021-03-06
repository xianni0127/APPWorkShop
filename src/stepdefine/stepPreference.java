package  stepdefine;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import static org.junit.Assert.assertEquals;

import Page.HomePage;
import Page.PreferencePage;
import  test.basics;
import java.io.IOException;
import java.io.File;
import java.net.URL;

import cucumber.api.java.en.And;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


import static org.junit.Assert.assertEquals;

public class stepPreference {

    public  AndroidDriver driver=Hook.driver;

    @Given("^open the app and click Preference$")
    public void open_the_app_and_click_Preference() throws Throwable {
        HomePage homepage = new HomePage(driver);
        homepage.clickPreference();
    }

    @When("^click dependencies$")
    public void click_dependencies() throws Throwable {
        PreferencePage preferencepage =  new PreferencePage(driver);
        preferencepage.clickDependencies();
    }

    @Then("^we get dependencies$")
    public void we_get_dependencies() throws Throwable {
        assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='EXAMPLE PREFERENCE DEPENDENCY']").getText(), "EXAMPLE PREFERENCE DEPENDENCY");
    }


}


