package com.aravinda.app_uiTest.documents;

import com.aravinda.app_uiTest.contexs.AddressFormatterContext;
import com.aravinda.app_uiTest.scripts.StartDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddressFormatterTestDocument extends StartDriver {
    private final AddressFormatterContext context;

    public AddressFormatterTestDocument(AddressFormatterContext context) {
        this.context = context;
    }

    public void testAddressFormats() {

        int addressCount = 0;
        for (String address : context.getAddressFieldMultipleValue()) {
            webDriver.findElement(By.id(context.getAddressField())).sendKeys(address);
            webDriver.findElement(By.id(context.getSubmitButton())).click();
            WebElement result =webDriver.findElement(By.xpath("//*[contains(@class,'" + context.getResult() + "')][2]"));
            Assert.assertEquals("Comparing result and expected result", context.getExpectedResultList()[addressCount], result.getText());
            webDriver.findElement(By.xpath("//*[contains(@class,'" + context.getTryAnotherAddressButton() + "')]")).click();
            addressCount++;
        }


    }
}
