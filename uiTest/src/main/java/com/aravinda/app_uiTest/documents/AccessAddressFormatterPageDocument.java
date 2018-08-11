package com.aravinda.app_uiTest.documents;

import com.aravinda.app_uiTest.contexs.AddressFormatterContext;
import com.aravinda.app_uiTest.scripts.StartDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AccessAddressFormatterPageDocument extends StartDriver {
    private final AddressFormatterContext context;

    public AccessAddressFormatterPageDocument(AddressFormatterContext context) {
        this.context = context;
    }

    public void validateMainPage() {
        boolean isVisible = webDriver.findElement(By.xpath("//h1[contains(text(),'"+context.getHeadingLabel()+"')]")).isDisplayed();
        Assert.assertTrue(isVisible);

    }
}
