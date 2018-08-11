package com.aravinda.app_uiTest.scripts;

import com.aravinda.app_uiTest.contexs.AddressFormatterContext;
import com.aravinda.app_uiTest.documents.AccessAddressFormatterPageDocument;
import org.testng.annotations.Test;

public class UITC1_AccessAddressFormatterMainPageTestScript extends StartDriver {

    @Test
    public void accessAddressFormatterPage() {
        AddressFormatterContext context = new AddressFormatterContext();

        context.setHeadingLabel("Address Formatter");

        AccessAddressFormatterPageDocument address = new AccessAddressFormatterPageDocument(context);
        address.validateMainPage();
    }
}
