package com.aravinda.app_uiTest.scripts;

import com.aravinda.app_uiTest.contexs.AddressFormatterContext;
import com.aravinda.app_uiTest.documents.AddressFormatterTestDocument;
import org.testng.annotations.Test;


public class UITC3_AddressTypeTest extends StartDriver {
    @Test
    public void accessAddressFormatterPage() {
        AddressFormatterContext context = new AddressFormatterContext();

        context.setAddressField("address");
        context.setSubmitButton("btn");
        String[] addressList = {
                "Winterallee 3",
                "Musterstrasse 45",
                "Blaufeldweg 123B", "Am Bächle 23",
                "Auf der Vogelwiese 23 b",
                "4, rue de la revolution",
                "200 Broadway Av",
                "Calle Aduana, 29",
                "Calle 39 No 1540"
        };

        context.setAddressFieldMultipleValue(addressList);
//        context.setAddressFieldValue("sdsdsdfsfsdf sdfsdfs 3434");
        context.setResult("result_text");
//        context.setExpectedResult("{\"housenumber\":\"3434\",\"street\":\"sdsdsdfsfsdf sdfsdfs\"}");
        String[] expectedResults = {
                "{\"housenumber\":\"3\",\"street\":\"Winterallee\"}",
                "{\"housenumber\":\"45\",\"street\":\"Musterstrasse\"}",
                "{\"housenumber\":\"123B\",\"street\":\"Blaufeldweg\"}",
                "{\"housenumber\":\"23\",\"street\":\"Am Bächle\"}",
                "{\"housenumber\":\"23 b\",\"street\":\"Auf der Vogelwiese\"}",
                "{\"housenumber\":\"4\",\"street\":\"rue de la revolution\"}",
                "{\"housenumber\":\"200\",\"street\":\"Broadway Av\"}",
                "{\"housenumber\":\"29\",\"street\":\"Calle Aduana\"}",
                "{\"housenumber\":\"No 1540\",\"street\":\"Calle 39\"}"
        };
        context.setExpectedResultList(expectedResults);
        context.setTryAnotherAddressButton("btn btn_submit");
        AddressFormatterTestDocument address = new AddressFormatterTestDocument(context);
        address.testAddressFormats();
    }
}
