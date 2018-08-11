package com.aravinda.app_uiTest.scripts;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class StartDriver {
    protected static WebDriver webDriver;

    @BeforeTest
    public void createTestEnvironment() throws ConfigurationException {
        CompositeConfiguration config = new CompositeConfiguration();
        config.addConfiguration(new PropertiesConfiguration("src/main/resources/config.properties"));
        System.setProperty("webdriver.chrome.driver", config.getProperty("WEB_DRIVER_PATH").toString());
        webDriver = new ChromeDriver();
        webDriver.manage().window().fullscreen();
        webDriver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        webDriver.get(config.getProperty("BASE_URL").toString());
    }

    @AfterTest
    public void exitTestEnvironment() throws ConfigurationException {
        webDriver.quit();
    }
}
