package com.aravinda.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class JsonFormatValidateTest {
    private static final Logger logger = LogManager.getLogger("JsonFormatValidateTest");
    @Test
    public void jsonFormatValidator() {
        String address = "Winterallee 3";
        String result = new AddressServicesImpl().input(address).toString();
        Assert.assertTrue(isJson(result));
    }

    private static boolean isJson(String test) {
        try {
            new JSONObject(test);
        } catch (JSONException ex1) {
            try {
                new JSONArray(test);
            } catch (JSONException ex2) {
                return false;
            }
        }
        return true;
    }

}
