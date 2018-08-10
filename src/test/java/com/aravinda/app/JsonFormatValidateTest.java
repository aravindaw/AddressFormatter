package com.aravinda.app;

import org.json.*;
import org.junit.Assert;
import org.junit.Test;

public class JsonFormatValidateTest {
    @Test
    public void jsonFormatValidator() {
        String address = "Winterallee 3";
        String result = new AddressServicesImpl().input(address);
        Assert.assertTrue(isJson(result));
    }

    public static boolean isJson(String test) {
        try {
            new JSONObject(test);
        } catch (JSONException ex) {
            try {
                new JSONArray(test);
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }

}
