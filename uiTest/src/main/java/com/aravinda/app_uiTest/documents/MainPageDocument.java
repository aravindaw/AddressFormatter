package com.aravinda.app_uiTest.documents;

import com.aravinda.app_uiTest.contexs.AddressFormatterContext;
import com.aravinda.app_uiTest.scripts.StartDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPageDocument extends StartDriver {
    private final AddressFormatterContext context;

    public MainPageDocument(AddressFormatterContext context) {
        this.context = context;
    }

    public void testResetButton() {
        WebElement addressField = webDriver.findElement(By.id(context.getAddressField()));
        addressField.sendKeys(context.getAddressFieldValue());
        Assert.assertTrue(addressField.getAttribute("value").contains(context.getAddressFieldValue()));
        webDriver.findElement(By.xpath("//*[contains(@class,'"+context.getResetButton()+"')]")).click();
        Assert.assertTrue(addressField.getAttribute("value").contains(""));

    }
}
