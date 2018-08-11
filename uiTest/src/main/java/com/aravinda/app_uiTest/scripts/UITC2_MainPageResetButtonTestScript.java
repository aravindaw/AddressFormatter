package com.aravinda.app_uiTest.scripts;

import com.aravinda.app_uiTest.contexs.AddressFormatterContext;
import com.aravinda.app_uiTest.documents.MainPageDocument;
import org.testng.annotations.Test;

public class UITC2_MainPageResetButtonTestScript extends StartDriver {
    @Test
    public void accessAddressFormatterPage() {
        AddressFormatterContext context = new AddressFormatterContext();

        context.setAddressField("address");
        context.setAddressFieldValue("Test Address");
        context.setResetButton("btn btn_reset");

        MainPageDocument address = new MainPageDocument(context);
        address.testResetButton();
    }
}
